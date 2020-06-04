package view;

import dao.JDClienteDAO;
import java.awt.HeadlessException;
import model.JDCliente;
import model.JDModeloTabela;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import model.JDEndereco;

import util.Conexao;
import util.JDteclasMas;


public class JDClienteframe extends javax.swing.JFrame {

    // Variável que recebe a instância da tela principal
    private JDClienteframe telaCliente;
   Conexao connecta = new Conexao();
   
   JDCliente Modcli = new JDCliente();
   JDEndereco Modend = new JDEndereco();   
   
   
   JDClienteDAO contCad = new JDClienteDAO();
   
   
    
    
    public JDClienteframe() {
       initComponents();
       habilitaCampos();
       
       jT1nome.setDocument(new JDteclasMas());
      
       
       desabilitaCampos();
        connecta.conexao();
    }

    private void desabilitaCampos() {
        jT0Id.setEditable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jT0Id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jT1nome = new javax.swing.JTextField();
        jT2email = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jBInserir = new javax.swing.JButton();
        jBSelecionar = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBlimpar = new javax.swing.JButton();
        scrDados = new javax.swing.JScrollPane();
        tableDados = new javax.swing.JTable();
        pnlCampos = new javax.swing.JPanel();
        btnPesq = new javax.swing.JButton();
        txtPesq = new javax.swing.JTextField();
        lblPesq = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jT4numero = new javax.swing.JTextField();
        jT3logradouro = new javax.swing.JTextField();
        jT6estado = new javax.swing.JTextField();
        jT5cidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel7.setText("ID: ");

        jLabel1.setText("Nome: ");

        jT1nome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel2.setText("E-mail: ");

        jBInserir.setText("Inserir");
        jBInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInserirActionPerformed(evt);
            }
        });

        jBSelecionar.setText("Selecionar");
        jBSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSelecionarActionPerformed(evt);
            }
        });

        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBlimpar.setText("Limpar");
        jBlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimparActionPerformed(evt);
            }
        });

        tableDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDadosMouseClicked(evt);
            }
        });
        scrDados.setViewportView(tableDados);

        pnlCampos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnPesq.setText("Pesquisar");
        btnPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqActionPerformed(evt);
            }
        });

        txtPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesqActionPerformed(evt);
            }
        });

        lblPesq.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPesq.setText("DIGITE O NOME PARA PESQUISAR");

        javax.swing.GroupLayout pnlCamposLayout = new javax.swing.GroupLayout(pnlCampos);
        pnlCampos.setLayout(pnlCamposLayout);
        pnlCamposLayout.setHorizontalGroup(
            pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCamposLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(lblPesq)
                .addGap(24, 24, 24))
            .addGroup(pnlCamposLayout.createSequentialGroup()
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCamposLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(txtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCamposLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCamposLayout.setVerticalGroup(
            pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPesq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel3.setText("Logradouro:");

        jLabel4.setText("Número:");

        jLabel5.setText("Cidade:");

        jLabel6.setText("Estado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator3)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jBInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jBlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel7))
                                .addGap(42, 42, 42))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jT0Id, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT2email, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT1nome, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT4numero, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT3logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT6estado, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT5cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(pnlCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrDados)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jT0Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jT1nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jT2email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addComponent(pnlCampos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jT3logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jT4numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jT5cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jT6estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBInserir)
                    .addComponent(jBSelecionar)
                    .addComponent(jBAlterar)
                    .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBlimpar))
                .addGap(17, 17, 17)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrDados, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBAlterar, jBExcluir, jBInserir, jBSelecionar, jBlimpar});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    JDClienteframe(JDClienteframe telaCliente) {
        this();
        this.telaCliente = telaCliente;

    }

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

        telaCliente.setEnabled(true);

    }//GEN-LAST:event_formWindowClosed

    private void jBlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimparActionPerformed
        this.dispose();
        limpaCampos();
    }//GEN-LAST:event_jBlimparActionPerformed

  
    private void jBInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInserirActionPerformed
    
          try {
              
           Modend.setNome(jT1nome.getText());
             Modend.setEmail(jT2email.getText());
            
               
            Modend.setLogradouro(jT3logradouro.getText());
            Modend.setNumero(Integer.valueOf(jT4numero.getText()));
            Modend.setCidade(jT5cidade.getText());
            Modend.setEstado(jT6estado.getText());
             
            contCad.Salvar( Modend);  
           
             
          jT1nome.setText("");
           jT2email.setText("");   
             jT3logradouro.setText("");  
             jT4numero.setText("");  
             jT5cidade.setText("");  
             jT6estado.setText("");  

            } catch (HeadlessException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar cliente.");
           }
        
       preencherTabela(" select * from cliente p\n" +
        " inner join endereco es on p.idcliente = es.idcliente");
    }//GEN-LAST:event_jBInserirActionPerformed

    private void jBSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSelecionarActionPerformed
        preencherTabela(" select * from cliente p\n" +
        " inner join endereco es on p.idcliente = es.idcliente");
    }//GEN-LAST:event_jBSelecionarActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        Modcli.setIdcliente(Long.parseLong(jT0Id.getText()));
        Modcli.setNome(jT1nome.getText());
       Modcli.setEmail(jT2email.getText());
       contCad.Editar(Modcli);
       preencherTabela(" select * from cliente p\n" +
        " inner join endereco es on p.idcliente = es.idcliente");
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
       
       Modcli.setIdcliente(Long.parseLong(jT0Id.getText()));
       Modcli.setNome(jT1nome.getText());
       Modcli.setEmail(jT2email.getText());
       contCad.Excluir(Modcli); 
       limpaCampos();
        preencherTabela(" select * from cliente p\n" +
        " inner join endereco es on p.idcliente = es.idcliente");
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void btnPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqActionPerformed
        Modend.setPesquisa(txtPesq.getText());
        JDEndereco jdendereco = contCad.buscCliente(Modend);
        
        jT0Id.setText(String.valueOf(jdendereco.getjDCliente().getIdcliente()));
        jT1nome.setText(jdendereco.getjDCliente().getNome());
        jT2email.setText(jdendereco.getjDCliente().getEmail());
        
        jT3logradouro.setText(jdendereco.getLogradouro());
         jT4numero.setText(String.valueOf(jdendereco.getNumero()));
         jT5cidade.setText(jdendereco.getCidade());
         jT6estado.setText(jdendereco.getEstado());
        
        
        preencherTabela("Select * from cliente p inner join endereco es on p.idcliente = es.idcliente"
                + " where nome like'%"+Modcli.getPesquisa()+"%'");
    }//GEN-LAST:event_btnPesqActionPerformed

    private void txtPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesqActionPerformed

    private void tableDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDadosMouseClicked
       int linhaSelecionada = tableDados.getSelectedRow();
        
       jT0Id.setText(tableDados.getValueAt(linhaSelecionada, 0).toString()); 
       jT1nome.setText(tableDados.getValueAt(linhaSelecionada, 1).toString()); 
       jT2email.setText(tableDados.getValueAt(linhaSelecionada, 2).toString()); 
    }//GEN-LAST:event_tableDadosMouseClicked
  // Habilita os campos do formulário
    private void habilitaCampos() {        
        jT1nome.setEditable(true);
        jT2email.setEditable(true);
        
    }
    
    // Limpa os campos do formulário
    private void limpaCampos() {
        jT0Id.setText("");
        jT1nome.setText("");
        jT2email.setText("");

    }

    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID","NOME","EMAIL","LOGRADOURO","NUMERO","CIDADE","ESTADO"};
         connecta.conexao();
        connecta.executaSql(Sql);
        try{
          connecta.rs.first();
          do{
            dados.add(new Object[]{connecta.rs.getLong("idcliente"),connecta.rs.getString("nome"),connecta.rs.getString("email")
            ,connecta.rs.getString("logradouro"),connecta.rs.getInt("numero"),connecta.rs.getString("cidade")
            ,connecta.rs.getString("estado")});
         }while (connecta.rs.next());
        } catch(SQLException ex){
            JOptionPane.showMessageDialog (rootPane,"Erro ao Preencher ArrayList"+ ex);
        }
        JDModeloTabela modelo = new JDModeloTabela(dados, colunas);
        tableDados.setModel(modelo);
        tableDados.getColumnModel().getColumn(0).setPreferredWidth(50);
        tableDados.getColumnModel().getColumn(0).setResizable(false);
        tableDados.getColumnModel().getColumn(1).setPreferredWidth(200);
        tableDados.getColumnModel().getColumn(1).setResizable(false);
        tableDados.getColumnModel().getColumn(2).setPreferredWidth(120);
        tableDados.getColumnModel().getColumn(2).setResizable(false); 
        tableDados.getColumnModel().getColumn(3).setPreferredWidth(100);
        tableDados.getColumnModel().getColumn(3).setResizable(false);
        tableDados.getColumnModel().getColumn(4).setPreferredWidth(50);
        tableDados.getColumnModel().getColumn(4).setResizable(false);
        tableDados.getColumnModel().getColumn(5).setPreferredWidth(50);
        tableDados.getColumnModel().getColumn(5).setResizable(false);//sem alterar o tamanho
        tableDados.getColumnModel().getColumn(6).setPreferredWidth(50);
        tableDados.getColumnModel().getColumn(6).setResizable(false);
        tableDados.getColumnModel().getColumn(7).setPreferredWidth(250);
        tableDados.getColumnModel().getColumn(7).setResizable(false);

        tableDados.getTableHeader().setReorderingAllowed(false); //sem reorganizar as colunas
        tableDados.setAutoResizeMode(tableDados.AUTO_RESIZE_OFF);//sem redimensionamento
        //ao tocar na tabela selecionará apena um por vez
        tableDados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        connecta.desconecta();
    }

     
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JDClienteframe().setVisible(true);
            }
        });
    }    



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesq;
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBInserir;
    private javax.swing.JButton jBSelecionar;
    private javax.swing.JButton jBlimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jT0Id;
    private javax.swing.JTextField jT1nome;
    private javax.swing.JTextField jT2email;
    private javax.swing.JTextField jT3logradouro;
    private javax.swing.JTextField jT4numero;
    private javax.swing.JTextField jT5cidade;
    private javax.swing.JTextField jT6estado;
    private javax.swing.JLabel lblPesq;
    private javax.swing.JPanel pnlCampos;
    private javax.swing.JScrollPane scrDados;
    private javax.swing.JTable tableDados;
    private javax.swing.JTextField txtPesq;
    // End of variables declaration//GEN-END:variables

}
