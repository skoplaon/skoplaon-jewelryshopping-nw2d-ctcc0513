
package user;


import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class RegistrationFrame extends javax.swing.JFrame {

   // In-memory user storage
    private static final Map<String, String> userDatabase = new HashMap<>();
   

    /**
     * Creates new form RegistrationFrame
     */
    public RegistrationFrame() {
        initComponents();
    }
    private void clearFields() {
        fname.setText("");
        lname.setText("");
        username.setText("");
        password.setText("");
        email.setText("");
        phoneNumber.setText("");
        
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        agreeButton = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 0));
        jPanel2.setLayout(null);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1200, 0);

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTER");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(230, 150, 300, 58);

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("PERSONAL INFORMATION");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 270, 282, 17);

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("First Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 310, 121, 17);

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("CONTACT INFORMATION");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(80, 490, 282, 17);

        fname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jPanel1.add(fname);
        fname.setBounds(70, 340, 282, 30);

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Last Name");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(70, 380, 121, 17);

        jLabel10.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Email Address");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(72, 520, 121, 17);

        jLabel11.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Phone Number");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(72, 583, 121, 17);

        lname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jPanel1.add(lname);
        lname.setBounds(70, 410, 282, 30);

        email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jPanel1.add(email);
        email.setBounds(72, 545, 282, 30);

        phoneNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jPanel1.add(phoneNumber);
        phoneNumber.setBounds(72, 612, 282, 30);

        jLabel12.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("ACCOUNT INFORMATION");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(410, 270, 282, 17);

        jLabel13.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Username");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(400, 310, 121, 17);

        jLabel14.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Password");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(400, 380, 121, 17);

        username.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jPanel1.add(username);
        username.setBounds(400, 340, 270, 30);

        agreeButton.setFont(new java.awt.Font("Lucida Sans", 0, 10)); // NOI18N
        agreeButton.setForeground(new java.awt.Color(51, 51, 51));
        agreeButton.setText("I agree to the Terms and Conditions of Bejeweled Jewelry Shop ");
        agreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(agreeButton);
        agreeButton.setBounds(370, 520, 350, 19);

        jLabel15.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("TERMS & CONDITIONS");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(400, 490, 260, 17);

        registerButton.setBackground(new java.awt.Color(102, 102, 102));
        registerButton.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Register");
        registerButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        jPanel1.add(registerButton);
        registerButton.setBounds(570, 560, 140, 30);

        clearButton.setBackground(new java.awt.Color(102, 102, 102));
        clearButton.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear");
        clearButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        jPanel1.add(clearButton);
        clearButton.setBounds(440, 560, 121, 30);

        password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(400, 410, 270, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Untitled design (18).png"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 100, 1210, 650);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/silverLogo.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 10, 260, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1211, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1227, 758));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        fname.setText(null);
        lname.setText(null);
        email.setText(null);
        phoneNumber.setText(null);
        username.setText(null);
        password.setText(null);
        
    }//GEN-LAST:event_clearButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
     {//GEN-FIRST:event_registerButtonActionPerformed
         String enteredUsername = username.getText();
        String enteredPassword = password.getText();
        String enteredFirstName = fname.getText();
        String enteredLastName = lname.getText();
        String enteredEmail = email.getText();
        String enteredPhoneNumber = phoneNumber.getText();

        if (enteredUsername.isEmpty() || enteredPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in both username and password.");
        } else {
            if (UserManager.registerUser(enteredUsername, enteredPassword)) {
                JOptionPane.showMessageDialog(this, "Registration successful!");
                // Open the Login form
              
                LoginFrame login = new LoginFrame();
                login.setVisible(true);
                this.dispose(); // Close the current Register form
          
        }
                                                  
        }
    
     }

        
    }//GEN-LAST:event_registerButtonActionPerformed

    private void agreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreeButtonActionPerformed
        // TODO add your handling code here:
          if (!agreeButton.isSelected()) {
            JOptionPane.showMessageDialog(null, "Please agree to terms and agreements");
        }
    

    

    }//GEN-LAST:event_agreeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RegistrationFrame().setVisible(true);
              
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox agreeButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lname;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables






}