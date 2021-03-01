/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cnpm;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class changePassWord extends javax.swing.JFrame {

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
        String user;
        boolean checkemty=true;
        boolean checkvalid=true;
    /**
     * Creates new form changePassWord
     */
    public changePassWord() {
        initComponents();
        txtUsername.setText(getUser());
        txtUsername.setEditable(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.white);
        this.setSize(400,350);
        lbErrorDifferent.setVisible(false);
        lbErrorEmpty.setVisible(false);
        lbErrorMatch.setVisible(false);
        lbHideConfirm.setVisible(false);
        lbHidePass.setVisible(false);
        lbShowConfir.setVisible(true);
        lbShowPass.setVisible(true);
            txtPassword.setFont(new Font("Dubai Light", Font.ITALIC, 16));
            txtPassword.setForeground(new Color(51,51,51));
                        txtPasswordConfirm.setFont(new Font("Dubai Light", Font.ITALIC, 16));
            txtPasswordConfirm.setForeground(new Color(51,51,51));
        
        
        lbShowPass.addMouseListener(new MouseAdapter() {
            
            public void mouseClicked(MouseEvent m)
            {
                      
                          txtPassword.setEchoChar((char)0);
                lbHidePass.setVisible(true);
                lbShowPass.setVisible(false);
            }
            
        });
        
         lbHidePass.addMouseListener(new MouseAdapter() {
            
            public void mouseClicked(MouseEvent m)
            {
                        txtPassword.setEchoChar('*');
        lbHidePass.setVisible(false);
        lbShowPass.setVisible(true);
            }
            
        });
         
         
                 lbShowConfir.addMouseListener(new MouseAdapter() {
            
            public void mouseClicked(MouseEvent m)
            {
             
                txtPasswordConfirm.setEchoChar((char)0);
                lbHideConfirm.setVisible(true);
                lbShowConfir.setVisible(false);
            }
             
            
        });
                 
                 
                     
            lbHideConfirm.addMouseListener(new MouseAdapter() {
            
            public void mouseClicked(MouseEvent m)
            {
             
                     txtPasswordConfirm.setEchoChar('*');
                lbHideConfirm.setVisible(false);
                lbShowConfir.setVisible(true);
            }
             
            
        });
        
        
        
        
        
        
        btUpdate.addActionListener(new ActionListener()
                {
                public void actionPerformed(ActionEvent e)
                {
                    String pass=txtPassword.getText();
                    String pass1=txtPasswordConfirm.getText();
                    if (pass.equals("PASSWORD123456789") || pass.isEmpty())
                    {
                        setVisible(true);
                        lbErrorEmpty.setVisible(true);
                        lbErrorDifferent.setVisible(false);
                        lbErrorMatch.setVisible(false);
                        setSize(550,350);
                       
                    }
                    else if (checkPassOld(user, pass1)==false)
                   {
                        setVisible(true);
                        lbErrorDifferent.setVisible(true);
                        lbErrorEmpty.setVisible(false);
                        lbErrorMatch.setVisible(false);
                        setSize(580,350);
                   }
                    else if(!pass.equals(pass1))
                    {
                        setVisible(true);
                        lbErrorMatch.setVisible(true);
                        lbErrorDifferent.setVisible(false);
                        lbErrorEmpty.setVisible(false);
                        setSize(550,350);
                   }
                    else
                    {
                         changePassword(txtUsername.getText(), pass);
                          JOptionPane.showMessageDialog(null,"SUCCESSFUL","BINGO!",JOptionPane.PLAIN_MESSAGE,new ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\Image\\icons8_good_quality_32.png"));
                         dispose();
                     }
                }
                });

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
        lbHidePass = new javax.swing.JLabel();
        lbHideConfirm = new javax.swing.JLabel();
        lbShowConfir = new javax.swing.JLabel();
        lbShowPass = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lbUpdate = new javax.swing.JLabel();
        btUpdate = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtPasswordConfirm = new javax.swing.JPasswordField();
        lbConfirm = new javax.swing.JLabel();
        lbNewPass = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btExit = new javax.swing.JButton();
        btMinimize = new javax.swing.JButton();
        lbErrorDifferent = new javax.swing.JLabel();
        lbErrorEmpty = new javax.swing.JLabel();
        lbErrorMatch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbHidePass.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\eye_30px.png")); // NOI18N
        lbHidePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbHidePassMouseClicked(evt);
            }
        });
        jPanel1.add(lbHidePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 40, 30));

        lbHideConfirm.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\eye_30px.png")); // NOI18N
        lbHideConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbHideConfirmMouseClicked(evt);
            }
        });
        jPanel1.add(lbHideConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        lbShowConfir.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\hide_30px.png")); // NOI18N
        lbShowConfir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbShowConfirMouseClicked(evt);
            }
        });
        jPanel1.add(lbShowConfir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        lbShowPass.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\hide_30px.png")); // NOI18N
        lbShowPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbShowPassMouseClicked(evt);
            }
        });
        jPanel1.add(lbShowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        lbTitle.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(51, 0, 51));
        lbTitle.setText("CHANGE PASSWORD");
        jPanel1.add(lbTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 230, 50));

        txtUsername.setBackground(new java.awt.Color(255, 255, 255));
        txtUsername.setFont(new java.awt.Font("Dubai Light", 3, 16)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(0, 0, 0));
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 270, 50));

        lbUpdate.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        lbUpdate.setForeground(new java.awt.Color(255, 255, 102));
        lbUpdate.setText("UPDATE");
        jPanel1.add(lbUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 120, 30));

        btUpdate.setBackground(new java.awt.Color(102, 102, 102));
        btUpdate.setForeground(new java.awt.Color(255, 255, 0));
        btUpdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\button.png")); // NOI18N
        btUpdate.setBorder(null);
        btUpdate.setBorderPainted(false);
        btUpdate.setContentAreaFilled(false);
        jPanel1.add(btUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 140, 50));

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("Dubai Light", 2, 16)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(51, 51, 51));
        txtPassword.setText("PASSWORD123456789");
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 2, new java.awt.Color(0, 0, 0)));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 270, 50));

        txtPasswordConfirm.setBackground(new java.awt.Color(255, 255, 255));
        txtPasswordConfirm.setFont(new java.awt.Font("Dubai Light", 2, 16)); // NOI18N
        txtPasswordConfirm.setForeground(new java.awt.Color(51, 51, 51));
        txtPasswordConfirm.setText("PASSWORD1234567890");
        txtPasswordConfirm.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 2, new java.awt.Color(0, 0, 0)));
        txtPasswordConfirm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordConfirmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordConfirmFocusLost(evt);
            }
        });
        jPanel1.add(txtPasswordConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 270, 50));

        lbConfirm.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lbConfirm.setForeground(new java.awt.Color(51, 0, 51));
        lbConfirm.setText("CONFIRMING");
        jPanel1.add(lbConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 130, 50));

        lbNewPass.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lbNewPass.setForeground(new java.awt.Color(51, 0, 51));
        lbNewPass.setText("NEW PASSWORD");
        jPanel1.add(lbNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 110, 50));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        btExit.setBackground(new java.awt.Color(204, 204, 204));
        btExit.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btExit.setForeground(new java.awt.Color(0, 0, 0));
        btExit.setText("X");
        btExit.setBorder(null);
        btExit.setBorderPainted(false);
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        btMinimize.setBackground(new java.awt.Color(204, 204, 204));
        btMinimize.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btMinimize.setForeground(new java.awt.Color(0, 0, 0));
        btMinimize.setText("-");
        btMinimize.setBorder(null);
        btMinimize.setBorderPainted(false);
        btMinimize.setDefaultCapable(false);
        btMinimize.setFocusPainted(false);
        btMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMinimizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 90, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 350));

        lbErrorDifferent.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbErrorDifferent.setForeground(new java.awt.Color(255, 0, 0));
        lbErrorDifferent.setText("Must different old pass");
        getContentPane().add(lbErrorDifferent, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 170, 40));

        lbErrorEmpty.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbErrorEmpty.setForeground(new java.awt.Color(255, 0, 0));
        lbErrorEmpty.setText("Pass's empty");
        getContentPane().add(lbErrorEmpty, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 130, 40));

        lbErrorMatch.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbErrorMatch.setForeground(new java.awt.Color(255, 0, 0));
        lbErrorMatch.setText("Pass don't match");
        getContentPane().add(lbErrorMatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 130, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordConfirmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordConfirmFocusGained
        // TODO add your handling code here:
         

        if(txtPasswordConfirm.getText().trim().toUpperCase().equals("PASSWORD1234567890"))
        {
            txtPasswordConfirm.setFont(new Font("Dialog", Font.BOLD, 16));
            txtPasswordConfirm.setForeground(new Color(10, 15, 15));
            txtPasswordConfirm.setText("");
        }
    }//GEN-LAST:event_txtPasswordConfirmFocusGained

    private void txtPasswordConfirmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordConfirmFocusLost
        // TODO add your handling code here:
        if(txtPasswordConfirm.getText().trim().toUpperCase().equals(""))
        {
            txtPasswordConfirm.setFont(new Font("Dubai Light", Font.ITALIC, 16));
            txtPasswordConfirm.setForeground(new Color(51,51,51));
            txtPasswordConfirm.setText("PASSWORD1234567890");
        }
    }//GEN-LAST:event_txtPasswordConfirmFocusLost

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        // TODO add your handling code here:
        if(txtPassword.getText().trim().toUpperCase().equals(""))
        {
            txtPassword.setFont(new Font("Dubai Light", Font.ITALIC, 16));
            txtPassword.setForeground(new Color(51,51,51));
            txtPassword.setText("PASSWORD123456789");
        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        // TODO add your handling code here:
      

        if(txtPassword.getText().trim().toUpperCase().equals("PASSWORD123456789"))
        {
            txtPassword.setFont(new Font("Dialog", Font.BOLD, 16));
            txtPassword.setForeground(new Color(10, 15, 15));
            txtPassword.setText("");
        }
    }//GEN-LAST:event_txtPasswordFocusGained

    private void btMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMinimizeActionPerformed
        setState(this.ICONIFIED)    ;    // TODO add your handling code here:
        //Minimize JFrame
    }//GEN-LAST:event_btMinimizeActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_btExitActionPerformed

    private void lbHidePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHidePassMouseClicked
                // TODO add your handling code here:
