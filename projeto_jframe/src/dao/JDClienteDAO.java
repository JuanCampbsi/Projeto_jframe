package dao;

import util.Conexao;
import model.JDCliente;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.JDEndereco;

public class JDClienteDAO {

    Conexao connecta = new Conexao();//Criando instancia de conexão
    JDCliente cli = new JDCliente(); //Instanciando a classe 
     JDEndereco cliend = new JDEndereco(); //Instanciando a classe 
    
    public void Salvar( JDEndereco cliend){
      connecta.conexao();
      try {
         
          PreparedStatement pst = connecta.con.prepareStatement(" "
                  + "DO $$" 
                  + "DECLARE tableId integer ;" 
                  +"BEGIN "
                  + "Insert into cliente(idcliente, nome, email) values (DEFAULT, ?, ?)"
                  +" RETURNING idcliente INTO tableId;"
                  + "Insert into endereco(idendereco,logradouro, numero, cidade, estado, idcliente) "
                  + "values (DEFAULT,?,?,?,?,tableId)"
                  + "END $$ LANGUAGE plpgsql;");     
        
          
            pst.setString(1, cliend.getNome());
            pst.setString(2, cliend.getEmail());
            
          
            pst.setString(3, cliend.getLogradouro());
            pst.setInt(4, cliend.getNumero());
            pst.setString(5, cliend.getCidade());
            pst.setString(6, cliend.getEstado());                     
           // pst.setInt(5, cliend.getIdcliente());
            pst.execute();
           
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados\n" + ex);        
      connecta.desconecta();
    }
    }
    
    public void Editar (JDCliente mod){
      connecta.conexao();
        try {
            PreparedStatement pst = connecta.con.prepareStatement("update cliente set  nome=?, email=? where idcliente=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEmail()); 
            pst.setLong(3, mod.getIdcliente());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Alterados com sucesso");    
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Dados não alterados\n" + ex);     
        connecta.desconecta();
        
        }
   }
   
    
    public void Excluir (JDCliente mod){
      connecta.conexao();
        try {
            PreparedStatement pst = connecta.con.prepareStatement("delete from cliente where idcliente=?");
            pst.setLong(1, mod.getIdcliente());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Excluidos com sucesso");    
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Dados não excluídos\n" + ex);     
        connecta.desconecta();
        
        }
   }
    
    
    
  public JDEndereco buscCliente(JDEndereco modend){
    connecta.conexao();
    connecta.executaSql("Select * from cliente p inner join cliente es on p.idcliente = es.idcliente"
                + " where p.nome like'%"+modend.getPesquisa()+"%'");
        try {
            connecta.rs.first();
            modend.getjDCliente().setIdcliente(connecta.rs.getLong("idcliente"));
           modend.getjDCliente().setNome(connecta.rs.getString("nome"));
           modend.getjDCliente().setEmail(connecta.rs.getString("email"));
            
             modend.setLogradouro(connecta.rs.getString("logradouro"));
              modend.setNumero(connecta.rs.getInt("numero"));
               modend.setCidade(connecta.rs.getString("cidade"));
                modend.setEstado(connecta.rs.getString("estado"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados na tabela\n" + ex);
        }
        connecta.desconecta();
        return (modend);
  
  }
}
