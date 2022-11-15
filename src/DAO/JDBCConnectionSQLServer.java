/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author datsu
 */
public class JDBCConnectionSQLServer {
    public static Connection getJDBCConnection(){
        
        String user = "sa";
        String password = "123456";
        String serverName = "DESKTOP-60C14JF";
        String dbName = "QuanLyNuocGiaiKhat";
        String url = "jdbc:sqlserver://" + serverName + ":1433;DatabaseName=" + dbName + ";user=" + user + ";password=" + password + ";encrypt=true;trustServerCertificate=true";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            return DriverManager.getConnection(url);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnectionSQLServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
        
    } 
    
}
