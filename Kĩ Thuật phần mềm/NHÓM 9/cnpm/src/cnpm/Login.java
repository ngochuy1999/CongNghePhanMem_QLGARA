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
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import java.awt.geom.RoundRectangle2D;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author USER
 */
public class Login extends javax.swing.JFrame {
    boolean check;
    String name;
    String sex;
    String position;
     String everything;

    public String getEverything() {
        return everything;
    }

    public void setEverything(String everything) {
        this.everything = everything;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isLackUser() {
        return lackUser;
    }

    public void setLackUser(boolean lackUser) {
        this.lackUser = lackUser;
    }

    public boolean isLackPass() {
        return lackPass;
    }

    public void setLackPass(boolean lackPass) {
        this.lackPass = lackPass;
    }

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }
    boolean lackUser,lackPass,full;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
               

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    Image img=new ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\Image\\LOGO WHITE.png").getImage().getScaledInstance(lbImage.getWidth(), lbImage.getHeight(), Image.SCALE_SMOOTH);
    lbImage.setIcon(new ImageIcon(img));
    this.getContentPane().setBackground(new Color(51,51,51));
    this.setLocationRelativeTo(null);
    this.setOpacity(0.9f);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        panelBackground = new javax.swing.JPanel();
        lbUser = new javax.swing.JLabel();
        lbPass = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        btSignIn = new javax.swing.JButton();
        lbPass1 = new javax.swing.JLabel();
        panelIcon = new javax.swing.JPanel();
        txtMinimize = new javax.swing.JLabel();
        txtExit = new javax.swing.JLabel();
        lbImage = new javax.swing.JLabel();

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("X");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(564, 620));
        setUndecorated(true);
        setOpacity(0.9F);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBackground.setBackground(new java.awt.Color(51, 51, 51));
        panelBackground.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        panelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbUser.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        lbUser.setForeground(new java.awt.Color(255, 255, 102));
        lbUser.setText("USER NAME");
        panelBackground.add(lbUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 67, -1, 31));

        lbPass.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        lbPass.setForeground(new java.awt.Color(255, 255, 102));
        lbPass.setText("Sign in");
        panelBackground.add(lbPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 110, 20));

        txtUser.setBackground(new java.awt.Color(51, 51, 51));
        txtUser.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 0));
        txtUser.setBorder(null);
        txtUser.setCaretColor(new java.awt.Color(255, 255, 102));
        txtUser.setPreferredSize(new java.awt.Dimension(70, 25));
        panelBackground.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 69, 226, -1));

        txtPassword.setBackground(new java.awt.Color(51, 51, 51));
        txtPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 0));
        txtPassword.setBorder(null);
        txtPassword.setPreferredSize(new java.awt.Dimension(70, 25));
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        panelBackground.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 137, 226, 28));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 0));
        panelBackground.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 104, 222, 10));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 0));
        panelBackground.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 172, 226, 10));

        btSignIn.setBackground(new java.awt.Color(102, 102, 102));
        btSignIn.setForeground(new java.awt.Color(255, 255, 0));
        btSignIn.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\button.png")); // NOI18N
        btSignIn.setBorder(null);
        btSignIn.setBorderPainted(false);
        btSignIn.setContentAreaFilled(false);
        btSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSignInActionPerformed(evt);
            }
        });
        panelBackground.add(btSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 140, 60));

        lbPass1.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        lbPass1.setForeground(new java.awt.Color(255, 255, 102));
        lbPass1.setText("PASSWORD");
        panelBackground.add(lbPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 138, -1, -1));

        getContentPane().add(panelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 352, 552, -1));

        panelIcon.setBackground(new java.awt.Color(51, 51, 51));
        panelIcon.setForeground(new java.awt.Color(0, 0, 0));
        panelIcon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMinimize.setBackground(new java.awt.Color(51, 51, 51));
        txtMinimize.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
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
        panelIcon.add(txtMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 61, 30));

        txtExit.setBackground(new java.awt.Color(51, 51, 51));
        txtExit.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
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
        panelIcon.add(txtExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 49, 30));
        panelIcon.add(lbImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 400, 210));

        getContentPane().add(panelIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 564, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSignInActionPerformed
        // TODO add your handling code here:
         String user=txtUser.getText();
        String pass=txtPassword.getText();
       if (pass.isEmpty() && user.isEmpty())
       {
           JOptionPane.showMessageDialog(null, "PLEASE DON'T LET EMPTY", "FAILED", JOptionPane.ERROR_MESSAGE);
       }
        else if (checkUser(user)==false)
       {
           JOptionPane.showMessageDialog(null, "USER ISN'T EXIST", "FAILED", JOptionPane.ERROR_MESSAGE);
       }
        else if (checkPass(user, pass)==false)
       {
           JOptionPane.showMessageDialog(null, "INVALID PASSWORD", "FAILED", JOptionPane.ERROR_MESSAGE);
       }
       else if( checkUser(user)==true && checkPass(user, pass)==true)
       {

          // Image img=new ImageIcon()
           JOptionPane.showMessageDialog(null,"SUCCESSFUL","BINGO!",JOptionPane.PLAIN_MESSAGE,new ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\Image\\icons8_good_quality_32.png"));
           this.setVisible(false);

          
           MainFrame a=new MainFrame();
           a.setUserName(user);
           a.lbIconUserFemale.setVisible(false);
           a.lbIconUserMale.setVisible(false);
           getInfor(txtUser.getText());
           a.setStaffName(getName());
        if(getSex().equals("Nam"))
        {
            a.lbIconUserMale.setVisible(true);
            a.lbIconUserFemale.setVisible(false);
        }
        else
        {
            a.lbIconUserMale.setVisible(false);
            a.lbIconUserFemale.setVisible(true);
        }
        if(getPosition().equals("Quản lí"))
        {
                    a.lbManager.setVisible(true);
                    a.lbAccountant.setVisible(false);
                    a.lbStockStaff.setVisible(false);
                    a.lbStockStaff.setVisible(true);
                    a.lbStaff.setVisible(true);
                    a.lbInforGuestCar.setVisible(true);
                    a.lbInforGuest.setVisible(true);
                    a.lbService.setVisible(true);
                    a.lbSell.setVisible(true);
        }
        else if (getPosition().equals("Quản kho"))
        {
              a.lbManager.setVisible(false);
            a.lbAccountant.setVisible(false);
            a.lbStockStaff.setVisible(true);
          a.lbInforGuestCar.setVisible(false);
             a.lbInforGuest.setVisible(false);
            a.lbStaff.setVisible(false);
            a.lbService.setVisible(false);
            a.lbSell.setVisible(false);
           // a.lbStock.setBounds(a.lbStock.getX(),200,a.lbStock.getWidth(),a.lbStock.getHeight());
            
        }
        else
        {
          a.lbManager.setVisible(false);
                    a.lbAccountant.setVisible(true);
                    a.lbStockStaff.setVisible(false);
                    
                    a.setLayout(null);
                    a.lbStock.setBounds(a.lbStock.getX(),200,a.lbStock.getWidth(),a.lbStock.getHeight());
                    a.lbInforGuest.setBounds(a.lbInforGuest.getX(),300,a.lbInforGuest.getWidth(),a.lbInforGuest.getHeight());
                    a.lbInforGuestCar.setBounds(a.lbInforGuestCar.getX(),400,a.lbInforGuestCar.getWidth(),a.lbInforGuestCar.getHeight());
                    a.lbSell.setBounds(a.lbSell.getX(),500,a.lbSell.getWidth(),a.lbSell.getHeight());
                    
                    a.lbInforGuestCar.setVisible(true);
                    a.lbInforGuest.setVisible(true);
                    a.lbSell.setVisible(true);
                    a.lbStaff.setVisible(false);
                    a.lbService.setVisible(false);
                    a.lbStock.setVisible(true);
        }
        int count=0;
        for (int i=getName().length()-1;i>=0;i--)
        {
            
            if(getName().charAt(i)==32)
            {
                count++;
                a.lbUser.setText("HI!"+getName().substring(i, getName().length()));
                a.lbUser.setForeground(Color.yellow);
                a.lbUser.setFont(new Font("Dialog",Font.ITALIC,15));
            }
            if(count==2)
            {
                break;
            }
        }
 
       
           a.setVisible(true);
       }

      

    }//GEN-LAST:event_btSignInActionPerformed

    private void txtExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_txtExitMouseClicked

    private void txtMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMinimizeMouseClicked
        // TODO add your handling code here:
        setState(this.ICONIFIED);
    }//GEN-LAST:event_txtMinimizeMouseClicked

    private void txtExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseEntered
        // TODO add your handling code here:
        txtExit.setBackground(new Color(200, 0,0));
        
    }//GEN-LAST:event_txtExitMouseEntered

    private void txtExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseExited
        // TODO add your handling code here:
        txtExit.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_txtExitMouseExited

    private void txtMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMinimizeMouseEntered
        // TODO add your handling code here:
        txtMinimize.setBackground(new Color(200, 0,0));
    }//GEN-LAST:event_txtMinimizeMouseEntered

    private void txtMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMinimizeMouseExited
        // TODO add your handling code here:
        txtMinimize.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_txtMinimizeMouseExited

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
         String user=txtUser.getText();
        String pass=txtPassword.getText();
       if (pass.isEmpty() && user.isEmpty())
       {
           JOptionPane.showMessageDialog(null, "PLEASE DON'T LET EMPTY", "FAILED", JOptionPane.ERROR_MESSAGE);
       }
        else if (checkUser(user)==false)
       {
           JOptionPane.showMessageDialog(null, "USER ISN'T EXIST", "FAILED", JOptionPane.ERROR_MESSAGE);
       }
        else if (checkPass(user, pass)==false)
       {
           JOptionPane.showMessageDialog(null, "INVALID PASSWORD", "FAILED", JOptionPane.ERROR_MESSAGE);
       }
       else if( checkUser(user)==true && checkPass(user, pass)==true)
       {

          // Image img=new ImageIcon()
           JOptionPane.showMessageDialog(null,"SUCCESSFUL","BINGO!",JOptionPane.PLAIN_MESSAGE,new ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\Image\\icons8_good_quality_32.png"));
           this.setVisible(false);
          
          
           MainFrame a=new MainFrame();
           a.setUserName(user);
           a.lbIconUserFemale.setVisible(false);
           a.lbIconUserMale.setVisible(false);
           getInfor(txtUser.getText());
           a.setStaffName(getName());
           
        if(getSex().equals("Nam"))
        {
            a.lbIconUserMale.setVisible(true);
            a.lbIconUserFemale.setVisible(false);
        }
        else
        {
            a.lbIconUserMale.setVisible(false);
            a.lbIconUserFemale.setVisible(true);
        }
        a.setPosition(getPosition());
        if(getPosition().equals("Quản lí"))
        {
                    a.lbManager.setVisible(true);
                    a.lbAccountant.setVisible(false);
                    a.lbStockStaff.setVisible(false);
                    a.lbStockStaff.setVisible(true);
                    a.lbStaff.setVisible(true);
                    a.lbInforGuestCar.setVisible(true);
                    a.lbInforGuest.setVisible(true);
                    a.lbService.setVisible(true);
                    a.lbSell.setVisible(true);
        }
        else if (getPosition().equals("Quản kho"))
        {
              a.lbManager.setVisible(false);
            a.lbAccountant.setVisible(false);
            a.lbStockStaff.setVisible(true);
             a.lbInforGuestCar.setVisible(false);
             a.lbInforGuest.setVisible(false);
            a.lbStaff.setVisible(false);
            a.lbService.setVisible(false);
            a.lbSell.setVisible(false);
        
            
        }
        else if(getPosition().equals("Thu ngân"))
        {
          a.lbManager.setVisible(false);
                    a.lbAccountant.setVisible(true);
                    a.lbStockStaff.setVisible(false);
                    
                    a.setLayout(null);
                    a.lbStock.setBounds(a.lbStock.getX(),200,a.lbStock.getWidth(),a.lbStock.getHeight());
                    a.lbInforGuest.setBounds(a.lbInforGuest.getX(),300,a.lbInforGuest.getWidth(),a.lbInforGuest.getHeight());
                    a.lbInforGuestCar.setBounds(a.lbInforGuestCar.getX(),400,a.lbInforGuestCar.getWidth(),a.lbInforGuestCar.getHeight());
                    a.lbSell.setBounds(a.lbSell.getX(),500,a.lbSell.getWidth(),a.lbSell.getHeight());
                    
                    a.lbInforGuestCar.setVisible(true);
                    a.lbInforGuest.setVisible(true);
                    a.lbSell.setVisible(true);
                    a.lbStaff.setVisible(false);
                    a.lbService.setVisible(false);
                    a.lbStock.setVisible(true);
        }
        int count=0;
        for (int i=getName().length()-1;i>=0;i--)
        {
            
            if(getName().charAt(i)==32)
            {
                count++;
                a.lbUser.setText("HI!"+getName().substring(i, getName().length()));
                a.lbUser.setForeground(Color.yellow);
                a.lbUser.setFont(new Font("Dialog",Font.ITALIC,15));
            }
            if(count==2)
            {
                break;
            }
        }
 
       
           a.setVisible(true);
       }

        }
    }//GEN-LAST:event_txtPasswordKeyPressed
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    public void checkAccount(String user,String password)
    {
        setLackUser(false);
        setLackPass(false);
        setFull(false);
        try {
        Connection c=Connecting.Connect();
        String sql="Select USERNAME from Account";
          PreparedStatement pr = c.prepareStatement(sql);
          ResultSet rs=pr.executeQuery();
            while(rs.next())
            {
                 if(user.equals(rs.getString(1)))
                {
                    setLackUser(true);
                    break;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean checkUser(String user)
    {
        setCheck(false);
        try {
        Connection c=Connecting.Connect();
        String sql="Select USERNAME from Account";
          PreparedStatement pr = c.prepareStatement(sql);
          ResultSet rs=pr.executeQuery();
            while(rs.next())
            {
                 if(user.equals(rs.getString(1)))
                {
                    setCheck(true);
                    break;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isCheck();
    }
    
   public boolean checkPass(String user,String password)
    {
        setCheck(false);
        try {
        Connection c=Connecting.Connect();
        String sql="Select * from Account";
          PreparedStatement pr = c.prepareStatement(sql);
          ResultSet rs=pr.executeQuery();
            while(rs.next())
            {
                 if(user.equals(rs.getString(1))&& password.equals(rs.getString(2)))
                {
                    setCheck(true);
                    break;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isCheck();
    }

       
    public void getInfor(String username)
    {
        try {
            Connection c=Connecting.Connect();
            String sql="Select GIOITINH, TENNV,CHUCVU FROM NhanVien where USERNAME='"+username+"'";
            PreparedStatement pr=c.prepareStatement(sql);
            ResultSet rs=pr.executeQuery();
            while(rs.next())
            {
               setSex(rs.getString(1));
               setName(rs.getString(2));
                setPosition(rs.getString(3));
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btSignIn;
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbImage;
    public javax.swing.JLabel lbPass;
    public javax.swing.JLabel lbPass1;
    public javax.swing.JLabel lbUser;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelIcon;
    private javax.swing.JLabel txtExit;
    private javax.swing.JLabel txtMinimize;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
