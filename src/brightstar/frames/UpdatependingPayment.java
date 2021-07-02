/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brightstar.frames;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import brightstar.connection.DBConnection;

/**
 *
 * @author Yasith
 */
public class UpdatependingPayment extends javax.swing.JFrame {

    /**
     * Creates new form UpdatependingPayment
     */
    public UpdatependingPayment() {
        initComponents();
    }

    public UpdatependingPayment(String one, String two, String three) {
             initComponents();
        
            JpaymentId.setText(one);
            
            if(two.equals("Cash")){
    
                Jcash.setSelected(true);
            }
                if(two.equals("Cheque")){
    
                 Jcheque.setSelected(true);
             }
                 if(three.equals("Done")){
    
                Jdone.setSelected(true);
            }
                if(three.equals("Pending")){
    
                 Jpending.setSelected(true);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JpaymentId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JmaintenanceStatus = new javax.swing.JLabel();
        Jdone = new javax.swing.JRadioButton();
        Jpending = new javax.swing.JRadioButton();
        JPaymentCompletedDate = new com.toedter.calendar.JDateChooser();
        JmaintenanceStatus1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Jcash = new javax.swing.JRadioButton();
        Jcheque = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 51, 153));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText(" Update Pending Payments");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(473, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("If the Maintenance Is Successfull Done  Chanege the Maintenance Status As Done");

        JpaymentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JpaymentIdActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("PaymentId");

        JmaintenanceStatus.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        JmaintenanceStatus.setText("Maintenance Status");

        buttonGroup2.add(Jdone);
        Jdone.setText("Done");
        Jdone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JdoneActionPerformed(evt);
            }
        });

        buttonGroup2.add(Jpending);
        Jpending.setText("Pending");
        Jpending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JpendingActionPerformed(evt);
            }
        });

        JmaintenanceStatus1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        JmaintenanceStatus1.setText("Payment Completed Date");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Update ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Payment Method");

        buttonGroup1.add(Jcash);
        Jcash.setText("Cash");
        Jcash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcashActionPerformed(evt);
            }
        });

        buttonGroup1.add(Jcheque);
        Jcheque.setText("Cheque");
        Jcheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JchequeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(JmaintenanceStatus)
                    .addComponent(JmaintenanceStatus1)
                    .addComponent(jLabel5))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Jcash)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Jcheque))
                    .addComponent(JpaymentId, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(JPaymentCompletedDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Jdone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Jpending)))
                .addGap(248, 248, 248))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(JpaymentId, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Jcheque)
                    .addComponent(Jcash))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JmaintenanceStatus)
                    .addComponent(Jdone)
                    .addComponent(Jpending))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPaymentCompletedDate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JmaintenanceStatus1))
                .addGap(37, 37, 37)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JpaymentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JpaymentIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JpaymentIdActionPerformed

    private void JdoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JdoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JdoneActionPerformed

    private void JpendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JpendingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JpendingActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String PaymentId = JpaymentId.getText();
        
        boolean Cash = Jcash.isSelected();
        boolean Cheque = Jcheque.isSelected();
        Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        String PaymentCompletedDate = formatter.format(JPaymentCompletedDate.getDate());
            
        String PaymentMethode = "null";
            
        if(Cash == true){
                
                PaymentMethode = "Cash";
               
                
        }
        else if(Cheque = true){
    
             PaymentMethode = "Cheque ";
        }
        boolean Done = Jdone.isSelected();
        boolean Pending = Jpending.isSelected();

        String PyamentStatus = "null";

        if(Done == true){

            PyamentStatus = "Done";

        }
        else if(Pending = true){

            PyamentStatus = "Pending ";
        }
        try{
            String updatePendingMaintenanceQuery = "UPDATE maintenancepaymentnew "
            +"SET paymentMethode = ?, paymentStatus =  ?, completeDate = ?"
            + "WHERE paymentId = ?";

            PreparedStatement ps = DBConnection.getDBconnection().prepareStatement(updatePendingMaintenanceQuery);

            ps.setString(1, PaymentMethode);
            ps.setString(2, PyamentStatus);
            ps.setString(3, PaymentCompletedDate);
            ps.setString(4, PaymentId);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Pending MaintenanceStatus Updated successfully!",
                "Confirmation Message", JOptionPane.PLAIN_MESSAGE);
            this.setVisible(false);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdatePendingMaintenanceForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdatePendingMaintenanceForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void JcashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JcashActionPerformed

    private void JchequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JchequeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JchequeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdatependingPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdatependingPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdatependingPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdatependingPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdatependingPayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JPaymentCompletedDate;
    private javax.swing.JRadioButton Jcash;
    private javax.swing.JRadioButton Jcheque;
    private javax.swing.JRadioButton Jdone;
    private javax.swing.JLabel JmaintenanceStatus;
    private javax.swing.JLabel JmaintenanceStatus1;
    private javax.swing.JTextField JpaymentId;
    private javax.swing.JRadioButton Jpending;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
