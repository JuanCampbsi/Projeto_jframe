package dao;

import util.JDConnectioFactory;
import model.JDCliente;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class JDClienteDAO {

    private Connection connection;
    Long codcliente;
    String nome;
    String email;

    public JDClienteDAO() {
        this.connection = new JDConnectioFactory().getConnection();
    }
    
    // SELECT - Retorna uma lista com o resultado da consulta
    public List<JDCliente> getLista(String nome) throws SQLException{
        // Prepara conexão p/ receber o comando SQL
        String sql = "SELECT * FROM cliente WHERE nome like ?";
        PreparedStatement stmt = this.connection.prepareStatement(sql);
        stmt.setString(1, nome);
        
        // Recebe o resultado da consulta SQL
        ResultSet rs = stmt.executeQuery();
        
        List<JDCliente> lista = new ArrayList<>();
        
        // Enquanto existir registros, pega os valores do ReultSet e vai adicionando na lista
        while(rs.next()) {
            //  A cada loop, é instanciado um novo objeto, p/ servir de ponte no envio de registros p/ a lista
           JDCliente c = new JDCliente();
            
            // "c" -> Cliente novo - .setNome recebe o campo do banco de String "nome" 
            c.setIdcliente(Long.valueOf(rs.getString("idcliente")));
            c.setNome(rs.getString("nome"));
            c.setEmail(rs.getString("email"));
          
            // Adiciona o registro na lista
            lista.add(c);            
        }
        
        
        
        // Fecha a conexão com o BD
        rs.close();
        stmt.close();
        
        // Retorna a lista de registros, gerados pela consulta
        return lista;          
    }

    public void adiciona(JDCliente cliente) {
        String sql = "INSERT INTO cliente( nome,email) VALUES(?,?)";
        try {
            PreparedStatement stmt;
        // stmt recebe o comando SQL
        stmt = this.connection.prepareStatement(sql);
            
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}


