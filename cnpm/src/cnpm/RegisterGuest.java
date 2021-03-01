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
public class RegisterGuest extends javax.swing.JFrame {
    /**
     * Creates new form RegisterMember
     */
    upDateStaffPanel t;
    public String id;
    public RegisterGuest() {
    initComponents();
    this.setSize(490,330);
 
            //Ban đầu cho các lb ẩn
         
        lbErrorPhone.setVisible(false);
        lbErrorAddressEmpty.setVisible(false);
        lbErrorNameEmpty.setVisible(false);
        lbErrorPhoneEmpty.setVisible(false);
        lbErrorNameInvalid.setVisible(false);
        lbErrorPhoneExisting.setVisible(false);
        //Set nut update an
        btUpdate.setVisible(false);
        lbUpdate.setVisible(false);
        btDelete.setVisible(false);
        lbDelete.setVisible(false);
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
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        lbUpdate = new javax.swing.JLabel();
        lbRegister = new javax.swing.JLabel();
        btRegister = new javax.swing.JButton();
        txtSDT = new javax.swing.JTextField();
        btUpdate = new javax.swing.JButton();
        lbDelete = new javax.swing.JLabel();
        btDelete = new javax.swing.JButton();
        txtMinimize = new javax.swing.JLabel();
        txtExit = new javax.swing.JLabel();
        lbErrorNameInvalid = new javax.swing.JLabel();
        lbErrorNameEmpty = new javax.swing.JLabel();
        lbErrorPhone = new javax.swing.JLabel();
        lbErrorPhoneEmpty = new javax.swing.JLabel();
        lbErrorAddressEmpty = new javax.swing.JLabel();
        lbErrorPhoneExisting = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(209, 209, 224));
        setUndecorated(true);
        setOpacity(0.95F);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBackground.setBackground(new java.awt.Color(255, 255, 255));
        panelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRegister.setBackground(new java.awt.Color(51, 51, 51));
        panelRegister.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black), "Sign Up", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(255, 255, 102))); // NOI18N
        panelRegister.setPreferredSize(new java.awt.Dimension(250, 530));
        panelRegister.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Dubai Light", 2, 16)); // NOI18N
        txtName.setForeground(new java.awt.Color(51, 51, 51));
        txtName.setText("NAME*");
        txtName.setToolTipText("");
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 2, new java.awt.Color(0, 0, 0)));
        txtName.setCaretColor(new java.awt.Color(204, 0, 0));
        txtName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtName.setDisabledTextColor(new java.awt.Color(69, 73, 74));
        txtName.setDragEnabled(true);
        txtName.setSelectedTextColor(new java.awt.Color(69, 73, 74));
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });
        panelRegister.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 360, 50));

        txtAddress.setBackground(new java.awt.Color(255, 255, 255));
        txtAddress.setFont(new java.awt.Font("Dubai Light", 2, 16)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(51, 51, 51));
        txtAddress.setText("ADDRESS*");
        txtAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 2, new java.awt.Color(0, 0, 0)));
        txtAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAddressFocusLost(evt);
            }
        });
        panelRegister.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 360, 50));

        lbUpdate.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        lbUpdate.setForeground(new java.awt.Color(255, 255, 102));
        lbUpdate.setText("UPDATE");
        panelRegister.add(lbUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 120, 30));

        lbRegister.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        lbRegister.setForeground(new java.awt.Color(255, 255, 102));
        lbRegister.setText("ADD");
        panelRegister.add(lbRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 140, 30));

        btRegister.setBackground(new java.awt.Color(102, 102, 102));
        btRegister.setForeground(new java.awt.Color(255, 255, 0));
        btRegister.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\button.png")); // NOI18N
        btRegister.setBorder(null);
        btRegister.setBorderPainted(false);
        btRegister.setContentAreaFilled(false);
        btRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegisterActionPerformed(evt);
            }
        });
        panelRegister.add(btRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 180, 70));

        txtSDT.setBackground(new java.awt.Color(255, 255, 255));
        txtSDT.setFont(new java.awt.Font("Dubai Light", 2, 16)); // NOI18N
        txtSDT.setForeground(new java.awt.Color(51, 51, 51));
        txtSDT.setText("PHONE NUMBER*");
        txtSDT.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 2, new java.awt.Color(0, 0, 0)));
        txtSDT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSDTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSDTFocusLost(evt);
            }
        });
        panelRegister.add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 360, 50));

        btUpdate.setBackground(new java.awt.Color(102, 102, 102));
        btUpdate.setForeground(new java.awt.Color(255, 255, 0));
        btUpdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\button.png")); // NOI18N
        btUpdate.setBorder(null);
        btUpdate.setBorderPainted(false);
        btUpdate.setContentAreaFilled(false);
        panelRegister.add(btUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 180, 70));

        lbDelete.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        lbDelete.setForeground(new java.awt.Color(255, 255, 102));
        lbDelete.setText("DELETE");
        panelRegister.add(lbDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 120, 30));

        btDelete.setBackground(new java.awt.Color(102, 102, 102));
        btDelete.setForeground(new java.awt.Color(255, 255, 0));
        btDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\button.png")); // NOI18N
        btDelete.setBorder(null);
        btDelete.setBorderPainted(false);
        btDelete.setContentAreaFilled(false);
        panelRegister.add(btDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 170, 70));

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
        panelRegister.add(txtMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 30, 20));

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
        panelRegister.add(txtExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 40, 20));

        panelBackground.add(panelRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 480));

        getContentPane().add(panelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 610));

        lbErrorNameInvalid.setFont(new java.awt.Font("DialogInput", 3, 16)); // NOI18N
        lbErrorNameInvalid.setForeground(new java.awt.Color(255, 92, 51));
        lbErrorNameInvalid.setText("Below 40 character");
        lbErrorNameInvalid.setToolTipText("");
        getContentPane().add(lbErrorNameInvalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 200, -1));

        lbErrorNameEmpty.setFont(new java.awt.Font("DialogInput", 3, 16)); // NOI18N
        lbErrorNameEmpty.setForeground(new java.awt.Color(255, 92, 51));
        lbErrorNameEmpty.setText("Name's empty");
        lbErrorNameEmpty.setToolTipText("");
        getContentPane().add(lbErrorNameEmpty, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 150, -1));

        lbErrorPhone.setFont(new java.awt.Font("DialogInput", 3, 16)); // NOI18N
        lbErrorPhone.setForeground(new java.awt.Color(255, 92, 51));
        lbErrorPhone.setText("Phone's invalid");
        getContentPane().add(lbErrorPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 180, 50));

        lbErrorPhoneEmpty.setFont(new java.awt.Font("DialogInput", 3, 16)); // NOI18N
        lbErrorPhoneEmpty.setForeground(new java.awt.Color(255, 92, 51));
        lbErrorPhoneEmpty.setText("Phone's empty");
        lbErrorPhoneEmpty.setToolTipText("");
        getContentPane().add(lbErrorPhoneEmpty, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 150, -1));

        lbErrorAddressEmpty.setFont(new java.awt.Font("DialogInput", 3, 16)); // NOI18N
        lbErrorAddressEmpty.setForeground(new java.awt.Color(255, 92, 51));
        lbErrorAddressEmpty.setText("Address's empty");
        lbErrorAddressEmpty.setToolTipText("");
        getContentPane().add(lbErrorAddressEmpty, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 150, -1));

        lbErrorPhoneExisting.setFont(new java.awt.Font("DialogInput", 3, 16)); // NOI18N
        lbErrorPhoneExisting.setForeground(new java.awt.Color(255, 92, 51));
        lbErrorPhoneExisting.setText("Phone's existing");
        getContentPane().add(lbErrorPhoneExisting, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 190, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents
                 
    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        // TODO add your handling code here:
               if(txtName.getText().trim().toUpperCase().equals(""))
               {
           txtName.setFont(new Font("Dubai Light", Font.ITALIC, 16));
           txtName.setForeground(new Color(51,51,51));
           txtName.setBackground(Color.white);
           txtName.setText("NAME*");   
               }
    }//GEN-LAST:event_txtNameFocusLost

    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained
        // TODO add your handling code here:
                if(txtName.getText().trim().toUpperCase().equals("NAME*"))
                {
           txtName.setFont(new Font("Dialog", Font.BOLD, 16));
           txtName.setForeground(new Color(10, 15, 15));
           txtName.setBackground(Color.white);
           txtName.setText("");
                }
           //do nothing
    }//GEN-LAST:event_txtNameFocusGained

    private void txtSDTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSDTFocusGained
          if(txtSDT.getText().trim().toUpperCase().equals("PHONE NUMBER*"))
          {
           txtSDT.setFont(new Font("Dialog", Font.BOLD, 16));
           txtSDT.setForeground(new Color(10, 15, 15));
           txtSDT.setText("");
          }
    }//GEN-LAST:event_txtSDTFocusGained

    private void txtSDTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSDTFocusLost
        // TODO add your handling code here:
                          if(txtSDT.getText().trim().toUpperCase().equals(""))
               {
           txtSDT.setFont(new Font("Dubai Light", Font.ITALIC, 16));
           txtSDT.setForeground(new Color(51,51,51));
           txtSDT.setText("PHONE NUMBER*"); 
               }
    }//GEN-LAST:event_txtSDTFocusLost

    private void txtAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusGained
        // TODO add your handling code here:
                  if(txtAddress.getText().trim().toUpperCase().equals("ADDRESS*"))
                  {
           txtAddress.setFont(new Font("Dialog", Font.BOLD, 16));
           txtAddress.setForeground(new Color(10, 15, 15));
           txtAddress.setText("");
                  }
    }//GEN-LAST:event_txtAddressFocusGained

    private void txtAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusLost
        // TODO add your handling code here:
             if(txtAddress.getText().trim().toUpperCase().equals(""))
               {
           txtAddress.setFont(new Font("Dubai Light", Font.ITALIC, 16));
           txtAddress.setForeground(new Color(51,51,51));
           txtAddress.setText("ADDRESS*"); 
               }
    }//GEN-LAST:event_txtAddressFocusLost

    private void btRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegisterActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_btRegisterActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterGuest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btDelete;
    public javax.swing.JButton btRegister;
    public javax.swing.JButton btUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JLabel lbDelete;
    public javax.swing.JLabel lbErrorAddressEmpty;
    public javax.swing.JLabel lbErrorNameEmpty;
    public javax.swing.JLabel lbErrorNameInvalid;
    public javax.swing.JLabel lbErrorPhone;
    public javax.swing.JLabel lbErrorPhoneEmpty;
    public javax.swing.JLabel lbErrorPhoneExisting;
    public javax.swing.JLabel lbRegister;
    public javax.swing.JLabel lbUpdate;
    private javax.swing.JPanel panelBackground;
    public javax.swing.JPanel panelRegister;
    public javax.swing.JTextField txtAddress;
    public javax.swing.JLabel txtExit;
    private javax.swing.JLabel txtMinimize;
    public javax.swing.JTextField txtName;
    public javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
}
