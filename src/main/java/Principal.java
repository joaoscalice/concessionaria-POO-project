/*João Victor Nunino Scalice
RA: 2475316
ADS 2022_02
VERSÃO JDK: 18.0.2.1
PROGRAMA: Net Beans 15
*/

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author João Scalice
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
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
        btSair = new javax.swing.JButton();
        btCadastraUser = new javax.swing.JButton();
        btCadastraAuto = new javax.swing.JButton();
        lblSubTitulo = new javax.swing.JLabel();
        btTabelUser = new javax.swing.JButton();
        btTabelAuto = new javax.swing.JButton();
        btManipularUser = new javax.swing.JButton();
        btManipularAuto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblTitulo.setText("PRINCIPAL");

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btCadastraUser.setText("Cadastrar Usuário");
        btCadastraUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastraUserActionPerformed(evt);
            }
        });

        btCadastraAuto.setText("Cadastrar Automóvel");
        btCadastraAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastraAutoActionPerformed(evt);
            }
        });

        lblSubTitulo.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        lblSubTitulo.setText("SISTEMA DE CADASTRO CONCESSIONÁRIA");

        btTabelUser.setText("Tabela de Usuários");
        btTabelUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTabelUserActionPerformed(evt);
            }
        });

        btTabelAuto.setText("Tabela de Automóveis");
        btTabelAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTabelAutoActionPerformed(evt);
            }
        });

        btManipularUser.setText("Manipulação de Dados Usuário");
        btManipularUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btManipularUserActionPerformed(evt);
            }
        });

        btManipularAuto.setText("Manipulação de Dados Automóvel");
        btManipularAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btManipularAutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btSair)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btCadastraUser, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCadastraAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btManipularUser, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btManipularAuto))
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btTabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btTabelAuto))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSubTitulo)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(257, 257, 257))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSubTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTabelUser)
                    .addComponent(btManipularUser)
                    .addComponent(btCadastraUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTabelAuto)
                    .addComponent(btManipularAuto)
                    .addComponent(btCadastraAuto))
                .addGap(48, 48, 48)
                .addComponent(btSair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadastraUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastraUserActionPerformed
        CadUsuario.getCadUsuario().setVisible(true);
    }//GEN-LAST:event_btCadastraUserActionPerformed

    private void btCadastraAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastraAutoActionPerformed
        CadAutomovel.getCadAuto().setVisible(true);
    }//GEN-LAST:event_btCadastraAutoActionPerformed

    private void btManipularUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btManipularUserActionPerformed
        ManipulaUsuario.getConsUsuario().setVisible(true);
    }//GEN-LAST:event_btManipularUserActionPerformed

    private void btTabelUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTabelUserActionPerformed
        TabUsuario.getTabUsuario().setVisible(true);
    }//GEN-LAST:event_btTabelUserActionPerformed

    private void btTabelAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTabelAutoActionPerformed
        TabAutomovel.getTabAutomovel().setVisible(true);
    }//GEN-LAST:event_btTabelAutoActionPerformed

    private void btManipularAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btManipularAutoActionPerformed
        ManipulaAuto.getConsAutomovel().setVisible(true);
    }//GEN-LAST:event_btManipularAutoActionPerformed
    
    public void sair(){
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Saída", JOptionPane.YES_NO_CANCEL_OPTION);
        if (resp == 0)
            this.dispose();
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastraAuto;
    private javax.swing.JButton btCadastraUser;
    private javax.swing.JButton btManipularAuto;
    private javax.swing.JButton btManipularUser;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btTabelAuto;
    private javax.swing.JButton btTabelUser;
    private javax.swing.JLabel lblSubTitulo;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
