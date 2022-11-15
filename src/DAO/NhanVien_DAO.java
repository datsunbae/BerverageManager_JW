/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.NhanVien_DTO;
import java.sql.Connection;
import java.util.List;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author datsu
 */
public class NhanVien_DAO {
    
    Connection connection = JDBCConnectionSQLServer.getJDBCConnection();
    
    public List<NhanVien_DTO> getAllStaff(){
        List<NhanVien_DTO> listStaff = new ArrayList<>();

        String sql = "Select * From NhanVien";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            
            while(rs.next()){
                NhanVien_DTO nv = new NhanVien_DTO();
                
                nv.setMaNV(rs.getString("MANV"));
                nv.setTenNV(rs.getString("TENNV"));
                nv.setSdtNV(rs.getString("SDTNV"));
                nv.setEmailNV(rs.getString("EMAILNV"));
                nv.setDiaChiNV(rs.getString("DIACHINV"));
                
                listStaff.add(nv);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listStaff;
    }
    
    public void AddStaff(NhanVien_DTO nv){
        
        String sql = "INSERT INTO NHANVIEN(MANV,TENNV, SDTNV, EMAILNV, DIACHINV) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nv.getMaNV());
            preparedStatement.setString(2, nv.getTenNV());
            preparedStatement.setString(3, nv.getSdtNV());
            preparedStatement.setString(4, nv.getEmailNV());
            preparedStatement.setString(5, nv.getDiaChiNV());
            
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void UpdateStaff(NhanVien_DTO nv){
        String sql = "UPDATE NHANVIEN SET TENNV = ?, SDTNV = ?, EMAILNV = ?, DIACHINV = ? WHERE MANV = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nv.getTenNV());
            preparedStatement.setString(2, nv.getSdtNV());
            preparedStatement.setString(3, nv.getEmailNV());
            preparedStatement.setString(4, nv.getDiaChiNV());
            preparedStatement.setString(5, nv.getMaNV());
            
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void DeleteStaff(String maNV){
        String sql = "DELETE FROM NHANVIEN WHERE MANV = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maNV);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<NhanVien_DTO> SearchStaff(String tenNV){
        List<NhanVien_DTO> listStaff = new ArrayList<>();
        String sql = "SELECT * FROM NHANVIEN WHERE TENNV LIKE N'%" + tenNV +"%'";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                NhanVien_DTO nv = new NhanVien_DTO();
                
                nv.setMaNV(rs.getString("MANV"));
                nv.setTenNV(rs.getString("TENNV"));
                nv.setSdtNV(rs.getString("SDTNV"));
                nv.setEmailNV(rs.getString("EMAILNV"));
                nv.setDiaChiNV(rs.getString("DIACHINV"));
                
                listStaff.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listStaff;
    }
    
}
