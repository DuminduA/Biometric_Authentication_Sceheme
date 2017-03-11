/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biometric.authentication;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author dumindu
 */
import org.sqlite.JDBC;
public class DbConnection {
    
    static Connection sqlite=null;
    
    public static Connection connect() {
        try{      
            Class.forName("org.sqlite.JDBC");
             sqlite =  DriverManager.getConnection("jdbc:sqlite:Database/Biometric_Authentication.sqlite");
             System.out.println("Database Connection established");
             return sqlite;    
        }catch(Exception e){
            System.out.println(e);
            System.out.println("Database Connection Failed");
            return null;
        }
        
        
    }
    
    
    
}
