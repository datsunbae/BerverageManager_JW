/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.TaiKhoan_DTO;
import java.sql.Connection;
import java.util.List;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author trcaodai
 */
public class TaiKhoan_DAO {
    Connection connection = JDBCConnectionSQLServer.getJDBCConnection();
    
    
    public TaiKhoan_DTO LayTaiKhoanBangMTK(String maSP){
        String sql = "SELECT * FROM TAIKHOAN WHERE MADANGNHAP = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maSP);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                TaiKhoan_DTO tk = new TaiKhoan_DTO();
                tk.setMaTK(rs.getString("MADANGNHAP"));
                tk.setMatKhau(rs.getString("MATKHAU"));
                return tk;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
