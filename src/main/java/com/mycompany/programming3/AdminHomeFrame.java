/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.programming3;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author omarm
 */
public class AdminHomeFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddAndRemoveMovieFrame
     */
    public AdminHomeFrame() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("ITV");
        this.setLocationRelativeTo(null);
        hall1Button.setBackground(Color.white);
        hall2Button.setBackground(Color.white);
        hall3Button.setBackground(Color.white);
        hall4Button.setBackground(Color.white);
        hall5Button.setBackground(Color.white);
        hall6Button.setBackground(Color.white);
        homeButton.setBackground(Color.white);
        homeButton.setForeground(new Color(35, 179, 155));
        showField.setEditable(false);
        this.setVisible(true);

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
        addMovieButton = new javax.swing.JButton();
        removeMovieButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        hall1Button = new javax.swing.JButton();
        hall2Button = new javax.swing.JButton();
        hall3Button = new javax.swing.JButton();
        hall4Button = new javax.swing.JButton();
        hall5Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        showField = new javax.swing.JTextArea();
        searchLabel = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        hall6Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(15, 13, 12));
        setMinimumSize(new java.awt.Dimension(1112, 500));

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

        addMovieButton.setBackground(new java.awt.Color(35, 179, 155));
        addMovieButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        addMovieButton.setForeground(new java.awt.Color(255, 255, 255));
        addMovieButton.setText("Add Movie");
        addMovieButton.setBorder(null);
        addMovieButton.setFocusable(false);
        addMovieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMovieButtonActionPerformed(evt);
            }
        });

        removeMovieButton.setBackground(new java.awt.Color(35, 179, 155));
        removeMovieButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        removeMovieButton.setForeground(new java.awt.Color(255, 255, 255));
        removeMovieButton.setText("About");
        removeMovieButton.setBorder(null);
        removeMovieButton.setFocusable(false);
        removeMovieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMovieButtonActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(35, 179, 155));
        logoutButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Log Out");
        logoutButton.setBorder(null);
        logoutButton.setFocusable(false);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addMovieButton, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeMovieButton, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(addMovieButton)
                .addComponent(removeMovieButton)
                .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addMovieButton, homeButton, removeMovieButton});

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        hall1Button.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        hall1Button.setForeground(new java.awt.Color(35, 179, 155));
        hall1Button.setText("Hall1");
        hall1Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(35, 179, 155), 2));
        hall1Button.setContentAreaFilled(false);
        hall1Button.setFocusable(false);
        hall1Button.setOpaque(true);
        hall1Button.setPreferredSize(new java.awt.Dimension(133, 34));
        hall1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hall1ButtonActionPerformed(evt);
            }
        });

        hall2Button.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        hall2Button.setForeground(new java.awt.Color(35, 179, 155));
        hall2Button.setText("Hall2");
        hall2Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(35, 179, 155), 2));
        hall2Button.setContentAreaFilled(false);
        hall2Button.setFocusable(false);
        hall2Button.setOpaque(true);
        hall2Button.setPreferredSize(new java.awt.Dimension(133, 34));
        hall2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hall2ButtonActionPerformed(evt);
            }
        });

        hall3Button.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        hall3Button.setForeground(new java.awt.Color(35, 179, 155));
        hall3Button.setText("Hall3");
        hall3Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(35, 179, 155), 2));
        hall3Button.setContentAreaFilled(false);
        hall3Button.setFocusable(false);
        hall3Button.setOpaque(true);
        hall3Button.setPreferredSize(new java.awt.Dimension(133, 34));
        hall3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hall3ButtonActionPerformed(evt);
            }
        });

        hall4Button.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        hall4Button.setForeground(new java.awt.Color(35, 179, 155));
        hall4Button.setText("Hall4");
        hall4Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(35, 179, 155), 2));
        hall4Button.setContentAreaFilled(false);
        hall4Button.setFocusable(false);
        hall4Button.setOpaque(true);
        hall4Button.setPreferredSize(new java.awt.Dimension(133, 34));
        hall4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hall4ButtonActionPerformed(evt);
            }
        });

        hall5Button.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        hall5Button.setForeground(new java.awt.Color(35, 179, 155));
        hall5Button.setText("Hall5");
        hall5Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(35, 179, 155), 2));
        hall5Button.setContentAreaFilled(false);
        hall5Button.setFocusable(false);
        hall5Button.setOpaque(true);
        hall5Button.setPreferredSize(new java.awt.Dimension(133, 34));
        hall5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hall5ButtonActionPerformed(evt);
            }
        });

        showField.setColumns(20);
        showField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        showField.setForeground(new java.awt.Color(28, 141, 122));
        showField.setRows(5);
        jScrollPane1.setViewportView(showField);

        searchLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        searchLabel.setForeground(new java.awt.Color(35, 179, 155));
        searchLabel.setText("Search By Movie Genre :");

        searchField.setPreferredSize(new java.awt.Dimension(64, 26));

        searchButton.setBackground(new java.awt.Color(35, 179, 155));
        searchButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\omarm\\Desktop\\Programming3\\src\\main\\java\\Icons\\icons8-search-502.png")); // NOI18N
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        hall6Button.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        hall6Button.setForeground(new java.awt.Color(35, 179, 155));
        hall6Button.setText("Hall6");
        hall6Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(35, 179, 155), 2));
        hall6Button.setContentAreaFilled(false);
        hall6Button.setFocusable(false);
        hall6Button.setOpaque(true);
        hall6Button.setPreferredSize(new java.awt.Dimension(133, 34));
        hall6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hall6ButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(28, 141, 122));
        jLabel1.setText("click to search");

        clearButton.setBackground(new java.awt.Color(255, 0, 51));
        clearButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear Search");
        clearButton.setFocusable(false);
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(searchLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(hall1Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(hall2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(hall3Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(hall4Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(hall5Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(hall6Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(hall1Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hall2Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hall3Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hall4Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hall5Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hall6Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(searchField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(searchLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(searchButton)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        AdminHomeFrame addAndRemoveMovieFrame = new AdminHomeFrame();
        addAndRemoveMovieFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void addMovieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMovieButtonActionPerformed
        AddMovieFrame addMovieFrame = new AddMovieFrame();
        this.dispose();
    }//GEN-LAST:event_addMovieButtonActionPerformed

    private void removeMovieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMovieButtonActionPerformed
        AboutFrame removeMovieFrame = new AboutFrame();
        this.dispose();
    }//GEN-LAST:event_removeMovieButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        AdminOrGuestFrame adminOrGuestFrame = new AdminOrGuestFrame();
        this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void hall6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hall6ButtonActionPerformed
        showField.setEditable(true);
        hall6Button.setBackground(new Color(35, 179, 155));
        hall6Button.setForeground(Color.white);

        hall2Button.setForeground(new Color(35, 179, 155));
        hall2Button.setBackground(Color.white);

        hall4Button.setForeground(new Color(35, 179, 155));
        hall4Button.setBackground(Color.white);

        hall3Button.setBackground(Color.white);
        hall3Button.setForeground(new Color(35, 179, 155));

        hall1Button.setBackground(Color.white);
        hall1Button.setForeground(new Color(35, 179, 155));

        hall5Button.setBackground(Color.white);
        hall5Button.setForeground(new Color(35, 179, 155));

        Cinema cinema = new Cinema();
        ArrayList<Movie> tempMovies = new ArrayList<>();
        showField.setText("");
        tempMovies = Cinema.readMoviesHallFile("Hall6");
        for (Movie m : tempMovies) {
            String availableSeats = Integer.toString(m.getAvailableSeats());
            String movieDetails = "\n\n";
            showField.append(movieDetails);
            movieDetails = " { ".concat(m.getName().concat(" , ".concat(m.getType().concat(" , ".concat(m.getDate().concat(" , ".concat("Availabe Seats is:".concat(availableSeats.concat(" }")))))))));
            showField.append(movieDetails);
            movieDetails = "\n\n";
            showField.append(movieDetails);
            //here you send the string to the text area!
        }
        showField.setEditable(false);
    }//GEN-LAST:event_hall6ButtonActionPerformed

    private void hall5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hall5ButtonActionPerformed
        showField.setEditable(true);
        hall5Button.setBackground(new Color(35, 179, 155));
        hall5Button.setForeground(Color.white);

        hall2Button.setForeground(new Color(35, 179, 155));
        hall2Button.setBackground(Color.white);

        hall4Button.setForeground(new Color(35, 179, 155));
        hall4Button.setBackground(Color.white);

        hall3Button.setBackground(Color.white);
        hall3Button.setForeground(new Color(35, 179, 155));

        hall1Button.setBackground(Color.white);
        hall1Button.setForeground(new Color(35, 179, 155));

        hall6Button.setBackground(Color.white);
        hall6Button.setForeground(new Color(35, 179, 155));

        Cinema cinema = new Cinema();
        ArrayList<Movie> tempMovies = new ArrayList<>();
        showField.setText("");
        tempMovies = Cinema.readMoviesHallFile("Hall5");
        for (Movie m : tempMovies) {
            String availableSeats = Integer.toString(m.getAvailableSeats());
            String movieDetails = "\n\n";
            showField.append(movieDetails);
            movieDetails = " { ".concat(m.getName().concat(" , ".concat(m.getType().concat(" , ".concat(m.getDate().concat(" , ".concat("Availabe Seats is:".concat(availableSeats.concat(" }")))))))));
            showField.append(movieDetails);
            movieDetails = "\n\n";
            showField.append(movieDetails);
            //here you send the string to the text area!
        }
        showField.setEditable(false);
    }//GEN-LAST:event_hall5ButtonActionPerformed

    private void hall4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hall4ButtonActionPerformed
        showField.setEditable(true);
        hall4Button.setBackground(new Color(35, 179, 155));
        hall4Button.setForeground(Color.white);

        hall2Button.setBackground(Color.white);
        hall2Button.setForeground(new Color(35, 179, 155));

        hall3Button.setBackground(Color.white);
        hall3Button.setForeground(new Color(35, 179, 155));

        hall1Button.setBackground(Color.white);
        hall1Button.setForeground(new Color(35, 179, 155));

        hall5Button.setBackground(Color.white);
        hall5Button.setForeground(new Color(35, 179, 155));

        hall6Button.setBackground(Color.white);
        hall6Button.setForeground(new Color(35, 179, 155));
        Cinema cinema = new Cinema();
        ArrayList<Movie> tempMovies = new ArrayList<>();
        showField.setText("");
        tempMovies = Cinema.readMoviesHallFile("Hall4");
        for (Movie m : tempMovies) {
            String availableSeats = Integer.toString(m.getAvailableSeats());
            String movieDetails = "\n\n";
            showField.append(movieDetails);
            movieDetails = " { ".concat(m.getName().concat(" , ".concat(m.getType().concat(" , ".concat(m.getDate().concat(" , ".concat("Availabe Seats is:".concat(availableSeats.concat(" }")))))))));
            showField.append(movieDetails);
            movieDetails = "\n\n";
            showField.append(movieDetails);
            //here you send the string to the text area!
        }
        showField.setEditable(false);
    }//GEN-LAST:event_hall4ButtonActionPerformed

    private void hall3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hall3ButtonActionPerformed
        showField.setEditable(true);
        hall3Button.setBackground(new Color(35, 179, 155));
        hall3Button.setForeground(Color.white);

        hall2Button.setForeground(new Color(35, 179, 155));
        hall2Button.setBackground(Color.white);

        hall4Button.setForeground(new Color(35, 179, 155));
        hall4Button.setBackground(Color.white);

        hall1Button.setBackground(Color.white);
        hall1Button.setForeground(new Color(35, 179, 155));

        hall5Button.setBackground(Color.white);
        hall5Button.setForeground(new Color(35, 179, 155));

        hall6Button.setBackground(Color.white);
        hall6Button.setForeground(new Color(35, 179, 155));

        Cinema cinema = new Cinema();
        ArrayList<Movie> tempMovies = new ArrayList<>();
        showField.setText("");
        tempMovies = Cinema.readMoviesHallFile("Hall3");
        for (Movie m : tempMovies) {
            String availableSeats = Integer.toString(m.getAvailableSeats());
            String movieDetails = "\n\n";
            showField.append(movieDetails);
            movieDetails = " { ".concat(m.getName().concat(" , ".concat(m.getType().concat(" , ".concat(m.getDate().concat(" , ".concat("Availabe Seats is:".concat(availableSeats.concat(" }")))))))));
            showField.append(movieDetails);
            movieDetails = "\n\n";
            showField.append(movieDetails);
            //here you send the string to the text area!
        }
        showField.setEditable(false);
    }//GEN-LAST:event_hall3ButtonActionPerformed

    private void hall2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hall2ButtonActionPerformed
        showField.setEditable(true);
        hall2Button.setBackground(new Color(35, 179, 155));
        hall2Button.setForeground(Color.white);

        hall4Button.setForeground(new Color(35, 179, 155));
        hall4Button.setBackground(Color.white);

        hall3Button.setBackground(Color.white);
        hall3Button.setForeground(new Color(35, 179, 155));

        hall1Button.setBackground(Color.white);
        hall1Button.setForeground(new Color(35, 179, 155));

        hall5Button.setBackground(Color.white);
        hall5Button.setForeground(new Color(35, 179, 155));

        hall6Button.setBackground(Color.white);
        hall6Button.setForeground(new Color(35, 179, 155));

        Cinema cinema = new Cinema();
        ArrayList<Movie> tempMovies = new ArrayList<>();
        showField.setText("");
        tempMovies = Cinema.readMoviesHallFile("Hall2");
        for (Movie m : tempMovies) {
            String availableSeats = Integer.toString(m.getAvailableSeats());
            String movieDetails = "\n\n";
            showField.append(movieDetails);
            movieDetails = " { ".concat(m.getName().concat(" , ".concat(m.getType().concat(" , ".concat(m.getDate().concat(" , ".concat("Availabe Seats is:".concat(availableSeats.concat(" }")))))))));
            showField.append(movieDetails);
            movieDetails = "\n\n";
            showField.append(movieDetails);
            //here you send the string to the text area!
        }
        showField.setEditable(false);
    }//GEN-LAST:event_hall2ButtonActionPerformed

    private void hall1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hall1ButtonActionPerformed

        showField.setEditable(true);
        hall1Button.setBackground(new Color(35, 179, 155));
        hall1Button.setForeground(Color.white);

        hall2Button.setBackground(Color.white);
        hall2Button.setForeground(new Color(35, 179, 155));

        hall3Button.setBackground(Color.white);
        hall3Button.setForeground(new Color(35, 179, 155));

        hall4Button.setBackground(Color.white);
        hall4Button.setForeground(new Color(35, 179, 155));

        hall5Button.setBackground(Color.white);
        hall5Button.setForeground(new Color(35, 179, 155));

        hall6Button.setBackground(Color.white);
        hall6Button.setForeground(new Color(35, 179, 155));
        Cinema cinema = new Cinema();
        ArrayList<Movie> tempMovies = new ArrayList<>();
        showField.setText("");
        tempMovies = Cinema.readMoviesHallFile("Hall1");
        for (Movie m : tempMovies) {
            String availableSeats = Integer.toString(m.getAvailableSeats());
            String movieDetails = "\n\n";
            showField.append(movieDetails);
            movieDetails = " { ".concat(m.getName().concat(" , ".concat(m.getType().concat(" , ".concat(m.getDate().concat(" , ".concat("Availabe Seats is:".concat(availableSeats.concat(" }")))))))));
            showField.append(movieDetails);
            movieDetails = "\n\n";
            showField.append(movieDetails);
            //here you send the string to the text area!
        }
        showField.setEditable(false);
    }//GEN-LAST:event_hall1ButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        showField.setText("");
        String movieType = searchField.getText();
        String moivesDeatilsByType = "\n  Search Result: ".concat(movieType.concat("\n\n  Movies:\n"));
        boolean b1 = false;

        for (int i = 1; i <= 6; i++) {
            String hallName1 = "Hall" + i;
            ArrayList<Movie> tempMovies2 = new ArrayList<>();
            tempMovies2 = Cinema.readMoviesHallFile(hallName1);
            for (Movie temp : tempMovies2) {
                if (movieType.equals(temp.getType())) {
                    b1 = true;
                    moivesDeatilsByType = moivesDeatilsByType.concat("  { ".concat(temp.getHallName()).concat(" , ".concat(temp.getName()).concat(" , ".concat(temp.getDate().concat(" , ".concat(Integer.toString(temp.getAvailableSeats()).concat(" }")))))));

                    moivesDeatilsByType = moivesDeatilsByType.concat("\n  The price of any Ticket: 20000 S.P");

                    moivesDeatilsByType = moivesDeatilsByType.concat("\n\n");

                }
            }

        }

        if (!b1) {
            moivesDeatilsByType = moivesDeatilsByType.concat("  NO Movies!");

        }

        // Here you send the moivesDeatilsByType to the text area!
        showField.append(moivesDeatilsByType);
        showField.setEditable(false);
        hall1Button.setEnabled(false);
        hall2Button.setEnabled(false);
        hall3Button.setEnabled(false);
        hall4Button.setEnabled(false);
        hall5Button.setEnabled(false);
        hall6Button.setEnabled(false);
    }//GEN-LAST:event_searchButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        showField.setText("");
        hall1Button.setEnabled(true);
        hall2Button.setEnabled(true);
        hall3Button.setEnabled(true);
        hall4Button.setEnabled(true);
        hall5Button.setEnabled(true);
        hall6Button.setEnabled(true);
    }//GEN-LAST:event_clearButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminHomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMovieButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton hall1Button;
    private javax.swing.JButton hall2Button;
    private javax.swing.JButton hall3Button;
    private javax.swing.JButton hall4Button;
    private javax.swing.JButton hall5Button;
    private javax.swing.JButton hall6Button;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton removeMovieButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JTextArea showField;
    // End of variables declaration//GEN-END:variables
}
