/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

/**
 *
 * @author ah625
 */
public class SignUpUI extends javax.swing.JFrame {

    /**
     * Creates new form SignUpUI
     */
    public SignUpUI() {
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

        Title = new javax.swing.JLabel();
        sub1 = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        sub2 = new javax.swing.JLabel();
        sub3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        LoginButton = new javax.swing.JButton();
        PasswordField2 = new javax.swing.JPasswordField();
        PasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        Title.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Sign Up");
        getContentPane().add(Title);
        Title.setBounds(210, 30, 130, 47);

        sub1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        sub1.setText("Username");
        getContentPane().add(sub1);
        sub1.setBounds(50, 90, 80, 19);

        UsernameField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        UsernameField.setText("Enter a Username");
        getContentPane().add(UsernameField);
        UsernameField.setBounds(50, 110, 430, 50);

        sub2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        sub2.setText("Password");
        getContentPane().add(sub2);
        sub2.setBounds(50, 180, 70, 19);

        sub3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        sub3.setText("Confirm Password");
        getContentPane().add(sub3);
        sub3.setBounds(50, 250, 120, 19);

        jButton1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton1.setText("Sign Up");
        getContentPane().add(jButton1);
        jButton1.setBounds(180, 320, 190, 60);

        LoginButton.setBackground(new java.awt.Color(242, 242, 242));
        LoginButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        LoginButton.setText("L͟o͟g͟i͟n͟");
        LoginButton.setBorderPainted(false);
        LoginButton.setRequestFocusEnabled(false);
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LoginButton);
        LoginButton.setBounds(160, 380, 75, 23);

        PasswordField2.setText("jPasswordField1");
        getContentPane().add(PasswordField2);
        PasswordField2.setBounds(50, 270, 430, 40);

        PasswordField1.setText("jPasswordField1");
        getContentPane().add(PasswordField1);
        PasswordField1.setBounds(50, 200, 430, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_LoginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SignUpUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JPasswordField PasswordField1;
    private javax.swing.JPasswordField PasswordField2;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel sub1;
    private javax.swing.JLabel sub2;
    private javax.swing.JLabel sub3;
    // End of variables declaration//GEN-END:variables
}
