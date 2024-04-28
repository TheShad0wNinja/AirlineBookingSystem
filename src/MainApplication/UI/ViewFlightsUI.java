package MainApplication.UI;

import MainApplication.Admin;
import MainApplication.Authentication;
import MainApplication.Flight;
import MainApplication.Passenger;

import javax.swing.table.DefaultTableModel;

public class ViewFlightsUI extends MainFrame {

    Authentication auth;
    public ViewFlightsUI(Authentication auth) {
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
        jLabel1.setText("View Flights");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                },
                new String [] {
                        "Flight Num", "Seat Num", "Origin", "Destination", "Departure", "Arrival"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });

        if (!auth.isAdmin()) {
            Passenger user = (Passenger) auth.getCurrentAccount();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(user.viewAvailableFlights().size());

            int row = 0;
            for (Flight flight : user.viewAvailableFlights()) {
                int col = 0;
                model.setValueAt(flight.getFlightNum(), row, col++);
                model.setValueAt(flight.getSeats().size(), row, col++);
                model.setValueAt(flight.getRoute().getOrigin(), row, col++);
                model.setValueAt(flight.getRoute().getDestination(), row, col++);
                model.setValueAt(flight.getDeparture().toString(), row, col++);
                model.setValueAt(flight.getArrival().toString(), row, col++);
                row++;
            }
        } else {
            Admin user = (Admin) auth.getCurrentAccount();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(user.getFlights().size());

            int row = 0;
            for (Flight flight : user.getFlights()) {
                int col = 0;
                model.setValueAt(flight.getFlightNum(), row, col++);
                model.setValueAt(flight.getSeats().size(), row, col++);
                model.setValueAt(flight.getRoute().getOrigin(), row, col++);
                model.setValueAt(flight.getRoute().getDestination(), row, col++);
                model.setValueAt(flight.getDeparture().toString(), row, col++);
                model.setValueAt(flight.getArrival().toString(), row, col++);
                row++;
            }
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
        if (auth.isAdmin())
            new AdminUI(auth);
        else
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