//         txtPassword.setEchoChar('*');
//        lbHidePass.setVisible(false);
//        lbShowPass.setVisible(true);

    }//GEN-LAST:event_lbHidePassMouseClicked

    private void lbShowPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbShowPassMouseClicked
        // TODO add your handling code here:

//      
//                          txtPassword.setEchoChar((char)0);
//                lbHidePass.setVisible(true);
//                lbShowPass.setVisible(false);
    }//GEN-LAST:event_lbShowPassMouseClicked

    private void lbHideConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHideConfirmMouseClicked
        // TODO add your handling code here:

//            txtPasswordConfirm.setEchoChar('*');
//                lbHideConfirm.setVisible(false);
//                lbShowConfir.setVisible(true);
    }//GEN-LAST:event_lbHideConfirmMouseClicked

    private void lbShowConfirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbShowConfirMouseClicked
        // TODO add your handling code here:
               
//
//                                        txtPasswordConfirm.setEchoChar((char)0);
//                lbHideConfirm.setVisible(true);
//                lbShowConfir.setVisible(false);
    }//GEN-LAST:event_lbShowConfirMouseClicked

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
            java.util.logging.Logger.getLogger(changePassWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changePassWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changePassWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changePassWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changePassWord().setVisible(true);
            }
        });
    }
    private void changePassword(String userName,String password)
    {
        Connection c=Connecting.Connect();
        String sql="Update Account set PASSWORD=? Where USERNAME=?";
        try {
            PreparedStatement pr=c.prepareStatement(sql);
            pr.setString(1, password);
            pr.setString(2, userName);
            pr.executeUpdate();
            pr.close();
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(changePassWord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private static boolean checkPassOld(String userName, String password)
    {
        boolean check=true;
        String checkPass;
            try {
                Connection c=Connecting.Connect();
                String sql="select PASSWORD from Account where USERNAME='"+userName+"'";
                PreparedStatement pr=c.prepareStatement(sql);
                ResultSet rs=pr.executeQuery();
                while(rs.next())
                {
                checkPass=rs.getString(1);
                System.out.print(checkPass);
                if(checkPass.equals(password))
                {
                    check=false;
                }
                }
            } catch (SQLException ex) {
                Logger.getLogger(changePassWord.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.print(check);
            return check;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExit;
    private javax.swing.JButton btMinimize;
    public javax.swing.JButton btUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel lbConfirm;
    public javax.swing.JLabel lbErrorDifferent;
    public javax.swing.JLabel lbErrorEmpty;
    public javax.swing.JLabel lbErrorMatch;
    public javax.swing.JLabel lbHideConfirm;
    public javax.swing.JLabel lbHidePass;
    public javax.swing.JLabel lbNewPass;
    public javax.swing.JLabel lbShowConfir;
    public javax.swing.JLabel lbShowPass;
    private javax.swing.JLabel lbTitle;
    public javax.swing.JLabel lbUpdate;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JPasswordField txtPasswordConfirm;
    public javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
