package view;

import dao.JDClienteDAO;
import java.awt.HeadlessException;
import model.JDCliente;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;

public class JDClienteframe extends javax.swing.JFrame {

    // Variável que recebe a instância da tela principal
    private JDClienteframe telaCliente;

    public JDClienteframe() {
        initComponents();
        desabilitaCampos();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesquisa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel7.setText("ID: ");

        jLabel1.setText("Nome: ");

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

        jTablePesquisa.setModel(tmCliente);
        jTablePesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePesquisaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePesquisa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jT2email, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                            .addComponent(jT0Id, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT1nome)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT0Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jT1nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT2email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBInserir)
                    .addComponent(jBSelecionar)
                    .addComponent(jBAlterar)
                    .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBlimpar))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
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
    }//GEN-LAST:event_jBlimparActionPerformed

  
    private void jBInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInserirActionPerformed
     inserirRegistro();
       
    }//GEN-LAST:event_jBInserirActionPerformed

    private void jBSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSelecionarActionPerformed
     
        try {            
            listaClientes(); 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Problemas ao listar clientes");            
        }   
    }//GEN-LAST:event_jBSelecionarActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
 
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed

    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jTablePesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePesquisaMouseClicked
        // Salva a posição da linha selecionada na tabela de pesquisa
        int linhaSelecionada = jTablePesquisa.getSelectedRow();

        jT0Id.setText(jTablePesquisa.getValueAt(linhaSelecionada, 0).toString());
        jT1nome.setText((String) jTablePesquisa.getValueAt(linhaSelecionada, 1));
        jT2email.setText((String) jTablePesquisa.getValueAt(linhaSelecionada, 2));
       

         habilitaCampos();
    }//GEN-LAST:event_jTablePesquisaMouseClicked
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

     /* ----INSERIR-> */
    // MÉTODOS:
    
    // Método p/ cadastrar um registro no banco de dados.
    private void inserirRegistro() {
       
                try {
                    JDCliente c = new JDCliente();
                    
                    c.setNome(jT1nome.getText());                   
                    c.setEmail(jT2email.getText());
                   

                    JDClienteDAO d = new  JDClienteDAO();

                    d.adiciona(c);

                    JOptionPane.showMessageDialog(rootPane, "Dados cadastrados com sucesso.");
                    limpaCampos();
                    desabilitaCampos();
                
                } catch (HeadlessException e) {
                    JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar cliente.");
                }
            
      
    }
    
     
    
    
    
/* ----PESQUISA-> */
    // MÉTODOS:
    

    DefaultTableModel tmCliente = new DefaultTableModel(null, new String[]{"id", "nome", "email"});
    List<JDCliente> clientes;
        
    
    
    private void listaClientes() throws SQLException {
        limpaCampos();
        JDClienteDAO d = new JDClienteDAO();
        clientes = d.getLista("%" + jBSelecionar.getText() + "%"); 
        
        // Após pesquisar os contatos, executa o método p/ exibir o resultado na tabela pesquisa
        mostraPesquisa(clientes);
        clientes.clear();
    }
    
   
    private void mostraPesquisa(List<JDCliente> clientes) {
      
        limparTabela();
        
        if (clientes.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Nenhum registro não encontrado.");
        } else {            
            // Linha em branco usada no for, para cada registro é criada uma nova linha 
            String[] linha = new String[] {null, null, null, null, null, null, null};
            // P/ cada registro é criada uma nova linha, cada recebe linha os campos do registro
            for (int i = 0; i < clientes.size(); i++) {
                tmCliente.addRow(linha);
                tmCliente.setValueAt(clientes.get(i).getIdcliente(), i, 0);
                tmCliente.setValueAt(clientes.get(i).getNome(), i, 1);
                tmCliente.setValueAt(clientes.get(i).getEmail(), i, 2);
                       
            }            
        }
    }
    
    

    
    // Limpa a tabela de resultados
    private void limparTabela() {       
        while (tmCliente.getRowCount() > 0) {            
            tmCliente.removeRow(0);
        }
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
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBInserir;
    private javax.swing.JButton jBSelecionar;
    private javax.swing.JButton jBlimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jT0Id;
    private javax.swing.JTextField jT1nome;
    private javax.swing.JTextField jT2email;
    private javax.swing.JTable jTablePesquisa;
    // End of variables declaration//GEN-END:variables

}
