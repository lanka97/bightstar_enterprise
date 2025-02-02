/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brightstar.frames;

import brightstar.panels.AddSparePartsSale;
import brightstar.panels.CustomersPanel;
import brightstar.panels.PendingPaymentsPanel;
import brightstar.panels.SparePartsReportPanel;
import brightstar.panels.ViewSparePartsSalesPanel;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import office_man_system.Home;

/**
 *
 * @author Admin
 */
public class SparePartsSaleForm extends javax.swing.JFrame {

    GridBagLayout layout = new GridBagLayout();

    CustomersPanel cust_panel;
    AddSparePartsSale spare_part_panel;
    ViewSparePartsSalesPanel view_spare_partsSales_panel;
    PendingPaymentsPanel pending_payments;
    SparePartsReportPanel spare_parts_report;

    public SparePartsSaleForm() {
        initComponents();

        cust_panel = new CustomersPanel();
        spare_part_panel = new AddSparePartsSale();
        view_spare_partsSales_panel = new ViewSparePartsSalesPanel();
        pending_payments = new PendingPaymentsPanel();
        spare_parts_report = new SparePartsReportPanel();

        DynamicPanel.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        DynamicPanel.add(cust_panel, c);

        DynamicPanel.add(spare_part_panel, c);

        DynamicPanel.add(view_spare_partsSales_panel, c);

        DynamicPanel.add(pending_payments, c);

        DynamicPanel.add(spare_parts_report, c);

        cust_panel.setVisible(true);
        spare_part_panel.setVisible(false);
        view_spare_partsSales_panel.setVisible(false);
        pending_payments.setVisible(false);
        spare_parts_report.setVisible(false);
    }
    
    
    public void closeWindow(){
        
        WindowEvent windowClose;
        windowClose = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowClose);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidePanel = new javax.swing.JPanel();
        btn_customer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_sparepart_sale = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_view_spareparts_sales = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_spareparts_pending = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btn_sparepart_report = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_home = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        DynamicPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_refresh = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bright Star Office Management System");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1400, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(0, 51, 153));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_customer.setBackground(new java.awt.Color(0, 102, 204));
        btn_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_customerMousePressed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/icons8_Customer_20px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customers");

        javax.swing.GroupLayout btn_customerLayout = new javax.swing.GroupLayout(btn_customer);
        btn_customer.setLayout(btn_customerLayout);
        btn_customerLayout.setHorizontalGroup(
            btn_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_customerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        btn_customerLayout.setVerticalGroup(
            btn_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidePanel.add(btn_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 300, 70));

        btn_sparepart_sale.setBackground(new java.awt.Color(0, 51, 153));
        btn_sparepart_sale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_sparepart_saleMousePressed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/icons8_Quickdraw_20px.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Spare Part Sales");

        javax.swing.GroupLayout btn_sparepart_saleLayout = new javax.swing.GroupLayout(btn_sparepart_sale);
        btn_sparepart_sale.setLayout(btn_sparepart_saleLayout);
        btn_sparepart_saleLayout.setHorizontalGroup(
            btn_sparepart_saleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_sparepart_saleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        btn_sparepart_saleLayout.setVerticalGroup(
            btn_sparepart_saleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidePanel.add(btn_sparepart_sale, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 300, 70));

        btn_view_spareparts_sales.setBackground(new java.awt.Color(0, 51, 153));
        btn_view_spareparts_sales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_view_spareparts_salesMousePressed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/icons8_Cash_Register_20px.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("View Sales");

        javax.swing.GroupLayout btn_view_spareparts_salesLayout = new javax.swing.GroupLayout(btn_view_spareparts_sales);
        btn_view_spareparts_sales.setLayout(btn_view_spareparts_salesLayout);
        btn_view_spareparts_salesLayout.setHorizontalGroup(
            btn_view_spareparts_salesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_view_spareparts_salesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        btn_view_spareparts_salesLayout.setVerticalGroup(
            btn_view_spareparts_salesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidePanel.add(btn_view_spareparts_sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 300, 70));

        btn_spareparts_pending.setBackground(new java.awt.Color(0, 51, 153));
        btn_spareparts_pending.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_spareparts_pendingMousePressed(evt);
            }
        });

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/icons8_Payment_History_20px_1.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Pending Payments");

