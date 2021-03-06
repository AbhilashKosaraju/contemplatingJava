/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUInterface;

import Business.FlightFleet;
import Business.AirLiner;
import Business.Flight;
import Business.Airplane;
import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author sowjanya
 */
public class ManageFlightsJPanel extends javax.swing.JPanel {

    private JPanel UserContainer;
    private FlightFleet Flightfleet;
    private Flight f;
    private Airplane air;

    ManageFlightsJPanel(JPanel UserContainer, FlightFleet Flightfleet) throws IOException {

        initComponents();
        this.UserContainer = UserContainer;
        this.Flightfleet = Flightfleet;
        //importcsv();
        populateFlightTable();
    }

    public void importcsv() throws FileNotFoundException, IOException {
        String filepath = "Book1f.csv";
        FileReader fr = new FileReader(filepath);
        BufferedReader br = new BufferedReader(fr);
        String StringRead = br.readLine();

        while (StringRead != null) {
            StringTokenizer st = new StringTokenizer(StringRead, ",");
            String SerialNumber = st.nextToken().trim();
            String Model = st.nextToken().trim();
            String AirlineName = st.nextToken().trim();
            String startpoint = st.nextToken().trim();
            String startTime = st.nextToken().trim();
            String destination = st.nextToken().trim();
            String arrivetime = st.nextToken().trim();
            String ReservedSeats = st.nextToken().trim();
            String AvailableSeats = st.nextToken().trim();
            String TotalSeats = st.nextToken().trim();
            String cost = st.nextToken().trim();
            String availability = st.nextToken().trim();
            String Manyear = st.nextToken().trim();
            String License = st.nextToken().trim();

            //AirLiner a = new AirLiner(); 
            AirLiner a = Flightfleet.addAirliner();
            Airplane air = new Airplane();
            Flight f = new Flight();

            a.setLicense(License);           // a.setManufacturedYear(Integer.parseInt(Manyear));
            a.setName(AirlineName);
            a.setAvailablity(availability);
            air.setManYear(Integer.parseInt(Manyear));
            air.setModel(Model);           // air.setSerialNumber(Integer.parseInt(SerialNumber));
            air.setTotalseats(Integer.parseInt(TotalSeats));

            f.setSerialNumber(Integer.parseInt(SerialNumber));
            f.setStartpoint(startpoint);
            f.setDeparttime(startTime);
            f.setDestination(destination);
            f.setArrivetime(arrivetime);
            f.setAvailableseats(Integer.parseInt(AvailableSeats));
            f.setReservedseats(Integer.parseInt(ReservedSeats));
            f.getSe().setCost(Integer.parseInt(cost));

            a.setF(f);
            a.setAp(air);

            StringRead = br.readLine();
        }
        br.close();
    }

