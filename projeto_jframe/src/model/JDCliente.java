
package model;

public class JDCliente {
    
    private Long idcliente;
    private String nome;
    private String email;

    public JDCliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        
    }
    
     public JDCliente() {
    }  

    public Long getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Long idcliente) {
        this.idcliente = idcliente;
    }  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



   
    
}
