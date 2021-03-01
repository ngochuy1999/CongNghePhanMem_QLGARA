/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cnpm;

import static cnpm.Connecting.Connect;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author USER
 */
public class updateGuestCar extends javax.swing.JPanel {

    String everthing;
    public String idcar;
    boolean check;
    String getId;
    String getName;
    public String getEverthing() {
        return everthing;
    }

    public void setEverthing(String everthing) {
        this.everthing = everthing;
    }
    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
    public String getIdcar() {
        return idcar;
    }

    public void setIdcar(String idcar) {
        this.idcar = idcar;
    }
   

    public String getGetName() {
        return getName;
    }

    public void setGetName(String getName) {
        this.getName = getName;
    }

    public String getGetId() {
        return getId;
    }

    public void setGetId(String getId) {
        this.getId = getId;
    }
    /**
     * Creates new form panelGuest
     */
    public updateGuestCar() {
       
        initComponents();
        getInforGuestCar();

        tbGuestCar.getTableHeader().setFont(new Font("DialogInput",Font.BOLD,14));     
        tbGuestCar.getTableHeader().setOpaque(false);
        tbGuestCar.getTableHeader().setBackground(new Color(204, 204, 255));
        btAddService.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbGuestCar = new javax.swing.JTable();
        btAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lbIconGuestCar = new javax.swing.JLabel();
        btAddService = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbGuestCar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tbGuestCar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CAR ID", "NAME CAR", "NUMBER PLATE", "OWNER"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbGuestCar.setPreferredSize(new java.awt.Dimension(300, 600));
        tbGuestCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGuestCarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbGuestCar);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 740, 420));

        btAdd.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btAdd.setText("ADD");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });
        add(btAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 79, 47));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\search_30px.png")); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 41, 40));

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
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 240, 41));

        lbIconGuestCar.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\Image\\setting64_64.png")); // NOI18N
        lbIconGuestCar.setPreferredSize(new java.awt.Dimension(300, 300));
        add(lbIconGuestCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 110, 130));

        btAddService.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btAddService.setText("ADD SERVICE");
        btAddService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddServiceActionPerformed(evt);
            }
        });
        add(btAddService, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 128, 47));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\Image\\car-door.png")); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 350, 140));
    }// </editor-fold>//GEN-END:initComponents
    public boolean checkInforGuestCar(AddGuestCar rm)
    {
        boolean check=true;
         int countfull=0;
         int countvalid=0;
        boolean checkEmptyNameCar=true;
        boolean checkNameCar=true;
        String nameCar=rm.txtNameCar.getText().trim().replaceAll("\\s+", " ").toUpperCase();
        boolean checkTemp=false;
           for(int i=0;i<nameCar.length();i++)
            {
                if(nameCar.charAt(i)>=65 && nameCar.charAt(i)<=90 || nameCar.charAt(i)>=97 && nameCar.charAt(i)<=122)
                {
                    checkTemp=true;
                }
            }
        if(nameCar.equals("CAR'S NAME*") || nameCar.isEmpty())
        {
            countfull++;
            checkEmptyNameCar=false;
        }

        else if (checkTemp==false)
        {

            countvalid++;
            checkNameCar=false;
        }
        
         //Number Plate
        String numberPlate=rm.txtNumberPlate.getText().toUpperCase();
        boolean checkEmptyNumberPlate=true;
        boolean checkNumberPlate=true;
        boolean checkSameNumberPlate=true;
         if(numberPlate.equals("CAR'S NUMBER PLATE*") || numberPlate.isEmpty())
        {
            checkEmptyNumberPlate=false;
            countfull++;
        }
        else if(checkExistNumberPlate(numberPlate)==true)
        {
            checkSameNumberPlate=false;
            countvalid++;
            
        }
         else  if (numberPlate.length()!=8)
        {
          checkNumberPlate=false;
          countvalid++;
        }
        else if(numberPlate.charAt(3)!=45)
        {
             checkNumberPlate=false;
            countvalid++;
        }
        else if (!(numberPlate.charAt(2)>=65 && numberPlate.charAt(2)<=90 || numberPlate.charAt(2)>=97 && numberPlate.charAt(2)<=122))
        {
            checkNumberPlate=false;
            countvalid++;
        }
        else 
        {
        for (int i=0;i<numberPlate.length();i++)
        {
            if(i!=2 && i!=3)
            {
                if(!(numberPlate.charAt(i)>=48 && numberPlate.charAt(i)<=57))
                {
                    checkNumberPlate=false;
                    countvalid++;
                }
            }
         
        } 
        
        }
         if (countfull!=0 || countvalid!=0)
         {
            check=false;
            rm. setSize(650,580);
           //NAME ERROR
                if(checkEmptyNameCar==false)
                {
                   rm.lbErrorNameCarEmpty.setVisible(true);
                   rm.lbErrorNameCar.setVisible(false);
                }
                else if(checkNameCar==false)
                {
                    rm.lbErrorNameCarEmpty.setVisible(false);
                    rm.lbErrorNameCar.setVisible(true);
                }
                else
                {
                    rm.lbErrorNameCarEmpty.setVisible(false);
                    rm.lbErrorNameCar.setVisible(false);
                }
                
        //ADDRESS ERROR
                if(checkEmptyNumberPlate==false)
                {
                    rm.lbErrorNumberPlateEmpty.setVisible(true);
                    rm.lbErrorNumberPlate.setVisible(false);
                    rm.lbErrorExistedNumberPlate.setVisible(false);
                }
                else if(checkSameNumberPlate==false)
                {
                    rm.lbErrorExistedNumberPlate.setVisible(true);
                     rm.lbErrorNumberPlateEmpty.setVisible(false);
                    rm.lbErrorNumberPlate.setVisible(false);
                }
                else if(checkNumberPlate==false)
                {
                    rm.lbErrorExistedNumberPlate.setVisible(false);
                     rm.lbErrorNumberPlateEmpty.setVisible(false);
                    rm.lbErrorNumberPlate.setVisible(true);
                }
                else
                {
                      rm.lbErrorExistedNumberPlate.setVisible(false);
                    rm.lbErrorNumberPlate.setVisible(false);
                    rm.lbErrorNumberPlateEmpty.setVisible(false);
                }
            }
         else
          {
             check=true;
          }
         return check;
    }
    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        // TODO add your handling code here:

            AddGuestCar rm=new AddGuestCar();
             rm.setVisible(true);
             rm.setSize(400,580);
        //NAME
        rm.btAdd.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
              if(checkInforGuestCar(rm)==true)
              {
       
                  rm.setSize(400,580);
                 String nameCar=rm.txtNameCar.getText().trim().replaceAll("\\s+", " ").toUpperCase();
                 String numberPlate=rm.txtNumberPlate.getText().toUpperCase();
                 String guest=String.valueOf(rm.cbGuestName.getEditor().getItem());
                 addGuestCar(nameCar, numberPlate, String.valueOf(rm.cbGuestID.getEditor().getItem()));
              JOptionPane.showMessageDialog(null,"SUCCESSFUL","BINGO!",JOptionPane.PLAIN_MESSAGE,new ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\Image\\icons8_good_quality_32.png"));
              getInforGuestCar();
              rm.txtNameCar.setText("CAR'S NAME*");
              rm.txtNumberPlate.setText("CAR'S NUMBER PLATE*");
              rm.txtNameCar.setFont(new Font("Dubai Light", Font.ITALIC, 16));
              rm.txtNameCar.setForeground(new Color(133,173,173));
              rm.txtNumberPlate.setFont(new Font("Dubai Light", Font.ITALIC, 16));
              rm.txtNumberPlate.setForeground(new Color(133,173,173));
             
              rm.lbErrorNameCar.setVisible(false);
              rm.lbErrorNameCarEmpty.setVisible(false);
              rm.lbErrorNumberPlate.setVisible(false);
              rm.lbErrorNumberPlateEmpty.setVisible(false);           
              }

            }
        });
       
    }//GEN-LAST:event_btAddActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
        jLabel1.setVisible(true);
    }//GEN-LAST:event_jTextField1FocusLost
