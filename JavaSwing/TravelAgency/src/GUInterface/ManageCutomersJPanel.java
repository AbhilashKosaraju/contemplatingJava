/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUInterface;

import Business.AirLiner;
import Business.Airplane;
import Business.Customer;
import Business.CustomerDirectory;
import Business.Flight;
import Business.FlightFleet;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JPanel;
import Business.Seat;
import java.awt.CardLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sowjanya
 */
public class ManageCutomersJPanel extends javax.swing.JPanel {

    private JPanel UserContainer;
    private CustomerDirectory Directory;
    private FlightFleet Flightfleet;

    ManageCutomersJPanel(JPanel UserContainer, CustomerDirectory Directory, FlightFleet Flightfleet) {
        initComponents();
        this.UserContainer = UserContainer;
        this.Flightfleet = Flightfleet;
        this.Directory = Directory;
    }

    public void importcsv() throws FileNotFoundException, IOException {
        String filepath = "Book22f.csv";
        FileReader fr = new FileReader(filepath);
        BufferedReader br = new BufferedReader(fr);
        String StringRead = br.readLine();

        while (StringRead != null) {
            StringTokenizer st = new StringTokenizer(StringRead, ",");
            String Name = st.nextToken().trim();
            String Gender = st.nextToken().trim();
            String Passport = st.nextToken().trim();
            String Startpoint = st.nextToken().trim();
            String Destination = st.nextToken().trim();
            String Airlines = st.nextToken().trim();
            String Seat = st.nextToken().trim();
            String SeatNumber = st.nextToken().trim();
            String serial = st.nextToken().trim();
            String Seatcost = st.nextToken().trim();

            //AirLiner a = new AirLiner(); 
            Customer cus = Directory.addCustomers();
            Seat s = new Seat();

            cus.setName(Name);
            cus.setGender(Gender);
            cus.setPassportnumber(Passport);
            cus.setFlightserial(Integer.parseInt(serial));
            cus.setDestination(Destination);
            cus.setStartpoint(Startpoint);
            cus.setSeat(Seat);
            cus.getS().setCost(Integer.parseInt(Seatcost));
            cus.getS().setSeat(Integer.parseInt(SeatNumber));
            cus.setAirlines(Airlines);

            StringRead = br.readLine();
        }
        br.close();
    }

    private void populateCustomerTable() {
        DefaultTableModel custb = (DefaultTableModel) displayCustomerTable.getModel();
        custb.setRowCount(0);

        for (Customer c : Directory.getDirectory()) {

            Object row[] = new Object[12];

            row[0] = c;
            row[1] = c.getGender();
            row[2] = c.getPassportnumber();
            row[3] = c.getStartpoint();
            row[4] = c.getDestination();
            row[5] = c.getAirlines();
            row[6] = c.getSeat();
            row[7] = c.getS().getCost();
            row[7] = c.getS().getSeat();
            row[8] = c.getFlightserial();
            row[9] = c.getAirlines();

            custb.addRow(row);

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
        displayCustomerTable = new javax.swing.JTable();
        dealsBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        displayCustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Gender", "Passport Number", "StartPoint", "Destination", "Airlines", "Seat", "Seat Number", "Flight Serial", "Seat Cost"
            }
        ));
        jScrollPane1.setViewportView(displayCustomerTable);

        dealsBtn.setText("Find Deals");
        dealsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealsBtnActionPerformed(evt);
            }
        });

        jButton2.setText("Import Customer Directory");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 962, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addComponent(dealsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(backBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(76, 76, 76)
                .addComponent(dealsBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(63, 63, 63))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dealsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealsBtnActionPerformed
        // TODO add your handling code here:
        CutomerDealsJPanel panel = new CutomerDealsJPanel(UserContainer, Flightfleet, Directory);
        UserContainer.add("AddAirlinerJPanel", panel);
        CardLayout layout = (CardLayout) UserContainer.getLayout();
        layout.next(UserContainer);

    }//GEN-LAST:event_dealsBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            importcsv();
            populateCustomerTable();
        } catch (IOException ex) {
            Logger.getLogger(ManageCutomersJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        UserContainer.remove(this);
        CardLayout layout = (CardLayout) UserContainer.getLayout();
        layout.previous(UserContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        populateCustomerTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton dealsBtn;
    private javax.swing.JTable displayCustomerTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
