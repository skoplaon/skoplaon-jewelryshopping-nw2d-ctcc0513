
package user;

import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;



public final class ShopFrame extends javax.swing.JFrame {
     private Stack<String> cartStack = new Stack<>();  
       private billingFrame billingFrameInstance; 
     private final LinkedList<String> cartItems = new LinkedList<>();
     
     JTabbedPane tabbedPane = new JTabbedPane();
     JPanel cart = new JPanel();
        
     
     
     
     Color defaultcolor, clickedcolor, white;
    private Object jTabbedPanel;

    /**
     *
     */
    public ShopFrame() {
         billingFrameInstance = new billingFrame(); 
       initComponents();
         
    
       
       defaultcolor = new Color(153,153,153);
       clickedcolor = new Color(204,204,204);
       white = new Color(255,255,255);
       
      
      getSum();
         
   }
   DefaultTableModel model;
       String item;
       int price;
       
     
       
       
       
       
       
       private final JTable cartTable;
    private final DefaultTableModel cartTableModel;
    private boolean buttonClicked = false;
    
     {
        // Initialize the cart table and table model
        cartTableModel = new DefaultTableModel();
        cartTableModel.addColumn("Product Name");
        cartTableModel.addColumn("Price");
        cartTable = new JTable(cartTableModel);
    }
     public void getSum() {
    int sum = 0;
    for (int i = 0; i < cartTableModel.getRowCount(); i++) {
        sum += Integer.parseInt(cartTableModel.getValueAt(i, 1).toString());
    }
    txtTotal.setText("Total: " + sum);
    txtTotal.setText(Integer.toString(sum));

    
    
    
}

     
    

     
     
   
     
     private JTabbedPane collectionTabbedPane;
     
     
     
     
     
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        aboutt = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        collection = new javax.swing.JLabel();
        p4 = new javax.swing.JPanel();
        rings = new javax.swing.JLabel();
        p3 = new javax.swing.JPanel();
        bracelet = new javax.swing.JLabel();
        p5 = new javax.swing.JPanel();
        earrings = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        necklace = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        p6 = new javax.swing.JPanel();
        collection1 = new javax.swing.JLabel();
        p7 = new javax.swing.JPanel();
        rings1 = new javax.swing.JLabel();
        p8 = new javax.swing.JPanel();
        bracelet1 = new javax.swing.JLabel();
        p9 = new javax.swing.JPanel();
        earrings1 = new javax.swing.JLabel();
        p10 = new javax.swing.JPanel();
        necklace1 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        myCart = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        collectionTab = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        collection3 = new javax.swing.JLabel();
        c4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        c11 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        collection4 = new javax.swing.JLabel();
        c1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        collection5 = new javax.swing.JLabel();
        c8 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        collection6 = new javax.swing.JLabel();
        c2 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        collection7 = new javax.swing.JLabel();
        c3 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        collection8 = new javax.swing.JLabel();
        c5 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        collection9 = new javax.swing.JLabel();
        c6 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        collection10 = new javax.swing.JLabel();
        c7 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        necklaceTab = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        collection11 = new javax.swing.JLabel();
        n4 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        collection12 = new javax.swing.JLabel();
        n1 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        collection13 = new javax.swing.JLabel();
        n8 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        collection14 = new javax.swing.JLabel();
        n2 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        collection15 = new javax.swing.JLabel();
        n3 = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        collection16 = new javax.swing.JLabel();
        n5 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        collection17 = new javax.swing.JLabel();
        n6 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        collection18 = new javax.swing.JLabel();
        n7 = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        braceletTab = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        collection19 = new javax.swing.JLabel();
        b4 = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        collection20 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        collection21 = new javax.swing.JLabel();
        b8 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        collection22 = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        collection23 = new javax.swing.JLabel();
        b3 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        collection24 = new javax.swing.JLabel();
        b5 = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        collection25 = new javax.swing.JLabel();
        b6 = new javax.swing.JButton();
        jLabel58 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        collection26 = new javax.swing.JLabel();
        b7 = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        ringsTab = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        collection35 = new javax.swing.JLabel();
        r4 = new javax.swing.JButton();
        jLabel76 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        collection36 = new javax.swing.JLabel();
        r1 = new javax.swing.JButton();
        jLabel78 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        collection37 = new javax.swing.JLabel();
        r8 = new javax.swing.JButton();
        jLabel80 = new javax.swing.JLabel();
        jPanel52 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        collection38 = new javax.swing.JLabel();
        r2 = new javax.swing.JButton();
        jLabel82 = new javax.swing.JLabel();
        jPanel53 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        collection39 = new javax.swing.JLabel();
        r3 = new javax.swing.JButton();
        jLabel84 = new javax.swing.JLabel();
        jPanel54 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        collection40 = new javax.swing.JLabel();
        r5 = new javax.swing.JButton();
        jLabel86 = new javax.swing.JLabel();
        jPanel55 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        collection41 = new javax.swing.JLabel();
        r6 = new javax.swing.JButton();
        jLabel88 = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        collection42 = new javax.swing.JLabel();
        r7 = new javax.swing.JButton();
        jLabel90 = new javax.swing.JLabel();
        earringsTab = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        collection27 = new javax.swing.JLabel();
        e4 = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        collection28 = new javax.swing.JLabel();
        e1 = new javax.swing.JButton();
        jLabel63 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        collection29 = new javax.swing.JLabel();
        e8 = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        collection30 = new javax.swing.JLabel();
        e2 = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        collection31 = new javax.swing.JLabel();
        e3 = new javax.swing.JButton();
        jLabel69 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        collection32 = new javax.swing.JLabel();
        e5 = new javax.swing.JButton();
        jLabel71 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        collection33 = new javax.swing.JLabel();
        e6 = new javax.swing.JButton();
        jLabel73 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        collection34 = new javax.swing.JLabel();
        e7 = new javax.swing.JButton();
        jLabel75 = new javax.swing.JLabel();
        cartTab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableModel = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        txtTotal = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        showTotal = new javax.swing.JButton();

        jTabbedPane2.setBackground(new java.awt.Color(102, 102, 102));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab1", jPanel5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/silverLogo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Sans", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Shop");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 90, 22));