public void  filterData(String query)
{
    DefaultTableModel dtm= (DefaultTableModel)tbGuestCar.getModel();
    TableRowSorter<DefaultTableModel> tr= new TableRowSorter<DefaultTableModel>(dtm);
    tbGuestCar.setRowSorter(tr);
    tr.setRowFilter(RowFilter.regexFilter(query));
}
    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        String query=jTextField1.getText().toUpperCase();
        filterData(query);
    }//GEN-LAST:event_jTextField1KeyReleased

    private void tbGuestCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGuestCarMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dtm=(DefaultTableModel)tbGuestCar.getModel();
        int index=tbGuestCar.getSelectedRow();
        btAddService.setEnabled(true);
        setIdcar(String.valueOf(tbGuestCar.getValueAt(index, 0)));
        if(evt.getClickCount()==2)
        {
             btAddService.setEnabled(false);
            AddGuestCar a=new AddGuestCar();
            a.setVisible(true);
        
         //Dinh Dang lai Form dang ki
         a.setSize(400,580);
        a.btAdd.setVisible(false);
        a.lbAdd.setVisible(false);
        a.btUpdate.setVisible(true);
        a.lbUpdate.setVisible(true);
        a.btDelete.setVisible(true);
        a.lbDelete.setVisible(true);
        a.panelRegister.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black), "Updating", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(255, 255, 102)));
     
       
       //SET GIÁ TRỊ CHO CÁC TRƯỜNG
        //ID
        String id=String.valueOf(tbGuestCar.getValueAt(index, 0));
         
        //NAME
        String nameCar=String.valueOf(tbGuestCar.getValueAt(index, 1));
        a.txtNameCar.setText(String.valueOf(tbGuestCar.getValueAt(index, 1)));
        a.txtNameCar.setFont(new Font("Dialog",Font.BOLD,16));
        a.txtNameCar.setForeground(Color.black);
        
        
        //PHONE NUMBER 
        String numberPlate=String.valueOf(tbGuestCar.getValueAt(index, 2));
        a.txtNumberPlate.setText(numberPlate);
        a.txtNumberPlate.setFont(new Font("Dialog",Font.BOLD,16));
        a.txtNumberPlate.setForeground(Color.black);
        
         
        //ADDRESS
           String address=String.valueOf(tbGuestCar.getValueAt(index, 3));
        a.cbGuestName.setSelectedItem(String.valueOf(tbGuestCar.getValueAt(index, 3)));
        a.cbGuestName.setFont(new Font("Dialog",Font.BOLD,16));
        a.cbGuestName.setForeground(Color.black);
       
            a.btUpdate.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    if(checkInforGuestCar(a)==true)
                    {
                  a.setSize(400,580);
                 String nameCar=a.txtNameCar.getText().trim().replaceAll("\\s+", " ").toUpperCase();
                 String numberPlate=a.txtNumberPlate.getText().trim().replaceAll("\\s+", " ").toUpperCase();
                 //String guestName=String.valueOf(a.cbGuestName.getEditor().getItem());
                        updateInforGuestCar(nameCar, numberPlate, String.valueOf(a.cbGuestID.getEditor().getItem()), id);
                        JOptionPane.showMessageDialog(null,"SUCCESSFUL","BINGO!",JOptionPane.PLAIN_MESSAGE,new ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\Image\\icons8_good_quality_32.png"));
                        getInforGuestCar();
                        a.dispose();
                    }
                }
            });
            a.btDelete.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    AddAccessoriesAndService as=new AddAccessoriesAndService();
                  int input=JOptionPane.showConfirmDialog(null, "Are You Sure For Deleting This Car?", "CONFIRM", JOptionPane.YES_NO_OPTION);
                  if(input==0)
                  {
                   as.deleteAllServiceDetail(id);
                   for(String idAccess:as.getAccessoryIDfromIDCar(id))
                   {
                       String quantityAccessDetail="-"+String.valueOf(as.getQuantityFromAccessoriDetail(idAccess, id));
                       as.subtractQuantity(idAccess, quantityAccessDetail);
                       as.deleteAccessDetail(idAccess, id);
                   }
                    deleteGuestCar(id);
                    
                    JOptionPane.showMessageDialog(null,"SUCCESSFUL","BINGO!",JOptionPane.PLAIN_MESSAGE,new ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\Image\\icons8_good_quality_32.png"));
                    getInforGuestCar();
                    a.dispose();
                  }
                }
            });
        }
        
        
    }//GEN-LAST:event_tbGuestCarMouseClicked

    private void btAddServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddServiceActionPerformed
        // TODO add your handling code here:
        AddAccessoriesAndService as=new AddAccessoriesAndService();
        as.setVisible(true);
        as.getInforAccessoriesDetail(getIdcar());
        as.lbNameCar.setText(getNameCarFromId(getIdcar()));
        as.getInforServiceDetail(getIdcar());
        as.lbAddAccess.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent t)
            {
                        AddAccessoryForCar fc=new AddAccessoryForCar();
                        fc.setVisible(true);
                        
                        fc.btAdding.addActionListener(new ActionListener()
                         {
                            public void actionPerformed (ActionEvent t)
                            {
            
                                if(as.checkValidateAccessory(fc)==true)
                                {
                                    String accessoryName=String.valueOf(fc.cbAccessoriName.getEditor().getItem());
                                    String quantity=fc.txtQuantity.getText();
                                    if(as.checkExist(as.changeNameAccessoryIntoIDAccessory(accessoryName),getIdcar())==false)
                                    {
                                            as.addAccessForEveryCar(as.changeNameAccessoryIntoIDAccessory(accessoryName), getIdcar(), quantity);
                                            as.getInforAccessoriesDetail(getIdcar());
                                            as.subtractQuantity( as.changeNameAccessoryIntoIDAccessory(accessoryName), quantity);
                                            JOptionPane.showMessageDialog(null,"SUCCESSFUL","BINGO!",JOptionPane.PLAIN_MESSAGE,new ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\Image\\icons8_good_quality_32.png"));
                                            fc.getComboBoxNameAccessoriWithUpdate();
                                    }
                                    else
                                    {
                                        as.updateQuantity(as.changeNameAccessoryIntoIDAccessory(accessoryName),getIdcar(), quantity);
                                        as.getInforAccessoriesDetail(getIdcar());
                                         as.subtractQuantity( as.changeNameAccessoryIntoIDAccessory(accessoryName), quantity);
                                        JOptionPane.showMessageDialog(null,"SUCCESSFUL","BINGO!",JOptionPane.PLAIN_MESSAGE,new ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\Image\\icons8_good_quality_32.png"));
                                        fc.getComboBoxNameAccessoriWithUpdate();
                                    }
                                            
                                }
  
                            }
                          });
                         
            }
        });
        as.tbAccessories.addMouseListener(new MouseAdapter() {
            
            public void mouseClicked(MouseEvent e)
            {
                 getInforGuestCar();
                DefaultTableModel dtm=(DefaultTableModel)as.tbAccessories.getModel();
                int index=as.tbAccessories.getSelectedRow();
                if(e.getClickCount()==2)
                {
                    AddAccessoryForCar afc=new AddAccessoryForCar();
                    afc.getComboBoxNameAccessori();
                    afc.setVisible(true);
                    afc.btAdding.setVisible(false);
                    afc.lbAdding.setVisible(false);
                    afc.lbUpdate.setVisible(true);
                    afc.lbDelete.setVisible(true);
                    afc.btDelete.setVisible(true);
                    afc.btUpdate.setVisible(true);
                    afc.cbAccessoriName.setEditable(false);
                    afc.panelRegister.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black), "Update Accessories", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(255, 255, 102)));
           //CẦN MÃ XE VỚI MÃ LINH KIỆN ĐỂ SỬA
           //TỪ BẢNG LẤY ĐƯỢC TÊN PHẢI CHUYỂN TÊN VỀ ID ĐỂ CHỈNH SỬA
           
           String id =as.changeNameAccessoryIntoIDAccessory(String.valueOf(as.tbAccessories.getValueAt(index, 0)));   
           String nameAccess=String.valueOf(as.tbAccessories.getValueAt(index, 0));
           String quantity=String.valueOf(as.tbAccessories.getValueAt(index, 1));
           String price=String.valueOf(as.tbAccessories.getValueAt(index, 2));
           
           //SET GIÁ TRỊ CHO CÁC COMPONENT KHI CLICK VÀO
           afc.cbAccessoriName.setSelectedItem(nameAccess);
           afc.txtPrice.setText(String.valueOf(Integer.parseInt(price)/Integer.parseInt(quantity)));
           afc.txtQuantity.setText(quantity);
           afc.txtQuantity.setForeground(Color.black);
           afc.txtQuantity.setFont(new Font("dialog",Font.BOLD,16));
           afc.btUpdate.addActionListener(new ActionListener()
                         {
                            public void actionPerformed(ActionEvent t)
                            {
                                   String accessoryName=String.valueOf(afc.cbAccessoriName.getEditor().getItem());
                                    String quantity=afc.txtQuantity.getText();
                                    String id=as.changeNameAccessoryIntoIDAccessory(accessoryName);
                                     
                                if(as.checkValidateAccessoryWithUpdate(afc,id,getIdcar()    )==true)
                                {
                                 
                                    int quantityDetail=as.getQuantityFromAccessoriDetail(id, getIdcar());
                                    int quantityAdd=Integer.valueOf(quantity);
                                    int check=quantityAdd-quantityDetail;
                                    if(check>0)
                                    {

                                        as.updateQuantityWithBtUpdate(id, getIdcar(), quantity);
                                        as.subtractQuantity( id, String.valueOf(check));
                                        afc.dispose();
                                        JOptionPane.showMessageDialog(null,"SUCCESSFUL","BINGO!",JOptionPane.PLAIN_MESSAGE,new ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\Image\\icons8_good_quality_32.png"));
                                        as.getInforAccessoriesDetail(getIdcar());
                                        
                                    }
                                    else 
                                    { 
                                        as.updateQuantityWithBtUpdate(id, getIdcar(), quantity);
                                        as.subtractQuantity( id, String.valueOf(check));
                                        afc.dispose();
                                        JOptionPane.showMessageDialog(null,"SUCCESSFUL","BINGO!",JOptionPane.PLAIN_MESSAGE,new ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\Image\\icons8_good_quality_32.png"));
                                        as.getInforAccessoriesDetail(getIdcar());
                                    }
             
                                }
  
                            }
                          });
                        afc.btDelete.addActionListener(new ActionListener()
                        {
                            public void actionPerformed(ActionEvent t)
                            {
                               as.deleteAccessDetail(id, getIdcar());
                               String quantity="-"+afc.txtQuantity.getText();
                               afc.dispose();    
                               as.subtractQuantity( id, quantity);
                               JOptionPane.showMessageDialog(null,"SUCCESSFUL","BINGO!",JOptionPane.PLAIN_MESSAGE,new ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\Image\\icons8_good_quality_32.png"));
                               as.getInforAccessoriesDetail(getIdcar());
                               
                            }
                        });
           
                }
            }
        });

        as.lbTextAccessories.addMouseListener(new MouseAdapter() {
            
             public void mouseClicked(MouseEvent t)
            {
                        AddAccessoryForCar fc=new AddAccessoryForCar();
                        fc.setVisible(true);
                         fc.btAdding.addActionListener(new ActionListener()
                         {
                            public void actionPerformed(ActionEvent t)
                            {

                                if(as.checkValidateAccessory(fc)==true)
                                {
                                    
                                String accessoryName=String.valueOf(fc.cbAccessoriName.getEditor().getItem());
                                String quantity=fc.txtQuantity.getText();
                                as.addAccessForEveryCar(as.changeNameAccessoryIntoIDAccessory(accessoryName), getIdcar(), quantity);
                                as.getInforAccessoriesDetail(getIdcar());
                                JOptionPane.showMessageDialog(null,"SUCCESSFUL","BINGO!",JOptionPane.PLAIN_MESSAGE,new ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\Image\\icons8_good_quality_32.png"));
                                }
  
                            }
        });
            }
        });
       
        
        as.lbAddService.addMouseListener(new MouseAdapter() {
            
            public void mouseClicked(MouseEvent t)
            {
                    AddServicesForCar sf=new AddServicesForCar();
                    sf.setVisible(true);
                    sf.cbServiceName.setEditable(false);
                        sf.btAdding.addActionListener(new ActionListener()
                         {
                            public void actionPerformed(ActionEvent t)
                            {
 
                                String serviceName=String.valueOf(sf.cbServiceName.getEditor().getItem());
                                if(as.checkExistForServiceEachCar(as.changeNameServiceIntoIDService(serviceName), getIdcar())==true)
                                {
                                as.addServiceForEveryCar(as.changeNameServiceIntoIDService(serviceName), getIdcar());
                                as.getInforServiceDetail(getIdcar());
                                JOptionPane.showMessageDialog(null,"SUCCESSFUL","BINGO!",JOptionPane.PLAIN_MESSAGE,new ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\Image\\icons8_good_quality_32.png"));
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(null, "YOUR SERVICE'S EXISTING","FAILED",JOptionPane.ERROR_MESSAGE);
                                }
  
                            }
        });
            
            }
        });
        
            as.tbService.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent m)
                {
                 int index=as.tbService.getSelectedRow();
                 String nameService=String.valueOf(as.tbService.getValueAt(index, 0));
                 String price=String.valueOf(as.tbService.getValueAt(index, 1));
                    if(m.getClickCount()==2)
                    {
                    AddServicesForCar sf=new AddServicesForCar();
                    sf.setVisible(true);
                    sf.btAdding.setVisible(false);
                    sf.lbAdding.setVisible(false);
                    sf.btDelete.setVisible(true);
                    sf.lbDelete.setVisible(true);
                    
                    sf.btDelete.addActionListener(new ActionListener()
                    {
                        public void actionPerformed(ActionEvent a)
                        {
                           as.deleteServiceDetail(as.changeNameServiceIntoIDService(nameService), getIdcar());
                           as.getInforServiceDetail(getIdcar());
                           JOptionPane.showMessageDialog(null,"SUCCESSFUL","BINGO!",JOptionPane.PLAIN_MESSAGE,new ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\Image\\icons8_good_quality_32.png"));
                           sf.dispose();
                        }
                    });
                    
                    
                    }
                }
            });

    }//GEN-LAST:event_btAddServiceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        getInforGuestCar();
    }//GEN-LAST:event_jButton1ActionPerformed
