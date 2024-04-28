package MainApplication.UI;

import MainApplication.Admin;
import MainApplication.Authentication;
import MainApplication.Flight;
import MainApplication.Route;

import javax.swing.*;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UpdateFlightUI extends MainFrame {

    Authentication auth;
    public UpdateFlightUI(Authentication auth) {
        this.auth = auth;
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Flight_NUM = new javax.swing.JLabel();
        Origin = new javax.swing.JTextField();
        Dest = new javax.swing.JTextField();
        Route = new javax.swing.JLabel();
        Route2 = new javax.swing.JLabel();
        Arrival_Date = new javax.swing.JTextField();
        Route1 = new javax.swing.JLabel();
        Route4 = new javax.swing.JLabel();
        Departure_Date = new javax.swing.JTextField();
        Departure = new javax.swing.JLabel();
        ADD = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Flight_NUM1 = new javax.swing.JLabel();
        FlightNum = new javax.swing.JTextField();

        ADD.setEnabled(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font(fontFamily, 1, 48)); // NOI18N
        jLabel1.setText("Update Booking");

        Flight_NUM.setText("Origin Location");

        Origin.setToolTipText("");
        Origin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                OriginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
//                OriginFocusLost(evt);
            }
        });
        Origin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OriginActionPerformed(evt);
            }
        });

        Dest.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DestFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DestFocusLost(evt);
            }
        });
        Dest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestActionPerformed(evt);
            }
        });

        Route.setText("Destination Location");

        Route2.setText("    Arrival:");

//        Arrival_Date.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM/dd/yyyy"))));
        Arrival_Date.setToolTipText("");
        Arrival_Date.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Arrival_DateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Arrival_DateFocusLost(evt);
            }
        });
        Arrival_Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Arrival_DateActionPerformed(evt);
            }
        });

        Route1.setText("format: dd-mm-yyyy-hh:mm");

        Route4.setText("format: dd-mm-yyyy-hh:mm");

        Departure_Date.setToolTipText("");
        Departure_Date.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Departure_DateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Departure_DateFocusLost(evt);
            }
        });
        Departure_Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Departure_DateActionPerformed(evt);
            }
        });

        Departure.setText("    Departure:");

        ADD.setText("Update Flight");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });

        jButton1.setText("Retrieve");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Flight_NUM1.setText("Flight Code");

        FlightNum.setToolTipText("");
        FlightNum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FlightNumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FlightNumFocusLost(evt);
            }
        });
        FlightNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlightNumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(Departure, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Departure_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(102, 102, 102)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(Route2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jButton1)
                                                                        .addComponent(Route1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(Route4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(115, 115, 115)
                                                                .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(Flight_NUM, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(120, 120, 120)
                                                                                .addComponent(Origin, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(Route, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(100, 100, 100)
                                                                                .addComponent(Dest, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(Flight_NUM1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(120, 120, 120)
                                                                                .addComponent(FlightNum, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(70, 70, 70)
                                                                .addComponent(Arrival_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Flight_NUM1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(FlightNum, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Flight_NUM, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(Origin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Route, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Dest, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Route1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(Arrival_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(Route2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Route4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(Departure, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Departure_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(123, Short.MAX_VALUE))
        );

        this.setVisible(true);
    }// </editor-fold>

    private void OriginFocusGained(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
    }

    private void OriginFcusLost(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
    }

    private void OriginActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void DestFocusGained(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
    }

    private void DestFocusLost(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:

    }

    private void DestActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void Arrival_DateFocusGained(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
    }

    private void Arrival_DateFocusLost(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
    }

    private void Arrival_DateActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void Departure_DateFocusGained(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
    }

    private void Departure_DateFocusLost(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
    }

    private void Departure_DateActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {
        Admin user = (Admin) auth.getCurrentAccount();
        Flight flight = user.searchFlight(FlightNum.getText());
        if (flight == null) {
            this.showNotification("Invalid Input", "Flight Code is invalid", true);
            ADD.setEnabled(false);
            return;
        }

        ADD.setEnabled(true);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH:mm");
        LocalDateTime arrival;
        try {
            arrival = LocalDateTime.parse(Arrival_Date.getText(), dtf);
        } catch (DateTimeException e) {
            this.showNotification("Invalid Inputs", "Invalid arrival date", true);
            return;
        }

        LocalDateTime departure;
        try {
            departure  = LocalDateTime.parse(Arrival_Date.getText(), dtf);
        }catch (DateTimeException e) {
            this.showNotification("Invalid Inputs", "Invalid departure date", true);
            return;
        }
        user.updateFlight(flight, Origin.getText(), Dest.getText(), arrival, departure);
        new AdminUI(auth);
        this.dispose();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        Admin user = (Admin) auth.getCurrentAccount();
        Flight flight = user.searchFlight(FlightNum.getText());
        if (flight == null) {
            this.showNotification("Invalid Input", "Flight Code is invalid", true);
            ADD.setEnabled(false);
            return;
        }

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH:mm");
        ADD.setEnabled(true);
        Origin.setText(flight.getRoute().getOrigin());
        Dest.setText(flight.getRoute().getDestination());
        Departure_Date.setText(flight.getDeparture().format(dtf));
        Arrival_Date.setText(flight.getArrival().format(dtf));
    }

    private void FlightNumFocusGained(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
    }

    private void FlightNumFocusLost(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
    }

    private void FlightNumActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    // Variables declaration - do not modify
    private javax.swing.JButton ADD;
    private JTextField Arrival_Date;
    private javax.swing.JLabel Departure;
    private JTextField Departure_Date;
    private javax.swing.JTextField Dest;
    private javax.swing.JTextField FlightNum;
    private javax.swing.JLabel Flight_NUM;
    private javax.swing.JLabel Flight_NUM1;
    private javax.swing.JTextField Origin;
    private javax.swing.JLabel Route;
    private javax.swing.JLabel Route1;
    private javax.swing.JLabel Route2;
    private javax.swing.JLabel Route4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration
}