        aboutt.setFont(new java.awt.Font("Lucida Sans", 1, 20)); // NOI18N
        aboutt.setForeground(new java.awt.Color(102, 102, 102));
        aboutt.setText("About");
        aboutt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abouttMouseClicked(evt);
            }
        });
        jPanel1.add(aboutt, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, 90, 22));

        jLabel12.setFont(new java.awt.Font("Lucida Sans", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Home");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 90, 22));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 110));

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        p1.setBackground(new java.awt.Color(153, 153, 153));

        collection.setBackground(new java.awt.Color(255, 255, 255));
        collection.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        collection.setForeground(new java.awt.Color(255, 255, 255));
        collection.setText("Collections");
        collection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collectionMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collectionMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collectionMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(collection)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(collection)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p4.setBackground(new java.awt.Color(153, 153, 153));

        rings.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        rings.setForeground(new java.awt.Color(255, 255, 255));
        rings.setText("Rings");
        rings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ringsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ringsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ringsMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout p4Layout = new javax.swing.GroupLayout(p4);
        p4.setLayout(p4Layout);
        p4Layout.setHorizontalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(rings)
                .addContainerGap(187, Short.MAX_VALUE))
        );
        p4Layout.setVerticalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rings)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p3.setBackground(new java.awt.Color(153, 153, 153));

        bracelet.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        bracelet.setForeground(new java.awt.Color(255, 255, 255));
        bracelet.setText("Bracelet");
        bracelet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                braceletMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                braceletMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                braceletMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(bracelet)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bracelet)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p5.setBackground(new java.awt.Color(153, 153, 153));

        earrings.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        earrings.setForeground(new java.awt.Color(255, 255, 255));
        earrings.setText("Earrings");
        earrings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                earringsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                earringsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                earringsMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout p5Layout = new javax.swing.GroupLayout(p5);
        p5.setLayout(p5Layout);
        p5Layout.setHorizontalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(earrings)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        p5Layout.setVerticalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(earrings)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p2.setBackground(new java.awt.Color(153, 153, 153));

        necklace.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        necklace.setForeground(new java.awt.Color(255, 255, 255));
        necklace.setText("Necklace");
        necklace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                necklaceMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                necklaceMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                necklaceMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(necklace)
                .addContainerGap(155, Short.MAX_VALUE))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(necklace)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        p6.setBackground(new java.awt.Color(153, 153, 153));

        collection1.setBackground(new java.awt.Color(255, 255, 255));
        collection1.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        collection1.setForeground(new java.awt.Color(255, 255, 255));
        collection1.setText("Collections");
        collection1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout p6Layout = new javax.swing.GroupLayout(p6);
        p6.setLayout(p6Layout);
        p6Layout.setHorizontalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(collection1)
                .addContainerGap(135, Short.MAX_VALUE))
        );
        p6Layout.setVerticalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(collection1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p7.setBackground(new java.awt.Color(153, 153, 153));

        rings1.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        rings1.setForeground(new java.awt.Color(255, 255, 255));
        rings1.setText("Rings");
        rings1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rings1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rings1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rings1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout p7Layout = new javax.swing.GroupLayout(p7);
        p7.setLayout(p7Layout);
        p7Layout.setHorizontalGroup(
            p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(rings1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p7Layout.setVerticalGroup(
            p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rings1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p8.setBackground(new java.awt.Color(153, 153, 153));

        bracelet1.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        bracelet1.setForeground(new java.awt.Color(255, 255, 255));
        bracelet1.setText("Bracelet");
        bracelet1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bracelet1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bracelet1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bracelet1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout p8Layout = new javax.swing.GroupLayout(p8);
        p8.setLayout(p8Layout);
        p8Layout.setHorizontalGroup(
            p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(bracelet1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p8Layout.setVerticalGroup(
            p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bracelet1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p9.setBackground(new java.awt.Color(153, 153, 153));

        earrings1.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        earrings1.setForeground(new java.awt.Color(255, 255, 255));
        earrings1.setText("Earrings");
        earrings1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                earrings1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                earrings1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                earrings1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout p9Layout = new javax.swing.GroupLayout(p9);
        p9.setLayout(p9Layout);
        p9Layout.setHorizontalGroup(
            p9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(earrings1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p9Layout.setVerticalGroup(
            p9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(earrings1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p10.setBackground(new java.awt.Color(153, 153, 153));

        necklace1.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        necklace1.setForeground(new java.awt.Color(255, 255, 255));
        necklace1.setText("Necklace");
        necklace1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                necklace1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                necklace1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                necklace1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout p10Layout = new javax.swing.GroupLayout(p10);
        p10.setLayout(p10Layout);
        p10Layout.setHorizontalGroup(
            p10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p10Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(necklace1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p10Layout.setVerticalGroup(
            p10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(necklace1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel93.setFont(new java.awt.Font("Lucida Sans", 3, 20)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_logout_rounded_left_16px.png"))); // NOI18N
        jLabel93.setText("Logout");
        jLabel93.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel93MouseClicked(evt);
            }
        });

        myCart.setFont(new java.awt.Font("Lucida Sans", 3, 20)); // NOI18N
        myCart.setForeground(new java.awt.Color(255, 255, 255));
        myCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_shopping_cart_24px_1.png"))); // NOI18N
        myCart.setText("My Cart");
        myCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myCartMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(myCart, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                .addComponent(myCart, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(476, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel14.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 740));

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 204));

        collectionTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), null));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel17.setForeground(new java.awt.Color(204, 204, 204));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/necklacee2222.png"))); // NOI18N

        collection3.setBackground(new java.awt.Color(255, 255, 255));
        collection3.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection3.setForeground(new java.awt.Color(0, 102, 102));
        collection3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection3.setText("\"Dancing Moissanite\"");
        collection3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection3MouseReleased(evt);
            }
        });

        c4.setBackground(new java.awt.Color(153, 153, 153));
        c4.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        c4.setForeground(new java.awt.Color(255, 255, 255));
        c4.setText("Add to cart");
        c4.setBorder(null);
        c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("₱ 18, 000.00");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collection3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(collection3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(24, 24, 24))
        );

        jPanel3.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 240, 330));

        c11.setBackground(new java.awt.Color(255, 255, 255));
        c11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        c11.setForeground(new java.awt.Color(204, 204, 204));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/collection11.png"))); // NOI18N

        collection4.setBackground(new java.awt.Color(255, 255, 255));
        collection4.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection4.setForeground(new java.awt.Color(0, 102, 102));
        collection4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection4.setText("\"Celtic Knot\"");
        collection4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection4MouseReleased(evt);
            }
        });

        c1.setBackground(new java.awt.Color(153, 153, 153));
        c1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        c1.setForeground(new java.awt.Color(255, 255, 255));
        c1.setText("Add to cart");
        c1.setBorder(null);
        c1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c1MouseClicked(evt);
            }
        });
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("₱ 27, 000.00");

        javax.swing.GroupLayout c11Layout = new javax.swing.GroupLayout(c11);
        c11.setLayout(c11Layout);
        c11Layout.setHorizontalGroup(
            c11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(c11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collection4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(c11Layout.createSequentialGroup()
                        .addGroup(c11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(c11Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17))
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        c11Layout.setVerticalGroup(
            c11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c11Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(collection4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(c11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(24, 24, 24))
        );

        jPanel3.add(c11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 250, -1));

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel19.setForeground(new java.awt.Color(204, 204, 204));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bracelet222.png"))); // NOI18N

        collection5.setBackground(new java.awt.Color(255, 255, 255));
        collection5.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection5.setForeground(new java.awt.Color(0, 102, 102));
        collection5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection5.setText("\"Blocaci Soulmate\"");
        collection5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection5MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection5MouseReleased(evt);
            }
        });

        c8.setBackground(new java.awt.Color(153, 153, 153));
        c8.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        c8.setForeground(new java.awt.Color(255, 255, 255));
        c8.setText("Add to cart");
        c8.setBorder(null);
        c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c8ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("₱ 22, 000.00");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(collection5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(collection5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(24, 24, 24))
        );

        jPanel3.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, 240, 320));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel20.setForeground(new java.awt.Color(204, 204, 204));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ringg111.png"))); // NOI18N

        collection6.setBackground(new java.awt.Color(255, 255, 255));
        collection6.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection6.setForeground(new java.awt.Color(0, 102, 102));
        collection6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection6.setText("\"Moment Wish\"");
        collection6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection6MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection6MouseReleased(evt);
            }
        });

        c2.setBackground(new java.awt.Color(153, 153, 153));
        c2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        c2.setForeground(new java.awt.Color(255, 255, 255));
        c2.setText("Add to cart");
        c2.setBorder(null);
        c2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c2MouseClicked(evt);
            }
        });
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("₱ 8, 000.00");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collection6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(collection6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(24, 24, 24))
        );

        jPanel3.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 240, 330));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel21.setForeground(new java.awt.Color(204, 204, 204));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/earringss111.jpg"))); // NOI18N

        collection7.setBackground(new java.awt.Color(255, 255, 255));
        collection7.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection7.setForeground(new java.awt.Color(0, 102, 102));
        collection7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection7.setText("\"Teardrop Filigree\"");
        collection7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection7MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection7MouseReleased(evt);
            }
        });

        c3.setBackground(new java.awt.Color(153, 153, 153));
        c3.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        c3.setForeground(new java.awt.Color(255, 255, 255));
        c3.setText("Add to cart");
        c3.setBorder(null);
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("₱ 15, 000.00");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collection7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(collection7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(24, 24, 24))
        );

        jPanel3.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 240, 330));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel22.setForeground(new java.awt.Color(204, 204, 204));

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/braceleeeeetttt111.png"))); // NOI18N

        collection8.setBackground(new java.awt.Color(255, 255, 255));
        collection8.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection8.setForeground(new java.awt.Color(0, 102, 102));
        collection8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection8.setText("\"Twisted Vine\"");
        collection8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection8MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection8MouseReleased(evt);
            }
        });

        c5.setBackground(new java.awt.Color(153, 153, 153));
        c5.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        c5.setForeground(new java.awt.Color(255, 255, 255));
        c5.setText("Add to cart");
        c5.setBorder(null);
        c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c5ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("₱ 21, 000.00");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(collection8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(collection8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(24, 24, 24))
        );

        jPanel3.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 250, 320));

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel23.setForeground(new java.awt.Color(204, 204, 204));

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/earrings22222.png"))); // NOI18N

        collection9.setBackground(new java.awt.Color(255, 255, 255));
        collection9.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection9.setForeground(new java.awt.Color(0, 102, 102));
        collection9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection9.setText("\"Dangle Drop\"");
        collection9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection9MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection9MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection9MouseReleased(evt);
            }
        });

        c6.setBackground(new java.awt.Color(153, 153, 153));
        c6.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        c6.setForeground(new java.awt.Color(255, 255, 255));
        c6.setText("Add to cart");
        c6.setBorder(null);
        c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c6ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("₱ 6, 000.00");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(collection9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(collection9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(24, 24, 24))
        );

        jPanel3.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 240, 320));

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel24.setForeground(new java.awt.Color(204, 204, 204));

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ring333.png"))); // NOI18N

        collection10.setBackground(new java.awt.Color(255, 255, 255));
        collection10.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection10.setForeground(new java.awt.Color(0, 102, 102));
        collection10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection10.setText("\"Silver Halo\"");
        collection10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection10MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection10MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection10MouseReleased(evt);
            }
        });

        c7.setBackground(new java.awt.Color(153, 153, 153));
        c7.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        c7.setForeground(new java.awt.Color(255, 255, 255));
        c7.setText("Add to cart");
        c7.setBorder(null);
        c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c7ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
        jLabel29.setText("₱ 9, 000.00");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(collection10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(collection10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(24, 24, 24))
        );

        jPanel3.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 240, 320));

        collectionTab.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1050, 750));

        jTabbedPane1.addTab("tab1", collectionTab);

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), null));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel25.setForeground(new java.awt.Color(204, 204, 204));

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/necklace777.png"))); // NOI18N

        collection11.setBackground(new java.awt.Color(255, 255, 255));
        collection11.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection11.setForeground(new java.awt.Color(0, 102, 102));
        collection11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection11.setText("\"Exquisite Brilliance\"");
        collection11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection11MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection11MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection11MouseReleased(evt);
            }
        });

        n4.setBackground(new java.awt.Color(153, 153, 153));
        n4.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        n4.setForeground(new java.awt.Color(255, 255, 255));
        n4.setText("Add to cart");
        n4.setBorder(null);
        n4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 102, 102));
        jLabel31.setText("₱ 20, 000.00");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collection11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel31)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(collection11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addGap(24, 24, 24))
        );

        jPanel8.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 240, 330));

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel26.setForeground(new java.awt.Color(204, 204, 204));

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/necklace4444.png"))); // NOI18N

        collection12.setBackground(new java.awt.Color(255, 255, 255));
        collection12.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection12.setForeground(new java.awt.Color(0, 102, 102));
        collection12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection12.setText("\"Royal Elegance\"");
        collection12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection12MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection12MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection12MouseReleased(evt);
            }
        });

        n1.setBackground(new java.awt.Color(153, 153, 153));
        n1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        n1.setForeground(new java.awt.Color(255, 255, 255));
        n1.setText("Add to cart");
        n1.setBorder(null);
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(102, 102, 102));
        jLabel33.setText("₱ 12, 000.00");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collection12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel33))
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(collection12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addGap(24, 24, 24))
        );

        jPanel8.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 250, -1));

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel27.setForeground(new java.awt.Color(204, 204, 204));

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/necklace999.png"))); // NOI18N

        collection13.setBackground(new java.awt.Color(255, 255, 255));
        collection13.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection13.setForeground(new java.awt.Color(0, 102, 102));
        collection13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection13.setText("\"Pearl Radiance\"");
        collection13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection13MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection13MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection13MouseReleased(evt);
            }
        });

        n8.setBackground(new java.awt.Color(153, 153, 153));
        n8.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        n8.setForeground(new java.awt.Color(255, 255, 255));
        n8.setText("Add to cart");
        n8.setBorder(null);
        n8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n8ActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 102, 102));
        jLabel35.setText("₱ 23, 000.00");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel35)
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(collection13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(collection13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addGap(24, 24, 24))
        );

        jPanel8.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 360, 240, 320));

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel28.setForeground(new java.awt.Color(204, 204, 204));

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/necklace55555.png"))); // NOI18N

        collection14.setBackground(new java.awt.Color(255, 255, 255));
        collection14.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection14.setForeground(new java.awt.Color(0, 102, 102));
        collection14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection14.setText("\"Diamond Symphony\"");
        collection14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection14MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection14MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection14MouseReleased(evt);
            }
        });

        n2.setBackground(new java.awt.Color(153, 153, 153));
        n2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        n2.setForeground(new java.awt.Color(255, 255, 255));
        n2.setText("Add to cart");
        n2.setBorder(null);
        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 102, 102));
        jLabel37.setText("₱ 21, 000.00");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collection14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel37)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(collection14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addGap(24, 24, 24))
        );

        jPanel8.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 240, 330));

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel29.setForeground(new java.awt.Color(204, 204, 204));

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/necklace6666.png"))); // NOI18N

        collection15.setBackground(new java.awt.Color(255, 255, 255));
        collection15.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection15.setForeground(new java.awt.Color(0, 102, 102));
        collection15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection15.setText("\"Opulent Splendor\"");
        collection15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection15MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection15MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection15MouseReleased(evt);
            }
        });

        n3.setBackground(new java.awt.Color(153, 153, 153));
        n3.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        n3.setForeground(new java.awt.Color(255, 255, 255));
        n3.setText("Add to cart");
        n3.setBorder(null);
        n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(102, 102, 102));
        jLabel39.setText("₱ 17, 000.00");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collection15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel39)
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(collection15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addGap(24, 24, 24))
        );

        jPanel8.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 240, 330));

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel30.setForeground(new java.awt.Color(204, 204, 204));

        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/necklace888.png"))); // NOI18N

        collection16.setBackground(new java.awt.Color(255, 255, 255));
        collection16.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection16.setForeground(new java.awt.Color(0, 102, 102));
        collection16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection16.setText("\"Regal Treasures\"");
        collection16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection16MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection16MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection16MouseReleased(evt);
            }
        });

        n5.setBackground(new java.awt.Color(153, 153, 153));
        n5.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        n5.setForeground(new java.awt.Color(255, 255, 255));
        n5.setText("Add to cart");
        n5.setBorder(null);
        n5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n5ActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(102, 102, 102));
        jLabel41.setText("₱ 14, 000.00");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel41)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collection16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(collection16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addGap(24, 24, 24))
        );

        jPanel8.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 250, 320));

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel31.setForeground(new java.awt.Color(204, 204, 204));

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/necklacee2222.png"))); // NOI18N

        collection17.setBackground(new java.awt.Color(255, 255, 255));
        collection17.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection17.setForeground(new java.awt.Color(0, 102, 102));
        collection17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection17.setText("\"Dancing Moissanite\"");
        collection17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection17MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection17MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection17MouseReleased(evt);
            }
        });

        n6.setBackground(new java.awt.Color(153, 153, 153));
        n6.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        n6.setForeground(new java.awt.Color(255, 255, 255));
        n6.setText("Add to cart");
        n6.setBorder(null);
        n6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n6ActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(102, 102, 102));
        jLabel43.setText("₱ 18, 000.00");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel43)
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(collection17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(collection17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addGap(24, 24, 24))
        );

        jPanel8.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 240, 320));

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel32.setForeground(new java.awt.Color(204, 204, 204));

        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/collection11.png"))); // NOI18N

        collection18.setBackground(new java.awt.Color(255, 255, 255));
        collection18.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection18.setForeground(new java.awt.Color(0, 102, 102));
        collection18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection18.setText("\"Celtic Knot\"");
        collection18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection18MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection18MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection18MouseReleased(evt);
            }
        });

        n7.setBackground(new java.awt.Color(153, 153, 153));
        n7.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        n7.setForeground(new java.awt.Color(255, 255, 255));
        n7.setText("Add to cart");
        n7.setBorder(null);
        n7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n7ActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(102, 102, 102));
        jLabel45.setText("₱ 27, 000.00");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel45)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(collection18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(collection18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addGap(24, 24, 24))
        );

        jPanel8.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 240, 320));

        javax.swing.GroupLayout necklaceTabLayout = new javax.swing.GroupLayout(necklaceTab);
        necklaceTab.setLayout(necklaceTabLayout);
        necklaceTabLayout.setHorizontalGroup(
            necklaceTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, necklaceTabLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                .addContainerGap())
        );
        necklaceTabLayout.setVerticalGroup(
            necklaceTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(necklaceTabLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab3", necklaceTab);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), null));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel33.setForeground(new java.awt.Color(204, 204, 204));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bracelet888.png"))); // NOI18N

        collection19.setBackground(new java.awt.Color(255, 255, 255));
        collection19.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection19.setForeground(new java.awt.Color(0, 102, 102));
        collection19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection19.setText("\"Twilight Twilight Cuff\"");
        collection19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection19MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection19MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection19MouseReleased(evt);
            }
        });

        b4.setBackground(new java.awt.Color(153, 153, 153));
        b4.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        b4.setForeground(new java.awt.Color(255, 255, 255));
        b4.setText("Add to cart");
        b4.setBorder(null);
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(102, 102, 102));
        jLabel46.setText("₱ 11, 000.00");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collection19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel46)
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(collection19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46))
                .addGap(24, 24, 24))
        );

        jPanel4.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 240, 330));

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel34.setForeground(new java.awt.Color(204, 204, 204));

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bracelet444.png"))); // NOI18N

        collection20.setBackground(new java.awt.Color(255, 255, 255));
        collection20.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection20.setForeground(new java.awt.Color(0, 102, 102));
        collection20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection20.setText("\"Opulent Opaline\"");
        collection20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection20MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection20MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection20MouseReleased(evt);
            }
        });

        b1.setBackground(new java.awt.Color(153, 153, 153));
        b1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setText("Add to cart");
        b1.setBorder(null);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(102, 102, 102));
        jLabel48.setText("₱ 15, 000.00");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel48))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(collection20, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(collection20)
                .addGap(37, 37, 37)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addGap(24, 24, 24))
        );

        jPanel4.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 250, 330));

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel35.setForeground(new java.awt.Color(204, 204, 204));

        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bracelet222.png"))); // NOI18N

        collection21.setBackground(new java.awt.Color(255, 255, 255));
        collection21.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection21.setForeground(new java.awt.Color(0, 102, 102));
        collection21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection21.setText("\"Blocaci Soulmate\"");
        collection21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection21MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection21MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection21MouseReleased(evt);
            }
        });

        b8.setBackground(new java.awt.Color(153, 153, 153));
        b8.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        b8.setForeground(new java.awt.Color(255, 255, 255));
        b8.setText("Add to cart");
        b8.setBorder(null);
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(102, 102, 102));
        jLabel50.setText("₱ 22, 000.00");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel50)
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(collection21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(collection21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50))
                .addGap(24, 24, 24))
        );

        jPanel4.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 360, 240, 320));

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));
        jPanel36.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel36.setForeground(new java.awt.Color(204, 204, 204));

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bracelet5555.png"))); // NOI18N

        collection22.setBackground(new java.awt.Color(255, 255, 255));
        collection22.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection22.setForeground(new java.awt.Color(0, 102, 102));
        collection22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection22.setText("\"Sapphire Splendor\"");
        collection22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection22MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection22MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection22MouseReleased(evt);
            }
        });

        b2.setBackground(new java.awt.Color(153, 153, 153));
        b2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.setText("Add to cart");
        b2.setBorder(null);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(102, 102, 102));
        jLabel52.setText("₱ 13, 000.00");

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collection22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel52)
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(collection22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52))
                .addGap(24, 24, 24))
        );

        jPanel4.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 240, 330));

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));
        jPanel37.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel37.setForeground(new java.awt.Color(204, 204, 204));

        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bracelet6666.png"))); // NOI18N

        collection23.setBackground(new java.awt.Color(255, 255, 255));
        collection23.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection23.setForeground(new java.awt.Color(0, 102, 102));
        collection23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection23.setText("\"Pearlescent Perfection\"");
        collection23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection23MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection23MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection23MouseReleased(evt);
            }
        });

        b3.setBackground(new java.awt.Color(153, 153, 153));
        b3.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        b3.setForeground(new java.awt.Color(255, 255, 255));
        b3.setText("Add to cart");
        b3.setBorder(null);
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(102, 102, 102));
        jLabel54.setText("₱ 13, 000.00");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collection23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel54)
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(collection23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54))
                .addGap(24, 24, 24))
        );

        jPanel4.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 240, 330));

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));
        jPanel38.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel38.setForeground(new java.awt.Color(204, 204, 204));

        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/braceleeeeetttt111.png"))); // NOI18N

        collection24.setBackground(new java.awt.Color(255, 255, 255));
        collection24.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection24.setForeground(new java.awt.Color(0, 102, 102));
        collection24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection24.setText("\"Twisted Vine\"");
        collection24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection24MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection24MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection24MouseReleased(evt);
            }
        });

        b5.setBackground(new java.awt.Color(153, 153, 153));
        b5.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        b5.setForeground(new java.awt.Color(255, 255, 255));
        b5.setText("Add to cart");
        b5.setBorder(null);
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(102, 102, 102));
        jLabel56.setText("₱ 21, 000.00");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel56)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(collection24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(collection24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56))
                .addGap(24, 24, 24))
        );

        jPanel4.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 250, 320));

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));
        jPanel39.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel39.setForeground(new java.awt.Color(204, 204, 204));

        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bracelet777.png"))); // NOI18N

        collection25.setBackground(new java.awt.Color(255, 255, 255));
        collection25.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection25.setForeground(new java.awt.Color(0, 102, 102));
        collection25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection25.setText("\"Platinum Pinnacle\"");
        collection25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection25MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection25MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection25MouseReleased(evt);
            }
        });

        b6.setBackground(new java.awt.Color(153, 153, 153));
        b6.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        b6.setForeground(new java.awt.Color(255, 255, 255));
        b6.setText("Add to cart");
        b6.setBorder(null);
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(102, 102, 102));
        jLabel58.setText("₱ 17, 000.00");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel58)
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(collection25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(collection25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58))
                .addGap(24, 24, 24))
        );

        jPanel4.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 240, 320));

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));
        jPanel40.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel40.setForeground(new java.awt.Color(204, 204, 204));

        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bracelet999.png"))); // NOI18N

        collection26.setBackground(new java.awt.Color(255, 255, 255));
        collection26.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection26.setForeground(new java.awt.Color(0, 102, 102));
        collection26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection26.setText("\"Exquisite Ivory Wings\"");
        collection26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection26MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection26MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection26MouseReleased(evt);
            }
        });

        b7.setBackground(new java.awt.Color(153, 153, 153));
        b7.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        b7.setForeground(new java.awt.Color(255, 255, 255));
        b7.setText("Add to cart");
        b7.setBorder(null);
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(102, 102, 102));
        jLabel60.setText("₱ 14, 000.00");

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel60)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(collection26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(collection26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60))
                .addGap(24, 24, 24))
        );

        jPanel4.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 240, 320));

        javax.swing.GroupLayout braceletTabLayout = new javax.swing.GroupLayout(braceletTab);
        braceletTab.setLayout(braceletTabLayout);
        braceletTabLayout.setHorizontalGroup(
            braceletTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
        );
        braceletTabLayout.setVerticalGroup(
            braceletTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, braceletTabLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("tab4", braceletTab);

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), null));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel49.setBackground(new java.awt.Color(255, 255, 255));
        jPanel49.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel49.setForeground(new java.awt.Color(204, 204, 204));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ring6666.png"))); // NOI18N

        collection35.setBackground(new java.awt.Color(255, 255, 255));
        collection35.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection35.setForeground(new java.awt.Color(0, 102, 102));
        collection35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection35.setText("\"Crimson Crown\"");
        collection35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection35MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection35MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection35MouseReleased(evt);
            }
        });

        r4.setBackground(new java.awt.Color(153, 153, 153));
        r4.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        r4.setForeground(new java.awt.Color(255, 255, 255));
        r4.setText("Add to cart");
        r4.setBorder(null);
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });

        jLabel76.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(102, 102, 102));
        jLabel76.setText("₱ 22, 000.00");

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collection35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(r4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel76)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(collection35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel76))
                .addGap(24, 24, 24))
        );

        jPanel10.add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 240, 330));

        jPanel50.setBackground(new java.awt.Color(255, 255, 255));
        jPanel50.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel50.setForeground(new java.awt.Color(204, 204, 204));

        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ring4444.png"))); // NOI18N

        collection36.setBackground(new java.awt.Color(255, 255, 255));
        collection36.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection36.setForeground(new java.awt.Color(0, 102, 102));
        collection36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection36.setText("\"Diamond Deluge\"");
        collection36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection36MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection36MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection36MouseReleased(evt);
            }
        });

        r1.setBackground(new java.awt.Color(153, 153, 153));
        r1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        r1.setForeground(new java.awt.Color(255, 255, 255));
        r1.setText("Add to cart");
        r1.setBorder(null);
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });

        jLabel78.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(102, 102, 102));
        jLabel78.setText("₱ 31, 000.00");

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collection36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel50Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel78))
                            .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(collection36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel78))
                .addGap(24, 24, 24))
        );

        jPanel10.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 250, 330));

        jPanel51.setBackground(new java.awt.Color(255, 255, 255));
        jPanel51.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel51.setForeground(new java.awt.Color(204, 204, 204));

        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ring9999.png"))); // NOI18N

        collection37.setBackground(new java.awt.Color(255, 255, 255));
        collection37.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection37.setForeground(new java.awt.Color(0, 102, 102));
        collection37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection37.setText("\"Champagne Cascade\"");
        collection37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection37MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection37MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection37MouseReleased(evt);
            }
        });

        r8.setBackground(new java.awt.Color(153, 153, 153));
        r8.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        r8.setForeground(new java.awt.Color(255, 255, 255));
        r8.setText("Add to cart");
        r8.setBorder(null);
        r8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8ActionPerformed(evt);
            }
        });

        jLabel80.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(102, 102, 102));
        jLabel80.setText("₱ 12, 000.00");

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel51Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(collection37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(r8, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel80)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel51Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(collection37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80))
                .addGap(24, 24, 24))
        );

        jPanel10.add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 360, 240, 320));

        jPanel52.setBackground(new java.awt.Color(255, 255, 255));
        jPanel52.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel52.setForeground(new java.awt.Color(204, 204, 204));

        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ringg111.png"))); // NOI18N

        collection38.setBackground(new java.awt.Color(255, 255, 255));
        collection38.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection38.setForeground(new java.awt.Color(0, 102, 102));
        collection38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection38.setText("\"Moment Wish\"");
        collection38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection38MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection38MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection38MouseReleased(evt);
            }
        });

        r2.setBackground(new java.awt.Color(153, 153, 153));
        r2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        r2.setForeground(new java.awt.Color(255, 255, 255));
        r2.setText("Add to cart");
        r2.setBorder(null);
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(102, 102, 102));
        jLabel82.setText("₱ 8, 000.00");

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collection38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel82)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(collection38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel82))
                .addGap(24, 24, 24))
        );

        jPanel10.add(jPanel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 240, 330));

        jPanel53.setBackground(new java.awt.Color(255, 255, 255));
        jPanel53.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel53.setForeground(new java.awt.Color(204, 204, 204));

        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ring555.png"))); // NOI18N

        collection39.setBackground(new java.awt.Color(255, 255, 255));
        collection39.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection39.setForeground(new java.awt.Color(0, 102, 102));
        collection39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection39.setText("\"Baroque Pearl Bliss\"");
        collection39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection39MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection39MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection39MouseReleased(evt);
            }
        });

        r3.setBackground(new java.awt.Color(153, 153, 153));
        r3.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        r3.setForeground(new java.awt.Color(255, 255, 255));
        r3.setText("Add to cart");
        r3.setBorder(null);
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });

        jLabel84.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(102, 102, 102));
        jLabel84.setText("₱ 28, 000.00");

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collection39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel53Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(r3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel84)
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel53Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(collection39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel84))
                .addGap(24, 24, 24))
        );

        jPanel10.add(jPanel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 240, 330));

        jPanel54.setBackground(new java.awt.Color(255, 255, 255));
        jPanel54.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel54.setForeground(new java.awt.Color(204, 204, 204));

        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ring777.png"))); // NOI18N

        collection40.setBackground(new java.awt.Color(255, 255, 255));
        collection40.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection40.setForeground(new java.awt.Color(0, 102, 102));
        collection40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection40.setText("\"Pearlescent Dream\"");
        collection40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection40MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection40MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection40MouseReleased(evt);
            }
        });

        r5.setBackground(new java.awt.Color(153, 153, 153));
        r5.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        r5.setForeground(new java.awt.Color(255, 255, 255));
        r5.setText("Add to cart");
        r5.setBorder(null);
        r5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5ActionPerformed(evt);
            }
        });

        jLabel86.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(102, 102, 102));
        jLabel86.setText("₱ 18, 000.00");

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(r5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel86)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(collection40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel54Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(collection40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel86))
                .addGap(24, 24, 24))
        );

        jPanel10.add(jPanel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 250, 320));

        jPanel55.setBackground(new java.awt.Color(255, 255, 255));
        jPanel55.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel55.setForeground(new java.awt.Color(204, 204, 204));

        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ring8888.png"))); // NOI18N

        collection41.setBackground(new java.awt.Color(255, 255, 255));
        collection41.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection41.setForeground(new java.awt.Color(0, 102, 102));
        collection41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection41.setText("\"Platinum Enigma\"");
        collection41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection41MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection41MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection41MouseReleased(evt);
            }
        });

        r6.setBackground(new java.awt.Color(153, 153, 153));
        r6.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        r6.setForeground(new java.awt.Color(255, 255, 255));
        r6.setText("Add to cart");
        r6.setBorder(null);
        r6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6ActionPerformed(evt);
            }
        });

        jLabel88.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(102, 102, 102));
        jLabel88.setText("₱ 23, 000.00");

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(r6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel88)
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel55Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(collection41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(collection41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel88))
                .addGap(24, 24, 24))
        );

        jPanel10.add(jPanel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 240, 320));

        jPanel56.setBackground(new java.awt.Color(255, 255, 255));
        jPanel56.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel56.setForeground(new java.awt.Color(204, 204, 204));

        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ring333.png"))); // NOI18N

        collection42.setBackground(new java.awt.Color(255, 255, 255));
        collection42.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection42.setForeground(new java.awt.Color(0, 102, 102));
        collection42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection42.setText("\"Silver Halo\"");
        collection42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection42MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection42MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection42MouseReleased(evt);
            }
        });

        r7.setBackground(new java.awt.Color(153, 153, 153));
        r7.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        r7.setForeground(new java.awt.Color(255, 255, 255));
        r7.setText("Add to cart");
        r7.setBorder(null);
        r7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7ActionPerformed(evt);
            }
        });

        jLabel90.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(102, 102, 102));
        jLabel90.setText("₱ 9, 000.00");

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(r7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel90)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(collection42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(collection42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel90))
                .addGap(24, 24, 24))
        );

        jPanel10.add(jPanel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 240, 320));

        javax.swing.GroupLayout ringsTabLayout = new javax.swing.GroupLayout(ringsTab);
        ringsTab.setLayout(ringsTabLayout);
        ringsTabLayout.setHorizontalGroup(
            ringsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
        );
        ringsTabLayout.setVerticalGroup(
            ringsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ringsTabLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("tab5", ringsTab);

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), null));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));
        jPanel41.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel41.setForeground(new java.awt.Color(204, 204, 204));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/earrings6666.png"))); // NOI18N

        collection27.setBackground(new java.awt.Color(255, 255, 255));
        collection27.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection27.setForeground(new java.awt.Color(0, 102, 102));
        collection27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection27.setText("\"Emerald Vine Ear Crawlers\"");
        collection27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection27MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection27MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection27MouseReleased(evt);
            }
        });

        e4.setBackground(new java.awt.Color(153, 153, 153));
        e4.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        e4.setForeground(new java.awt.Color(255, 255, 255));
        e4.setText("Add to cart");
        e4.setBorder(null);
        e4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e4ActionPerformed(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(102, 102, 102));
        jLabel61.setText("₱ 10, 000.00");

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collection27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(e4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel61)
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(collection27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61))
                .addGap(24, 24, 24))
        );

        jPanel9.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 240, 330));

        jPanel42.setBackground(new java.awt.Color(255, 255, 255));
        jPanel42.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel42.setForeground(new java.awt.Color(204, 204, 204));

        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/earrings444.png"))); // NOI18N

        collection28.setBackground(new java.awt.Color(255, 255, 255));
        collection28.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection28.setForeground(new java.awt.Color(0, 102, 102));
        collection28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection28.setText("\"Diamond Cascade Dangles\"");
        collection28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection28MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection28MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection28MouseReleased(evt);
            }
        });

        e1.setBackground(new java.awt.Color(153, 153, 153));
        e1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        e1.setForeground(new java.awt.Color(255, 255, 255));
        e1.setText("Add to cart");
        e1.setBorder(null);
        e1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e1ActionPerformed(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(102, 102, 102));
        jLabel63.setText("₱ 4, 000.00");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collection28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel63))
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(collection28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63))
                .addGap(24, 24, 24))
        );

        jPanel9.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 250, 330));

        jPanel43.setBackground(new java.awt.Color(255, 255, 255));
        jPanel43.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel43.setForeground(new java.awt.Color(204, 204, 204));

        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/earrings9999.png"))); // NOI18N

        collection29.setBackground(new java.awt.Color(255, 255, 255));
        collection29.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection29.setForeground(new java.awt.Color(0, 102, 102));
        collection29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection29.setText("\"Opulent Pearl Pendants\"");
        collection29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection29MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection29MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection29MouseReleased(evt);
            }
        });

        e8.setBackground(new java.awt.Color(153, 153, 153));
        e8.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        e8.setForeground(new java.awt.Color(255, 255, 255));
        e8.setText("Add to cart");
        e8.setBorder(null);
        e8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e8ActionPerformed(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(102, 102, 102));
        jLabel65.setText("₱ 4, 000.00");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(collection29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(e8, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel65))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(collection29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65))
                .addGap(24, 24, 24))
        );

        jPanel9.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 360, 240, 320));

        jPanel44.setBackground(new java.awt.Color(255, 255, 255));
        jPanel44.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel44.setForeground(new java.awt.Color(204, 204, 204));

        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/earrings5555.png"))); // NOI18N

        collection30.setBackground(new java.awt.Color(255, 255, 255));
        collection30.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection30.setForeground(new java.awt.Color(0, 102, 102));
        collection30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection30.setText("\"Platinum Perfection Drops\"");
        collection30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection30MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection30MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection30MouseReleased(evt);
            }
        });

        e2.setBackground(new java.awt.Color(153, 153, 153));
        e2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        e2.setForeground(new java.awt.Color(255, 255, 255));
        e2.setText("Add to cart");
        e2.setBorder(null);
        e2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e2ActionPerformed(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(102, 102, 102));
        jLabel67.setText("₱ 25, 000.00");

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collection30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel67)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(collection30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67))
                .addGap(24, 24, 24))
        );

        jPanel9.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 240, 330));

        jPanel45.setBackground(new java.awt.Color(255, 255, 255));
        jPanel45.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel45.setForeground(new java.awt.Color(204, 204, 204));

        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/earringss111.jpg"))); // NOI18N

        collection31.setBackground(new java.awt.Color(255, 255, 255));
        collection31.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection31.setForeground(new java.awt.Color(0, 102, 102));
        collection31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection31.setText("\"Teardrop Filigree\"");
        collection31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection31MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection31MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection31MouseReleased(evt);
            }
        });

        e3.setBackground(new java.awt.Color(153, 153, 153));
        e3.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        e3.setForeground(new java.awt.Color(255, 255, 255));
        e3.setText("Add to cart");
        e3.setBorder(null);
        e3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e3ActionPerformed(evt);
            }
        });

        jLabel69.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(102, 102, 102));
        jLabel69.setText("₱ 15, 000.00");

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collection31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(e3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel69)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(collection31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69))
                .addGap(24, 24, 24))
        );

        jPanel9.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 240, 330));

        jPanel46.setBackground(new java.awt.Color(255, 255, 255));
        jPanel46.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel46.setForeground(new java.awt.Color(204, 204, 204));

        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/earrings7777.png"))); // NOI18N

        collection32.setBackground(new java.awt.Color(255, 255, 255));
        collection32.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection32.setForeground(new java.awt.Color(0, 102, 102));
        collection32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection32.setText("\"Chandelier Diamond Delights\"");
        collection32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection32MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection32MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection32MouseReleased(evt);
            }
        });

        e5.setBackground(new java.awt.Color(153, 153, 153));
        e5.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        e5.setForeground(new java.awt.Color(255, 255, 255));
        e5.setText("Add to cart");
        e5.setBorder(null);
        e5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e5ActionPerformed(evt);
            }
        });

        jLabel71.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(102, 102, 102));
        jLabel71.setText("₱ 16, 000.00");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(e5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel71)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(collection32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(collection32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71))
                .addGap(24, 24, 24))
        );

        jPanel9.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 250, 320));

        jPanel47.setBackground(new java.awt.Color(255, 255, 255));
        jPanel47.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel47.setForeground(new java.awt.Color(204, 204, 204));

        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/earrings22222.png"))); // NOI18N

        collection33.setBackground(new java.awt.Color(255, 255, 255));
        collection33.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection33.setForeground(new java.awt.Color(0, 102, 102));
        collection33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection33.setText("\"Dangle Drop\"");
        collection33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection33MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection33MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection33MouseReleased(evt);
            }
        });

        e6.setBackground(new java.awt.Color(153, 153, 153));
        e6.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        e6.setForeground(new java.awt.Color(255, 255, 255));
        e6.setText("Add to cart");
        e6.setBorder(null);
        e6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e6ActionPerformed(evt);
            }
        });

        jLabel73.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(102, 102, 102));
        jLabel73.setText("₱ 6, 000.00");

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(e6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel73)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(collection33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(collection33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73))
                .addGap(24, 24, 24))
        );

        jPanel9.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 240, 320));

        jPanel48.setBackground(new java.awt.Color(255, 255, 255));
        jPanel48.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel48.setForeground(new java.awt.Color(204, 204, 204));

        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/earrings8888.png"))); // NOI18N

        collection34.setBackground(new java.awt.Color(255, 255, 255));
        collection34.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        collection34.setForeground(new java.awt.Color(0, 102, 102));
        collection34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collection34.setText("\"Platinum Petal Dusters\"");
        collection34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection34MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collection34MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collection34MouseReleased(evt);
            }
        });

        e7.setBackground(new java.awt.Color(153, 153, 153));
        e7.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        e7.setForeground(new java.awt.Color(255, 255, 255));
        e7.setText("Add to cart");
        e7.setBorder(null);
        e7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e7ActionPerformed(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(102, 102, 102));
        jLabel75.setText("₱ 8, 000.00");

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(e7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel75)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(collection34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(collection34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75))
                .addGap(24, 24, 24))
        );

        jPanel9.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 240, 320));

        javax.swing.GroupLayout earringsTabLayout = new javax.swing.GroupLayout(earringsTab);
        earringsTab.setLayout(earringsTabLayout);
        earringsTabLayout.setHorizontalGroup(
            earringsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
        );
        earringsTabLayout.setVerticalGroup(
            earringsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", earringsTab);

        cartTab.setBackground(new java.awt.Color(204, 204, 204));

        tableModel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        tableModel.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        tableModel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Price"
            }
        ));
        tableModel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableModelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableModel);

        jPanel7.setBackground(new java.awt.Color(241, 241, 241));

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete Item");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        showTotal.setBackground(new java.awt.Color(153, 153, 153));
        showTotal.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        showTotal.setForeground(new java.awt.Color(255, 255, 255));
        showTotal.setText("Show Total ");
        showTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(showTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(729, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout cartTabLayout = new javax.swing.GroupLayout(cartTab);
        cartTab.setLayout(cartTabLayout);
        cartTabLayout.setHorizontalGroup(
            cartTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartTabLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(cartTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );
        cartTabLayout.setVerticalGroup(
            cartTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartTabLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab6", cartTab);

        jPanel14.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, -40, 1040, 780));

        getContentPane().add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1280, 740));

        setSize(new java.awt.Dimension(1299, 869));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void collectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collectionMouseClicked
        // TODO add your handling code here:
       
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_collectionMouseClicked

    private void necklaceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_necklaceMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_necklaceMouseClicked

    private void braceletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_braceletMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_braceletMouseClicked

    private void ringsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ringsMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_ringsMouseClicked

    private void earringsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_earringsMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_earringsMouseClicked

    private void collectionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collectionMousePressed
        // TODO add your handling code here:
        p1.setBackground(clickedcolor);
        p2.setBackground(defaultcolor);
        p3.setBackground(defaultcolor);
        p4.setBackground(defaultcolor);
        p5.setBackground(defaultcolor);
        collection.setForeground(white);
    }//GEN-LAST:event_collectionMousePressed

    private void collectionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collectionMouseReleased
        // TODO add your handling code here:
        p1.setBackground(defaultcolor);
    }//GEN-LAST:event_collectionMouseReleased

    private void necklaceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_necklaceMousePressed
        // TODO add your handling code here:
        p1.setBackground(defaultcolor);
        p2.setBackground(clickedcolor);
        p3.setBackground(defaultcolor);
        p4.setBackground(defaultcolor);
        p5.setBackground(defaultcolor);
        necklace.setForeground(white);
    }//GEN-LAST:event_necklaceMousePressed

    private void necklaceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_necklaceMouseReleased
        // TODO add your handling code here:
        p2.setBackground(defaultcolor);
    }//GEN-LAST:event_necklaceMouseReleased

    private void braceletMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_braceletMousePressed
        // TODO add your handling code here:
       p1.setBackground(defaultcolor);
        p2.setBackground(defaultcolor);
        p3.setBackground(clickedcolor);
        p4.setBackground(defaultcolor);
        p5.setBackground(defaultcolor);
        bracelet.setForeground(white); 
    }//GEN-LAST:event_braceletMousePressed

    private void braceletMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_braceletMouseReleased
        // TODO add your handling code here:
       p3.setBackground(defaultcolor); 
    }//GEN-LAST:event_braceletMouseReleased

    private void ringsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ringsMousePressed
        // TODO add your handling code here:
        p1.setBackground(defaultcolor);
        p2.setBackground(defaultcolor);
        p3.setBackground(defaultcolor);
        p4.setBackground(clickedcolor);
        p5.setBackground(defaultcolor);
        rings.setForeground(white); 
    }//GEN-LAST:event_ringsMousePressed

    private void ringsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ringsMouseReleased
        // TODO add your handling code here:
        p4.setBackground(defaultcolor); 
    }//GEN-LAST:event_ringsMouseReleased

    private void earringsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_earringsMousePressed
        // TODO add your handling code here:
        p1.setBackground(defaultcolor);
        p2.setBackground(defaultcolor);
        p3.setBackground(defaultcolor);
        p4.setBackground(defaultcolor);
        p5.setBackground(clickedcolor);
        earrings.setForeground(white); 
    }//GEN-LAST:event_earringsMousePressed

    private void earringsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_earringsMouseReleased
        // TODO add your handling code here:
        p5.setBackground(defaultcolor); 
    }//GEN-LAST:event_earringsMouseReleased

    private void collection3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection3MouseClicked

    private void collection3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection3MousePressed

    private void collection3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection3MouseReleased

    private void collection4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection4MouseClicked

    private void collection4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection4MousePressed

    private void collection4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection4MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection4MouseReleased

    private void collection5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection5MouseClicked

    private void collection5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection5MousePressed

    private void collection5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection5MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection5MouseReleased

    private void collection6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection6MouseClicked

    private void collection6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection6MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection6MousePressed

    private void collection6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection6MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection6MouseReleased

    private void collection7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection7MouseClicked

    private void collection7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection7MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection7MousePressed

    private void collection7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection7MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection7MouseReleased

    private void collection8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection8MouseClicked

    private void collection8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection8MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection8MousePressed

    private void collection8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection8MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection8MouseReleased

    private void collection9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection9MouseClicked

    private void collection9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection9MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection9MousePressed

    private void collection9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection9MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection9MouseReleased

    private void collection10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection10MouseClicked

    private void collection10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection10MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection10MousePressed

    private void collection10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection10MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection10MouseReleased

    private void collection11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection11MouseClicked

    private void collection11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection11MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection11MousePressed

    private void collection11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection11MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection11MouseReleased

    private void collection12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection12MouseClicked

    private void collection12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection12MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection12MousePressed

    private void collection12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection12MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection12MouseReleased

    private void collection13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection13MouseClicked

    private void collection13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection13MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection13MousePressed

    private void collection13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection13MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection13MouseReleased

    private void collection14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection14MouseClicked

    private void collection14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection14MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection14MousePressed

    private void collection14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection14MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection14MouseReleased

    private void collection15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection15MouseClicked

    private void collection15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection15MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection15MousePressed

    private void collection15MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection15MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection15MouseReleased

    private void collection16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection16MouseClicked

    private void collection16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection16MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection16MousePressed

    private void collection16MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection16MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection16MouseReleased

    private void collection17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection17MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection17MouseClicked

    private void collection17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection17MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection17MousePressed

    private void collection17MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection17MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection17MouseReleased

    private void collection18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection18MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection18MouseClicked

    private void collection18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection18MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection18MousePressed

    private void collection18MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection18MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection18MouseReleased

    private void collection19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection19MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection19MouseClicked

    private void collection19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection19MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection19MousePressed

    private void collection19MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection19MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection19MouseReleased

    private void collection20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection20MouseClicked

    private void collection20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection20MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection20MousePressed

    private void collection20MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection20MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection20MouseReleased

    private void collection21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection21MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection21MouseClicked

    private void collection21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection21MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection21MousePressed

    private void collection21MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection21MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection21MouseReleased

    private void collection22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection22MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection22MouseClicked

    private void collection22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection22MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection22MousePressed

    private void collection22MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection22MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection22MouseReleased

    private void collection23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection23MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection23MouseClicked

    private void collection23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection23MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection23MousePressed

    private void collection23MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection23MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection23MouseReleased

    private void collection24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection24MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection24MouseClicked

    private void collection24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection24MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection24MousePressed

    private void collection24MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection24MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection24MouseReleased

    private void collection25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection25MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection25MouseClicked

    private void collection25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection25MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection25MousePressed

    private void collection25MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection25MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection25MouseReleased

    private void collection26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection26MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection26MouseClicked

    private void collection26MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection26MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection26MousePressed

    private void collection26MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection26MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection26MouseReleased

    private void collection35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection35MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection35MouseClicked

    private void collection35MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection35MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection35MousePressed

    private void collection35MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection35MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection35MouseReleased

    private void collection36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection36MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection36MouseClicked

    private void collection36MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection36MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection36MousePressed

    private void collection36MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection36MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection36MouseReleased

    private void collection37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection37MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection37MouseClicked

    private void collection37MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection37MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection37MousePressed

    private void collection37MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection37MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection37MouseReleased

    private void collection38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection38MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection38MouseClicked

    private void collection38MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection38MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection38MousePressed

    private void collection38MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection38MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection38MouseReleased

    private void collection39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection39MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection39MouseClicked

    private void collection39MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection39MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection39MousePressed

    private void collection39MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection39MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection39MouseReleased

    private void collection40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection40MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection40MouseClicked

    private void collection40MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection40MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection40MousePressed

    private void collection40MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection40MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection40MouseReleased

    private void collection41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection41MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection41MouseClicked

    private void collection41MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection41MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection41MousePressed

    private void collection41MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection41MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection41MouseReleased

    private void collection42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection42MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection42MouseClicked

    private void collection42MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection42MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection42MousePressed

    private void collection42MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection42MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection42MouseReleased

    private void collection27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection27MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection27MouseClicked

    private void collection27MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection27MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection27MousePressed

    private void collection27MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection27MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection27MouseReleased

    private void collection28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection28MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection28MouseClicked

    private void collection28MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection28MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection28MousePressed

    private void collection28MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection28MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection28MouseReleased

    private void collection29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection29MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection29MouseClicked

    private void collection29MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection29MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection29MousePressed

    private void collection29MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection29MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection29MouseReleased

    private void collection30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection30MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection30MouseClicked

    private void collection30MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection30MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection30MousePressed

    private void collection30MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection30MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection30MouseReleased

    private void collection31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection31MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection31MouseClicked

    private void collection31MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection31MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection31MousePressed

    private void collection31MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection31MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection31MouseReleased

    private void collection32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection32MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection32MouseClicked

    private void collection32MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection32MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection32MousePressed

    private void collection32MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection32MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection32MouseReleased

    private void collection33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection33MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection33MouseClicked

    private void collection33MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection33MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection33MousePressed

    private void collection33MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection33MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection33MouseReleased

    private void collection34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection34MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection34MouseClicked

    private void collection34MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection34MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection34MousePressed

    private void collection34MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection34MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection34MouseReleased

    private void collection1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_collection1MouseClicked

    private void collection1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_collection1MousePressed

    private void collection1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_collection1MouseReleased

    private void rings1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rings1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rings1MouseClicked

    private void rings1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rings1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_rings1MousePressed

    private void rings1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rings1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_rings1MouseReleased

    private void bracelet1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bracelet1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bracelet1MouseClicked

    private void bracelet1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bracelet1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_bracelet1MousePressed

    private void bracelet1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bracelet1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_bracelet1MouseReleased

    private void earrings1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_earrings1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_earrings1MouseClicked

    private void earrings1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_earrings1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_earrings1MousePressed

    private void earrings1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_earrings1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_earrings1MouseReleased

    private void necklace1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_necklace1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_necklace1MouseClicked

    private void necklace1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_necklace1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_necklace1MousePressed

    private void necklace1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_necklace1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_necklace1MouseReleased

    private void myCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myCartMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_myCartMouseClicked

    private void jLabel93MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel93MouseClicked
        // TODO add your handling code here
        LoginFrame login;
       JOptionPane.showMessageDialog(this, "Logging out.");
        LoginFrame LoginFrame = login = new LoginFrame();
        login.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jLabel93MouseClicked

    private void c1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_c1MouseClicked

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
       
       //delete row
        
       if (tableModel.getSelectedRowCount() == 1){
           
           tableModelPanel.removeRow(tableModel.getSelectedRow());
           
           
       }
       else{
           if(tableModel.getRowCount() == 0){
               
               JOptionPane.showMessageDialog(this, "Cart is Empty!");
               
               
           } else{
              JOptionPane.showMessageDialog(this, "Please Select an item to delete."); 
           }
       }
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
        
     
      
     JButton c111 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Celtic Knot";
        int productPrice = 27000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(c1, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
        cartStack.push(product);
    } 
        
         
           
        
        
    }//GEN-LAST:event_c1ActionPerformed

    private void c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c7ActionPerformed
        // TODO add your handling code here:
        JButton c77 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Silver Halo";
        int productPrice = 9000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(c7, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
        cartStack.push(product);
     }
    }//GEN-LAST:event_c7ActionPerformed

    private void c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c8ActionPerformed
        // TODO add your handling code here:
        JButton c88 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Bolcaci Soulmate";
        int productPrice = 22000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(c8, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
        cartStack.push(product);
     }
    }//GEN-LAST:event_c8ActionPerformed

    private void tableModelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableModelMouseClicked
         DefaultTableModel table = (DefaultTableModel) tableModel.getModel();

    // Assuming "productName" is the name of the product
    String productName = table.getValueAt(tableModel.getSelectedRow(), 0).toString();
    String productPrice = table.getValueAt(tableModel.getSelectedRow(), 1).toString();

    // Check if the item is already in the cart
    if (cartStack.contains(productName)) {
        // If it's in the cart, remove it (pop from the stack)
        cartStack.remove(productName);
        System.out.println("Removed item from cart: " + productName);
    } else {
        // If it's not in the cart, add it (push onto the stack)
        cartStack.push(productName);
        System.out.println("Added item to cart: " + productName);
    }

    // You can update the UI or perform other actions based on the cart status
    updateCartUI();

    // ... Other existing code ...
}

