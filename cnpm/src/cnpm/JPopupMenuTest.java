/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cnpm;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author USER
 */
public class JPopupMenuTest extends JFrame {
    private JPopupMenu popup;
   public JPopupMenuTest() {
      setTitle("JPopupMenu Test");
      Container contentPane = getContentPane() ;
      popup = new JPopupMenu();
      // add menu items to popup
      popup.add(new JMenuItem("Cut"));
      popup.add(new JMenuItem("Copy"));
      popup.add(new JMenuItem("Paste"));
      popup.addSeparator();
      popup.add(new JMenuItem("SelectAll"));
      contentPane.addMouseListener(new MouseAdapter() {
         public void mouseReleased(MouseEvent me) {
            showPopup(me); // showPopup() is our own user-defined method
         }
      }) ;
      setSize(375, 250);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setVisible(true);
   }
   void showPopup(MouseEvent me) {
      if(me.isPopupTrigger())
         popup.show(me.getComponent(), me.getX(), me.getY());
   }
   public static void main(String args[]) {
      new JPopupMenuTest();
   }
}
