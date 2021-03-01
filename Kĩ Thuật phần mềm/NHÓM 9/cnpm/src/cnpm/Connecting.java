/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cnpm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class Connecting {

    /**
     * @param args the command line arguments
     */
 public static Connection Connect()
 {
    Connection c=null;
    String url="jdbc:sqlserver://;databaseName=QLGARA";
    String user="sa";
    String pass="123456";
     try {
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          c=DriverManager.getConnection(url, user, pass);
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(Connecting.class.getName()).log(Level.SEVERE, null, ex);
     }catch (SQLException ex) {
            
        }
     return c;
 }
    public static void main(String[] args) {
        Connect();
    }
    
}
