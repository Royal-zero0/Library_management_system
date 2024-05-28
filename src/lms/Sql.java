/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author anonymous
 */
public class Sql {
   
    
    
    
    PreparedStatement pst;
    Connection con;
    public Connection connect() {  
    try{  
        Class.forName("com.mysql.jdbc.Driver");  
       return  con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/LMS","root","hackvirus");  
   
        }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(null,e);}

     return  con;
    
    }
    
    
    
  
    
}
