/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cnpm;

import static cnpm.Connecting.Connect;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author USER
 */
public class updatePanelGuest extends javax.swing.JPanel {
String staffName;
int index;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }
    /**
     * Creates new form panelGuest
     */
    public updatePanelGuest() {
        initComponents();
        getInforGuest();
                tbGuest.getTableHeader().setFont(new Font("DialogInput",Font.BOLD,14));
        tbGuest.getTableHeader().setOpaque(false);
        tbGuest .getTableHeader().setBackground(new Color(204, 204, 255));
        btMakeInvoice.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbGuest = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        btMakeInvoice = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 460));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\search_30px.png")); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 40, 50));

        tbGuest.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tbGuest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GUEST ID", "NAME", "PHONE NUMBER", "ADDRESS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbGuest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGuestMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbGuest);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 727, 480));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\Image\\icons8_plus_min1111111us_32.png")); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 61, 111, 47));

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 65, 240, 41));

        btMakeInvoice.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btMakeInvoice.setText("MAKE A INVOICE");
        btMakeInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMakeInvoiceActionPerformed(evt);
            }
        });
        add(btMakeInvoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\Image\\2_64.png")); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 390, 130));
    }// </editor-fold>//GEN-END:initComponents
    public boolean checkInfor(RegisterGuest rm)
    {
        boolean check=true;
         int countfull=0;
         int countvalid=0;
        boolean checkEmptyName=true;
        boolean checkName=true;
        String name=rm.txtName.getText().trim().replaceAll("\\s+", " ").toUpperCase();
        if(name.equals("NAME*") || name.isEmpty())
        {
            countfull++;
            checkEmptyName=false;
        }
        else if (name.length()>30)
        {
            countvalid++;
            checkName=false;
        }
        
         //PHONE NUMBER
        String phoneNumber=rm.txtSDT.getText();
        boolean checkEmptyPhone=true;
        boolean checkPhoneNumber=true;
         if(phoneNumber.equals("PHONE NUMBER*") || phoneNumber.isEmpty())
        {
            checkEmptyPhone=false;
            countfull++;
        }
         else if (phoneNumber.charAt(0)!=48)
         {
          checkPhoneNumber=false;
          countvalid++;
         }
         else  if (phoneNumber.length()<10 || phoneNumber.length()>11)
        {
          checkPhoneNumber=false;
          countvalid++;
        }
         
        else if (phoneNumber.trim().replaceAll("\\s+", " ").equals(' '))
        {
            checkPhoneNumber=false;
            countvalid++;
        }
        
        else
        {
        for(int i=0;i<phoneNumber.length();i++)
        {
            
            if(phoneNumber.charAt(i)>=48 && phoneNumber.charAt(i)<=57 )
            {
                checkPhoneNumber=true;
            }
            else if(phoneNumber.charAt(i)==13)
            {
                checkPhoneNumber=true;
            }
            else if(phoneNumber.charAt(i)==32)
            {
                checkPhoneNumber=true;
            }
            else
            {
                checkPhoneNumber=false;
                countvalid++;
                break;
            }
        }
       }
       //Address
        boolean checkEmptyAddress=true;
        String address=rm.txtAddress.getText().trim().replaceAll("\\s+", " ").toUpperCase();
         if(address.equals("ADDRESS*") || address.isEmpty())
        {
            countfull++;
            checkEmptyAddress=false;
        }
         if (countfull!=0 || countvalid!=0)
         {
            rm. setSize(680,330);
            check=false;
        //NAME ERROR
                if(checkEmptyName==false)
                {
                   
                   rm.lbErrorNameEmpty.setVisible(true);
                   rm.lbErrorNameInvalid.setVisible(false);
                }
                else if(checkName==false)
                {
                    rm.lbErrorNameEmpty.setVisible(false);
                    rm.lbErrorNameInvalid.setVisible(true);
                }
                else
                {
                    rm.lbErrorNameEmpty.setVisible(false);
                    rm.lbErrorNameInvalid.setVisible(false);
                }
                
        //ADDRESS ERROR
                if(checkEmptyAddress==false)
                {
                    rm.lbErrorAddressEmpty.setVisible(true);
                }
                else
                {
                    rm.lbErrorAddressEmpty.setVisible(false);
                }
                  //PHONENUMBER ERROR         
                if(checkEmptyPhone==false)
                {
                    rm.lbErrorPhoneEmpty.setVisible(true);
                    rm.lbErrorPhone.setVisible(false);
                }
                else if(checkPhoneNumber==false )
                {
                    rm.lbErrorPhoneEmpty.setVisible(false);
                    rm.lbErrorPhone.setVisible(true);
                }
                else
                {
                    rm.lbErrorPhone.setVisible(false);
                    rm.lbErrorPhoneEmpty.setVisible(false);
                }
         
            }
         else
          {
             check=true;
          }
         return check;
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

             RegisterGuest rm=new RegisterGuest();
             rm.setVisible(true);
             rm.setSize(480,330);
        //NAME
        rm.btRegister.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
              if(checkInfor(rm)==true)
              {
                 String name=rm.txtName.getText().trim().replaceAll("\\s+", " ").toUpperCase();
                 String phoneNumber=rm.txtSDT.getText();
                 String address=rm.txtAddress.getText().trim().replaceAll("\\s+", " ").toUpperCase();
               registerGuest(name, phoneNumber, address,"0");
              JOptionPane.showMessageDialog(null,"SUCCESSFUL","BINGO!",JOptionPane.PLAIN_MESSAGE,new ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\Image\\icons8_good_quality_32.png"));
              getInforGuest();
              rm.txtName.setText("NAME*");
              rm.txtSDT.setText("PHONE NUMBER*");
              rm.txtAddress.setText("ADDRESS*");
                         rm.txtName.setFont(new Font("Dubai Light", Font.ITALIC, 16));
                         rm.txtName.setForeground(new Color(133,173,173));
                         rm.txtSDT.setFont(new Font("Dubai Light", Font.ITALIC, 16));
                         rm.txtSDT.setForeground(new Color(133,173,173));
                         rm.txtAddress.setFont(new Font("Dubai Light", Font.ITALIC, 16));
                         rm.txtAddress.setForeground(new Color(133,173,173));
                         rm.setSize(480,335);
                         rm.lbErrorAddressEmpty.setVisible(false);
                         rm.lbErrorNameEmpty.setVisible(false);
                         rm.lbErrorNameInvalid.setVisible(false);
                         rm.lbErrorPhoneEmpty.setVisible(false);
                         rm.lbErrorPhone.setVisible(false);
                       
              }

            }
        });
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
        jLabel1.setVisible(true);
    }//GEN-LAST:event_jTextField1FocusLost
