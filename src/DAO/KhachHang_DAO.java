/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.KhachHang_DTO;
import java.sql.Connection;
import java.util.List;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author datsu
 */
public class KhachHang_DAO {
    Connection connection = JDBCConnectionSQLServer.getJDBCConnection();
    
    public List<KhachHang_DTO> getAllCustomer(){
        List<KhachHang_DTO> listCustomer = new ArrayList<>();

        String sql = "Select * From KHACHHANG";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            
            while(rs.next()){
                KhachHang_DTO kh = new KhachHang_DTO();
                
                kh.setMaKH(rs.getString("MAKH"));
                kh.setTenKH(rs.getString("TENKH"));
                kh.setSdtKH(rs.getString("SDTKH"));
                kh.setEmailKH(rs.getString("EMAILKH"));
                kh.setDiaChiKH(rs.getString("DIACHIKH"));
                
                listCustomer.add(kh);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listCustomer;
    }
    
    public List<KhachHang_DTO> getAllKhachSi(){
        List<KhachHang_DTO> listCustomer = new ArrayList<>();

        String sql = "Select * From KHACHHANG WHERE MAKH != 'KH0'";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            
            while(rs.next()){
                KhachHang_DTO kh = new KhachHang_DTO();
                
                kh.setMaKH(rs.getString("MAKH"));
                kh.setTenKH(rs.getString("TENKH"));
                kh.setSdtKH(rs.getString("SDTKH"));
                kh.setEmailKH(rs.getString("EMAILKH"));
                kh.setDiaChiKH(rs.getString("DIACHIKH"));
                
                listCustomer.add(kh);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listCustomer;
    }
    
    public KhachHang_DTO KHLe(){
        String sql = "Select * From KHACHHANG WHERE MAKH = 'KH0'";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                KhachHang_DTO kh = new KhachHang_DTO();
                
                kh.setMaKH(rs.getString("MAKH"));
                kh.setTenKH(rs.getString("TENKH"));
                kh.setSdtKH(rs.getString("SDTKH"));
                kh.setEmailKH(rs.getString("EMAILKH"));
                kh.setDiaChiKH(rs.getString("DIACHIKH"));
                return kh;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
    
    public void AddCustomer(KhachHang_DTO kh){
        
        String sql = "INSERT INTO KHACHHANG(MAKH,TENKH, SDTKH, EMAILKH, DIACHIKH) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, kh.getMaKH());
            preparedStatement.setString(2, kh.getTenKH());
            preparedStatement.setString(3, kh.getSdtKH());
            preparedStatement.setString(4, kh.getEmailKH());
            preparedStatement.setString(5, kh.getDiaChiKH());
            
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void UpdateCustomer(KhachHang_DTO kh){
        String sql = "UPDATE KHACHHANG SET TENKH = ?, SDTKH = ?, EMAILKH = ?, DIACHIKH = ? WHERE MAKH = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, kh.getTenKH());
            preparedStatement.setString(2, kh.getSdtKH());
            preparedStatement.setString(3, kh.getEmailKH());
            preparedStatement.setString(4, kh.getDiaChiKH());
            preparedStatement.setString(5, kh.getMaKH());
            
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void DeleteCustomer(String maKH){
        String sql = "DELETE FROM KHACHHANG WHERE MAKH = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maKH);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<KhachHang_DTO> SearchCustomer(String tenKH){
        List<KhachHang_DTO> listCustomer = new ArrayList<>();
        String sql = "SELECT * FROM KHACHHANG WHERE TENKH LIKE N'%" + tenKH +"%'";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                KhachHang_DTO kh = new KhachHang_DTO();
                
                kh.setMaKH(rs.getString("MAKH"));
                kh.setTenKH(rs.getString("TENKH"));
                kh.setSdtKH(rs.getString("SDTKH"));
                kh.setEmailKH(rs.getString("EMAILKH"));
                kh.setDiaChiKH(rs.getString("DIACHIKH"));
                
                listCustomer.add(kh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listCustomer;
    }
    
}