private void updateCartUI() {
    // You can update the UI to reflect the current state of the cart
    // For example, you might want to highlight or mark items in the table
    // that are currently in the cart

        
        
        
    }//GEN-LAST:event_tableModelMouseClicked

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        // TODO add your handling code here:
         JButton c22 = (JButton) evt.getSource();
       DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Moment Wish";
        int productPrice = 8000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(c2, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
          cartStack.push(product);
    } 
    }//GEN-LAST:event_c2ActionPerformed

    private void c2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c2MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_c2MouseClicked

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
        // TODO add your handling code here:
         JButton c33 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Teardrop Filigree";
        int productPrice = 15000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(c3, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
          cartStack.push(product);
    } 
    }//GEN-LAST:event_c3ActionPerformed

    private void c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4ActionPerformed
        // TODO add your handling code here:
        JButton c44 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Dancing Moissanite";
        int productPrice = 18000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(c4, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
          cartStack.push(product);
     }
    }//GEN-LAST:event_c4ActionPerformed

    private void c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c5ActionPerformed
        // TODO add your handling code here:
        JButton c55 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Twisted Vine";
        int productPrice = 21000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(c5, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
          cartStack.push(product);
     }
    }//GEN-LAST:event_c5ActionPerformed

    private void c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c6ActionPerformed
        // TODO add your handling code here:
        JButton c66 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Dangle Drop";
        int productPrice = 6000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(c6, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
          cartStack.push(product);
     }
    }//GEN-LAST:event_c6ActionPerformed

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
        // TODO add your handling code here:
        JButton n11 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Royal Elegance";
        int productPrice = 12000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(n1, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
          cartStack.push(product);
     }
    }//GEN-LAST:event_n1ActionPerformed

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed
        // TODO add your handling code here:
         JButton n22 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Diamond Symphony";
        int productPrice = 24000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(n2, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
          cartStack.push(product);
     }

    }//GEN-LAST:event_n2ActionPerformed

    private void n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n3ActionPerformed
        // TODO add your handling code here:
         JButton n33 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Opulent Splendor";
        int productPrice = 17000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(n3, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
          cartStack.push(product);
     }

    }//GEN-LAST:event_n3ActionPerformed

    private void n4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n4ActionPerformed
        // TODO add your handling code here:
         JButton n44 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Exquisite Brilliance";
        int productPrice = 20000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(n4, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
          cartStack.push(product);
     }

    }//GEN-LAST:event_n4ActionPerformed

    private void n5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n5ActionPerformed
        // TODO add your handling code here:
         JButton n55 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Regal Treasures";
        int productPrice = 14000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(n5, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
          cartStack.push(product);
     }
    }//GEN-LAST:event_n5ActionPerformed

    private void n6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n6ActionPerformed
        // TODO add your handling code here:
         JButton n66 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Dancing Moissanite";
        int productPrice = 18000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(n6, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
          cartStack.push(product);
     }
    }//GEN-LAST:event_n6ActionPerformed

    private void n7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n7ActionPerformed
        // TODO add your handling code here:
         JButton n77 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Celtic Knot";
        int productPrice = 27000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(n7, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
          cartStack.push(product);
     }
    }//GEN-LAST:event_n7ActionPerformed

    private void n8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n8ActionPerformed
        // TODO add your handling code here:
         JButton n88 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Pearl Radiance";
        int productPrice = 23000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(n8, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
          cartStack.push(product);
     }
    }//GEN-LAST:event_n8ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        JButton b11 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Opulent Opaline";
        int productPrice = 15000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(b1, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
         cartStack.push(product);
     }
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
         JButton b22 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Sapphire Splendor";
        int productPrice = 13000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(b2, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
        
         cartStack.push(product);
     }
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        JButton b33 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Pearlescent Perfection";
        int productPrice = 13000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(b3, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
        
         cartStack.push(product);
     }
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
         JButton b44 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Twilight Twilight Cuff";
        int productPrice = 11000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(b4, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
        
        
         cartStack.push(product);
     }
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
        JButton b55 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Twisted Vine";
        int productPrice = 21000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(b5, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
        
        
         cartStack.push(product);
     } 
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
        JButton b66 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Platinum Pinnacle";
        int productPrice = 17000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(b6, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
        
        
         cartStack.push(product);
     } 
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
        JButton b77 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Exquisite Ivory Wings";
        int productPrice = 14000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(b7, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
        
         cartStack.push(product);
     } 
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
        JButton b88 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Bolcaci Soulmate";
        int productPrice = 22000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(b8, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
        
        
         cartStack.push(product);
     } 
     
    }//GEN-LAST:event_b8ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
        JButton r11 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Diamond Deluge";
        int productPrice = 31000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(r1, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
        
         cartStack.push(product);
     } 
    }//GEN-LAST:event_r1ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        // TODO add your handling code here:
        JButton r22 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Moment Wish";
        int productPrice = 8000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(r2, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
        
         cartStack.push(product);
     } 
    }//GEN-LAST:event_r2ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        // TODO add your handling code here:
        JButton r33 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Baroque Pearl Bliss";
        int productPrice = 28000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(r3, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
        
        
         cartStack.push(product);
     } 
    }//GEN-LAST:event_r3ActionPerformed

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
        // TODO add your handling code here:
        JButton r44 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Crimson Crown";
        int productPrice = 22000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(r4, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
        
        
         cartStack.push(product);
     } 
    }//GEN-LAST:event_r4ActionPerformed

    private void r5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5ActionPerformed
        // TODO add your handling code here:
         JButton r55 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Pearlescent Dream";
        int productPrice = 18000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(r5, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
        
        
         cartStack.push(product);
     } 
    }//GEN-LAST:event_r5ActionPerformed

    private void r6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6ActionPerformed
        // TODO add your handling code here:
        JButton r66 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Platinum Enigma";
        int productPrice = 23000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(r6, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
        
         cartStack.push(product);
     } 
    }//GEN-LAST:event_r6ActionPerformed

    private void r7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7ActionPerformed
        // TODO add your handling code here:
        JButton r77 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Silver Halo";
        int productPrice = 9000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(r7, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
        
         cartStack.push(product);
     }
    }//GEN-LAST:event_r7ActionPerformed

    private void r8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8ActionPerformed
        // TODO add your handling code here:
         JButton r88 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Champagne Cascade";
        int productPrice = 12000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(r8, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
        
         cartStack.push(product);
     }
    }//GEN-LAST:event_r8ActionPerformed

    private void e1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e1ActionPerformed
        // TODO add your handling code here:
         JButton e11 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Diamond Cascade Dangles";
        int productPrice = 4000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(e1, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
        
         cartStack.push(product);
     }
    }//GEN-LAST:event_e1ActionPerformed

    private void e2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e2ActionPerformed
        // TODO add your handling code here:
        JButton e22 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Platinum Perfection Drops";
        int productPrice = 2500;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(e2, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
        
         cartStack.push(product);
     }
    }//GEN-LAST:event_e2ActionPerformed

    private void e3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e3ActionPerformed
        // TODO add your handling code here:
        JButton e33 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Teardrop Filigree";
        int productPrice = 15000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(e3, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
        
         cartStack.push(product);
     }
    }//GEN-LAST:event_e3ActionPerformed

    private void e4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e4ActionPerformed
        // TODO add your handling code here:
         JButton e44 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Emerald Vine Ear Crawlers";
        int productPrice = 10000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(e4, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
        
         cartStack.push(product);
     }
    }//GEN-LAST:event_e4ActionPerformed

    private void e5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e5ActionPerformed
        // TODO add your handling code here:
          JButton e55 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Chandelier Diamond Delights";
        int productPrice = 16000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(e5, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
        
         cartStack.push(product);
     }
    }//GEN-LAST:event_e5ActionPerformed

    private void e6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e6ActionPerformed
        // TODO add your handling code here:
          JButton e66 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Dangle Drop";
        int productPrice = 6000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(e6, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
        
         cartStack.push(product);
     }
    }//GEN-LAST:event_e6ActionPerformed

    private void e7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e7ActionPerformed
        // TODO add your handling code here:
         JButton e77 = (JButton) evt.getSource();
     DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();
     {
        String product = "Platinum Petal Dusters";
        int productPrice = 8000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(e7, "Item added to cart");
        // Refresh the table
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;
         cartStack.push(product);
     }
    }//GEN-LAST:event_e7ActionPerformed

    private void e8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e8ActionPerformed
        // TODO add your handling code here:
         JButton e88 = (JButton) evt.getSource();
        DefaultTableModel tableModelPanel = (DefaultTableModel) tableModel.getModel();

        String product = "Opulent Pearl Pendants";
        int productPrice = 4000;
        tableModelPanel.addRow(new Object[]{product, productPrice});
        JOptionPane.showMessageDialog(e8, "Item added to cart");
        tableModel.revalidate();
        tableModel.repaint();
        buttonClicked = true;

        // Push the product to the cart stack
        cartStack.push(product);
     
    }//GEN-LAST:event_e8ActionPerformed

    private void showTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTotalActionPerformed
         
        
        int rowCount = tableModel.getRowCount();

        if (rowCount > 0) {
            int[] prefixSum = new int[rowCount];

            // Calculate prefix sum
            prefixSum[0] = Integer.parseInt(tableModel.getValueAt(0, 1).toString());
            for (int i = 1; i < rowCount; i++) {
                prefixSum[i] = prefixSum[i - 1] + Integer.parseInt(tableModel.getValueAt(i, 1).toString());
            }

            // Set the total in the txtTotal field
            txtTotal.setText(Integer.toString(prefixSum[rowCount - 1]));

            // Pass the total amount to the billingFrame
            billingFrame billing = new billingFrame();
            billing.setTotalAmount(Integer.toString(prefixSum[rowCount - 1]));
            billing.setVisible(true);
            
           
        } else {
            // Handle case when there are no rows in the table
            txtTotal.setText("0");
        }
        
          
    
    
      

                    
    }//GEN-LAST:event_showTotalActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
         HomeFrame home;
        
            HomeFrame HomeFrame = home = new HomeFrame();
            home.setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void abouttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abouttMouseClicked
        // TODO add your handling code here:hh
         HomeFrame home;
        
            HomeFrame HomeFrame = home = new HomeFrame();
            home.setVisible(true);

    }//GEN-LAST:event_abouttMouseClicked
           
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShopFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         //</editor-fold>
         
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ShopFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutt;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JLabel bracelet;
    private javax.swing.JLabel bracelet1;
    private javax.swing.JPanel braceletTab;
    private javax.swing.JButton c1;
    private javax.swing.JPanel c11;
    private javax.swing.JButton c2;
    private javax.swing.JButton c3;
    private javax.swing.JButton c4;
    private javax.swing.JButton c5;
    private javax.swing.JButton c6;
    private javax.swing.JButton c7;
    private javax.swing.JButton c8;
    private javax.swing.JPanel cartTab;
    private javax.swing.JLabel collection;
    private javax.swing.JLabel collection1;
    private javax.swing.JLabel collection10;
    private javax.swing.JLabel collection11;
    private javax.swing.JLabel collection12;
    private javax.swing.JLabel collection13;
    private javax.swing.JLabel collection14;
    private javax.swing.JLabel collection15;
    private javax.swing.JLabel collection16;
    private javax.swing.JLabel collection17;
    private javax.swing.JLabel collection18;
    private javax.swing.JLabel collection19;
    private javax.swing.JLabel collection20;
    private javax.swing.JLabel collection21;
    private javax.swing.JLabel collection22;
    private javax.swing.JLabel collection23;
    private javax.swing.JLabel collection24;
    private javax.swing.JLabel collection25;
    private javax.swing.JLabel collection26;
    private javax.swing.JLabel collection27;
    private javax.swing.JLabel collection28;
    private javax.swing.JLabel collection29;
    private javax.swing.JLabel collection3;
    private javax.swing.JLabel collection30;
    private javax.swing.JLabel collection31;
    private javax.swing.JLabel collection32;
    private javax.swing.JLabel collection33;
    private javax.swing.JLabel collection34;
    private javax.swing.JLabel collection35;
    private javax.swing.JLabel collection36;
    private javax.swing.JLabel collection37;
    private javax.swing.JLabel collection38;
    private javax.swing.JLabel collection39;
    private javax.swing.JLabel collection4;
    private javax.swing.JLabel collection40;
    private javax.swing.JLabel collection41;
    private javax.swing.JLabel collection42;
    private javax.swing.JLabel collection5;
    private javax.swing.JLabel collection6;
    private javax.swing.JLabel collection7;
    private javax.swing.JLabel collection8;
    private javax.swing.JLabel collection9;
    private javax.swing.JPanel collectionTab;
    private javax.swing.JButton e1;
    private javax.swing.JButton e2;
    private javax.swing.JButton e3;
    private javax.swing.JButton e4;
    private javax.swing.JButton e5;
    private javax.swing.JButton e6;
    private javax.swing.JButton e7;
    private javax.swing.JButton e8;
    private javax.swing.JLabel earrings;
    private javax.swing.JLabel earrings1;
    private javax.swing.JPanel earringsTab;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel myCart;
    private javax.swing.JButton n1;
    private javax.swing.JButton n2;
    private javax.swing.JButton n3;
    private javax.swing.JButton n4;
    private javax.swing.JButton n5;
    private javax.swing.JButton n6;
    private javax.swing.JButton n7;
    private javax.swing.JButton n8;
    private javax.swing.JLabel necklace;
    private javax.swing.JLabel necklace1;
    private javax.swing.JPanel necklaceTab;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p10;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel p5;
    private javax.swing.JPanel p6;
    private javax.swing.JPanel p7;
    private javax.swing.JPanel p8;
    private javax.swing.JPanel p9;
    private javax.swing.JButton r1;
    private javax.swing.JButton r2;
    private javax.swing.JButton r3;
    private javax.swing.JButton r4;
    private javax.swing.JButton r5;
    private javax.swing.JButton r6;
    private javax.swing.JButton r7;
    private javax.swing.JButton r8;
    private javax.swing.JLabel rings;
    private javax.swing.JLabel rings1;
    private javax.swing.JPanel ringsTab;
    private javax.swing.JButton showTotal;
    private javax.swing.JTable tableModel;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    private static class cartTableModel {

        private static void addRow(Object[] object) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public cartTableModel() {
        }
    }

    private static class tableModel {

        public tableModel() {
        }
    }

    private static class table {

        public table() {
        }
    }

    }

        
        
        
    

    
    


   

