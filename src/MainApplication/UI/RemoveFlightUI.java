package MainApplication.UI;

import MainApplication.Admin;
import MainApplication.Authentication;
import MainApplication.Flight;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveFlightUI extends MainFrame {

    Authentication auth;
    public RemoveFlightUI(Authentication auth) {
        this.auth = auth;
        initComponents();
    }

    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FlightCode = new javax.swing.JTextField();
        RemoveBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font(fontFamily, 1, 48)); // NOI18N
        jLabel1.setText("Remove Flight");

        jLabel2.setFont(new java.awt.Font(fontFamily, 0, 24)); // NOI18N
        jLabel2.setText("Flight Code:");

        FlightCode.setFont(new java.awt.Font(fontFamily, 0, 24)); // NOI18N
        FlightCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlightCodeActionPerformed(evt);
            }
        });

        RemoveBtn.setFont(new java.awt.Font(fontFamily, 0, 24)); // NOI18N
        RemoveBtn.setText("Remove");
        RemoveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveBtnActionPerformed(evt);
            }
        });

        BackBtn.setFont(new java.awt.Font(fontFamily, 0, 24)); // NOI18N
        BackBtn.setText("Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(131, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(128, 128, 128))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(BackBtn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(RemoveBtn))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(FlightCode, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1)
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(FlightCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(RemoveBtn)
                                        .addComponent(BackBtn))
                                .addContainerGap(297, Short.MAX_VALUE))
        );
        this.setVisible(true);
    }// </editor-fold>

    private void RemoveBtnActionPerformed(ActionEvent evt) {
        Admin user = (Admin) auth.getCurrentAccount();
        Flight flight = user.searchFlight(FlightCode.getText());
        if (flight == null) {
            this.showNotification("Invalid Input", "Invalid Flight Code", true);
            return;
        }
        user.removeFlight(flight.getFlightNum());

        new AdminUI(auth);
        this.dispose();
    }

    private void BackBtnActionPerformed(ActionEvent e) {
        new AdminUI(auth);
        this.dispose();
    }

    private void FlightCodeActionPerformed(java.awt.event.ActionEvent evt) {
    }


    // Variables declaration - do not modify
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextField FlightCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton RemoveBtn;
    // End of variables declaration
}
