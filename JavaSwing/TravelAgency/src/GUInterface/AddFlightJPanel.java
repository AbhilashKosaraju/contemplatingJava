/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUInterface;

import Business.AirLiner;
import Business.Airplane;
import Business.Flight;
import Business.FlightFleet;
import Business.Seat;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author AbhilashKosaraju
 */
public class AddFlightJPanel extends javax.swing.JPanel {

    private JPanel UserContainer;
    private FlightFleet Flightfleet;
    private Flight fl;
    private Airplane ap;
    private Seat seat;

    AddFlightJPanel(JPanel UserContainer, FlightFleet Flightfleet) {
        initComponents();
        this.UserContainer = UserContainer;
        this.Flightfleet = Flightfleet;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        serialTextField = new javax.swing.JTextField();
        availableSeatsTextField = new javax.swing.JTextField();
        manYearTextField = new javax.swing.JTextField();
        totalSeatsTextField = new javax.swing.JTextField();
        modelTextField = new javax.swing.JTextField();
        licenseTextField = new javax.swing.JTextField();
        destinationTextField = new javax.swing.JTextField();
        airlinerTextField = new javax.swing.JTextField();
        startPointTextField = new javax.swing.JTextField();
        reservedSeatsTextField = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        arrivTimeTextField = new javax.swing.JTextField();
        departTimeTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        availabilityTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        seatcostTextField = new javax.swing.JTextField();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("                   Add Flight");

        jLabel2.setText("Destination");

        jLabel3.setText("License");

        jLabel4.setText("Serial Number");

        jLabel5.setText("Start Point ");

        jLabel6.setText("Airliner");

        jLabel7.setText("Available Seats");

        jLabel8.setText("Manufactured Year");

        jLabel9.setText("Model ");

        jLabel10.setText("Total Seats");

        jLabel11.setText("Reserved Seats");

        serialTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                serialTextFieldKeyPressed(evt);
            }
        });

        availableSeatsTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                availableSeatsTextFieldKeyReleased(evt);
            }
        });

        manYearTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                manYearTextFieldKeyPressed(evt);
            }
        });

        totalSeatsTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                totalSeatsTextFieldKeyPressed(evt);
            }
        });

        reservedSeatsTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                reservedSeatsTextFieldKeyPressed(evt);
            }
        });

        addbtn.setText("ADD");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel12.setText("Departure Time");

        jLabel13.setText("Arrival Time");

        jLabel14.setText("Availability");

        jLabel15.setText("Seat Cost");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(backBtn)
                        .addGap(233, 233, 233)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(destinationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(serialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(startPointTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(airlinerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(licenseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(manYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(availableSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reservedSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(394, 394, 394)
                                .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(departTimeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(arrivTimeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(availabilityTextField)
                            .addComponent(seatcostTextField))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backBtn))
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destinationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startPointTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(airlinerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(licenseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(availableSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reservedSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(addbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(arrivTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(departTimeTextField)
                                    .addGap(6, 6, 6))
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(availabilityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seatcostTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
        if (serialTextField.getText().equals("") || startPointTextField.getText().equals("") || destinationTextField.getText().equals("") || airlinerTextField.getText().equals("") || licenseTextField.getText().equals("") || manYearTextField.getText().equals("") || modelTextField.getText().equals("") || totalSeatsTextField.getText().equals("") || reservedSeatsTextField.getText().equals("") || departTimeTextField.getText().equals("") || arrivTimeTextField.getText().equals("") || availableSeatsTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, " Please fill all the required fields ");
        } else {

            int serialNumber = Integer.parseInt(serialTextField.getText());
            System.out.println(serialNumber);
            String startPoint = startPointTextField.getText();
            String destination = destinationTextField.getText();
            String airliner = airlinerTextField.getText();
            String license = licenseTextField.getText();
            int manYear = Integer.parseInt(manYearTextField.getText());
            String model = modelTextField.getText();
            int totalSeats = Integer.parseInt(totalSeatsTextField.getText());
            int availableSeats = Integer.parseInt(availableSeatsTextField.getText());
            int reservedSeats = Integer.parseInt(reservedSeatsTextField.getText());
            String availability = availabilityTextField.getText();

            String departtime = departTimeTextField.getText();
            String arrivetime = arrivTimeTextField.getText();

            AirLiner f = Flightfleet.addAirliner();
            fl = new Flight();
            ap = new Airplane();
            seat = new Seat();
            f.setLicense(license);
            f.setName(airliner);
            f.setAvailablity(availability);
            fl.setDestination(destination);
            ap.setManYear(manYear);
            fl.setSerialNumber(serialNumber);
            fl.setStartpoint(startPoint);
            ap.setModel(model);
            fl.setReservedseats(reservedSeats);
            fl.setAvailableseats(availableSeats);
            ap.setTotalseats(totalSeats);
            fl.setArrivetime(arrivetime);
            fl.setDeparttime(departtime);
            seat.setCost(Integer.parseInt(seatcostTextField.getText()));
            f.setAp(ap);
            f.setF(fl);

            if (serialTextField.getText().equals("") || startPointTextField.getText().equals("") || destinationTextField.getText().equals("") || airlinerTextField.getText().equals("") || licenseTextField.getText().equals("") || manYearTextField.getText().equals("") || modelTextField.getText().equals("") || totalSeatsTextField.getText().equals("") || reservedSeatsTextField.getText().equals("") || departTimeTextField.getText().equals("") || arrivTimeTextField.getText().equals("") || availableSeatsTextField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, " Please fill all the required fields ");
            } else {

                JOptionPane.showMessageDialog(null, "The Flight has been successfully added");
            }

        }

        serialTextField.setText("");
        startPointTextField.setText("");
        destinationTextField.setText("");
        airlinerTextField.setText("");
        licenseTextField.setText("");
        manYearTextField.setText("");
        modelTextField.setText("");
        totalSeatsTextField.setText("");
        availableSeatsTextField.setText("");
        reservedSeatsTextField.setText("");
        arrivTimeTextField.setText("");
        departTimeTextField.setText("");
        availabilityTextField.setText("");


    }//GEN-LAST:event_addbtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:

        UserContainer.remove(this);
        CardLayout layout = (CardLayout) UserContainer.getLayout();
        layout.previous(UserContainer);

    }//GEN-LAST:event_backBtnActionPerformed

    private void serialTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serialTextFieldKeyPressed

        int key = evt.getKeyCode();
        if ((key >= evt.VK_NUMPAD0 && key <= evt.VK_NUMPAD9) || (key >= evt.VK_0 && key <= evt.VK_9) || (key == evt.VK_BACK_SPACE)) {
            serialTextField.setEditable(true);
        } else {
            serialTextField.setEditable(false);
            JOptionPane.showMessageDialog(null, " Input format must be numbers");
            serialTextField.setText("");

        }


    }//GEN-LAST:event_serialTextFieldKeyPressed

    private void totalSeatsTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalSeatsTextFieldKeyPressed

        int key = evt.getKeyCode();
        if ((key >= evt.VK_NUMPAD0 && key <= evt.VK_NUMPAD9) || (key >= evt.VK_0 && key <= evt.VK_9) || (key == evt.VK_BACK_SPACE)) {
            totalSeatsTextField.setEditable(true);
        } else {
            totalSeatsTextField.setEditable(false);
            JOptionPane.showMessageDialog(null, " Input format must be numbers");
            totalSeatsTextField.setText("");

        }

    }//GEN-LAST:event_totalSeatsTextFieldKeyPressed

    private void availableSeatsTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_availableSeatsTextFieldKeyReleased

        int key = evt.getKeyCode();
        if ((key >= evt.VK_NUMPAD0 && key <= evt.VK_NUMPAD9) || (key >= evt.VK_0 && key <= evt.VK_9) || (key == evt.VK_BACK_SPACE)) {
            availableSeatsTextField.setEditable(true);
        } else {
            availableSeatsTextField.setEditable(false);
            JOptionPane.showMessageDialog(null, " Input format must be numbers");
            availableSeatsTextField.setText("");

        }


    }//GEN-LAST:event_availableSeatsTextFieldKeyReleased

    private void reservedSeatsTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reservedSeatsTextFieldKeyPressed
        int key = evt.getKeyCode();
        if ((key >= evt.VK_NUMPAD0 && key <= evt.VK_NUMPAD9) || (key >= evt.VK_0 && key <= evt.VK_9) || (key == evt.VK_BACK_SPACE)) {
            reservedSeatsTextField.setEditable(true);
        } else {
            reservedSeatsTextField.setEditable(false);
            JOptionPane.showMessageDialog(null, " Input format must be numbers");
            reservedSeatsTextField.setText("");

        }

    }//GEN-LAST:event_reservedSeatsTextFieldKeyPressed

    private void manYearTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_manYearTextFieldKeyPressed

        if (manYearTextField.getText().length() <= 3) {
            evt.consume();
        } else {
            manYearTextField.setEditable(false);
            JOptionPane.showMessageDialog(null, " Input format must be YYYY ");
            manYearTextField.setText("");
        }

        int key = evt.getKeyCode();
        if ((key >= evt.VK_NUMPAD0 && key <= evt.VK_NUMPAD9) || (key >= evt.VK_0 && key <= evt.VK_9) || (key == evt.VK_BACK_SPACE)) {
            manYearTextField.setEditable(true);
        } else {
            manYearTextField.setEditable(false);
            JOptionPane.showMessageDialog(null, " Input format must be numbers");
            manYearTextField.setText("");

        }

    }//GEN-LAST:event_manYearTextFieldKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JTextField airlinerTextField;
    private javax.swing.JTextField arrivTimeTextField;
    private javax.swing.JTextField availabilityTextField;
    private javax.swing.JTextField availableSeatsTextField;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField departTimeTextField;
    private javax.swing.JTextField destinationTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField licenseTextField;
    private javax.swing.JTextField manYearTextField;
    private javax.swing.JTextField modelTextField;
    private javax.swing.JTextField reservedSeatsTextField;
    private javax.swing.JTextField seatcostTextField;
    private javax.swing.JTextField serialTextField;
    private javax.swing.JTextField startPointTextField;
    private javax.swing.JTextField totalSeatsTextField;
    // End of variables declaration//GEN-END:variables
}