public void getInforGuestCar()
    {
      
        DefaultTableModel dtm=(DefaultTableModel)tbGuestCar.getModel();
        dtm.setRowCount(0);
        tbGuestCar.setModel(dtm);
        tbGuestCar.getColumnModel().getColumn(0).setPreferredWidth(3);
        tbGuestCar.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbGuestCar.getColumnModel().getColumn(2).setPreferredWidth(85);
        tbGuestCar.getColumnModel().getColumn(3).setPreferredWidth(230);
        tbGuestCar.setRowHeight(30);
        tbGuestCar.setAutoResizeMode(tbGuestCar.AUTO_RESIZE_LAST_COLUMN);
        Connection c=Connecting.Connect();
        String sql="Select * from XeKhach";
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
              
                v.add(changeIDGuestIntoName(rs.getString(4)));
                dtm.addRow(v);
                }
            }
            tbGuestCar.setModel(dtm);
            rs.close();
            pr.close();
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(upDateStaffPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }



public String changeNameGuestIntoId(String nameGuest,String phoneNumber)
{
    String id;
        try {
            Connection c=Connect();
            //TRUY SUẤT CÓ DẤU NÊN PHẢI DÙNG LỆNH KHÁC 
            String sql="Select MAKH from KhachHang where TENKH like N'%" + nameGuest + "%' and SDT='"+phoneNumber+"'";
            PreparedStatement pr=c.prepareStatement(sql);
            ResultSet rs=pr.executeQuery();
            while(rs.next())
            {
                setGetId(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(updateGuestCar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return getGetId();
}



public String changeIDGuestIntoName(String id)
{
        try {
            Connection c=Connect();
            //TRUY SUẤT CÓ DẤU NÊN PHẢI DÙNG LỆNH KHÁC 
            String sql="Select TENKH from KhachHang where MAKH='"+id+"'";
            PreparedStatement pr=c.prepareStatement(sql);
            ResultSet rs=pr.executeQuery();
            while(rs.next())
            {
                setGetName(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(updateGuestCar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return getGetName();
}
public String getNameCarFromId(String id)
{
        try {
            Connection c=Connect();
            //TRUY SUẤT CÓ DẤU NÊN PHẢI DÙNG LỆNH KHÁC 
            String sql="Select HIEUXE,BIENSO from XeKhach where MAXE='"+id+"'";
            PreparedStatement pr=c.prepareStatement(sql);
            ResultSet rs=pr.executeQuery();
            while(rs.next())
            {
                setGetName(rs.getString(1)+"     "+rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(updateGuestCar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return getGetName();
}
//public String getFromId(String id)
//{
//        try {
//            Connection c=Connect();
//            //TRUY SUẤT CÓ DẤU NÊN PHẢI DÙNG LỆNH KHÁC 
//            String sql="Select HIEUXE,BIENSO from XeKhach where MAXE='"+id+"'";
//            PreparedStatement pr=c.prepareStatement(sql);
//            ResultSet rs=pr.executeQuery();
//            while(rs.next())
//            {
//                setGetName(rs.getString(1)+"-"+rs.getString(2));
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(updateGuestCar.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return getGetName();
//}
    private void addGuestCar(String nameCar,String numberPlate,String guestID)
    {
        try {
            Connection connect=Connect();
            String sql1=" insert into XeKhach values (?,?,?,?)";
            PreparedStatement pr1=connect.prepareStatement(sql1);
            pr1.setString(1, nameCar);
            pr1.setString(2, numberPlate);
            pr1.setString(3, guestID);
            pr1.setString(4, "0");
            pr1.executeUpdate();
            pr1.close();
            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegisterMember.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  private void updateInforGuestCar(String nameCar,String numberPlate,String guestID,String id)
 {
   Connection c=Connect();
   String sql="update XeKhach set HIEUXE=?,BIENSO=?,MAKH=? where MAXE=?";
        try {
            PreparedStatement pr=c.prepareStatement(sql);
            pr.setString(1, nameCar);
            pr.setString(2, numberPlate);
            pr.setString(3, guestID);
            pr.setString(4, id);
            pr.executeUpdate();
            pr.close();
            c.close();
        } catch (SQLException ex) {
           System.out.print("HELLO");
        }
     
 }
   public void updateStateGuestCar(String idCar,String state)
 {
   Connection c=Connect();
   String sql="update XeKhach set TRANGTHAI=? where MAXE=?";
        try {
            PreparedStatement pr=c.prepareStatement(sql);
            pr.setString(1, state);
            pr.setString(2, idCar);
            pr.executeUpdate();
            pr.close();
            c.close();
              getInforGuestCar();
        } catch (SQLException ex) {
           System.out.print("HELLO");
        }
     
 }
   public boolean checkExistNumberPlate(String numberPlate)
   {
       setCheck(false);
        try {
            Connection c=Connect();
            String sql="Select BIENSO,TRANGTHAI from XeKhach";
            PreparedStatement pr=c.prepareStatement(sql);
            ResultSet rs=pr.executeQuery();
            while(rs.next())
            {
               if(rs.getString(1).equals(numberPlate) && rs.getString(2).equals("0"))
               {
                   setCheck(true);
                   break;
               }
            }
        } catch (SQLException ex) {
            Logger.getLogger(updateGuestCar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isCheck();
   }
  public ArrayList<String> getIDCarList(String idGuest)
   {
       Connection c=Connecting.Connect();
       ArrayList<String> tempArr=new ArrayList();
        String sql="select MAXE from XeKhach where MAKH='"+idGuest+"'";
        try {
            PreparedStatement pr=c.prepareStatement(sql);
            ResultSet rs=pr.executeQuery();
            while(rs.next())
            {
                tempArr.add(String.valueOf(rs.getString(1)));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(upDateStaffPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tempArr;
   }
   public void deleteGuestCar(String id)
     {
         Connection c=Connect();
         String sql="delete from XeKhach where MAXE=?";
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

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btAddService;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbIconGuestCar;
    public javax.swing.JTable tbGuestCar;
    // End of variables declaration//GEN-END:variables
}
