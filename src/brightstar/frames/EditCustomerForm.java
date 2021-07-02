/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brightstar.frames;

import brightstar.connection.DBConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Pasan
 */
public class EditCustomerForm extends javax.swing.JFrame {

    /**
     * Creates new form AddCustomerForm
     */
    public EditCustomerForm() {
        initComponents();
    }

    public EditCustomerForm(String buyerID, String nic, String name, String phone, String address, String company, String email) {

        initComponents();

        label_buyerID.setText(buyerID);
        Jnic.setText(nic);
        Jname.setText(name);
        Jphone.setText(phone);
        Jaddress.setText(address);
        Jcompany.setText(company);
        Jemail.setText(email);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        Jname = new javax.swing.JTextField();
        label3 = new java.awt.Label();
        Jphone = new javax.swing.JTextField();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        Jcompany = new javax.swing.JTextField();
        label6 = new java.awt.Label();
        Jemail = new javax.swing.JTextField();
        btn_update = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        btn_remove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jaddress = new javax.swing.JTextArea();
        Jnic = new javax.swing.JTextField();
        label_buyerID = new javax.swing.JLabel();
        errorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Edit Customer");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26))
        );

        label1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label1.setText("Customer NIC");

        label2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label2.setText("Name");

        label3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label3.setText("Phone");

        label4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label4.setText("Address");

        label5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label5.setText("Company");

        label6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label6.setText("Email");

        btn_update.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_cancel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        btn_remove.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_remove.setText("Remove");
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });

        Jaddress.setColumns(20);
        Jaddress.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        Jaddress.setRows(5);
        jScrollPane1.setViewportView(Jaddress);

        label_buyerID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_buyerID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        errorMessage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        errorMessage.setForeground(new java.awt.Color(255, 0, 0));
        errorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(label_buyerID, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(26, 26, 26))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(54, 54, 54)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(64, 64, 64)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Jemail, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(Jphone, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(Jname, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(Jcompany, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1)
                                    .addComponent(Jnic, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(errorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(label_buyerID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jnic, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jphone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 59, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jcompany, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jemail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(errorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        int state = JOptionPane.showConfirmDialog(null, "Do you want to cancel?", "Alert", JOptionPane.YES_NO_OPTION);

        if (state == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:

        if (hasValidation()) {

            try {
                // TODO add your handling code here:

                String buyerID = label_buyerID.getText();
                String nic = Jnic.getText();
                String name = Jname.getText();
                String phone = Jphone.getText();
                String address = Jaddress.getText();
                String company = Jcompany.getText();
                String email = Jemail.getText();

                String updateCustomerQuery = "UPDATE sparepart_buyer "
                        + "SET nic = ?, name = ?, phone = ?, address = ?, company = ?, email = ? "
                        + "WHERE buyerID = ?";

                PreparedStatement ps = DBConnection.getDBconnection().prepareStatement(updateCustomerQuery);

                ps.setString(1, nic);
                ps.setString(2, name);
                ps.setString(3, phone);
                ps.setString(4, address);
                ps.setString(5, company);
                ps.setString(6, email);
                ps.setString(7, buyerID);

                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Customer updated successfully!",
                        "Confirmation Message", JOptionPane.PLAIN_MESSAGE);
                this.setVisible(false);

                ps.close();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex,
                        "Confirmation Message", JOptionPane.PLAIN_MESSAGE);

            } catch (SQLException ex) {
                Logger.getLogger(AddCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex,
                        "Confirmation Message", JOptionPane.PLAIN_MESSAGE);
            }

        } else {

            JOptionPane.showMessageDialog(null, "Form validation failed!",
                    "Alert!", JOptionPane.PLAIN_MESSAGE);

        }


    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
        // TODO add your handling code here:
        int state = JOptionPane.showConfirmDialog(null, "Do you want to delete record?", "Alert", JOptionPane.YES_NO_OPTION);

        if (state == 0) {

            try {
                // TODO add your handling code here:

                String nic = Jnic.getText();
                String name = Jname.getText();
                String phone = Jphone.getText();
                String address = Jaddress.getText();
                String company = Jcompany.getText();
                String email = Jemail.getText();

                String updateCustomerQuery = "DELETE FROM sparepart_buyer WHERE nic = ?";

                PreparedStatement ps = DBConnection.getDBconnection().prepareStatement(updateCustomerQuery);

                ps.setString(1, nic);

                // add other customer references...
                ps.executeUpdate();

                ps.close();

                JOptionPane.showMessageDialog(null, "Customer removed successfully!",
                        "Confirmation Message", JOptionPane.PLAIN_MESSAGE);
                this.setVisible(false);

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex,
                        "Confirmation Message", JOptionPane.PLAIN_MESSAGE);

            } catch (SQLException ex) {
                Logger.getLogger(AddCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex,
                        "Confirmation Message", JOptionPane.PLAIN_MESSAGE);
            }

        }
    }//GEN-LAST:event_btn_removeActionPerformed

    public boolean hasValidation() {

        if (!validateNIC(Jnic.getText())) {
            errorMessage.setText("*Invalid NIC");
            return false;
        }

        if (!validateLetter(Jname.getText())) {
            errorMessage.setText("*Invalid name field");
            return false;
        }

        if (!validatePhone(Jphone.getText())) {
            errorMessage.setText("*Invalid phone number");
            return false;
        }

        if (!validateEmail(Jemail.getText())) {
            errorMessage.setText("*Invalid email address");
            return false;
        }

        return true;
    }

    public boolean validateNIC(String string) {

        int val = string.length();

        char str = 0;

        for (int i = 0; i < string.length(); i++) {

            str = string.charAt(i);

            if (val == 10 && str == 'V') {

                return true;

            }

        }

        return false;

    }

    public boolean validateLetter(String string) {

        int val;
        boolean ret = true;

        for (int i = 0; i < string.length(); i++) {

            val = (int) string.charAt(i);

            if (!(((val >= 65) && (val <= 90)) || ((val >= 97) && (val <= 122)) || val == 32)) {

                ret = false;
            }

        }

        return ret;
    }

    public boolean validatePhone(String string) {

        //if((string.length() == 12)&& (string.charAt(0) == '+')&& (string.charAt(1) == '9') && (string.charAt(2) == '4')  ){
        return (string.length() == 10) && (string.charAt(0) == '0') && (string.charAt(1) == '7');
    }

    public boolean validateEmail(String string) {

        int val;

        int at = 0;
        int dot = 0;

        for (int i = 0; i < string.length(); i++) {

            val = (int) string.charAt(i);

            if (val == 64) {

                at = i;
            }
        }

        for (int j = 0; j < string.length(); j++) {

            val = (int) string.charAt(j);

            if (val == 46) {

                dot = j;
            }
        }

        if (((at != 0) && (dot != 0)) && (at < dot)) {

            return true;
        } else {

            return false;
        }
    }

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
            java.util.logging.Logger.getLogger(EditCustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditCustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditCustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditCustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditCustomerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Jaddress;
    private javax.swing.JTextField Jcompany;
    private javax.swing.JTextField Jemail;
    private javax.swing.JTextField Jname;
    private javax.swing.JTextField Jnic;
    private javax.swing.JTextField Jphone;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_remove;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private javax.swing.JLabel label_buyerID;
    // End of variables declaration//GEN-END:variables
}
