
package user;

import javax.swing.JOptionPane;


public class billingFrame extends javax.swing.JFrame {

    public void setTotalAmount(String totalAmount) {
        amount.setText(totalAmount);
   }
     public billingFrame() {
        
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        fullName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        amountToPay = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        cardNumber = new javax.swing.JTextField();
        checkout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));

        jLabel21.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(534, 534, 534)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel21)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 40));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Payment");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 42, 139, -1));

        jLabel13.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Full name");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 90, -1, -1));

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        jPanel2.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 245, 230, 34));

        jLabel14.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Email");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 149, 40, -1));

        fullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameActionPerformed(evt);
            }
        });
        jPanel2.add(fullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 109, 230, 34));

        jLabel15.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Address");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 224, -1, -1));

        jLabel16.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("City");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 291, -1, -1));

        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });
        jPanel2.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 313, 230, 34));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 172, 230, 34));

        jLabel17.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Billing Address");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 42, -1, -1));

        jLabel18.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Credit Card Number");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 90, -1, -1));

        jLabel19.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Total Amount");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 151, -1, -1));

        jLabel20.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Amount to Pay");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 224, -1, 23));

        amountToPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountToPayActionPerformed(evt);
            }
        });
        jPanel2.add(amountToPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 253, 230, 34));

        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });
        jPanel2.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 178, 230, 34));

        cardNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNumberActionPerformed(evt);
            }
        });
        jPanel2.add(cardNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 111, 230, 34));

        checkout.setBackground(new java.awt.Color(204, 51, 0));
        checkout.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        checkout.setForeground(new java.awt.Color(255, 255, 255));
        checkout.setText("Proceed to Checkout");
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutActionPerformed(evt);
            }
        });
        jPanel2.add(checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 220, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 530, 420));

        setSize(new java.awt.Dimension(545, 444));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void fullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameActionPerformed

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void amountToPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountToPayActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_amountToPayActionPerformed

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        
    }//GEN-LAST:event_amountActionPerformed

    private void cardNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardNumberActionPerformed

    private void checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutActionPerformed
                                          
    String name = fullName.getText().trim();
    String emailAddress = email.getText().trim();
    String address1 = address.getText().trim();
    String cityName = city.getText().trim();
    String creditCardNumber = cardNumber.getText().trim();
    String totalAmountText = amount.getText().trim();
    String amountToPayText = amountToPay.getText().trim();

    if (name.isEmpty() || emailAddress.isEmpty() || address1.isEmpty() ||
            cityName.isEmpty() || creditCardNumber.isEmpty() || totalAmountText.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill in all the required fields");
    } else {
        try {
            double totalAmount = Double.parseDouble(totalAmountText);
            double amountToPay = Double.parseDouble(amountToPayText);

            if (totalAmount > amountToPay) {
                // Open Receipt frame and pass the information
                Receipt receiptFrame = new Receipt();
                receiptFrame.setInformation(name, address1, totalAmountText, amountToPayText);
                receiptFrame.setVisible(true);

                // Optionally, you can dispose the billingFrame if needed
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Not enough money to proceed with the payment");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid amount format. Please enter valid numbers.");
        }
    

    

    }
    }//GEN-LAST:event_checkoutActionPerformed

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
            java.util.logging.Logger.getLogger(billingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(billingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(billingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(billingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new billingFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField amount;
    private javax.swing.JTextField amountToPay;
    private javax.swing.JTextField cardNumber;
    private javax.swing.JButton checkout;
    private javax.swing.JTextField city;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fullName;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
 

