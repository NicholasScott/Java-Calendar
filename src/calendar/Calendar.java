/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calendar;
import javax.swing.JFrame;
import java.sql.*;

/**
 *
 * @author Nick
 */
public class Calendar {
        Connection conn = null;
    /**
     * @throws java.sql.SQLException
     */
    public void Connect() throws SQLException{
       
        try{
        conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/calendar","Nick","Password");    
        }
        catch(SQLException ex){
            System.out.println("ERROR: " + ex.getMessage());
        }
     }
  
    public static void main(String[] args) throws SQLException {
     
       Calendar cal = new Calendar();
       cal.Connect();
       JFrame mainFrame = new JFrame();
       CalendarWindow dcw = new CalendarWindow();
       mainFrame.add(dcw);
       mainFrame.pack();
       mainFrame.setVisible(true);
       mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
}