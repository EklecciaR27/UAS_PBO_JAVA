/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koneksi;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author ASUS
 */
public class dbKoneksi {
    Connection conn;
    public static Connection getKoneksi(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/dbtokoamplang", "root", "");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
        
    }
    
}
