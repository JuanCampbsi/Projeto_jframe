package dao;

import util.Conexao;
import model.JDCliente;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class JDClienteDAO {

    Conexao connecta = new Conexao();//Criando instancia de conexão
    JDCliente cli = new JDCliente(); //Instanciando a classe ClienteBeans
    
    
    public void Salvar(JDCliente cli){
      connecta.conexao();
      try {
          //responsável por receber a instrução sql  
          PreparedStatement pst = connecta.con.prepareStatement("Insert into cliente( nome, email) values (?,?)");           
            pst.setString(1, cli.getNome());
            pst.setString(2, cli.getEmail());
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
    
    
    
  public JDCliente buscCliente(JDCliente modi){
    connecta.conexao();
    connecta.executaSql("Select * from cliente where nome like'%"+modi.getPesquisa()+"%'");
        try {
            connecta.rs.first();
            modi.setIdcliente(connecta.rs.getLong("idcliente"));
            modi.setNome(connecta.rs.getString("nome"));
            modi.setEmail(connecta.rs.getString("email"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados na tabela\n" + ex);
        }
        connecta.desconecta();
        return (modi);
  
  }
}
