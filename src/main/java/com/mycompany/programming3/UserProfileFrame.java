/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.programming3;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JFrame;

/**
 *
 * @author omarm
 */
public class UserProfileFrame extends javax.swing.JFrame {

    /**
     * Creates new form UserProfileFrame
     */
    public UserProfileFrame() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 500);
        this.setTitle("ITV");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        profileButton.setBackground(Color.white);
        profileButton.setForeground(new Color(35, 179, 155));
        usernameLabel.setForeground(new Color(35, 179, 155));
        usernameLabel.setText(Cinema.usernameKey);
        ArrayList<User> tempUsers=new ArrayList<>();
    tempUsers=Cinema.readUsersFile();
    for(User u:tempUsers)
    {
        if(u.getUserName().equals(Cinema.usernameKey) && u.getPassword().equals(Cinema.passwordKey))
        {
            for(Map.Entry<Movie,ArrayList<Ticket>> entry:u.hm.entrySet())
            {
                String userDetails="\n";
                showField.append(userDetails);
                //here you send the userDetails to the text area!
                userDetails=" { Movie ID:".concat(Integer.toString(entry.getKey().getID()).concat(" , Movie:".concat(entry.getKey().getName().concat(" , Hall:".concat(entry.getKey().getHallName().concat(" , Date:".concat(entry.getKey().getDate().concat(" }"))))))));
                //here you send the userDetails to the text area!
                showField.append(userDetails);
                userDetails="\n Your Tickets number:".concat(Integer.toString(entry.getValue().size()).concat(" , Your Seats number:"));
                //here you send the userDetails to the text area!
                showField.append(userDetails);
                String seats=" [ ";
                for(Ticket t:entry.getValue())
                {
                    String num=Integer.toString(t.getSeatNumber());
                    seats=seats.concat(num.concat(" "));
                }
                seats=seats.concat("]");
                userDetails="\n";
                //here you send the userDetails to the text Area!
                showField.append(userDetails);
                //here you send the seats to the text area!
                showField.append(seats);
                userDetails = "\n";
                showField.append(userDetails);
            }
            break;
        }
    }
        showField.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        addTicketButton = new javax.swing.JButton();
        removeTicketButton = new javax.swing.JButton();
        profileButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        showField = new javax.swing.JTextArea();
        logoutButton = new javax.swing.JButton();
        changeUserLabel = new javax.swing.JLabel();
        changeUserField = new javax.swing.JTextField();
        changePasswordLabel = new javax.swing.JLabel();
        changePasswordField = new javax.swing.JTextField();
        saveUserButton = new javax.swing.JButton();
        savePasswordButton = new javax.swing.JButton();
        usernameChangedLabel = new javax.swing.JLabel();
        passwordChangedLabel1 = new javax.swing.JLabel();
        nameSuccessLabel = new javax.swing.JLabel();
        passwordSuccessLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 500));

        jPanel2.setBackground(new java.awt.Color(35, 179, 155));

        homeButton.setBackground(new java.awt.Color(35, 179, 155));
        homeButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        homeButton.setForeground(new java.awt.Color(255, 255, 255));
        homeButton.setText("Home");
        homeButton.setBorder(null);
        homeButton.setFocusable(false);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        addTicketButton.setBackground(new java.awt.Color(35, 179, 155));
        addTicketButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        addTicketButton.setForeground(new java.awt.Color(255, 255, 255));
        addTicketButton.setText("Add Ticket");
        addTicketButton.setBorder(null);
        addTicketButton.setFocusable(false);
        addTicketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTicketButtonActionPerformed(evt);
            }
        });

        removeTicketButton.setBackground(new java.awt.Color(35, 179, 155));
        removeTicketButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        removeTicketButton.setForeground(new java.awt.Color(255, 255, 255));
        removeTicketButton.setText("Remove Ticket");
        removeTicketButton.setBorder(null);
        removeTicketButton.setFocusable(false);
        removeTicketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTicketButtonActionPerformed(evt);
            }
        });

        profileButton.setBackground(new java.awt.Color(35, 179, 155));
        profileButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        profileButton.setForeground(new java.awt.Color(255, 255, 255));
        profileButton.setText("Profile");
        profileButton.setBorder(null);
        profileButton.setFocusable(false);
        profileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addTicketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeTicketButton, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(addTicketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(removeTicketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(profileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(35, 179, 155));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(35, 179, 155));
        jLabel1.setText("My Reservations :");

        showField.setColumns(20);
        showField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        showField.setForeground(new java.awt.Color(28, 141, 122));
        showField.setRows(5);
        showField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(showField);

        logoutButton.setBackground(new java.awt.Color(35, 179, 155));
        logoutButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Log Out");
        logoutButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(35, 179, 155), 2));
        logoutButton.setFocusable(false);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        changeUserLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        changeUserLabel.setForeground(new java.awt.Color(35, 179, 155));
        changeUserLabel.setText("Change Username :");

        changePasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        changePasswordLabel.setForeground(new java.awt.Color(35, 179, 155));
        changePasswordLabel.setText("Change Password :");

        saveUserButton.setBackground(new java.awt.Color(35, 179, 155));
        saveUserButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saveUserButton.setForeground(new java.awt.Color(255, 255, 255));
        saveUserButton.setText("Save");
        saveUserButton.setFocusable(false);
        saveUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveUserButtonActionPerformed(evt);
            }
        });

        savePasswordButton.setBackground(new java.awt.Color(35, 179, 155));
        savePasswordButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        savePasswordButton.setForeground(new java.awt.Color(255, 255, 255));
        savePasswordButton.setText("Save");
        savePasswordButton.setFocusable(false);
        savePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePasswordButtonActionPerformed(evt);
            }
        });

        usernameChangedLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usernameChangedLabel.setForeground(new java.awt.Color(14, 149, 19));

        passwordChangedLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordChangedLabel1.setForeground(new java.awt.Color(14, 149, 19));

        nameSuccessLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        passwordSuccessLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(logoutButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(changeUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(changeUserField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(changePasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(changePasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(passwordSuccessLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(savePasswordButton))
                    .addComponent(usernameChangedLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordChangedLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(nameSuccessLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveUserButton)))
                .addGap(122, 122, 122))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(changeUserLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(changeUserField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(saveUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameSuccessLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usernameChangedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(changePasswordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changePasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(logoutButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(savePasswordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordSuccessLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordChangedLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        UserHomeFrame userHomeFrame = new UserHomeFrame();
        this.dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void addTicketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTicketButtonActionPerformed
        AddTicketFrame addTicketFrame = new AddTicketFrame();
        this.dispose();
    }//GEN-LAST:event_addTicketButtonActionPerformed

    private void removeTicketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeTicketButtonActionPerformed
        RemoveTicketFrame removeTicketFrame = new RemoveTicketFrame();
        this.dispose();
    }//GEN-LAST:event_removeTicketButtonActionPerformed

    private void profileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButtonActionPerformed
        UserProfileFrame userProfileFrame = new UserProfileFrame();
        this.dispose();
    }//GEN-LAST:event_profileButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        GuestFrame guestFrame = new GuestFrame();
        this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void saveUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveUserButtonActionPerformed
        Cinema cinema = new Cinema();
        if (changeUserField.getText().isEmpty()) {
            nameSuccessLabel.setForeground(Color.red);
            nameSuccessLabel.setText("Failed");
        } else {
            cinema.changeUsername(Cinema.usernameKey, changeUserField.getText());
            Cinema.usernameKey = changeUserField.getText();
            nameSuccessLabel.setForeground(new Color(14, 149, 19));
            nameSuccessLabel.setText("Changed Successfully!");
        }
    }//GEN-LAST:event_saveUserButtonActionPerformed

    private void savePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePasswordButtonActionPerformed
        Cinema cinema = new Cinema();
        if (changePasswordField.getText().isEmpty()) {
            passwordSuccessLabel.setForeground(Color.red);
            passwordSuccessLabel.setText("Failed");
        } else {
            cinema.changePassword(Cinema.passwordKey, changePasswordField.getText());
            Cinema.passwordKey = changePasswordField.getText();
            passwordSuccessLabel.setForeground(new Color(14, 149, 19));
            passwordSuccessLabel.setText("Changed Successfully!");
        }
    }//GEN-LAST:event_savePasswordButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UserProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserProfileFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTicketButton;
    private javax.swing.JTextField changePasswordField;
    private javax.swing.JLabel changePasswordLabel;
    private javax.swing.JTextField changeUserField;
    private javax.swing.JLabel changeUserLabel;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel nameSuccessLabel;
    private javax.swing.JLabel passwordChangedLabel1;
    private javax.swing.JLabel passwordSuccessLabel;
    private javax.swing.JButton profileButton;
    private javax.swing.JButton removeTicketButton;
    private javax.swing.JButton savePasswordButton;
    private javax.swing.JButton saveUserButton;
    private javax.swing.JTextArea showField;
    private javax.swing.JLabel usernameChangedLabel;
    public javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
