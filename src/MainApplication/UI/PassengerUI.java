package MainApplication.UI;

import MainApplication.Authentication;

public class PassengerUI extends MainFrame {

    final Authentication auth;

    public PassengerUI(Authentication auth) {
        this.auth = auth;
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ViewBtn = new javax.swing.JButton();
        BookBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        ManageBtn = new javax.swing.JButton();
        LogoutBtn = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();
        FlightsBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel1.setText("Welcome");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel2.setText("What would you like to do?");

        ViewBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        ViewBtn.setText("View Bookings");
        ViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBtnActionPerformed(evt);
            }
        });

        BookBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        BookBtn.setText("Book a Flight");
        BookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookBtnActionPerformed(evt);
            }
        });

        CancelBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        CancelBtn.setText("Cancel Booking");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        UpdateBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        UpdateBtn.setText("Update Booking");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        ManageBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        ManageBtn.setText("Manage Account");
        ManageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageBtnActionPerformed(evt);
            }
        });

        LogoutBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        LogoutBtn.setText("Logout");
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });

        ExitBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        ExitBtn.setText("Exit");
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });

        FlightsBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        FlightsBtn.setText("View Flights");
        FlightsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlightsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(FlightsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ManageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                        .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ViewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(41, 41, 41)
                                .addComponent(BookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ViewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ManageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FlightsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        this.setVisible(true);
    }


    private void ViewBtnActionPerformed(java.awt.event.ActionEvent evt) {
        new ViewBookingsUI(auth);
        this.dispose();
    }

    private void BookBtnActionPerformed(java.awt.event.ActionEvent evt) {
        new AddBookingUI(auth);
        this.dispose();
    }

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {
        new RemoveBookingUI(auth);
        this.dispose();
    }

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void ManageBtnActionPerformed(java.awt.event.ActionEvent evt) {
        new ManageAccountUI(auth);
        this.dispose();
    }

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {
        auth.logout();
        new SignInUI(auth);
        this.dispose();
    }

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(1);
    }

    private void FlightsBtnActionPerformed(java.awt.event.ActionEvent evt) {
        new ViewFlightsUI(auth);
        this.dispose();
    }

    // Variables declaration - do not modify
    private javax.swing.JButton BookBtn;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JButton ManageBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JButton ViewBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton FlightsBtn;
    // End of variables declaration
}
