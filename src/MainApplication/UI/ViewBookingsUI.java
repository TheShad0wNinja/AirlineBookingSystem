package MainApplication.UI;

import MainApplication.*;

import javax.swing.table.DefaultTableModel;

public class ViewBookingsUI extends MainFrame {

    Authentication auth;
    public ViewBookingsUI(Authentication auth) {
        this.auth = auth;
        initComponents();
    }

    private void initComponents() {

        BackBtn = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackBtn.setLabel("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font(fontFamily, 1, 36)); // NOI18N
        jLabel1.setText("View Bookings");

        jTable1.setModel(new DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                },
                new String [] {
                        "Booking Number", "Ticket Code", "Origin", "Destination", "Flight Number", "Arrival"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });

        Passenger user = (Passenger) auth.getCurrentAccount();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(user.getBookingCount());

        int row = 0;
        for (Booking booking : user.viewBookings()) {
            int col = 0;
            model.setValueAt(booking.getBookingCode(), row, col++);
            model.setValueAt(booking.getTicket().getTicketCode(), row, col++);
            model.setValueAt(booking.getTicket().getFlight().getRoute().getOrigin(), row, col++);
            model.setValueAt(booking.getTicket().getFlight().getRoute().getDestination(), row, col++);
            model.setValueAt(booking.getTicket().getFlight().getFlightNum(), row, col++);
            model.setValueAt(booking.getTicket().getFlight().getArrival().toString(), row, col++);
            row++;
        }

        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(183, 183, 183))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        this.setVisible(true);
    }// </editor-fold>

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {
        new PassengerUI(auth);
        this.dispose();
    }

    // Variables declaration - do not modify
    private java.awt.Button BackBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration
}
