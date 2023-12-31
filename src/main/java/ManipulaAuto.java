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
public class ManipulaAuto extends javax.swing.JFrame {

    private static ManipulaAuto consAutomovel = null;
    private Automovel auto = null;
    private GerConcessionaria gerConcessionaria = null;

    /**
     * Creates new form ConsAuto
     */
    public ManipulaAuto() {
        initComponents();
    }

    public static ManipulaAuto getConsAutomovel() {
        if (consAutomovel == null) {
            consAutomovel = new ManipulaAuto();
            return consAutomovel;
        }
        return consAutomovel;
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
        lblPlaca = new javax.swing.JLabel();
        lblCodVeic = new javax.swing.JLabel();
        ctPlaca = new javax.swing.JTextField();
        ctCodVeic = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        lblTypeAuto = new javax.swing.JLabel();
        cbTypeAuto = new javax.swing.JComboBox<>();
        btAlterar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblAno = new javax.swing.JLabel();
        ctAno = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        lblCor = new javax.swing.JLabel();
        ctMarca = new javax.swing.JTextField();
        ctCor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitulo.setText("MANIPULAÇÃO DE AUTOMÓVEL");

        lblPlaca.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPlaca.setText("PLACA:");

        lblCodVeic.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCodVeic.setText("DIGITE O CÓDIGO PARA MANIPULAR:");

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        lblTypeAuto.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblTypeAuto.setText("TIPO DE AUTOMÓVEL:");

        cbTypeAuto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carro", "Moto" }));
        cbTypeAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTypeAutoActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        jButton1.setText("Remover");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblAno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAno.setText("ANO:");

        lblMarca.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMarca.setText("MARCA:");

        lblCor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCor.setText("COR:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTypeAuto)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btSair)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btLimpar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btConsultar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(lblCodVeic))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(305, 305, 305)
                                .addComponent(cbTypeAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblMarca)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ctMarca))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPlaca)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ctPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ctCor))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ctAno, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ctCodVeic))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(30, 30, 30)
                .addComponent(lblTypeAuto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbTypeAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodVeic)
                    .addComponent(ctCodVeic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlaca)
                    .addComponent(lblAno)
                    .addComponent(ctAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(lblCor)
                    .addComponent(ctMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultar)
                    .addComponent(btAlterar)
                    .addComponent(jButton1))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultaAuto();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        alteraAuto();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void cbTypeAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTypeAutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTypeAutoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        removeAuto();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void sair() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair?", "SAÍDA", JOptionPane.YES_NO_CANCEL_OPTION);
        if (resp == 0) {
            this.dispose();
        }
    }

    public void limpar() {
        ctPlaca.setText("");
        ctCodVeic.setText("");
        ctMarca.setText(" ");
        ctAno.setText(" ");
        ctCor.setText(" ");
        ctPlaca.requestFocus();
    }

    public void alteraAuto() {
        if (cbTypeAuto.getSelectedItem() == "Carro") {
            auto = new Carro();
            ((Carro) auto).setCodVeic(Integer.parseInt(ctCodVeic.getText()));
        } else {
            auto = new Moto();
            ((Moto) auto).setCodVeic(Integer.parseInt(ctCodVeic.getText()));
        }

        try {
            auto.setCodVeic(Integer.parseInt(ctCodVeic.getText()));
            auto = GerConcessionaria.getGerConcessionaria().attAuto(auto);

            if (auto != null) {
                ctCodVeic.setText(Integer.toString(auto.getCodVeic()));
                ctPlaca.setText(auto.getPlaca());
                JOptionPane.showMessageDialog(null, "Confirme os dados do Automóvel", "Confirmação de Dados", 1);
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Não existe automóvel com esse Código", "Código inexistente", 0);
                limpar();
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O código deve ser um número inteiro!", "Erro de Código", 0);
            ctCodVeic.setText("");
            ctCodVeic.requestFocus();
        }
    }

    public void consultaAuto() {
        if (cbTypeAuto.getSelectedItem() == "Carro") {
            auto = new Carro();
            ((Carro) auto).setCodVeic(Integer.parseInt(ctCodVeic.getText()));
        } else {
            auto = new Moto();
            ((Moto) auto).setCodVeic(Integer.parseInt(ctCodVeic.getText()));
        }

        try {
            auto.setCodVeic(Integer.parseInt(ctCodVeic.getText()));

            auto = GerConcessionaria.getGerConcessionaria().consAuto(auto);

            if (auto != null) {
                String imp = "DADOS DO AUTOMÓVEL!\n\nPLACA: " + auto.getPlaca()
                        + "\n\nMARCA: " + auto.getMarca()
                        + "\n\nANO: " + auto.getAno()
                        + "\n\nCOR: " + auto.getCor();
                if (cbTypeAuto.getSelectedItem() == "Carro") {
                    imp = imp + "\n\nNUM CHASSI: " + ((Carro) auto).getNCHASSI()
                            + "\n\nNUM AIRBAGS: " + ((Carro) auto).getNAIRBAGS()
                            + "\n\nTIPO TRAÇÃO: " + ((Carro) auto).getTRACAO();
                } else {
                    imp = imp + "\n\nQUANTIDADE CILINDRADAS: " + ((Moto) auto).getCilin()
                            + "\n\nTIPO: " + ((Moto) auto).getType();
                }
                JOptionPane.showMessageDialog(null,imp ,"Consulta por Código",3);
                JOptionPane.showMessageDialog(null, "Confirme os dados do Automóvel", "Consulta de dados", 1);
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Não existe automóvel com esse Código", "Código inexiste", 0);
                limpar();
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O código deve ser um número inteiro entre 0 a 1000!", "Erro no Código", 0);
            ctCodVeic.setText("");
            ctCodVeic.requestFocus();
        }
    }

    public void removeAuto() {
        if (cbTypeAuto.getSelectedItem() == "Carro") {
            auto = new Carro();
            ((Carro) auto).setCodVeic(Integer.parseInt(ctCodVeic.getText()));
        } else {
            auto = new Moto();
            ((Moto) auto).setCodVeic(Integer.parseInt(ctCodVeic.getText()));
        }

        try {
            int x = JOptionPane.showConfirmDialog(null, "Deseja excluir esse Usuário", "Confirmação de Exclusão", JOptionPane.YES_NO_CANCEL_OPTION);
            if (x == 0) {
                auto.setCodVeic(Integer.parseInt(ctCodVeic.getText()));
                auto = GerConcessionaria.getGerConcessionaria().removeAuto(auto);

                if (auto == null) {
                    JOptionPane.showMessageDialog(null, "Automóvel excluído com Sucesso!", "Exclusão de Automóvel", 1);
                } else {
                    JOptionPane.showMessageDialog(null, "Não existe automóvel com esse código", "Código inexistente", 0);
                }
            }
            limpar();

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O Código deve ser um inteiro número de 1 a 1000!", "Erro de Código", 0);
            ctCodVeic.setText("");
            ctCodVeic.requestFocus();
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
            java.util.logging.Logger.getLogger(ManipulaAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManipulaAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManipulaAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManipulaAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManipulaAuto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JComboBox<String> cbTypeAuto;
    private javax.swing.JTextField ctAno;
    private javax.swing.JTextField ctCodVeic;
    private javax.swing.JTextField ctCor;
    private javax.swing.JTextField ctMarca;
    private javax.swing.JTextField ctPlaca;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblCodVeic;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTypeAuto;
    // End of variables declaration//GEN-END:variables
}
