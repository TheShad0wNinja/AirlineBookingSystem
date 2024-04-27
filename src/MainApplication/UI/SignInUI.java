/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainApplication.UI;

import MainApplication.Account;
import MainApplication.AccountCollection;
import MainApplication.Authentication;
import MainApplication.Passenger;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author ah625
 */
public class SignInUI extends MainFrame {

    private javax.swing.JButton LoginButton;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton SignUpButton;
    private javax.swing.JLabel SubTitle1;
    private javax.swing.JLabel SubTitle2;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField UsernameField;
    private Authentication auth;
    public SignInUI(Authentication auth) {
        this.auth = auth;
        initComponents();
    }

    private void initComponents() {

//        jButton1 = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        SubTitle1 = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        SubTitle2 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        SignUpButton = new javax.swing.JButton();

//        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        Title.setFont(new java.awt.Font(fontFamily, Font.PLAIN, 36)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Sign In");
        getContentPane().add(Title);
        Title.setBounds(210, 10, 130, 47);

        SubTitle1.setFont(new java.awt.Font(fontFamily, Font.PLAIN, 18)); // NOI18N
        SubTitle1.setText("Username");
        SubTitle1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(SubTitle1);
        SubTitle1.setBounds(60, 60, 90, 24);

        UsernameField.setFont(new java.awt.Font(fontFamily, Font.PLAIN, 12)); // NOI18N
        UsernameField.setForeground(Color.gray);
        getContentPane().add(UsernameField);
        UsernameField.setBounds(60, 90, 430, 50);

        SubTitle2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        SubTitle2.setText("Password");
        getContentPane().add(SubTitle2);
        SubTitle2.setBounds(60, 150, 90, 24);
        getContentPane().add(PasswordField);
        PasswordField.setBounds(60, 180, 430, 50);

        LoginButton.setFont(new java.awt.Font(fontFamily, Font.PLAIN, 24)); // NOI18N
        LoginButton.setText("Login");
        LoginButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LoginButton);
        LoginButton.setBounds(205, 250, 140, 40);

        SignUpButton.setFont(new java.awt.Font(fontFamily, Font.PLAIN, 10)); // NOI18N
        SignUpButton.setText("S̲i̲gn̲ ̲U̲p");
        SignUpButton.setBorderPainted(false);
        SignUpButton.setContentAreaFilled(false);
        SignUpButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SignUpButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        SignUpButton.setIconTextGap(0);
        SignUpButton.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispose();
                new SignUpUI(auth);
            }
        });
        getContentPane().add(SignUpButton);
        SignUpButton.setBounds(200, 290, 120, 23);

        this.setVisible(true);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        if (UsernameField.getText().isEmpty() || PasswordField.getPassword().length == 0) {
            this.showNotification("Invalid Inputs", "You are missing a field", true);
            return;
        }

        try {
            auth.login(UsernameField.getText(), new String(PasswordField.getPassword()));
        }catch (Exception e) {
            this.showNotification("Invalid Inputs", e.getMessage(), true);
            return;
        }

        if (auth.isAdmin()) {
           new AdminUI(auth);
        } else {
            new PassengerUI(auth);
        }
        this.dispose();
    }//GEN-LAST:event_LoginButtonActionPerformed

}
