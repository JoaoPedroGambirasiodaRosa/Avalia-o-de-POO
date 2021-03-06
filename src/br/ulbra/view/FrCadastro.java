/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

import br.ulbra.model.Agenda;
import br.ulbra.model.AgendaDAO;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JPGR
 */
public class FrCadastro extends javax.swing.JFrame {

    /**
     * Creates new form FrCadUsuario
     */
    public FrCadastro() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        showTable();
        controlarTela(1);
    }

    public void showTable() throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) tbAgenda.getModel();
        modelo.setNumRows(0);
        AgendaDAO udao = new AgendaDAO();
        for (Agenda p : udao.read()) {
            modelo.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getEmail(),
                p.getSenha(),
                p.getTelefone(),
                p.getRecado()
            });
        }
    }

    public void showTableForName(String nome) throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) tbAgenda.getModel();
        modelo.setNumRows(0);
        AgendaDAO udao = new AgendaDAO();
        for (Agenda p : udao.readPesq(nome)) {
            modelo.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getEmail(),
                p.getSenha(),
                p.getTelefone(),
                p.getRecado()
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbAgenda = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        txtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaRecado = new javax.swing.JTextArea();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 102));

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel1)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("C??DIGO:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        txtid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 68, 34));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOME:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        txtNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 370, 34));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("E-MAIL:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        tbAgenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID:", "NOME:", "E-MAIL:", "SENHA:", "TELEFONE:", "RECADO:"
            }
        ));
        tbAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAgendaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbAgenda);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, 470, 150));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("BUSCAR NOME:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, -1, -1));

        txtBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 280, 34));

        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/lupa.png"))); // NOI18N
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 550, 44, 34));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("RECADO:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 150, 34));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 470, 34));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("SENHA:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        txtTelefone.setEditable(false);
        getContentPane().add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 290, 34));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("TELEFONE:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        btNovo.setBackground(new java.awt.Color(0, 153, 255));
        btNovo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btNovo.setForeground(new java.awt.Color(255, 255, 255));
        btNovo.setText("NOVO");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btSalvar.setBackground(new java.awt.Color(51, 255, 51));
        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setText("SALVAR");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btAlterar.setBackground(new java.awt.Color(255, 102, 0));
        btAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btAlterar.setText("ALTERAR");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btExcluir.setBackground(new java.awt.Color(255, 0, 0));
        btExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btExcluir.setText("EXCLUIR");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btLimpar.setBackground(new java.awt.Color(0, 0, 0));
        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btLimpar.setText("LIMPAR");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        jTextAreaRecado.setEditable(false);
        jTextAreaRecado.setColumns(20);
        jTextAreaRecado.setRows(5);
        jScrollPane3.setViewportView(jTextAreaRecado);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(271, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 600, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        Agenda u = new Agenda();
        u.setNome(txtNome.getText());
        u.setEmail(txtEmail.getText());
        u.setSenha(txtSenha.getText());
        u.setTelefone(txtTelefone.getText());
        u.setRecado(jTextAreaRecado.getText());
                
        try {
            AgendaDAO udao = new AgendaDAO();
            udao.create(u);
            showTable();
            controlarTela(1);
            limparCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e.getMessage());
        }


    }//GEN-LAST:event_btSalvarActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed

        try {
            showTableForName(txtBuscar.getText());
        } catch (SQLException ex) {
            Logger.getLogger(FrCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void tbAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAgendaMouseClicked
        if (tbAgenda.getSelectedRow() != -1) {
            txtid.setText(tbAgenda.getValueAt(tbAgenda.getSelectedRow(), 0)
                    .toString());
            txtNome.setText(tbAgenda.getValueAt(tbAgenda.getSelectedRow(), 1)
                    .toString());
            txtEmail.setText(tbAgenda.getValueAt(tbAgenda.getSelectedRow(), 2)
                    .toString());
            txtSenha.setText(tbAgenda.getValueAt(tbAgenda.getSelectedRow(), 3)
                    .toString());
            txtTelefone.setText(tbAgenda.getValueAt(tbAgenda.getSelectedRow(), 4)
                    .toString());
            jTextAreaRecado.setText(tbAgenda.getValueAt(tbAgenda.getSelectedRow(), 5)
                    .toString());
            controlarTela(3);

        }
    }//GEN-LAST:event_tbAgendaMouseClicked

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        controlarTela(2);
    }//GEN-LAST:event_btNovoActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        Agenda u = new Agenda();
        u.setId(Integer.parseInt(txtid.getText()));
        u.setNome(txtNome.getText());
        u.setEmail(txtEmail.getText());
        u.setSenha(txtSenha.getText());
        u.setTelefone(txtTelefone.getText());
        u.setRecado(jTextAreaRecado.getText());

        AgendaDAO udao;
        try {
            udao = new AgendaDAO();
            udao.update(u);
            showTable();
            controlarTela(1);
        } catch (SQLException ex) {
            Logger.getLogger(FrCadastro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(FrCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        Agenda u = new Agenda();
        u.setId(Integer.parseInt(txtid.getText()));
        AgendaDAO udao;
        try {
            udao = new AgendaDAO();
            udao.delete(u);
            showTable();
            controlarTela(1);
            limparCampos();
        } catch (SQLException ex) {
            Logger.getLogger(FrCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparCampos();
        controlarTela(1);
    }//GEN-LAST:event_btLimparActionPerformed
  public void limparCampos(){
            txtid.setText(null);
            txtNome.setText(null);
            txtEmail.setText(null);
            txtSenha.setText(null);
            txtTelefone.setText(null);
            jTextAreaRecado.setText(null);
  }
    public void controlarTela(int op) {
        if (op == 1) { //quando inicializado o formulario pela primeira vez
            txtid.setEnabled(false);
            txtNome.setEnabled(false);
            txtEmail.setEnabled(false);
            txtSenha.setEnabled(false);
            txtTelefone.setEnabled(false);
            jTextAreaRecado.setEnabled(false);
            btSalvar.setEnabled(false);
            btExcluir.setEnabled(false);
            btAlterar.setEnabled(false);
            btNovo.setEnabled(true);
            
        }else if(op==2){ //quando clicado o bot??o novo
            txtid.setEnabled(false);
            txtNome.setEnabled(true);
            txtEmail.setEnabled(true);
            txtSenha.setEnabled(true);
            txtTelefone.setEnabled(true);
            jTextAreaRecado.setEnabled(true);
            btSalvar.setEnabled(true);
            btExcluir.setEnabled(false);
            btAlterar.setEnabled(false);
            btNovo.setEnabled(false);
            txtNome.requestFocus();
            limparCampos();
            
        }else if(op==3){
             txtNome.setEnabled(true);
            txtEmail.setEnabled(true);
            txtSenha.setEnabled(true);
            txtTelefone.setEnabled(true);
            jTextAreaRecado.setEnabled(true);
            btSalvar.setEnabled(false);
            btExcluir.setEnabled(true);
            btAlterar.setEnabled(true);
            btNovo.setEnabled(true);
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrCadastro().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FrCadastro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaRecado;
    private javax.swing.JTable tbAgenda;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
