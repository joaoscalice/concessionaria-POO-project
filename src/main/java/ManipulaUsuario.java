/*João Victor Nunino Scalice
RA: 2475316
ADS 2022_02*/

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author João Scalice
 */
public class ManipulaUsuario extends javax.swing.JFrame {

    private static ManipulaUsuario consUsuario = null;
    private Usuario user = null;
    private GerConcessionaria gerConcessionaria = null;

    public ManipulaUsuario() {
        initComponents();
    }

    public static ManipulaUsuario getConsUsuario() {
        if (consUsuario == null) {
            consUsuario = new ManipulaUsuario();
            return consUsuario;
        }
        return consUsuario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        ctCpf = new javax.swing.JTextField();
        ctNome = new javax.swing.JTextField();
        btSair = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        lblFunUser = new javax.swing.JLabel();
        cbFuncUser = new javax.swing.JComboBox<>();
        btAlterar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        ctId = new javax.swing.JTextField();
        lblRua = new javax.swing.JLabel();
        lblNum = new javax.swing.JLabel();
        lblCep = new javax.swing.JLabel();
        ctRua = new javax.swing.JTextField();
        ctNum = new javax.swing.JTextField();
        ctCep = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitulo.setText("MANIPULAÇÃO DE USUÁRIO");

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNome.setText("NOME:");

        lblCpf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCpf.setText("DIGITE O CPF PARA MANIPULAR:");

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        lblFunUser.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblFunUser.setText("FUNÇÃO DO USUÁRIO:");

        cbFuncUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Funcionário" }));
        cbFuncUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFuncUserActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        lblId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblId.setText("ID:");

        ctId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctIdActionPerformed(evt);
            }
        });

        lblRua.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblRua.setText("RUA:");

        lblNum.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNum.setText("NUM:");

        lblCep.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCep.setText("CEP:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ctCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblCep)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ctCep))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblNum)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ctNum))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblRua)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ctRua, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(93, 93, 93))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(285, 285, 285)
                                .addComponent(cbFuncUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCpf)
                                    .addComponent(lblFunUser)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblId)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ctId, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btSair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btConsultar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(lblFunUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbFuncUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(ctCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRua)
                    .addComponent(ctRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNum)
                    .addComponent(ctNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblId)
                            .addComponent(ctId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCep)
                            .addComponent(ctCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConsultar)
                    .addComponent(btAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btRemover)
                    .addComponent(btLimpar)
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultaUser();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void cbFuncUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFuncUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFuncUserActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        alteraUser();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        removeUser();
    }//GEN-LAST:event_btRemoverActionPerformed

    private void ctIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctIdActionPerformed

    public void sair() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair?", "SAÍDA", JOptionPane.YES_NO_CANCEL_OPTION);
        if (resp == 0) {
            this.dispose();
        }
    }

    public void limpar() {
        ctNome.setText("");
        ctCpf.setText("");
        ctId.setText(" ");
        ctRua.setText(" ");
        ctNum.setText(" ");
        ctCep.setText(" ");
        ctNome.requestFocus();
    }

    public void consultaUser() {
        if (cbFuncUser.getSelectedItem() == "Cliente") {
            user = new Cliente();
            ((Cliente) user).setIdCliente(Integer.parseInt(ctCpf.getText()));
        } else {
            user = new Funcionario();
            ((Funcionario) user).setIdFuncio(Integer.parseInt(ctCpf.getText()));
        }

        try {
            user.setCpf(Integer.parseInt(ctCpf.getText()));

            user = GerConcessionaria.getGerConcessionaria().consUser(user);

            if (user != null) {
                ctCpf.setText(Integer.toString(user.getCpf()));
                ctNome.setText(user.getNome());
                if(cbFuncUser.getSelectedItem() == "Cliente"){
                    ctId.setText(Integer.toString(((Cliente)user).getIdCliente()));
                } else {
                    ctId.setText(Integer.toString(((Funcionario)user).getIdFuncio()));
                }
                ctRua.setText(user.getEnder().getRua());
                ctNum.setText(Integer.toString(user.getEnder().getNum()));
                ctCep.setText(Integer.toString(user.getEnder().getCep()));
                JOptionPane.showMessageDialog(null, "Confirme os dados do Usuário", "Consulta de dados", 1);
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Não existe usuário com esse CPF", "CPF inexiste", 0);
                limpar();
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O CPF deve ser um número inteiro de 1 a 1000!", "Erro de CPF", 0);
            ctCpf.setText("");
            ctCpf.requestFocus();
        }
    }

    public void alteraUser() {
        if (cbFuncUser.getSelectedItem() == "Cliente") {
            user = new Cliente();
            ((Cliente) user).setIdCliente(Integer.parseInt(ctCpf.getText()));
        } else {
            user = new Funcionario();
            ((Funcionario) user).setIdFuncio(Integer.parseInt(ctCpf.getText()));
        }

        try {
            user.setCpf(Integer.parseInt(ctCpf.getText()));
            user = GerConcessionaria.getGerConcessionaria().attUser(user);

            if (user != null) {
                ctCpf.setText(Integer.toString(user.getCpf()));
                ctNome.setText(user.getNome());
                JOptionPane.showMessageDialog(null, "Confirme os dados do Usuário", "Confirmação de Dados", 1);
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Não existe usuário com esse CPF", "CPF inexistente", 0);
                limpar();
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O CPF deve ser um número inteiro de 1 a 1000!", "Erro de CPF", 0);
            ctCpf.setText("");
            ctCpf.requestFocus();
        }
    }

    public void removeUser() {
        if (cbFuncUser.getSelectedItem() == "Cliente") {
            user = new Cliente();
            ((Cliente) user).setIdCliente(Integer.parseInt(ctCpf.getText()));
        } else {
            user = new Funcionario();
            ((Funcionario) user).setIdFuncio(Integer.parseInt(ctCpf.getText()));
        }

        try {
            int x = JOptionPane.showConfirmDialog(null, "Deseja excluir esse Usuário", "Confirmação de Exclusão", JOptionPane.YES_NO_CANCEL_OPTION);
            if (x == 0) {
                user.setCpf(Integer.parseInt(ctCpf.getText()));
                user = GerConcessionaria.getGerConcessionaria().removeUser(user);
                
                if (user == null) {
                    JOptionPane.showMessageDialog(null, "Usuário excluído com Sucesso!", "Exclusão de Usuário", 1);
                } else {
                    JOptionPane.showMessageDialog(null, "Não existe usuário com esse CPF", "CPF inexistente", 0);
                }
            }
            limpar();

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O CPF deve ser um número inteiro de 1 a 1000!", "Erro de CPF", 0);
            ctCpf.setText("");
            ctCpf.requestFocus();
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
            java.util.logging.Logger.getLogger(ManipulaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManipulaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManipulaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManipulaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManipulaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btSair;
    private javax.swing.JComboBox<String> cbFuncUser;
    private javax.swing.JTextField ctCep;
    private javax.swing.JTextField ctCpf;
    private javax.swing.JTextField ctId;
    private javax.swing.JTextField ctNome;
    private javax.swing.JTextField ctNum;
    private javax.swing.JTextField ctRua;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblFunUser;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
