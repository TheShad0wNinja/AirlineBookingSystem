/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainApplication.UI;

import MainApplication.Authentication;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

/**
 *
 * @author ah625
 */
public class SignUpUI extends MainFrame {

    private javax.swing.JButton LoginButton;
    private javax.swing.JPasswordField PasswordField1;
    private javax.swing.JPasswordField PasswordField2;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JTextField NameField;
    private javax.swing.JTextField DobField;
    private javax.swing.JButton signupButton;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel PasswordConfLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel DobLabel;
    private Authentication auth;

    public SignUpUI(Authentication auth) {
        this.auth = auth;

        initComponents();
    }

    private void initComponents() {

        Title = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        DobLabel = new javax.swing.JLabel();
        PasswordConfLabel = new javax.swing.JLabel();
        signupButton = new javax.swing.JButton();
        LoginButton = new javax.swing.JButton();
        UsernameField = new javax.swing.JTextField();
        NameField = new javax.swing.JTextField();
        DobField = new javax.swing.JTextField();
        PasswordField2 = new javax.swing.JPasswordField();
        PasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        Title.setFont(new java.awt.Font(fontFamily, 0, 36)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Sign Up");
        getContentPane().add(Title);
        Title.setBounds(180, 30, 160, 47);

        UsernameLabel.setFont(new java.awt.Font(fontFamily, 0, 14)); // NOI18N
        UsernameLabel.setText("Username");
        getContentPane().add(UsernameLabel);
        UsernameLabel.setBounds(50, 90, 80, 19);

        UsernameField.setFont(new java.awt.Font(fontFamily, 0, 14)); // NOI18N
        getContentPane().add(UsernameField);
        UsernameField.setBounds(50, 110, 430, 50);

        NameLabel.setFont(new java.awt.Font(fontFamily, 0, 14)); // NOI18N
        NameLabel.setText("Name");
        getContentPane().add(NameLabel);
        NameLabel.setBounds(50, 170, 80, 19);

        NameField.setFont(new java.awt.Font(fontFamily, 0, 14)); // NOI18N
        getContentPane().add(NameField);
        NameField.setBounds(50, 190, 430, 50);

        PasswordLabel.setFont(new java.awt.Font(fontFamily, 0, 14)); // NOI18N
        PasswordLabel.setText("Password");
        getContentPane().add(PasswordLabel);
        PasswordLabel.setBounds(50, 250, 70, 19);
        getContentPane().add(PasswordField1);
        PasswordField1.setBounds(50, 270, 430, 50);

        PasswordConfLabel.setFont(new java.awt.Font(fontFamily, 0, 14)); // NOI18N
        PasswordConfLabel.setText("Confirm Password");
        getContentPane().add(PasswordConfLabel);
        PasswordConfLabel.setBounds(50, 325, 140, 19);
        getContentPane().add(PasswordField2);
        PasswordField2.setBounds(50, 345, 430, 50);

        DobLabel.setFont(new java.awt.Font(fontFamily, 0, 14)); // NOI18N
        DobLabel.setText("Date of birth (dd/mm/yyyy)");
        getContentPane().add(DobLabel);
        DobLabel.setBounds(50, 395, 300, 19);
        getContentPane().add(DobField);
        DobField.setBounds(50, 420, 430, 50);

        signupButton.setFont(new java.awt.Font(fontFamily, 0, 18)); // NOI18N
        signupButton.setText("Sign Up");
        getContentPane().add(signupButton);
        signupButton.setBounds(180, 490, 190, 60);
        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                signupButtonActionPerformed();
            }
        });

        LoginButton.setBackground(new java.awt.Color(242, 242, 242));
        LoginButton.setFont(new java.awt.Font(fontFamily, 0, 12)); // NOI18N
        LoginButton.setText("Sign In");
        LoginButton.setBorderPainted(false);
        LoginButton.setContentAreaFilled(false);
        LoginButton.setRequestFocusEnabled(false);
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        getContentPane().add(LoginButton);
        LoginButton.setBounds(160, 550, 200, 23);

        setVisible(true);
    }// </editor-fold>//GEN-END:initComponents

    private void signupButtonActionPerformed() {
        if (UsernameField.getText().isEmpty() || new String(PasswordField1.getPassword()).isEmpty() || new String(
                PasswordField1.getPassword()).isEmpty() || NameField.getText().isEmpty() || DobField.getText().isEmpty()) {
            this.showNotification("Invalid Inputs", "You are missing a field", true);
            return;
        }

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dob;
        try {
            dob = LocalDate.parse(DobField.getText(), dtf);
        } catch (DateTimeException e) {
            this.showNotification("Invalid Inputs", "Invalid date format", true);
            return;
        }

        if (!Arrays.equals(PasswordField1.getPassword(), PasswordField2.getPassword())) {
            this.showNotification("Invalid Inputs", "Passwords don't match", true);
            return;
        }

        try {
            auth.signup(NameField.getText(), UsernameField.getText(), new String(PasswordField1.getPassword()), dob);
        } catch (Exception e) {
            this.showNotification("Invalid Inputs", e.getMessage(), true);
            return;
        }

        System.out.println(auth.getCurrentAccount());
//        new PassengerUI();
        this.dispose();
    }

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        new SignInUI(auth);
        this.dispose();
    }
}
