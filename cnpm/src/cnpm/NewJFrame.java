/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cnpm;

import static cnpm.Connecting.Connect;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;
import org.jdesktop.swingx.autocomplete.AutoCompleteComboBoxEditor;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author USER
 */
public class NewJFrame extends javax.swing.JFrame {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
           initComponents();
            upDateStaffPanel a=new upDateStaffPanel();
            double t=Math.pow(11, 23);
            
           
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(120, 70));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setText("Delete");
        jTextField2.setPreferredSize(new java.awt.Dimension(72, 35));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 120, 40));

        jTextField1.setText("Reprint");
        jTextField1.setPreferredSize(new java.awt.Dimension(72, 35));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 50));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable2MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(636, 636, 636))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     public boolean checkExistBrandCar1(String brandID)
   {
     int count=0;
        try {

            Connection c=Connect();
            String sql="Select MAHANG from LinhKien";
            PreparedStatement pr=c.prepareStatement(sql);
            ResultSet rs=pr.executeQuery();
            while(rs.next())
            {
                System.out.println(rs.getString(1));
//               if(rs.getString(1).equalsIgnoreCase(brandID))
//               {
//                   count++;
//                   break;
//               }
            }
        } catch (SQLException ex) {
            System.out.print("hehe");
        }
        boolean a;
        if(count==0)
        {
            a= false;
        }
        else
        {
            a=true;
        }
        return a;
            
   }
    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
//        // TODO add your handling code here:
//        Set<String> s=new TreeSet<String>();
//        s.add("unpossible");
//        s.add("pog");
//         s.add("steve rogers");
//
////Copy below code in key_released event of jtextfield.
//
//if(evt.getKeyCode()==KeyEvent.VK_BACK_SPACE||evt.getKeyCode()==KeyEvent.VK_DELETE)
//        {
//           
//        }
//        else
//        {   
//            String to_check=jTextField1.getText();
//            int to_check_len=to_check.length();
//            for(String data:s)
//            {
//                String check_from_data="";
//                for(int i=0;i<to_check_len;i++)
//                {
//                    if(to_check_len<=data.length())
//                    {
//                        check_from_data = check_from_data+data.charAt(i);
//                    }
//                }
//                //System.out.print(check_from_data);
//                if(check_from_data.equals(to_check))
//                {
//                    //System.out.print("Found");
//                    jTextField1.setText(data);
//                    jTextField1.setSelectionStart(to_check_len);
//                    jTextField1.setSelectionEnd(data.length());
//                    break;
//                }
//            }
//        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTable2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MousePressed
        // TODO add your handling code here:
           if (evt.isPopupTrigger())
            System.out.println(evt);
    }//GEN-LAST:event_jTable2MousePressed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
           if (evt.isPopupTrigger())
            System.out.println(evt);
    }//GEN-LAST:event_jTable2MouseClicked

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private void AutoCompleteComboBoxEditor(JComboBox<String> jComboBox1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