        javax.swing.GroupLayout btn_spareparts_pendingLayout = new javax.swing.GroupLayout(btn_spareparts_pending);
        btn_spareparts_pending.setLayout(btn_spareparts_pendingLayout);
        btn_spareparts_pendingLayout.setHorizontalGroup(
            btn_spareparts_pendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_spareparts_pendingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        btn_spareparts_pendingLayout.setVerticalGroup(
            btn_spareparts_pendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidePanel.add(btn_spareparts_pending, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 300, 70));

        btn_sparepart_report.setBackground(new java.awt.Color(0, 51, 153));
        btn_sparepart_report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_sparepart_reportMousePressed(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/icons8_Graph_Report_20px.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Report");

        javax.swing.GroupLayout btn_sparepart_reportLayout = new javax.swing.GroupLayout(btn_sparepart_report);
        btn_sparepart_report.setLayout(btn_sparepart_reportLayout);
        btn_sparepart_reportLayout.setHorizontalGroup(
            btn_sparepart_reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_sparepart_reportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        btn_sparepart_reportLayout.setVerticalGroup(
            btn_sparepart_reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_sparepart_reportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        sidePanel.add(btn_sparepart_report, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 300, 70));

        btn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/icons8_Home_52px.png"))); // NOI18N
        btn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_homeMouseClicked(evt);
            }
        });
        sidePanel.add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 640, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/brightstar_logo_white.png"))); // NOI18N
        sidePanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 230, 100));

        getContentPane().add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 800));

        javax.swing.GroupLayout DynamicPanelLayout = new javax.swing.GroupLayout(DynamicPanel);
        DynamicPanel.setLayout(DynamicPanelLayout);
        DynamicPanelLayout.setHorizontalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        DynamicPanelLayout.setVerticalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        getContentPane().add(DynamicPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 1200, 700));

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Spare Parts Sales");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/icons8_Gears_74px.png"))); // NOI18N

        btn_refresh.setBackground(new java.awt.Color(0, 51, 204));
        btn_refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_refreshMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Refresh");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/icons8_Refresh_40px.png"))); // NOI18N

        javax.swing.GroupLayout btn_refreshLayout = new javax.swing.GroupLayout(btn_refresh);
        btn_refresh.setLayout(btn_refreshLayout);
        btn_refreshLayout.setHorizontalGroup(
            btn_refreshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_refreshLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        btn_refreshLayout.setVerticalGroup(
            btn_refreshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(379, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264)
                .addComponent(btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1200, 100));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btn_sparepart_saleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sparepart_saleMousePressed
        // TODO add your handling code here:
        setColor(btn_sparepart_sale);
        resetColor(btn_customer);
        resetColor(btn_view_spareparts_sales);
        resetColor(btn_spareparts_pending);
        resetColor(btn_sparepart_report);

        cust_panel.setVisible(false);
        spare_part_panel.setVisible(true);
        view_spare_partsSales_panel.setVisible(false);
        pending_payments.setVisible(false);
        spare_parts_report.setVisible(false);
    }//GEN-LAST:event_btn_sparepart_saleMousePressed

    private void btn_customerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_customerMousePressed
        // TODO add your handling code here:
        setColor(btn_customer);
        resetColor(btn_sparepart_sale);
        resetColor(btn_view_spareparts_sales);
        resetColor(btn_spareparts_pending);
        resetColor(btn_sparepart_report);

        cust_panel.setVisible(true);
        spare_part_panel.setVisible(false);
        view_spare_partsSales_panel.setVisible(false);
        pending_payments.setVisible(false);
        spare_parts_report.setVisible(false);

    }//GEN-LAST:event_btn_customerMousePressed

    private void btn_view_spareparts_salesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_view_spareparts_salesMousePressed
        // TODO add your handling code here:
        resetColor(btn_sparepart_sale);
        resetColor(btn_customer);
        setColor(btn_view_spareparts_sales);
        resetColor(btn_spareparts_pending);
        resetColor(btn_sparepart_report);

        cust_panel.setVisible(false);
        spare_part_panel.setVisible(false);
        view_spare_partsSales_panel.setVisible(true);
        pending_payments.setVisible(false);
        spare_parts_report.setVisible(false);
    }//GEN-LAST:event_btn_view_spareparts_salesMousePressed

    private void btn_spareparts_pendingMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_spareparts_pendingMousePressed
        // TODO add your handling code here:
        resetColor(btn_sparepart_sale);
        resetColor(btn_customer);
        resetColor(btn_view_spareparts_sales);
        setColor(btn_spareparts_pending);
        resetColor(btn_sparepart_report);

        pending_payments.setVisible(true);
        cust_panel.setVisible(false);
        spare_part_panel.setVisible(false);
        view_spare_partsSales_panel.setVisible(false);
        spare_parts_report.setVisible(false);
    }//GEN-LAST:event_btn_spareparts_pendingMousePressed

    private void btn_sparepart_reportMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sparepart_reportMousePressed
        // TODO add your handling code here:
        resetColor(btn_sparepart_sale);
        resetColor(btn_customer);
        resetColor(btn_view_spareparts_sales);
        resetColor(btn_spareparts_pending);
        setColor(btn_sparepart_report);

        cust_panel.setVisible(false);
        spare_part_panel.setVisible(false);
        view_spare_partsSales_panel.setVisible(false);
        pending_payments.setVisible(false);
        spare_parts_report.setVisible(true);
    }//GEN-LAST:event_btn_sparepart_reportMousePressed

    private void btn_refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_refreshMouseClicked
        // TODO add your handling code here:

        cust_panel.refreshBuyerTable();
        spare_part_panel.refreshPanel();
        view_spare_partsSales_panel.refreshPanel();
        pending_payments.refreshPanel();

        JOptionPane.showMessageDialog(null, "Refresh Complete!",
                "Confirmation Message", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btn_refreshMouseClicked

    private void btn_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseClicked
        // TODO add your handling code here:
        Home home = new Home();
        home.setVisible(rootPaneCheckingEnabled);
        closeWindow();
        
    }//GEN-LAST:event_btn_homeMouseClicked

    void setColor(JPanel panel) {
        panel.setBackground(new Color(0, 102, 204));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(0, 51, 153));
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SparePartsSaleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SparePartsSaleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SparePartsSaleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SparePartsSaleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SparePartsSaleForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JPanel btn_customer;
    private javax.swing.JLabel btn_home;
    private javax.swing.JPanel btn_refresh;
    private javax.swing.JPanel btn_sparepart_report;
    private javax.swing.JPanel btn_sparepart_sale;
    private javax.swing.JPanel btn_spareparts_pending;
    private javax.swing.JPanel btn_view_spareparts_sales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
