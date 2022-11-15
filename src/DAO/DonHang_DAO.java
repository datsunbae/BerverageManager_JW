/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.DonHang_DTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author datsu
 */
public class DonHang_DAO {
    Connection connection = JDBCConnectionSQLServer.getJDBCConnection();
    
    public List<DonHang_DTO> getAllDonHang(){
         
        List<DonHang_DTO> listDH = new ArrayList<>();
        String sql = "SELECT MADH, FORMAT (NGAYLAP, 'dd/MM/yyyy') as NGAYLAPDH, IDNV, IDKH, TONGTIEN FROM DONHANG";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                DonHang_DTO dh = new DonHang_DTO();
                dh.setMaDH(rs.getInt("MADH"));
                dh.setNgayLap(rs.getString("NGAYLAPDH"));
                dh.setMaNV(rs.getString("IDNV"));
                dh.setMaKH(rs.getString("IDKH"));
                dh.setTongTien(rs.getFloat("TONGTIEN"));
 
                listDH.add(dh);
            }
            return listDH;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
         return null;
     }
    
    public void addDonHang(DonHang_DTO dh){
        String sql = "INSERT INTO DONHANG(NGAYLAP,IDNV, IDKH, TONGTIEN) VALUES (?, ?, ?, ?)";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, dh.getNgayLap());
            preparedStatement.setString(2, dh.getMaNV());
            preparedStatement.setString(3, dh.getMaKH());
            preparedStatement.setFloat(4, dh.getTongTien());
            
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public int getMaDHVuaThem(){
        int maDH = 0;
        String sql = "SELECT TOP 1 MADH FROM DONHANG ORDER BY MADH DESC";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                maDH = rs.getInt("MADH");
            }
            return maDH;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
    
    public List<DonHang_DTO> listSearchDH(String ngaylap){
        List<DonHang_DTO> listDH = new ArrayList<>();
        String sql = "SELECT MADH, FORMAT (NGAYLAP, 'dd/MM/yyyy') as NGAYLAPDH, IDNV, IDKH, TONGTIEN FROM DONHANG WHERE NGAYLAP = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ngaylap);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                DonHang_DTO dh = new DonHang_DTO();
                dh.setMaDH(rs.getInt("MADH"));
                dh.setNgayLap(rs.getString("NGAYLAPDH"));
                dh.setMaNV(rs.getString("IDNV"));
                dh.setMaKH(rs.getString("IDKH"));
                dh.setTongTien(rs.getFloat("TONGTIEN"));
 
                listDH.add(dh);
            }
            
            return listDH;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
}
