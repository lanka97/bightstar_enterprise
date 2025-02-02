/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brightstar.panels;

import brightstar.Maintenance.Maintenance;
import brightstar.frames.AddMaintenanceForm;
import brightstar.frames.UpdateMaintenanceForm;
import brightstar.frames.UpdatePendingMaintenanceForm;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import brightstar.connection.DBConnection;

/**
 *
 * @author Pasan
 */
public class PendingMaintenanceDetails extends javax.swing.JPanel {

    /**
     * Creates new form AddSpareParts
     */
    public PendingMaintenanceDetails() {
        
        initComponents();
        clearTable();
        viewMaintenanceTable();
        
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel30 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setPreferredSize(new java.awt.Dimension(1200, 700));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel30.setText("Pending Maintenance Details");

        jTable2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Complain Id", "CustomerName", "Issue", "Machine Brand", "Model", "Maintenance Status", "Email", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setMaximumSize(new java.awt.Dimension(2147483647, 0));
        jTable2.setMinimumSize(new java.awt.Dimension(120, 0));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 153, 51));
        jLabel2.setText("Click row to update pending maintenance details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
   
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int row = jTable2.getSelectedRow();
        DefaultTableModel mode = (DefaultTableModel)jTable2.getModel();
        
        String one = mode.getValueAt(row, 0).toString();
        String two = mode.getValueAt(row, 1).toString();
       
        
        UpdatePendingMaintenanceForm frame = new UpdatePendingMaintenanceForm(one,two);
        frame.setVisible(true);        
        
        
        
        
    }//GEN-LAST:event_jTable2MouseClicked
    
     
    public ArrayList<Maintenance> getAllPendingMaintenance(){
        
        ArrayList<Maintenance> pendingList = new ArrayList<>();
        String viewAllPendingMaintenanceQueary  = "SELECT * FROM machinemaintenancenew  WHERE  maintenanceStatus = 'Pending' ";
        
        try {
            PreparedStatement ps = DBConnection.getDBconnection().prepareStatement(viewAllPendingMaintenanceQueary );
            
            ResultSet resultSet = ps.executeQuery();
            
            while(resultSet.next()){
               
                Maintenance maintenance = new Maintenance();
            
                maintenance.setComplainId(resultSet.getString(1));
                maintenance.setCustomerName(resultSet.getString(2));
                maintenance.setEmail(resultSet.getString(5));
                maintenance.setIssue(resultSet.getString(6));
                maintenance.setMachineBrand(resultSet.getString(7));
                maintenance.setModel(resultSet.getString(8)); 
                maintenance.setMaintenanceStatus(resultSet.getString(9));
                maintenance.setDate(resultSet.getString(11));
                
                //maintenance.setPaymentMethode(resultSet.getString(8));
                //maintenance.setMaintenanceStatus(resultSet.getString(9));
                
                
                pendingList.add(maintenance);
                
                
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MaintenancePanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MaintenancePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        return pendingList;
            
    }
    public void viewMaintenanceTable(){
    
        ArrayList<Maintenance> pendingList = getAllPendingMaintenance();
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        String[] row = new String[8];
            
        for(int i = 0; i < pendingList.size(); i++){
            row[0] = pendingList.get(i).getComplainId();
            row[1] = pendingList.get(i).getCustomerName();
            row[2] = pendingList.get(i).getIssue();
            row[3] = pendingList.get(i).getMachineBrand();
            row[4] = pendingList.get(i).getModel();
            row[5] = pendingList.get(i).getMaintenanceStatus();
            row[6] = pendingList.get(i).getEmail();
            row[7] = pendingList.get(i).getDate();
            // row[7] = mainList.get(i).getPaymentMethode();
            //row[8] = mainList.get(i).getMaintenanceStatus();
            
            model.addRow(row);
            
        }
        
        
    }
   
    public void clearTable(){
        
    DefaultTableModel dm = (DefaultTableModel) jTable2.getModel();
    dm.getDataVector().removeAllElements();
    revalidate();
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        clearTable();
        viewMaintenanceTable();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
