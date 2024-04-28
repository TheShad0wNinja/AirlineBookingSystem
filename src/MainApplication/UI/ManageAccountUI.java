package MainApplication.UI;

import MainApplication.Authentication;
import MainApplication.Passenger;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ManageAccountUI extends MainFrame {

    Authentication auth;
    public ManageAccountUI(Authentication auth) {
        this.auth = auth;
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NameF = new javax.swing.JTextField();
        UserF = new javax.swing.JTextField();
        DateF = new javax.swing.JTextField();
        PassF = new javax.swing.JTextField();
        UpdateBtn = new javax.swing.JToggleButton();
        BackBTN = new javax.swing.JToggleButton();

        jLabel1.setFont(new java.awt.Font(fontFamily, 1, 48)); // NOI18N
        jLabel1.setText("Manage Account");

        jLabel2.setFont(new java.awt.Font(fontFamily, 0, 24)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font(fontFamily, 0, 24)); // NOI18N
        jLabel3.setText("Username:");

        jLabel4.setFont(new java.awt.Font(fontFamily, 0, 24)); // NOI18N
        jLabel4.setText("Date:");

        jLabel5.setFont(new java.awt.Font(fontFamily, 0, 24)); // NOI18N
        jLabel5.setText("Password:");

        NameF.setFont(new java.awt.Font(fontFamily, 0, 24)); // NOI18N
        NameF.setText(auth.getCurrentAccount().getName());
        NameF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFActionPerformed(evt);
            }
        });

        UserF.setFont(new java.awt.Font(fontFamily, 0, 24)); // NOI18N
        UserF.setText(auth.getCurrentAccount().getUsername());
        UserF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserFActionPerformed(evt);
            }
        });

        DateF.setFont(new java.awt.Font(fontFamily, 0, 24)); // NOI18N
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateF.setText(auth.getCurrentAccount().getDob().format(dft));
        DateF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateFActionPerformed(evt);
            }
        });

        PassF.setFont(new java.awt.Font(fontFamily, 0, 24)); // NOI18N
        PassF.setText(auth.getCurrentAccount().getPassword());
        PassF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassFActionPerformed(evt);
            }
        });


        UpdateBtn.setFont(new java.awt.Font(fontFamily, 0, 18)); // NOI18N
        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        BackBTN.setFont(new java.awt.Font(fontFamily, 0, 18)); // NOI18N
        BackBTN.setText("Back");
        BackBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PassengerUI(auth);
                dispose();
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(130, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(121, 121, 121))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(NameF, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(DateF, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(UserF, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(PassF, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(55, 55, 55))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(BackBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(503, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1)
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(UserF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(NameF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(PassF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(DateF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                                .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(557, Short.MAX_VALUE)
                                        .addComponent(BackBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)))
        );

        this.setVisible(true);
    }

    private void NameFActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void UserFActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void DateFActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void PassFActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {
        Passenger user = (Passenger) auth.getCurrentAccount();
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dob;
        try {
           dob = LocalDate.parse(DateF.getText(), dft);
        } catch (Exception e) {
            this.showNotification("Invalid inputs", "Invalid birthday date", true);
            return;
        }

        user.updateUser(UserF.getText(), NameF.getText(), PassF.getText(),dob);

        new PassengerUI(auth);
        dispose();
    }


    // Variables declaration - do not modify                     
    private javax.swing.JToggleButton BackBTN;
    private javax.swing.JTextField DateF;
    private javax.swing.JTextField NameF;
    private javax.swing.JTextField PassF;
    private javax.swing.JToggleButton UpdateBtn;
    private javax.swing.JTextField UserF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration                   
}
