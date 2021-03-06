/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.TeamInitiative.EventCreator;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author JAI
 */
public class ManageMyEventsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageMyEventsJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount account;
    private WorkRequest workRequest;

    public ManageMyEventsJPanel(JPanel userProcessContainer, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnViewVolunteer = new javax.swing.JButton();
        btnViewEditEvent = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        btnDeleteEvent = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCompletedEventsWorkQueue = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSmileAndComplete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPendingEventWorkqueue = new javax.swing.JTable();
        btnViewVolunteer1 = new javax.swing.JButton();

        btnViewVolunteer.setText("View Volunteer's");
        btnViewVolunteer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewVolunteerActionPerformed(evt);
            }
        });

        btnViewEditEvent.setText("View/Edit Event");
        btnViewEditEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEditEventActionPerformed(evt);
            }
        });

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        btnDeleteEvent.setText("Delete Event");

        tblCompletedEventsWorkQueue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Event ID", "Type", "Completed On", "Status", "Volunteers Signed"
            }
        ));
        jScrollPane2.setViewportView(tblCompletedEventsWorkQueue);

        jLabel1.setText("My Events");

        jLabel3.setText("Completed Events :");

        jLabel2.setText("Pending Events :");

        btnSmileAndComplete.setText("Smile and Complete");

        tblPendingEventWorkqueue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Event ID", "Type", "Validity", "Status", "Volunteers Required", "Volunteers Signed"
            }
        ));
        jScrollPane1.setViewportView(tblPendingEventWorkqueue);

        btnViewVolunteer1.setText("View Volunteer's");
        btnViewVolunteer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewVolunteer1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSmileAndComplete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteEvent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewEditEvent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewVolunteer))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewVolunteer1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewVolunteer)
                    .addComponent(btnDeleteEvent)
                    .addComponent(btnViewEditEvent)
                    .addComponent(btnSmileAndComplete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(btnViewVolunteer1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void btnViewEditEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEditEventActionPerformed
        // TODO add your handling code here:
        ViewEditEventJPanel viewEditEventJPanel = new ViewEditEventJPanel(userProcessContainer, account);
        userProcessContainer.add("EditProfileJPanel", viewEditEventJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewEditEventActionPerformed

    private void btnViewVolunteerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewVolunteerActionPerformed
        // TODO add your handling code here:
        ViewVolunteersJPanel viewVolunteersJPanel = new ViewVolunteersJPanel(userProcessContainer, workRequest);
        userProcessContainer.add("ViewVolunteersJPanel", viewVolunteersJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewVolunteerActionPerformed

    private void btnViewVolunteer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewVolunteer1ActionPerformed
        // TODO add your handling code here:
        ViewVolunteersJPanel viewVolunteersJPanel = new ViewVolunteersJPanel(userProcessContainer, workRequest);
        userProcessContainer.add("ViewVolunteersJPanel", viewVolunteersJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewVolunteer1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnDeleteEvent;
    private javax.swing.JButton btnSmileAndComplete;
    private javax.swing.JButton btnViewEditEvent;
    private javax.swing.JButton btnViewVolunteer;
    private javax.swing.JButton btnViewVolunteer1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCompletedEventsWorkQueue;
    private javax.swing.JTable tblPendingEventWorkqueue;
    // End of variables declaration//GEN-END:variables
}
