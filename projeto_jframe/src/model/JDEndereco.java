
package model;

public class JDEndereco {
     private Long idendereco;
      private String logradouro;
    private int numero;
    private String cidade;
    private String estado;
    private int idcliente;   
    private JDCliente jDCliente;
    
     private String nome;
     private String email;
   

    public JDCliente getjDCliente() {
        return jDCliente;
    }

    public void setjDCliente(JDCliente jDCliente) {
        this.jDCliente = jDCliente;
    }
    
    
    
    public JDEndereco(String logradouro, int numero, String cidade, String estado, int idcliente, JDCliente jDCliente,
            String nome, String email){  
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.idcliente= idcliente;
        this.jDCliente = jDCliente;
        this.nome=nome;
        this.email=email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

      private String Pesquisa;

    public String getPesquisa() {
        return Pesquisa;
    }

    public void setPesquisa(String Pesquisa) {
        this.Pesquisa = Pesquisa;
    }
    public JDEndereco() {
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getIdendereco() {
        return idendereco;
    }

    public void setIdendereco(Long idendereco) {
        this.idendereco = idendereco;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

   

    

}