public void  filterData(String query)
{
    DefaultTableModel dtm= (DefaultTableModel)tbGuest.getModel();
    TableRowSorter<DefaultTableModel> tr= new TableRowSorter<DefaultTableModel>(dtm);
    tbGuest.setRowSorter(tr);
    tr.setRowFilter(RowFilter.regexFilter(query));
}
    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        String query=jTextField1.getText().toUpperCase();
        filterData(query);
    }//GEN-LAST:event_jTextField1KeyReleased

    private void tbGuestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGuestMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dtm=(DefaultTableModel)tbGuest.getModel();
        setIndex(tbGuest.getSelectedRow());
       
        btMakeInvoice.setEnabled(true);
        if(evt.getClickCount()==2)
        {
        RegisterGuest a=new RegisterGuest();
        a.setVisible(true);
        
         //Dinh Dang lai Form dang ki
         a.setSize(480,330);
        a.btRegister.setVisible(false);
        a.lbRegister.setVisible(false);
        a.btUpdate.setVisible(true);
        a.lbUpdate.setVisible(true);
        a.btDelete.setVisible(true);
        a.lbDelete.setVisible(true);
        a.panelRegister.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black), "Updating", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(255, 255, 102)));
     
       
       //SET GIÁ TRỊ CHO CÁC TRƯỜNG
        //ID
        String id=String.valueOf(tbGuest.getValueAt(index, 0));
         
        //NAME
        String name=String.valueOf(tbGuest.getValueAt(index, 1));
        a.txtName.setText(String.valueOf(tbGuest.getValueAt(index, 1)));
        a.txtName.setFont(new Font("Dialog",Font.BOLD,16));
        a.txtName.setForeground(Color.black);
        
        
        //PHONE NUMBER 
        String phone=String.valueOf(tbGuest.getValueAt(index, 2));
        a.txtSDT.setText(phone);
        a.txtSDT.setFont(new Font("Dialog",Font.BOLD,16));
        a.txtSDT.setForeground(Color.black);
        
         
        //ADDRESS
           String address=String.valueOf(tbGuest.getValueAt(index, 3));
        a.txtAddress.setText(String.valueOf(tbGuest.getValueAt(index, 3)));
        a.txtAddress.setFont(new Font("Dialog",Font.BOLD,16));
        a.txtAddress.setForeground(Color.black);
       
            a.btUpdate.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    if(checkInfor(a)==true)
                    {
                 String name=a.txtName.getText().trim().replaceAll("\\s+", " ").toUpperCase();
                 String phoneNumber=a.txtSDT.getText();
                 String address=a.txtAddress.getText().trim().replaceAll("\\s+", " ").toUpperCase();
                        updateInforGuest(name, phoneNumber, address, id);
                        JOptionPane.showMessageDialog(null,"SUCCESSFUL","BINGO!",JOptionPane.PLAIN_MESSAGE,new ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\Image\\icons8_good_quality_32.png"));
                        getInforGuest();
                        a.dispose();
                    }
                }
            });
            a.btDelete.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    AddAccessoriesAndService as=new AddAccessoriesAndService();
                    updateGuestCar gc=new updateGuestCar();
                     int input=JOptionPane.showConfirmDialog(null, "All Data About This Guest Will Be Deleted! Are You Sure?","CONFIRM", JOptionPane.YES_NO_OPTION);
                    if(input==0)
                    {
                    for(String idCar:gc.getIDCarList(id))
                    {
                        for(String idAccess:as.getAccessoryIDfromIDCar(idCar))
                        {
                            String quantityAccessDetail="-"+String.valueOf(as.getQuantityFromAccessoriDetail(idAccess, idCar));
                            as.subtractQuantity(idAccess, quantityAccessDetail);
                            as.deleteAccessDetail(idAccess, idCar);
                            gc.deleteGuestCar(idCar);
                        }
                        as.deleteAllServiceDetail(idCar);
                    }
                    
                    deleteGuest(id);
                    
                    JOptionPane.showMessageDialog(null,"SUCCESSFUL","BINGO!",JOptionPane.PLAIN_MESSAGE,new ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\Image\\icons8_good_quality_32.png"));
                    getInforGuest();
                    a.dispose();
                    }
                    
                }
            });
        }

    }//GEN-LAST:event_tbGuestMouseClicked

    private void btMakeInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMakeInvoiceActionPerformed
        // TODO add your handling code here:
                
 
            
                Bill bi=new Bill();
                updateDetailInvoice di=new updateDetailInvoice();
                upDateStaffPanel sp=new upDateStaffPanel();
                updateGuestCar gc=new updateGuestCar();
                Date cal=new Date();
                SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy");
                
                String guestID=String.valueOf(tbGuest.getValueAt(getIndex(), 0));
                String date=String.valueOf(df.format(cal.getTime()));
                String staffName=getStaffName();

                AddAccessoryForCar afc=new AddAccessoryForCar();
                AddServicesForCar  sfc=new AddServicesForCar();
                boolean checkPrintAccess=false;
                boolean checkPrintService=false;
                for(String idCar : gc.getIDCarList(guestID))
                {
                    if(afc.checkAccessoryForCar(idCar)==true)
                    {
                        checkPrintAccess=true;
                        break;
                    }
                    if(sfc.checkServiceForCar(idCar)==true)
                    {
                        checkPrintService=true;
                        break;
                    }
                }
                if(checkPrintAccess==true || checkPrintService==true)
                {
                di.createInvoice(guestID, date, sp.getStaffIDFromName(staffName),"0");
                bi.setGuestName(String.valueOf(tbGuest.getValueAt(getIndex(), 1)));
                bi.setGuestPhone(String.valueOf(tbGuest.getValueAt(getIndex(), 2)));
                bi.setStaffName(staffName);
                bi.createInvoice();
                updateStateGuest(guestID, "1");
                getInforGuest();
                    for(String idCar : gc.getIDCarList(guestID))
                    {
                    gc.updateStateGuestCar(idCar, "1");
                    }
                     
                }
                else if (checkPrintAccess==false && checkPrintService==false)
                {
                    JOptionPane.showMessageDialog(null, "CAR'S SERVICE IS EMPTY!","WARNING",JOptionPane.WARNING_MESSAGE);
                }
               
                  gc.getInforGuestCar();
                   
       
    }//GEN-LAST:event_btMakeInvoiceActionPerformed
