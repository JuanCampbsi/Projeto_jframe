// situa em qual package ou “pacote” está a classe
package util;
// faz as importações de classes necessárias para o funcionamento do 
//programa

import java.sql.Connection; // conexão SQL para Java 
import java.sql.DriverManager; // driver de conexão SQL para Java 
import java.sql.ResultSet;
import java.sql.SQLException; // classe para tratamento de exceções
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexao {

     
    public Statement stm;
    public ResultSet rs;
  
    private String driver =  "org.postgresql.Driver";
    private String caminho = "jdbc:postgresql://localhost:5432/BancoFeuc";
    private String usuario = "postgres";
    private String senha = "admin";
    
    public Connection con;
    
   
    public void conexao(){
      System.setProperty("jdbc.Drivers", driver);
        try {
            con = DriverManager.getConnection(caminho,usuario,senha);
        //    JOptionPane.showMessageDialog (null,"Conexão Realizada com sucesso!");
        } catch (SQLException ex) {
         JOptionPane.showMessageDialog (null,"Erro de Conexão\n"+ ex);
        }
    
    }
    
   
    public void executaSql(String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Erro de Execução do Sql\n"+ex.getMessage());
        }
    }
    

    public void desconecta(){
        try {
            con.close();
      //      JOptionPane.showMessageDialog (null,"Conexão Fechada!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog (null,"Erro ao fechar conexão com BD \n "+ ex);;
        }
    
    
    }
}
