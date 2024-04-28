package MainApplication.UI;

import MainApplication.Admin;
import MainApplication.Authentication;
import MainApplication.Flight;

import javax.swing.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AddFlightUI extends MainFrame {

    Authentication auth;
    public AddFlightUI(Authentication auth) {
        this.auth = auth;
        initComponents();
    }

    private void initComponents() {

        Flight_ID_textbox = new javax.swing.JTextField();
        radio = new javax.swing.ButtonGroup();
        Flight_title = new javax.swing.JLabel();
        Flight_NUM = new javax.swing.JLabel();
        Route = new javax.swing.JLabel();
        Origin = new javax.swing.JTextField();
        Dest = new javax.swing.JTextField();
        Route1 = new javax.swing.JLabel();
        Seats = new javax.swing.JLabel();
        Arrival_Date = new javax.swing.JTextField();
        ADD = new javax.swing.JButton();
        Departure = new javax.swing.JLabel();
        Departure_Date = new javax.swing.JTextField();
        ecoBox = new javax.swing.JCheckBox();
        firstBox = new javax.swing.JCheckBox();
        BusBox = new javax.swing.JCheckBox();
        FirstRow = new javax.swing.JTextField();
        EcoRow = new javax.swing.JTextField();
        BusRow = new javax.swing.JTextField();
        Seats1 = new javax.swing.JLabel();
        Seats2 = new javax.swing.JLabel();
        EcoCol = new javax.swing.JTextField();
        BusCol = new javax.swing.JTextField();
        FirstCol = new javax.swing.JTextField();
        Route2 = new javax.swing.JLabel();
        Route4 = new javax.swing.JLabel();
        Seats3 = new javax.swing.JLabel();
        EcoFare = new javax.swing.JTextField();
        BusFare = new javax.swing.JTextField();
        FirstFare = new javax.swing.JTextField();

        Flight_ID_textbox.setText("jTextField1");
        Flight_ID_textbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Flight_ID_textboxActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(null);

        Flight_title.setFont(new java.awt.Font(fontFamily, 1, 22)); // NOI18N
        Flight_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Flight_title.setText("Add Flight");
        getContentPane().add(Flight_title);
        Flight_title.setBounds(0, 0, 620, 95);

        Flight_NUM.setText("Origin Location");
        getContentPane().add(Flight_NUM);
        Flight_NUM.setBounds(30, 90, 120, 60);

        Route.setText("Destination Location");
        getContentPane().add(Route);
        Route.setBounds(30, 160, 140, 40);

        Origin.setToolTipText("");
        Origin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                OriginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                OriginFocusLost(evt);
            }
        });
        Origin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OriginActionPerformed(evt);
            }
        });
        getContentPane().add(Origin);
        Origin.setBounds(270, 100, 230, 40);

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
        getContentPane().add(Dest);
        Dest.setBounds(270, 160, 230, 42);

        Route1.setText("format: dd/mm/yyyy-hh:mm");
        getContentPane().add(Route1);
        Route1.setBounds(40, 380, 190, 40);

        Seats.setText("Number of columns (Max 10)");
        getContentPane().add(Seats);
        Seats.setBounds(40, 310, 180, 40);

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
        getContentPane().add(Arrival_Date);
        Arrival_Date.setBounds(100, 410, 164, 23);

        ADD.setText("Add Flight");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        getContentPane().add(ADD);
        ADD.setBounds(240, 470, 120, 40);

        Departure.setText("    Departure:");
        getContentPane().add(Departure);
        Departure.setBounds(320, 400, 80, 40);

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
        getContentPane().add(Departure_Date);
        Departure_Date.setBounds(410, 410, 164, 23);

        ecoBox.setText("Economy");
        ecoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecoBoxActionPerformed(evt);
            }
        });
        getContentPane().add(ecoBox);
        ecoBox.setBounds(260, 250, 93, 21);

        firstBox.setText("First Class");
        firstBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstBoxActionPerformed(evt);
            }
        });
        getContentPane().add(firstBox);
        firstBox.setBounds(490, 250, 93, 21);

        BusBox.setText("Business");
        BusBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusBoxActionPerformed(evt);
            }
        });
        getContentPane().add(BusBox);
        BusBox.setBounds(380, 250, 93, 21);

        FirstRow.setEditable(false);
        FirstRow.setText("0");
        getContentPane().add(FirstRow);
        FirstRow.setBounds(490, 290, 80, 23);

        EcoRow.setEditable(false);
        EcoRow.setText("0");
        EcoRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EcoRowActionPerformed(evt);
            }
        });
        getContentPane().add(EcoRow);
        EcoRow.setBounds(260, 290, 80, 23);

        BusRow.setEditable(false);
        BusRow.setText("0");
        getContentPane().add(BusRow);
        BusRow.setBounds(380, 290, 80, 23);

        Seats1.setText("    Seat type:");
        getContentPane().add(Seats1);
        Seats1.setBounds(20, 240, 120, 40);

        Seats2.setText("Number of Rows");
        getContentPane().add(Seats2);
        Seats2.setBounds(40, 280, 120, 40);

        EcoCol.setEditable(false);
        EcoCol.setText("0");
        EcoCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EcoColActionPerformed(evt);
            }
        });
        getContentPane().add(EcoCol);
        EcoCol.setBounds(260, 320, 80, 23);

        BusCol.setEditable(false);
        BusCol.setText("0");
        getContentPane().add(BusCol);
        BusCol.setBounds(380, 320, 80, 23);

        FirstCol.setEditable(false);
        FirstCol.setText("0");
        getContentPane().add(FirstCol);
        FirstCol.setBounds(490, 320, 80, 23);

        Route2.setText("    Arrival:");
        getContentPane().add(Route2);
        Route2.setBounds(30, 400, 80, 40);

        Route4.setText("format: dd/mm/yyyy-hh:mm");
        getContentPane().add(Route4);
        Route4.setBounds(340, 380, 190, 40);

        Seats3.setText("Fare");
        getContentPane().add(Seats3);
        Seats3.setBounds(40, 340, 180, 40);

        EcoFare.setEditable(false);
        EcoFare.setText("0");
        EcoFare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EcoFareActionPerformed(evt);
            }
        });
        getContentPane().add(EcoFare);
        EcoFare.setBounds(260, 350, 80, 23);

        BusFare.setEditable(false);
        BusFare.setText("0");
        getContentPane().add(BusFare);
        BusFare.setBounds(380, 350, 80, 23);

        FirstFare.setEditable(false);
        FirstFare.setText("0");
        getContentPane().add(FirstFare);
        FirstFare.setBounds(490, 350, 80, 23);

        setVisible(true);
    }// </editor-fold>

    private void Flight_ID_textboxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void DestActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void Arrival_DateActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void DestFocusGained(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
    }

    private void DestFocusLost(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:

    }

    private void Arrival_DateFocusGained(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
    }

    private void Arrival_DateFocusLost(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
    }

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {
        if (Origin.getText().isEmpty() || Dest.getText().isEmpty() || Arrival_Date.getText().isEmpty() || Departure_Date.getText().isEmpty()) {
            this.showNotification("Invalid Inputs", "Missing fields", true);
            return;
        }

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm");
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

        Admin user = (Admin) auth.getCurrentAccount();
        user.addNewFlight(Origin.getText(),
                Dest.getText(),
                Integer.parseInt(EcoRow.getText()),
                Integer.parseInt(EcoCol.getText()),
                Float.parseFloat(EcoFare.getText()),
                Integer.parseInt(BusRow.getText()),
                Integer.parseInt(BusCol.getText()),
                Float.parseFloat(BusFare.getText()),
                Integer.parseInt(FirstRow.getText()),
                Integer.parseInt(FirstCol.getText()),
                Float.parseFloat(FirstFare.getText()),
                departure,
                arrival
        );

        new AdminUI(auth);
        this.dispose();
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

    private void ecoBoxActionPerformed(java.awt.event.ActionEvent evt) {
        EcoRow.setEditable(ecoBox.isSelected());
        EcoFare.setEditable(ecoBox.isSelected());
        EcoCol.setEditable(ecoBox.isSelected());

        if (!ecoBox.isSelected()) {
            EcoCol.setText("0");
            EcoRow.setText("0");
            EcoFare.setText("0");
        }
    }

    private void firstBoxActionPerformed(java.awt.event.ActionEvent evt) {
        FirstCol.setEditable(firstBox.isSelected());
        FirstRow.setEditable(firstBox.isSelected());
        FirstFare.setEditable(firstBox.isSelected());

        if (!firstBox.isSelected()) {
            FirstCol.setText("0");
            FirstRow.setText("0");
            FirstFare.setText("0");
        }
    }

    private void BusBoxActionPerformed(java.awt.event.ActionEvent evt) {
        BusCol.setEditable(BusBox.isSelected());
        BusRow.setEditable(BusBox.isSelected());
        BusFare.setEditable(BusBox.isSelected());

        if (!BusBox.isSelected()) {
            BusCol.setText("0");
            BusRow.setText("0");
            BusFare.setText("0");
        }
    }

    private void EcoRowActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void EcoColActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void OriginActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void OriginFocusLost(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
    }

    private void OriginFocusGained(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
    }

    private void EcoFareActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    // Variables declaration - do not modify
    private javax.swing.JButton ADD;
    private JTextField Arrival_Date;
    private javax.swing.JCheckBox BusBox;
    private javax.swing.JTextField BusCol;
    private javax.swing.JTextField BusFare;
    private javax.swing.JTextField BusRow;
    private javax.swing.JLabel Departure;
    private JTextField Departure_Date;
    private javax.swing.JTextField Dest;
    private javax.swing.JTextField EcoCol;
    private javax.swing.JTextField EcoFare;
    private javax.swing.JTextField EcoRow;
    private javax.swing.JTextField FirstCol;
    private javax.swing.JTextField FirstFare;
    private javax.swing.JTextField FirstRow;
    private javax.swing.JTextField Flight_ID_textbox;
    private javax.swing.JLabel Flight_NUM;
    private javax.swing.JLabel Flight_title;
    private javax.swing.JTextField Origin;
    private javax.swing.JLabel Route;
    private javax.swing.JLabel Route1;
    private javax.swing.JLabel Route2;
    private javax.swing.JLabel Route4;
    private javax.swing.JLabel Seats;
    private javax.swing.JLabel Seats1;
    private javax.swing.JLabel Seats2;
    private javax.swing.JLabel Seats3;
    private javax.swing.JCheckBox ecoBox;
    private javax.swing.JCheckBox firstBox;
    private javax.swing.ButtonGroup radio;
    // End of variables declaration
}