public void getInforGuest()
    {
        DefaultTableModel dtm=(DefaultTableModel)tbGuest.getModel();
        dtm.setRowCount(0);
        tbGuest.setModel(dtm);
        tbGuest.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbGuest.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbGuest.getColumnModel().getColumn(2).setPreferredWidth(80);
        tbGuest.getColumnModel().getColumn(3).setPreferredWidth(230);
        tbGuest.setRowHeight(30);
       
        //tbGuest.setRowHeight(30);
        tbGuest.setAutoResizeMode(tbGuest.AUTO_RESIZE_LAST_COLUMN);
        Connection c=Connecting.Connect();
        String sql="Select * from KhachHang";
        Vector v;
        try {
            PreparedStatement pr=c.prepareStatement(sql);
            ResultSet rs=pr.executeQuery();
            while(rs.next())
            {
                if(rs.getString(5).equals("0"))
                {
                v=new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                dtm.addRow(v);
                }
            }
            tbGuest.setModel(dtm);
            rs.close();
            pr.close();
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(upDateStaffPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    private void registerGuest(String name,String phoneNumber,String address,String state)
    {
        try {
            Connection connect=Connect();
            String sql1=" insert into KhachHang values (?,?,?,?)";
            PreparedStatement pr1=connect.prepareStatement(sql1);
            pr1.setString(1, name);
            pr1.setString(2, phoneNumber);
            pr1.setString(3, address);
            pr1.setString(4, state);
            pr1.executeUpdate();
            pr1.close();
            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegisterMember.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
  private void updateInforGuest(String name,String phoneNumber,String address,String id)
 {
   Connection c=Connect();
   String sql="update KhachHang set TENKH=?,SDT=?,DIACHI=? where MAKH=?";
        try {
            PreparedStatement pr=c.prepareStatement(sql);
            pr.setString(1, name);
            pr.setString(2, phoneNumber);
            pr.setString(3, address);
            pr.setString(4, id);
            pr.executeUpdate();
            pr.close();
            c.close();
        } catch (SQLException ex) {
           System.out.print("HELLO");
        }
     
 }
   public void updateStateGuest(String id,String state)
 {
   Connection c=Connect();
   String sql="update KhachHang set TRANGTHAI=? where MAKH=?";
        try {
            PreparedStatement pr=c.prepareStatement(sql);
            pr.setString(1, state);
            pr.setString(2, id);
            pr.executeUpdate();
            pr.close();
            c.close();
                  

        } catch (SQLException ex) {
           System.out.print("HELLO");
        }
     
 }
   public void deleteGuest(String id)
     {
         Connection c=Connect();
         String sql="delete from KhachHang where MAKH=?";
         PreparedStatement pr;
    try {
         pr = c.prepareStatement(sql);
         pr.setString(1, id);
            pr.executeUpdate();
            pr.close();
            c.close();
    } catch (SQLException ex) {
        System.out.print("HELLO");
    }
     }   
         public static void main(String args[]) {
          JFrame a=new JFrame();
          updatePanelGuest b=new updatePanelGuest();
          a.add(b);
          a.setVisible(true);
          a.pack();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btMakeInvoice;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbGuest;
    // End of variables declaration//GEN-END:variables
}
