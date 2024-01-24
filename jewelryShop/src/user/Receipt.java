
package user;

import java.text.DecimalFormat;
import java.util.ArrayList;
public class Receipt extends javax.swing.JFrame {

   

    // ... other methods and fields ...



   public void setInformation(String fullName, String address, String totalAmount, String amountToPay,  ArrayList<String> billingInfo) {
        name.setText(fullName);
        this.address.setText(address);

        // Display the original total amount
       total.setText(formatAmount(Double.parseDouble(totalAmount)));

        // Display the amount to pay
        amountToPayLabel.setText(formatAmount(Double.parseDouble(amountToPay)));

        // Calculate exchange as the difference between total amount and amount to pay
        double exchangeValue = Double.parseDouble(amountToPay) - Double.parseDouble(totalAmount);

        // Display the exchange value
        exchangeLabel.setText(formatAmount(exchangeValue));
    }

    private String formatAmount(double amount) {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        return "₱" + decimalFormat.format(amount);
    

    



    
    }
    public Receipt() {
        initComponents();
    
    }

    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        exchangeLabel = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        amountToPayLabel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Cash = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 91, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Address");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 242, 91, 40));

        exchangeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exchangeLabel.setText("Total exchange");
        getContentPane().add(exchangeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 150, 50));

        name.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        name.setEnabled(false);
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 246, 30));

        address.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        address.setEnabled(false);
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 246, 30));

        amountToPayLabel.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        amountToPayLabel.setEnabled(false);
        amountToPayLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountToPayLabelActionPerformed(evt);
            }
        });
        getContentPane().add(amountToPayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 190, 30));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Back to homepage");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Exit");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, -1, -1));

        Cash.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Cash.setText("Cash");
        getContentPane().add(Cash, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 40, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Exchange");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Total");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        total.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        total.setEnabled(false);
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 190, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Thank you for oredering!! (1).png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void amountToPayLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountToPayLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountToPayLabelActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
          ShopFrame shop;

        ShopFrame ShopFrame = shop = new ShopFrame();
        shop.setVisible(true);
        
        this.dispose(); 
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
         this.dispose(); 
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cash;
    private javax.swing.JTextField address;
    private javax.swing.JTextField amountToPayLabel;
    private javax.swing.JLabel exchangeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField name;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables

}
