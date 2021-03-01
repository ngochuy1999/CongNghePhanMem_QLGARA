/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cnpm;

import static cnpm.Connecting.Connect;
import java.sql.ResultSet;
import java.sql.Connection;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.processing.Messager;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;


/**
 *
 * @author USER
 */
public class AddAccessories extends javax.swing.JFrame {
    /**
     * Creates new form RegisterMember
     */
    upDateStaffPanel t;
    public String id;
    public AddAccessories() {
    initComponents();
    loadBrandName();
    
            //Ban đầu cho các lb ẩn
        lbErrorPrice.setVisible(false);
        lBErrorQuantity.setVisible(false);
        lbErrorQuantityEmpty.setVisible(false);
        lbErrorPriceEmpty.setVisible(false);
        lbErrorAccessNameEmpty.setVisible(false);
        lbErrorAccessName.setVisible(false);
        lbErrorAccessExisting.setVisible(false);
        setSize(400,330);
        //Set nut update an
        btUpdate.setVisible(false);
        lbUpdate.setVisible(false);
        btDelete.setVisible(false);
        lbDelete.setVisible(false);
   // this.getContentPane().setBackground(new Color(51,0,51));
   
    this.getContentPane().setBackground(new Color(209, 209, 224));
    this.setLocationRelativeTo(null);
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
        panelBackground = new javax.swing.JPanel();
        panelRegister = new javax.swing.JPanel();
        txtAccessoriesName = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        cbBrandName = new javax.swing.JComboBox<>();
        lbUpdate = new javax.swing.JLabel();
        lbAdd = new javax.swing.JLabel();
        btAdd = new javax.swing.JButton();
        txtPrice = new javax.swing.JTextField();
        btUpdate = new javax.swing.JButton();
        lbDelete = new javax.swing.JLabel();
        btDelete = new javax.swing.JButton();
        txtMinimize = new javax.swing.JLabel();
        txtExit = new javax.swing.JLabel();
        lbErrorAccessName = new javax.swing.JLabel();
        lbErrorAccessNameEmpty = new javax.swing.JLabel();
        lbErrorQuantityEmpty = new javax.swing.JLabel();
        lBErrorQuantity = new javax.swing.JLabel();
        lbErrorPrice = new javax.swing.JLabel();
        lbErrorPriceEmpty = new javax.swing.JLabel();
        lbErrorAccessExisting = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(92, 92, 138));
        setUndecorated(true);
        setOpacity(0.95F);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBackground.setBackground(new java.awt.Color(255, 255, 255));
        panelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRegister.setBackground(new java.awt.Color(51, 51, 51));
        panelRegister.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black), "Adding Accessories", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(255, 255, 102))); // NOI18N
        panelRegister.setPreferredSize(new java.awt.Dimension(250, 530));
        panelRegister.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAccessoriesName.setBackground(new java.awt.Color(255, 255, 255));
        txtAccessoriesName.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        txtAccessoriesName.setForeground(new java.awt.Color(0, 0, 0));
        txtAccessoriesName.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 2, new java.awt.Color(0, 0, 0)));
        txtAccessoriesName.setCaretColor(new java.awt.Color(204, 0, 0));
        txtAccessoriesName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtAccessoriesName.setDisabledTextColor(new java.awt.Color(69, 73, 74));
        txtAccessoriesName.setDragEnabled(true);
        txtAccessoriesName.setSelectedTextColor(new java.awt.Color(69, 73, 74));
        txtAccessoriesName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAccessoriesNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAccessoriesNameFocusLost(evt);
            }
        });
        panelRegister.add(txtAccessoriesName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 240, 50));

        txtQuantity.setBackground(new java.awt.Color(255, 255, 255));
        txtQuantity.setFont(new java.awt.Font("Dubai Light", 2, 16)); // NOI18N
        txtQuantity.setForeground(new java.awt.Color(133, 173, 173));
        txtQuantity.setText("QUANTITY*");
        txtQuantity.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 2, new java.awt.Color(0, 0, 0)));
        txtQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQuantityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQuantityFocusLost(evt);
            }
        });
        panelRegister.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 360, 50));

        cbBrandName.setBackground(new java.awt.Color(255, 255, 255));
        cbBrandName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbBrandName.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 2, new java.awt.Color(0, 0, 0)));
        panelRegister.add(cbBrandName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 110, 50));

        lbUpdate.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        lbUpdate.setForeground(new java.awt.Color(255, 255, 102));
        lbUpdate.setText("UPDATE");
        panelRegister.add(lbUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 120, 30));

        lbAdd.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        lbAdd.setForeground(new java.awt.Color(255, 255, 102));
        lbAdd.setText("ADD");
        panelRegister.add(lbAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 140, 30));

        btAdd.setBackground(new java.awt.Color(102, 102, 102));
        btAdd.setForeground(new java.awt.Color(255, 255, 0));
        btAdd.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\button.png")); // NOI18N
        btAdd.setBorder(null);
        btAdd.setBorderPainted(false);
        btAdd.setContentAreaFilled(false);
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });
        panelRegister.add(btAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 180, 70));

        txtPrice.setBackground(new java.awt.Color(255, 255, 255));
        txtPrice.setFont(new java.awt.Font("Dubai Light", 2, 16)); // NOI18N
        txtPrice.setForeground(new java.awt.Color(133, 173, 173));
        txtPrice.setText("PRICE*");
        txtPrice.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 2, new java.awt.Color(0, 0, 0)));
        txtPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPriceFocusLost(evt);
            }
        });
        panelRegister.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 360, 50));

        btUpdate.setBackground(new java.awt.Color(102, 102, 102));
        btUpdate.setForeground(new java.awt.Color(255, 255, 0));
        btUpdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\button.png")); // NOI18N
        btUpdate.setBorder(null);
        btUpdate.setBorderPainted(false);
        btUpdate.setContentAreaFilled(false);
        panelRegister.add(btUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 180, 70));

        lbDelete.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        lbDelete.setForeground(new java.awt.Color(255, 255, 102));
        lbDelete.setText("DELETE");
        panelRegister.add(lbDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 120, 30));

        btDelete.setBackground(new java.awt.Color(102, 102, 102));
        btDelete.setForeground(new java.awt.Color(255, 255, 0));
        btDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\button.png")); // NOI18N
        btDelete.setBorder(null);
        btDelete.setBorderPainted(false);
        btDelete.setContentAreaFilled(false);
        panelRegister.add(btDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 170, 70));

        txtMinimize.setBackground(new java.awt.Color(51, 51, 51));
        txtMinimize.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        txtMinimize.setForeground(new java.awt.Color(255, 255, 102));
        txtMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMinimize.setText("-");
        txtMinimize.setOpaque(true);
        txtMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtMinimizeMouseExited(evt);
            }
        });
        panelRegister.add(txtMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 30, 20));

        txtExit.setBackground(new java.awt.Color(51, 51, 51));
        txtExit.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        txtExit.setForeground(new java.awt.Color(255, 255, 102));
        txtExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtExit.setText("x");
        txtExit.setOpaque(true);
        txtExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtExitMouseExited(evt);
            }
        });
        panelRegister.add(txtExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 40, 20));

        panelBackground.add(panelRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 610));

        getContentPane().add(panelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 610));

        lbErrorAccessName.setFont(new java.awt.Font("DialogInput", 3, 16)); // NOI18N
        lbErrorAccessName.setForeground(new java.awt.Color(255, 92, 51));
        lbErrorAccessName.setText("Below 30 character");
        lbErrorAccessName.setToolTipText("");
        getContentPane().add(lbErrorAccessName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 200, 50));

        lbErrorAccessNameEmpty.setFont(new java.awt.Font("DialogInput", 3, 16)); // NOI18N
        lbErrorAccessNameEmpty.setForeground(new java.awt.Color(255, 92, 51));
        lbErrorAccessNameEmpty.setText("Access name's empty");
        lbErrorAccessNameEmpty.setToolTipText("");
        getContentPane().add(lbErrorAccessNameEmpty, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 190, -1));

        lbErrorQuantityEmpty.setFont(new java.awt.Font("DialogInput", 3, 16)); // NOI18N
        lbErrorQuantityEmpty.setForeground(new java.awt.Color(255, 92, 51));
        lbErrorQuantityEmpty.setText("Quantity empty");
        lbErrorQuantityEmpty.setToolTipText("");
        getContentPane().add(lbErrorQuantityEmpty, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 150, -1));

        lBErrorQuantity.setFont(new java.awt.Font("DialogInput", 3, 16)); // NOI18N
        lBErrorQuantity.setForeground(new java.awt.Color(255, 92, 51));
        lBErrorQuantity.setText("Quantity's invalid");
        lBErrorQuantity.setToolTipText("");
        getContentPane().add(lBErrorQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 190, -1));

        lbErrorPrice.setFont(new java.awt.Font("DialogInput", 3, 16)); // NOI18N
        lbErrorPrice.setForeground(new java.awt.Color(255, 92, 51));
        lbErrorPrice.setText("Price's invalid");
        getContentPane().add(lbErrorPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 180, 50));

        lbErrorPriceEmpty.setFont(new java.awt.Font("DialogInput", 3, 16)); // NOI18N
        lbErrorPriceEmpty.setForeground(new java.awt.Color(255, 92, 51));
        lbErrorPriceEmpty.setText("Price's empty");
        lbErrorPriceEmpty.setToolTipText("");
        getContentPane().add(lbErrorPriceEmpty, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 150, -1));

        lbErrorAccessExisting.setFont(new java.awt.Font("DialogInput", 3, 16)); // NOI18N
        lbErrorAccessExisting.setForeground(new java.awt.Color(255, 92, 51));
        lbErrorAccessExisting.setText("Access's existing");
        lbErrorAccessExisting.setToolTipText("");
        getContentPane().add(lbErrorAccessExisting, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 200, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents
                 
    private void txtAccessoriesNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAccessoriesNameFocusLost
        // TODO add your handling code here:
               if(txtAccessoriesName.getText().trim().toUpperCase().equals(""))
               {
           txtAccessoriesName.setFont(new Font("Dubai Light", Font.ITALIC, 16));
           txtAccessoriesName.setForeground(new Color(133,173,173));
           txtAccessoriesName.setBackground(Color.white);
           txtAccessoriesName.setText("ACCESSORIES NAME*");   
               }
    }//GEN-LAST:event_txtAccessoriesNameFocusLost

    private void txtAccessoriesNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAccessoriesNameFocusGained
        // TODO add your handling code here:
                if(txtAccessoriesName.getText().trim().toUpperCase().equals("ACCESSORIES NAME*"))
                {
           txtAccessoriesName.setFont(new Font("Dialog", Font.BOLD, 16));
           txtAccessoriesName.setForeground(new Color(10, 15, 15));
           txtAccessoriesName.setBackground(Color.white);
           txtAccessoriesName.setText("");
                }
           //do nothing
    }//GEN-LAST:event_txtAccessoriesNameFocusGained

    private void txtQuantityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantityFocusGained
        // TODO add your handling code here:
            if(txtQuantity.getText().trim().toUpperCase().equals("QUANTITY*"))
            {
           txtQuantity.setFont(new Font("Dialog", Font.BOLD, 16));
           txtQuantity.setForeground(new Color(10, 15, 15));
           txtQuantity.setText("");
               }
    }//GEN-LAST:event_txtQuantityFocusGained

    private void txtQuantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantityFocusLost
        // TODO add your handling code here:
             if(txtQuantity.getText().trim().toUpperCase().equals(""))
               {
           txtQuantity.setFont(new Font("Dubai Light", Font.ITALIC, 16));
           txtQuantity.setForeground(new Color(133,173,173));
           txtQuantity.setText("QUANTITY*"); 
               }
    }//GEN-LAST:event_txtQuantityFocusLost

    private void txtPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPriceFocusGained
        // TODO add your handling code here:
                    if(txtPrice.getText().trim().toUpperCase().equals("PRICE*"))
                  {
           txtPrice.setFont(new Font("Dialog", Font.BOLD, 16));
           txtPrice.setForeground(new Color(10, 15, 15));
           txtPrice.setText("");
                  }
    }//GEN-LAST:event_txtPriceFocusGained

    private void txtPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPriceFocusLost
        // TODO add your handling code here:
                    if(txtPrice.getText().trim().toUpperCase().equals(""))
               {
           txtPrice.setFont(new Font("Dubai Light", Font.ITALIC, 16));
           txtPrice.setForeground(new Color(133,173,173));
           txtPrice.setText("PRICE*"); 
               }
        
    }//GEN-LAST:event_txtPriceFocusLost

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_btAddActionPerformed

    private void txtMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMinimizeMouseExited
        // TODO add your handling code here:
        txtMinimize.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_txtMinimizeMouseExited

    private void txtMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMinimizeMouseEntered
        // TODO add your handling code here:
        txtMinimize.setBackground(new Color(200, 0,0));
    }//GEN-LAST:event_txtMinimizeMouseEntered

    private void txtMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMinimizeMouseClicked
        // TODO add your handling code here:
        setState(this.ICONIFIED);
    }//GEN-LAST:event_txtMinimizeMouseClicked

    private void txtExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_txtExitMouseClicked

    private void txtExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseEntered
        // TODO add your handling code here:
        txtExit.setBackground(new Color(200, 0,0));
        
    }//GEN-LAST:event_txtExitMouseEntered

    private void txtExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseExited
        // TODO add your handling code here:
        txtExit.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_txtExitMouseExited

    /**
     * @param args the command line arguments
     */
