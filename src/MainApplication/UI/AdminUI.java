package MainApplication.UI;

import MainApplication.Authentication;

public class AdminUI extends MainFrame {

    final Authentication auth;
    public AdminUI(Authentication auth) {
        this.auth = auth;
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ViewBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        ReportBtn = new javax.swing.JButton();
        LogoutBtn = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font(fontFamily, 1, 48)); // NOI18N
        jLabel1.setText("Welcome");

        jLabel2.setFont(new java.awt.Font(fontFamily, 0, 24)); // NOI18N
        jLabel2.setText("What would you like to do?");

        ViewBtn.setFont(new java.awt.Font(fontFamily, 0, 18)); // NOI18N
        ViewBtn.setText("View Flights");
        ViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBtnActionPerformed(evt);
            }
        });

        AddBtn.setFont(new java.awt.Font(fontFamily, 0, 18)); // NOI18N
        AddBtn.setText("Add a Flight");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        CancelBtn.setFont(new java.awt.Font(fontFamily, 0, 18)); // NOI18N
        CancelBtn.setText("Remove a Flight");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        UpdateBtn.setFont(new java.awt.Font(fontFamily, 0, 18)); // NOI18N
        UpdateBtn.setText("Update a Flight");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        ReportBtn.setFont(new java.awt.Font(fontFamily, 0, 18)); // NOI18N
        ReportBtn.setText("Generate Report");
        ReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportBtnActionPerformed(evt);
            }
        });

        LogoutBtn.setFont(new java.awt.Font(fontFamily, 0, 18)); // NOI18N
        LogoutBtn.setText("Logout");
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });

        ExitBtn.setFont(new java.awt.Font(fontFamily, 0, 18)); // NOI18N
        ExitBtn.setText("Exit");
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ReportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(ViewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ReportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(54, Short.MAX_VALUE))
        );

        this.setVisible(true);
    }

    private void ViewBtnActionPerformed(java.awt.event.ActionEvent evt) {
        new ViewFlightsUI(auth);
        this.dispose();
    }

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {
        new AddFlightUI(auth);
        this.dispose();
    }

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {
        new RemoveFlightUI(auth);
        this.dispose();
    }

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {
        new UpdateFlightUI(auth);
        this.dispose();
    }

    private void ReportBtnActionPerformed(java.awt.event.ActionEvent evt) {
        new GenerateReportUI(auth);
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

    // Variables declaration - do not modify
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JButton ReportBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JButton ViewBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration
}
