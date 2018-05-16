/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.EarnSmile;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.MemberOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.IndividualWorkRequest;
import Business.WorkQueue.WorkRequest;

import Business.Network.*;
import Business.Organization.Organization;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JAI
 */
public class EarnASmileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EarnASmileJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount account;
    private Enterprise enterprise;
    private MemberOrganization memberOrganization;
    private WorkRequest workrequest;



    public EarnASmileJPanel(JPanel userProcessContainer, MemberOrganization memberOrganization, UserAccount account, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.account = account;
        this.enterprise = enterprise;
        this.memberOrganization = memberOrganization;
        workrequest = new WorkRequest();
        
        
        
        //populateTable();
        populateNetworkComboBox();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequestWorkqueue = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        completeDescriptionBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        completeDescTextArea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        earnSmileBtn = new javax.swing.JButton();
        lblrequestType = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboCountry = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        comboState = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        comboCity = new javax.swing.JComboBox();
        enterpriseComboBox = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        organizationComboBox = new javax.swing.JComboBox();

        jLabel1.setText("Earn A Smile");

        jLabel5.setText("Enter Location where you need help :");

        jLabel6.setText("Select Event Type :");

        tblRequestWorkqueue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Description", "Requestor", "Selector"
            }
        ));
        tblRequestWorkqueue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRequestWorkqueueMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblRequestWorkqueueMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblRequestWorkqueue);
        if (tblRequestWorkqueue.getColumnModel().getColumnCount() > 0) {
            tblRequestWorkqueue.getColumnModel().getColumn(2).setResizable(false);
        }

        jButton1.setText("See Requestor's Profile");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        completeDescriptionBtn.setText("See Complete Description");
        completeDescriptionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeDescriptionBtnActionPerformed(evt);
            }
        });

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        completeDescTextArea.setColumns(20);
        completeDescTextArea.setRows(5);
        jScrollPane2.setViewportView(completeDescTextArea);

        jLabel8.setText("Complete WorkDescription : ");

        earnSmileBtn.setText("Earn Smile");
        earnSmileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                earnSmileBtnActionPerformed(evt);
            }
        });

        lblrequestType.setText("<RequestType>");

        jLabel2.setText("Select Country :");

        comboCountry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCountryActionPerformed(evt);
            }
        });

        jLabel3.setText("Select State :");

        comboState.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboStateActionPerformed(evt);
            }
        });

        jLabel4.setText("Select City :");

        comboCity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCityActionPerformed(evt);
            }
        });

        enterpriseComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseComboBoxActionPerformed(evt);
            }
        });

        jLabel20.setText("Enterprise");

        jLabel21.setText("Organization");

        organizationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(417, 417, 417))
            .addGroup(layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(jButton1)
                .addGap(52, 52, 52)
                .addComponent(earnSmileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblrequestType)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comboState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comboCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comboCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(enterpriseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(organizationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(completeDescriptionBtn)))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(backBtn))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(completeDescriptionBtn)
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(comboCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterpriseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(comboState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(organizationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(comboCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblrequestType))
                        .addGap(89, 89, 89)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(earnSmileBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void populateNetworkComboBox() {
        comboCountry.removeAllItems();
        
       
       for (Network network : business.getNetworkList()) {

           comboCountry.addItem(network);
        }
    }

   private void populateStateComboBox(Network network) {
        comboState.removeAllItems();

       for (State state : network.getStateDirectory().getStateList()) {
            comboState.addItem(state);
        }

   }

   private void populateCityComboBox(State state) {
        comboCity.removeAllItems();

       for (City city : state.getCityDirectory().getCityList()) {
            comboCity.addItem(city);
        }

   }

   private void populateEnterpriseComboBox(City city) {
        enterpriseComboBox.removeAllItems();

       for (Enterprise enterprise : city.getEnterpriseDirectory().getEnterpriseList()) {
            enterpriseComboBox.addItem(enterprise);
        }

   }
    
   private void populateOrganizationComboBox(Enterprise enterprise) {
        organizationComboBox.removeAllItems();

       for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            organizationComboBox.addItem(o);
        }

   }
    
    
    
    
   public void populateTable(Organization o) {
        DefaultTableModel model = (DefaultTableModel) tblRequestWorkqueue.getModel();

        model.setRowCount(0);

        /*Network network = (Network) comboCountry.getSelectedItem();
        State state = (State) comboState.getSelectedItem();
        City city = (City) comboCity.getSelectedItem();
        Enterprise e = (Enterprise) enterpriseComboBox.getSelectedItem();
        Organization o = (Organization) organizationComboBox.getSelectedItem();
        
        Organization org = null;
        if (o instanceof MemberOrganization){
                org = o;
            }
        */
        
        for (WorkRequest request : o.getWorkQueue().getWorkRequestList()) {
           if(request.isDelete()){
               
           o.getWorkQueue().removeRequest(request);
           }
           
            Object[] row = new Object[3];
            row[1] = ((IndividualWorkRequest) request).getSender();
            row[2] = ((IndividualWorkRequest) request).getReceiver() == null ? null : request.getReceiver().getPerson().getFirstName();
            row[0] = ((IndividualWorkRequest) request);
//            row[3] = ((IndividualWorkRequest) request).getHelptype();

            model.addRow(row);
           // }
        
    }
   }
    
    
    
    private void completeDescriptionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeDescriptionBtnActionPerformed
        // TODO add your handling code here:    
     int selectedRow = tblRequestWorkqueue.getSelectedRow();

        if (selectedRow >= 0) {
            
        WorkRequest request = (WorkRequest) tblRequestWorkqueue.getValueAt(selectedRow, 0);  
        completeDescTextArea.setText("");
        completeDescTextArea.setText(((IndividualWorkRequest) request).getLngDescription());
        
        }
    }//GEN-LAST:event_completeDescriptionBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        int selectedRow = tblRequestWorkqueue.getSelectedRow();

        if (selectedRow >= 0) {
            
        WorkRequest request = (WorkRequest) tblRequestWorkqueue.getValueAt(selectedRow, 0);
        workrequest = request;
 
        RequestorCompleteProfileJPanel requestDescriptionJPanel = new RequestorCompleteProfileJPanel(userProcessContainer,account,workrequest);
        userProcessContainer.add("RequestDescriptionJPanel", requestDescriptionJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void earnSmileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_earnSmileBtnActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblRequestWorkqueue.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) tblRequestWorkqueue.getValueAt(selectedRow, 0);
            if ( (request.isComplete()) ||(request.isParticipate())) {
              JOptionPane.showMessageDialog(null, "Request already processed.");
                return;
            } 
            
            else {
               // request.setComplete(true);
                request.setParticipate(true);
                request.setReceiver(account);
                request.setStatus("Help is on the way");
                populateTable((Organization)organizationComboBox.getSelectedItem());

            }
        }
        
        
    }//GEN-LAST:event_earnSmileBtnActionPerformed

    private void tblRequestWorkqueueMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRequestWorkqueueMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblRequestWorkqueueMousePressed

    private void tblRequestWorkqueueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRequestWorkqueueMouseClicked
        // TODO add your handling code here:
        /*int selectedRow = tblRequestWorkqueue.getSelectedRow();
        WorkRequest request = (WorkRequest) tblRequestWorkqueue.getValueAt(selectedRow, 0);
        workrequest = request;
        lblrequestType.setText(workrequest.getType());
        lblrequestCountry.setText( ((IndividualWorkRequest) workrequest).getCountry());
        lblrequestState.setText( ((IndividualWorkRequest) workrequest).getState() );
        lblrequestCity.setText( ((IndividualWorkRequest) workrequest).getCity() );
         
        completeDescTextArea.setText(((IndividualWorkRequest) workrequest).getShrtDescription());
           
 //   (IndividualWorkRequest)workrequest).   */          
    }//GEN-LAST:event_tblRequestWorkqueueMouseClicked

    private void comboCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCountryActionPerformed
        // TODO add your handling code here:
        Network network = (Network) comboCountry.getSelectedItem();
        if (network != null) {
            //populateCountryComboBox(network);
            populateStateComboBox(network);
        }
    }//GEN-LAST:event_comboCountryActionPerformed

    private void comboStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboStateActionPerformed
        // TODO add your handling code here:
        State state = (State) comboState.getSelectedItem();
        if (state != null) {
            populateCityComboBox(state);
        }
    }//GEN-LAST:event_comboStateActionPerformed

    private void comboCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCityActionPerformed
        // TODO add your handling code here:
        City city = (City) comboCity.getSelectedItem();
        if (city != null) {
            populateEnterpriseComboBox(city);
        }
    }//GEN-LAST:event_comboCityActionPerformed

    private void enterpriseComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseComboBoxActionPerformed
        // TODO add your handling code here:
        Enterprise e = (Enterprise) enterpriseComboBox.getSelectedItem();
        if(e != null){
            populateOrganizationComboBox(e);
        }
    }//GEN-LAST:event_enterpriseComboBoxActionPerformed

    private void organizationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationComboBoxActionPerformed
        // TODO add your handling code here:
       Organization o = (Organization) organizationComboBox.getSelectedItem();
        if(o != null){
            populateTable(o);
        }
        //populateTable();
    }//GEN-LAST:event_organizationComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox comboCity;
    private javax.swing.JComboBox comboCountry;
    private javax.swing.JComboBox comboState;
    private javax.swing.JTextArea completeDescTextArea;
    private javax.swing.JButton completeDescriptionBtn;
    private javax.swing.JButton earnSmileBtn;
    private javax.swing.JComboBox enterpriseComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblrequestType;
    private javax.swing.JComboBox organizationComboBox;
    private javax.swing.JTable tblRequestWorkqueue;
    // End of variables declaration//GEN-END:variables
}
