/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.programming3;

import javax.swing.JFrame;

/**
 *
 * @author omarm
 */
public class PayMethodsFrame extends javax.swing.JFrame {

    /**
     * Creates new form PayMethodsFrame
     */
    int cnt1, cnt2, cnt3;

    public PayMethodsFrame() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 500);
        this.setTitle("ITV");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        cnt1 = 0;
        cnt2 = 0;
        cnt3 = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        paySyLabel = new javax.swing.JLabel();
        payMTNLabel = new javax.swing.JLabel();
        paySyButton = new javax.swing.JButton();
        payMTNButton = new javax.swing.JButton();
        payBankButton = new javax.swing.JButton();
        payCashButton = new javax.swing.JButton();
        payCashLabel = new javax.swing.JLabel();
        payBankLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        paySyLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        paySyLabel.setForeground(new java.awt.Color(35, 179, 155));
        paySyLabel.setText("Pay With Syriatel Cash :");

        payMTNLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        payMTNLabel.setForeground(new java.awt.Color(35, 179, 155));
        payMTNLabel.setText("Pay With MTN Cash :");

        paySyButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\omarm\\Desktop\\Programming3\\src\\main\\java\\Icons\\syriatel.jpeg")); // NOI18N
        paySyButton.setBorder(null);
        paySyButton.setFocusable(false);
        paySyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paySyButtonActionPerformed(evt);
            }
        });

        payMTNButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\omarm\\Desktop\\Programming3\\src\\main\\java\\Icons\\MTN.png")); // NOI18N
        payMTNButton.setBorder(null);
        payMTNButton.setFocusable(false);
        payMTNButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payMTNButtonActionPerformed(evt);
            }
        });

        payBankButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\omarm\\Desktop\\Programming3\\src\\main\\java\\Icons\\Bank.jpeg")); // NOI18N
        payBankButton.setBorder(null);
        payBankButton.setFocusable(false);
        payBankButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBankButtonActionPerformed(evt);
            }
        });

        payCashButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\omarm\\Desktop\\Programming3\\src\\main\\java\\Icons\\cash.jpeg")); // NOI18N
        payCashButton.setBorder(null);
        payCashButton.setFocusable(false);
        payCashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payCashButtonActionPerformed(evt);
            }
        });

        payCashLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        payCashLabel.setForeground(new java.awt.Color(35, 179, 155));
        payCashLabel.setText("Pay In Cash :");

        payBankLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        payBankLabel.setForeground(new java.awt.Color(35, 179, 155));
        payBankLabel.setText("Pay With Bank Account :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(254, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paySyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paySyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payBankButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payBankLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(payMTNLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(payMTNButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(payCashButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(payCashLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(210, 210, 210))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {payBankButton, payMTNButton, paySyButton});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(payMTNButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paySyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paySyLabel)
                    .addComponent(payMTNLabel))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(payBankButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(payBankLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(payCashButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(payCashLabel)))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {payBankButton, payCashButton, payMTNButton, paySyButton});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void payMTNButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payMTNButtonActionPerformed
        MTNFrame mtnFrame = new MTNFrame();
        this.dispose();
    }//GEN-LAST:event_payMTNButtonActionPerformed

    private void payCashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payCashButtonActionPerformed
        CashFrame cashFrame = new CashFrame();
        this.dispose();
    }//GEN-LAST:event_payCashButtonActionPerformed

    private void paySyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paySyButtonActionPerformed
        SyriatelFrame syriatelFrame = new SyriatelFrame();
        this.dispose();
    }//GEN-LAST:event_paySyButtonActionPerformed

    private void payBankButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBankButtonActionPerformed
        BankFrame bankFrame = new BankFrame();
        this.dispose();
    }//GEN-LAST:event_payBankButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PayMethodsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PayMethodsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PayMethodsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PayMethodsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PayMethodsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton payBankButton;
    private javax.swing.JLabel payBankLabel;
    private javax.swing.JButton payCashButton;
    private javax.swing.JLabel payCashLabel;
    private javax.swing.JButton payMTNButton;
    private javax.swing.JLabel payMTNLabel;
    private javax.swing.JButton paySyButton;
    private javax.swing.JLabel paySyLabel;
    // End of variables declaration//GEN-END:variables
}