//    private void createAccount(String userName,String password)
//    {
//        try {
//            Connection connect=Connect();
//            String sql1=" insert into Account values (?,?)";
//            PreparedStatement pr1=connect.prepareStatement(sql1);
//            pr1.setString(1, userName);
//            pr1.setString(2, password);
//            pr1.executeUpdate();
//            pr1.close();
//            connect.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(RegisterMember.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//   
// private void createStaff(String name,String userName,String sex,String position,String phoneNumber,String date,String address,String email)
// {
//        try {
//            Connection connect=Connect();
//            String sql=" insert into NhanVien (TENNV,USERNAME,GIOITINH,CHUCVU,SDT,NGAYSINH,DIACHI,EMAIL) values (?,?,?,?,?,?,?,?)";
//            PreparedStatement pr=connect.prepareStatement(sql);
//            pr.setString(1, name);
//            pr.setString(2, userName);
//            pr.setString(3, sex);
//            pr.setString(4, position);
//            pr.setString(5, phoneNumber);
//            pr.setString(6, date);
//            pr.setString(7, address);
//            pr.setString(8, email);
//            pr.executeUpdate();
//            pr.close();
//            connect.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(RegisterMember.class.getName()).log(Level.SEVERE, null, ex);
//        }
// }
    public void loadBrandName()
    {
        try {
            Connection c=Connect();
            String sql="select TENHANG FROM HANGXE";
            PreparedStatement pr=c.prepareStatement(sql);
            ResultSet rs=pr.executeQuery();
            Vector v;
            while(rs.next())
            {
            
                cbBrandName.addItem(rs.getString(1));
            }
            pr.close();
            rs.close();
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddAccessories.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
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
            java.util.logging.Logger.getLogger(AddAccessories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAccessories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAccessories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAccessories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddAccessories().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btAdd;
    public javax.swing.JButton btDelete;
    public javax.swing.JButton btUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JComboBox<String> cbBrandName;
    public javax.swing.JLabel lBErrorQuantity;
    public javax.swing.JLabel lbAdd;
    public javax.swing.JLabel lbDelete;
    public javax.swing.JLabel lbErrorAccessExisting;
    public javax.swing.JLabel lbErrorAccessName;
    public javax.swing.JLabel lbErrorAccessNameEmpty;
    public javax.swing.JLabel lbErrorPrice;
    public javax.swing.JLabel lbErrorPriceEmpty;
    public javax.swing.JLabel lbErrorQuantityEmpty;
    public javax.swing.JLabel lbUpdate;
    private javax.swing.JPanel panelBackground;
    public javax.swing.JPanel panelRegister;
    public javax.swing.JTextField txtAccessoriesName;
    public javax.swing.JLabel txtExit;
    private javax.swing.JLabel txtMinimize;
    public javax.swing.JTextField txtPrice;
    public javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
