// situa em qual package ou “pacote” está a classe
package util;
// faz as importações de classes necessárias para o funcionamento do 
//programa

import java.sql.Connection; // conexão SQL para Java 
import java.sql.DriverManager; // driver de conexão SQL para Java 
import java.sql.SQLException; // classe para tratamento de exceções

public class JDConnectioFactory {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:postgresql:BancoFeuc", "postgres", "admin");
        } catch (SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}
