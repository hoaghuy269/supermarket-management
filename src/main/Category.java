/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author hoagh
 */
public class Category extends javax.swing.JFrame {

    /**
     * Creates new form Products
     */
    public Category() {
        initComponents();
        SelectCategory();
    }

    //Connect Database
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    
    public void SelectCategory() {
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SupermarketManagement","user1","12345");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from User1.CATEGORY");
            table_category.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txt_categoryid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_categorydesscription = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_categoryname = new javax.swing.JTextField();
        btn_deletecategory = new javax.swing.JButton();
        btn_addcategory = new javax.swing.JButton();
        btn_editcategory = new javax.swing.JButton();
        btn_clearcategory = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_category = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 450));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(245, 245, 245));

        txt_categoryid.setForeground(new java.awt.Color(0, 153, 153));

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel4.setText("ID");

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel5.setText("Name");

        txt_categorydesscription.setForeground(new java.awt.Color(0, 153, 153));

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel6.setText("Description");

        txt_categoryname.setForeground(new java.awt.Color(0, 153, 153));

        btn_deletecategory.setBackground(new java.awt.Color(0, 153, 153));
        btn_deletecategory.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        btn_deletecategory.setForeground(new java.awt.Color(255, 255, 255));
        btn_deletecategory.setText("DELETE");
        btn_deletecategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_deletecategoryMouseClicked(evt);
            }
        });

        btn_addcategory.setBackground(new java.awt.Color(0, 153, 153));
        btn_addcategory.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        btn_addcategory.setForeground(new java.awt.Color(255, 255, 255));
        btn_addcategory.setText("ADD");
        btn_addcategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addcategoryMouseClicked(evt);
            }
        });

        btn_editcategory.setBackground(new java.awt.Color(0, 153, 153));
        btn_editcategory.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        btn_editcategory.setForeground(new java.awt.Color(255, 255, 255));
        btn_editcategory.setText("EDIT");
        btn_editcategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editcategoryMouseClicked(evt);
            }
        });

        btn_clearcategory.setBackground(new java.awt.Color(0, 153, 153));
        btn_clearcategory.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        btn_clearcategory.setForeground(new java.awt.Color(255, 255, 255));
        btn_clearcategory.setText("CLEAR");
        btn_clearcategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clearcategoryMouseClicked(evt);
            }
        });

        table_category.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "Description"
            }
        ));
        table_category.setRowHeight(15);
        table_category.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_categoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_category);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btn_deletecategory, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_clearcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btn_addcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(btn_editcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt_categoryid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_categoryname, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_categorydesscription, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(40, 40, 40))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txt_categoryid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_categoryname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_categorydesscription))
                .addGap(84, 84, 84)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_addcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_clearcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_deletecategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CATEGORY");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addcategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addcategoryMouseClicked
        // TODO add your handling code here:
        if(txt_categoryname.getText().isEmpty() || txt_categoryid.getText().isEmpty() || txt_categorydesscription.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else {
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SupermarketManagement","user1","12345");
                PreparedStatement add = Con.prepareStatement("insert into CATEGORY values(?,?,?)");
                add.setInt(1, Integer.valueOf(txt_categoryid.getText()));
                add.setString(2, txt_categoryname.getText());
                add.setString(3, txt_categorydesscription.getText());
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Category Added Succesfully");
                Con.close();
                SelectCategory();
            
            } catch (Exception e) {
            e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_addcategoryMouseClicked

    private void table_categoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_categoryMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)table_category.getModel();
        int Myindex = table_category.getSelectedRow();
        txt_categoryid.setText(model.getValueAt(Myindex, 0).toString());
        txt_categoryname.setText(model.getValueAt(Myindex, 1).toString());
        txt_categorydesscription.setText(model.getValueAt(Myindex, 2).toString());
    }//GEN-LAST:event_table_categoryMouseClicked

    private void btn_clearcategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clearcategoryMouseClicked
        // TODO add your handling code here:
        txt_categoryid.setText("");
        txt_categoryname.setText("");
        txt_categorydesscription.setText("");
    }//GEN-LAST:event_btn_clearcategoryMouseClicked

    private void btn_deletecategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deletecategoryMouseClicked
        // TODO add your handling code here:
        if (txt_categoryid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter Staff To Be Deleted");
        }
        else {
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SupermarketManagement","user1","12345");
                String sid = txt_categoryid.getText();
                String querry = "Delete from User1.CATEGORY where CATEGORY_ID = "+ sid;
                Statement add = Con.createStatement();
                add.executeUpdate(querry);
                SelectCategory();
                JOptionPane.showMessageDialog(this, "Category Delete Successfully");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_deletecategoryMouseClicked

    private void btn_editcategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editcategoryMouseClicked
        // TODO add your handling code here:
        if(txt_categoryid.getText().isEmpty() || txt_categoryname.getText().isEmpty() || txt_categorydesscription.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else {
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SupermarketManagement","user1","12345");
                String querry = "Update User1.CATEGORY set CATEGORY_NAME = '" + txt_categoryname.getText() + "'" + ", CATEGORY_DESC = '" + txt_categorydesscription.getText() +"'" + "where CATEGORY_ID =" + txt_categoryid.getText();
                Statement add = Con.createStatement();
                add.execute(querry);
                JOptionPane.showMessageDialog(this, "Update Successfully");
                SelectCategory();
                
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_editcategoryMouseClicked

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
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addcategory;
    private javax.swing.JButton btn_clearcategory;
    private javax.swing.JButton btn_deletecategory;
    private javax.swing.JButton btn_editcategory;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_category;
    private javax.swing.JTextField txt_categorydesscription;
    private javax.swing.JTextField txt_categoryid;
    private javax.swing.JTextField txt_categoryname;
    // End of variables declaration//GEN-END:variables
}
