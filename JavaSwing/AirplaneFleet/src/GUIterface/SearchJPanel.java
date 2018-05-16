/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIterface;

import GUIterface.DisplayJPanel;

import Business.AirPlaneFleet;
import Business.AirPlanes;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import javax.swing.table.DefaultTableModel;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author sowjanya
 */
public class SearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchJPanel
     */
    private AirPlaneFleet apf;

    public SearchJPanel(AirPlaneFleet apf) throws FileNotFoundException, IOException {

        this.apf = apf;

        initComponents();
        populateSearchTable();
        clearTable();

    }

    public void importcsv() throws FileNotFoundException, IOException {
        String filepath = "C:\\Users\\sowjanya\\Documents\\NetBeansProjects\\Homework2\\src\\Book1.csv";
        FileReader fr = new FileReader(filepath);
        BufferedReader br = new BufferedReader(fr);
        String StringRead = br.readLine();

        while (StringRead != null) {
            StringTokenizer st = new StringTokenizer(StringRead, ",");
            String SerialNumber = st.nextToken().trim();
            String AirlineType = st.nextToken().trim();
            String Airliner = st.nextToken().trim();
            String ModelNumber = st.nextToken().trim();
            String StartPoint = st.nextToken().trim();
            String Destination = st.nextToken().trim();
            String Departure = st.nextToken().trim();
            int AvailableSeats = Integer.parseInt(st.nextToken());
            String Manufacturedyear = st.nextToken().trim();
            String License = st.nextToken().trim();
            String Available = st.nextToken().trim();

            AirPlanes a = apf.addPlanes();
            a.setAvailablity(Available);
            a.setDeparture(Departure);
            a.setManufacturedyear(Integer.parseInt(Manufacturedyear));
            a.setType(AirlineType);
            a.setAirliner(Airliner);
            a.setModelNumber(ModelNumber);
            a.setStartPoint(StartPoint);
            a.setSerialNumber(SerialNumber);
            a.setDestination(Destination);
            a.setAvailableSeats(AvailableSeats);
            a.setLicense(License);
            StringRead = br.readLine();
        }
        br.close();

    }

    private void populateSearchTable() {
        DefaultTableModel apft = (DefaultTableModel) planeSearchTable.getModel();

        apft.setRowCount(0);

        for (AirPlanes ap : apf.getFleet()) {
            Object row[] = new Object[12];

            row[0] = ap;
            row[1] = ap.getType();
            row[2] = ap.getAirliner();
            row[3] = ap.getModelNumber();
            row[4] = ap.getStartPoint();
            row[5] = ap.getDestination();
            row[6] = ap.getDeparture();
            row[7] = ap.getAvailableSeats();
            row[8] = ap.getManufacturedyear();
            row[9] = ap.getLicense();
            row[10] = ap.getAvailablity();
            apft.addRow(row);

            //apft.setRowCount(0);
        }

        Calendar calendar = Calendar.getInstance();
        java.util.Date now = calendar.getTime();
        java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(now.getTime());
        String Lastupdate = String.valueOf(currentTimestamp);

        updatesTextField.setText(Lastupdate);
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
        planeSearchTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        updatesTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        allPlanesBtn = new javax.swing.JButton();
        boeingPlaneBtn = new javax.swing.JButton();
        availablePlanesBtn = new javax.swing.JButton();
        searchTextField = new javax.swing.JTextField();
        availablePlanesTextField = new javax.swing.JTextField();
        notAvailablePlanesTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        manuBtn = new javax.swing.JButton();
        yearTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        minseatsTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        maxseatsTextField = new javax.swing.JTextField();
        seatsBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        serialBtn = new javax.swing.JButton();
        serialnoTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        modelnoTextField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        airlineTextField = new javax.swing.JTextField();
        airlinerBtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        upTextField = new javax.swing.JTextField();
        airportBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        airportTextField = new javax.swing.JTextField();
        maintenanceBtn = new javax.swing.JButton();
        importcsvBtn = new javax.swing.JButton();

        planeSearchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SerialNumber", "Plane Tyoe", "Airliner", "Model Number", "Start Point", "Destination l", "Departure Timel", "Available Seats", "Manufactured Year", "License", "Available"
            }
        ));
        jScrollPane1.setViewportView(planeSearchTable);

        jLabel1.setText("   Quick Search");

        jLabel2.setText("Lastly Update on");

        allPlanesBtn.setText("Currently available planes and other planes");
        allPlanesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allPlanesBtnActionPerformed(evt);
            }
        });

        boeingPlaneBtn.setText("Planes Made By Boeing");
        boeingPlaneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boeingPlaneBtnActionPerformed(evt);
            }
        });

        availablePlanesBtn.setText("Available Planes");
        availablePlanesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availablePlanesBtnActionPerformed(evt);
            }
        });

        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });
        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyReleased(evt);
            }
        });

        jLabel3.setText("&");

        manuBtn.setText("Get Planes");
        manuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manuBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("                                                                                                Planes Manufactured on ");

        jLabel5.setText("                            Planes with the minimum of ");

        jLabel6.setText("  and maximum of");

        seatsBtn.setText("Get Planes");
        seatsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatsBtnActionPerformed(evt);
            }
        });

        resetBtn.setText("Reset ");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        serialBtn.setText("Get Plane");
        serialBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serialBtnActionPerformed(evt);
            }
        });

        jLabel7.setText("                       Enter the serial number of the plane you want to find here");

        jLabel8.setText("                     Enter the model number here to get the list of planes");

        modelnoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelnoTextFieldActionPerformed(evt);
            }
        });

        jButton2.setText("Get Planes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setText("                            Enter the Airline name to get its manufacturers ");

        airlinerBtn.setText("Get Planes");
        airlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlinerBtnActionPerformed(evt);
            }
        });

        updatebtn.setText("Click here to see when was the last time the catalog was updated ");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        airportBtn.setText("Get Planes");
        airportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airportBtnActionPerformed(evt);
            }
        });

        jLabel10.setText("                      Flights available from ");

        maintenanceBtn.setText("Click here to get a list of all planes with expired mainatenance certificate");
        maintenanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maintenanceBtnActionPerformed(evt);
            }
        });

        importcsvBtn.setText("Import .csv");
        importcsvBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importcsvBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1772, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(importcsvBtn)
                        .addGap(368, 368, 368)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updatesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resetBtn)
                .addGap(308, 308, 308))
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boeingPlaneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 949, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(availablePlanesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 949, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(allPlanesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 949, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(availablePlanesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(notAvailablePlanesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(208, 208, 208))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(minseatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(serialnoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                            .addComponent(maxseatsTextField)
                                            .addComponent(yearTextField)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(airlineTextField))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(modelnoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(213, 213, 213)
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(9, 9, 9))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(updatebtn)
                                                        .addGap(3, 3, 3)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(airportTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(upTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(maintenanceBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(43, 43, 43)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(manuBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(airlinerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(serialBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seatsBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(airportBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(880, 880, 880))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updatesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resetBtn)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(importcsvBtn))
                        .addGap(51, 51, 51)
                        .addComponent(availablePlanesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(allPlanesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(availablePlanesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(notAvailablePlanesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(39, 39, 39)
                        .addComponent(boeingPlaneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(manuBtn)
                            .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minseatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maxseatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seatsBtn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serialBtn)
                            .addComponent(serialnoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modelnoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(airlineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(airlinerBtn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updatebtn)
                            .addComponent(upTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(airportBtn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(airportTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(maintenanceBtn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void populatesecondarySearchTable() {

        DefaultTableModel apft = (DefaultTableModel) planeSearchTable.getModel();

        apft.setRowCount(0);

        for (AirPlanes ap : apf.getFleetcache()) {
            Object row[] = new Object[12];
            row[0] = ap;
            row[1] = ap.getType();
            row[2] = ap.getAirliner();
            row[3] = ap.getModelNumber();
            row[4] = ap.getStartPoint();
            row[5] = ap.getDestination();
            row[6] = ap.getDeparture();
            row[7] = ap.getAvailableSeats();
            row[8] = ap.getManufacturedyear();
            row[9] = ap.getLicense();
            row[10] = ap.getAvailablity();

            apft.addRow(row);
        }
        // 
    }

    private void availablePlanesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availablePlanesBtnActionPerformed
        // TODO add your handling code here:

        clearTable();
        for (AirPlanes a : apf.getFleet()) {
            String yes = "yes";
            String availability = a.getAvailablity().trim();

            if (availability.equalsIgnoreCase("yes")) {
                apf.addtempPlanes(a);
                break;

            }

        }
        populatesecondarySearchTable();

    }//GEN-LAST:event_availablePlanesBtnActionPerformed

    private void searchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyReleased
        // TODO add your handling code here:

        DefaultTableModel apft = (DefaultTableModel) planeSearchTable.getModel();
        String search = searchTextField.getText();
        if (search.length() > 1) {
            search = search.substring(0, 1).toUpperCase() + search.substring(1, search.length());
        }
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(apft);

        planeSearchTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));

    }//GEN-LAST:event_searchTextFieldKeyReleased

    private void allPlanesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allPlanesBtnActionPerformed
        // TODO add your handling code here:
        int count = 0, notcount = 5;
        for (AirPlanes a : apf.getFleet()) {
            String yes = "yes";
            String availability = a.getAvailablity().trim();
            if (availability.equalsIgnoreCase("yes")) {
                count = count + 1;
            } else if (availability.equalsIgnoreCase("no")) {
                notcount = notcount + 1;
            }
            availablePlanesTextField.setText(String.valueOf(count));
            notAvailablePlanesTextField.setText(String.valueOf(notcount));
        }
    }//GEN-LAST:event_allPlanesBtnActionPerformed

    private void boeingPlaneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boeingPlaneBtnActionPerformed
        // TODO add your handling code here:
        clearTable();
        for (AirPlanes a : apf.getFleet()) {
            String Boeing = "Boeing";
            String Type = a.getType().trim();
            if (Type.equalsIgnoreCase("Boeing")) {
                apf.addtempPlanes(a);
            }
    }//GEN-LAST:event_boeingPlaneBtnActionPerformed
        populatesecondarySearchTable();
    }
    private void manuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manuBtnActionPerformed
        // TODO add your handling code here:

        clearTable();
        for (AirPlanes a : apf.getFleet()) {
            int year = Integer.parseInt(yearTextField.getText());
            int manyear = (a.getManufacturedyear());
            if (manyear == year) {
                apf.addtempPlanes(a);
            }

    }//GEN-LAST:event_manuBtnActionPerformed
        populatesecondarySearchTable();
    }

    public void clearTable() {
        DefaultTableModel apft = (DefaultTableModel) planeSearchTable.getModel();
        apft.setRowCount(0);
        AirPlaneFleet temp = apf;
        System.out.print("ClearTable");
        for (AirPlanes f : apf.getFleetcache()) {
            Object obj[] = new Object[12];
            obj[0] = "";
            obj[1] = "";
            obj[2] = "";
            obj[3] = "";
            obj[4] = "";
            obj[5] = "";
            obj[6] = "";
            obj[7] = "";
            obj[8] = "";
            obj[9] = "";
            obj[10] = "";

            apft.addRow(obj);
        }
        temp.getFleetcache().clear();
    }
    private void seatsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatsBtnActionPerformed
        // TODO add your handling code here:
        clearTable();
        for (AirPlanes a : apf.getFleet()) {
            int min = Integer.parseInt(minseatsTextField.getText());
            int max = Integer.parseInt(maxseatsTextField.getText());
            if (a.getAvailableSeats() > min & a.getAvailableSeats() < max) {
                apf.addtempPlanes(a);
            }
    }//GEN-LAST:event_seatsBtnActionPerformed
        populatesecondarySearchTable();
    }
    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        availablePlanesTextField.setText("");
        notAvailablePlanesTextField.setText("");
        yearTextField.setText("");
        minseatsTextField.setText("");
        maxseatsTextField.setText("");
        serialnoTextField.setText("");
        modelnoTextField.setText("");
        airlineTextField.setText("");
        upTextField.setText("");
        airportTextField.setText("");
        updatesTextField.setText("");
        searchTextField.setText("");

    }//GEN-LAST:event_resetBtnActionPerformed

    private void serialBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serialBtnActionPerformed
        // TODO add your handling code here:

        clearTable();

        for (AirPlanes a : apf.getFleet()) {
            String serialno = String.valueOf(serialnoTextField.getText());
            if (a.getSerialNumber().equals(serialno)) {
                apf.addtempPlanes(a);
            }

    }//GEN-LAST:event_serialBtnActionPerformed
        populatesecondarySearchTable();
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        clearTable();
        //populateSearchTable();
        for (AirPlanes a : apf.getFleet()) {
            String modelno = modelnoTextField.getText();
            if (a.getModelNumber().equals(modelno)) {
                apf.addtempPlanes(a);
            }
        }
        populatesecondarySearchTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void airlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlinerBtnActionPerformed
        // TODO add your handling code here:
        clearTable();
        for (AirPlanes a : apf.getFleet()) {
            String airline = airlineTextField.getText();
            if (a.getAirliner().equalsIgnoreCase(airline)) {
                apf.addtempPlanes(a);
            }
        }
        populatesecondarySearchTable();

    }//GEN-LAST:event_airlinerBtnActionPerformed

    private void modelnoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelnoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelnoTextFieldActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        String update = updatesTextField.getText();
        upTextField.setText(update);
    }//GEN-LAST:event_updatebtnActionPerformed

    private void airportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airportBtnActionPerformed
        // TODO add your handling code here:
        clearTable();

        for (AirPlanes a : apf.getFleet()) {
            String airport = airportTextField.getText();
            if (a.getStartPoint().equalsIgnoreCase(airport)) {
                apf.addtempPlanes(a);
            }
        }
        populatesecondarySearchTable();


    }//GEN-LAST:event_airportBtnActionPerformed

    private void maintenanceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maintenanceBtnActionPerformed
        // TODO add your handling code here:
        clearTable();
        for (AirPlanes a : apf.getFleet()) {
            if (a.getLicense().equalsIgnoreCase("Expired")) {
                apf.addtempPlanes(a);
            }

        }
        populatesecondarySearchTable();
    }//GEN-LAST:event_maintenanceBtnActionPerformed

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextFieldActionPerformed

    private void importcsvBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importcsvBtnActionPerformed
        try {
            // TODO add your handling code here:
            importcsv();
            populateSearchTable();
            JOptionPane.showMessageDialog(null, " AirPlane Database has been imported ");
        } catch (IOException ex) {
            Logger.getLogger(SearchJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_importcsvBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airlineTextField;
    private javax.swing.JButton airlinerBtn;
    private javax.swing.JButton airportBtn;
    private javax.swing.JTextField airportTextField;
    private javax.swing.JButton allPlanesBtn;
    private javax.swing.JButton availablePlanesBtn;
    private javax.swing.JTextField availablePlanesTextField;
    private javax.swing.JButton boeingPlaneBtn;
    private javax.swing.JButton importcsvBtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton maintenanceBtn;
    private javax.swing.JButton manuBtn;
    private javax.swing.JTextField maxseatsTextField;
    private javax.swing.JTextField minseatsTextField;
    private javax.swing.JTextField modelnoTextField;
    private javax.swing.JTextField notAvailablePlanesTextField;
    private javax.swing.JTable planeSearchTable;
    private javax.swing.JButton resetBtn;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JButton seatsBtn;
    private javax.swing.JButton serialBtn;
    private javax.swing.JTextField serialnoTextField;
    private javax.swing.JTextField upTextField;
    private javax.swing.JButton updatebtn;
    private javax.swing.JTextField updatesTextField;
    private javax.swing.JTextField yearTextField;
    // End of variables declaration//GEN-END:variables

}