    private void populateFlightTable() {
        DefaultTableModel fltb = (DefaultTableModel) displayFlightTable.getModel();
        fltb.setRowCount(0);

        for (AirLiner a : Flightfleet.getFlightfleet()) {

            Object row[] = new Object[15];

            row[0] = a;
            row[1] = a.getAvailablity();
            row[2] = a.getLicense();
            row[3] = a.getAp().getModel(); //a.getManufacturedYear();
            row[4] = a.getAp().getManYear();
            row[5] = a.getAp().getTotalseats();
            f = a.getF();
            row[6] = f.getSerialNumber();
            System.out.println(f.getSerialNumber() + "f.serialnumber");
            row[7] = a.getF().getStartpoint();
            row[8] = a.getF().getDeparttime();
            row[9] = a.getF().getDestination();
            row[10] = a.getF().getArrivetime();
            row[11] = a.getF().getAvailableseats();
            row[12] = a.getF().getReservedseats();
            row[13] = a.getF().getSe().getCost();

            fltb.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        displayFlightTable = new javax.swing.JTable();
        addflightBtn = new javax.swing.JButton();
        updateFlightScheduleBtn = new javax.swing.JButton();
        cancelFlightSchedule = new javax.swing.JButton();
        quicksearchTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        displayFlightTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner", "Availability", "License", "Model", "Manufactureed Year", "Total Seats", "Serial Number", "Start Point ", "Departure Time", "Destination", "Arrival Time", "Available Seats", "Total Seats", "Seat Cost"
            }
        ));
        jScrollPane1.setViewportView(displayFlightTable);

        addflightBtn.setText("Add Flight");
        addflightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addflightBtnActionPerformed(evt);
            }
        });

        updateFlightScheduleBtn.setText("Update Flight Schedule");
        updateFlightScheduleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateFlightScheduleBtnActionPerformed(evt);
            }
        });

        cancelFlightSchedule.setText("Cancel the Flight ");
        cancelFlightSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelFlightScheduleActionPerformed(evt);
            }
        });

        quicksearchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quicksearchTextFieldActionPerformed(evt);
            }
        });
        quicksearchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quicksearchTextFieldKeyReleased(evt);
            }
        });

        jLabel1.setText("      Quick Search :");

        jButton1.setText("Import");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addflightBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updateFlightScheduleBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(cancelFlightSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(backBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1025, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(quicksearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quicksearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jButton2)))
                .addGap(32, 32, 32)
                .addComponent(addflightBtn)
                .addGap(26, 26, 26)
                .addComponent(updateFlightScheduleBtn)
                .addGap(32, 32, 32)
                .addComponent(cancelFlightSchedule)
                .addGap(34, 34, 34)
                .addComponent(backBtn)
                .addGap(0, 462, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addflightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addflightBtnActionPerformed
        // TODO add your handling code here:

        AddFlightJPanel panel = new AddFlightJPanel(UserContainer, Flightfleet);
        UserContainer.add("AddFlightJPanel", panel);
        CardLayout layout = (CardLayout) UserContainer.getLayout();
        layout.next(UserContainer);

    }//GEN-LAST:event_addflightBtnActionPerformed

    private void updateFlightScheduleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateFlightScheduleBtnActionPerformed

        try {
            UpdateFlightJPanel panel = new UpdateFlightJPanel(UserContainer, Flightfleet);
            UserContainer.add("UpdateFlightScheduleJPanel", panel);
            CardLayout layout = (CardLayout) UserContainer.getLayout();
            layout.next(UserContainer);
        } catch (IOException ex) {
            Logger.getLogger(ManageFlightsJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateFlightScheduleBtnActionPerformed

    private void cancelFlightScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelFlightScheduleActionPerformed
        CancelFlightsJPanel panel = new CancelFlightsJPanel(UserContainer, Flightfleet);
        UserContainer.add("CancelFlightJPanel", panel);
        CardLayout layout = (CardLayout) UserContainer.getLayout();
        layout.next(UserContainer);
    }//GEN-LAST:event_cancelFlightScheduleActionPerformed

    private void quicksearchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quicksearchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quicksearchTextFieldActionPerformed

    private void quicksearchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quicksearchTextFieldKeyReleased

        DefaultTableModel apft = (DefaultTableModel) displayFlightTable.getModel();
        String search = quicksearchTextField.getText();
        if (search.length() > 1) {
            search = search.substring(0, 1).toUpperCase() + search.substring(1, search.length());
        }
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(apft);

        displayFlightTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));


    }//GEN-LAST:event_quicksearchTextFieldKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            importcsv();
            populateFlightTable();
        } catch (IOException ex) {
            Logger.getLogger(ManageFlightsJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        UserContainer.remove(this);
        CardLayout layout = (CardLayout) UserContainer.getLayout();
        layout.previous(UserContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        populateFlightTable();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addflightBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton cancelFlightSchedule;
    private javax.swing.JTable displayFlightTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField quicksearchTextField;
    private javax.swing.JButton updateFlightScheduleBtn;
    // End of variables declaration//GEN-END:variables
}
