/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.NhapKho_DTO;
import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author datsu
 */
public class NhapKho_DAO {
     Connection connection = JDBCConnectionSQLServer.getJDBCConnection();
     
     public List<NhapKho_DTO> getAllPhieuNhapKho(){
         
        List<NhapKho_DTO> listNK = new ArrayList<>();
        String sql = "SELECT MAPNK, FORMAT (NGAYNHAP, 'dd/MM/yyyy') as NGAYNK, TONGTIEN, IDNV, IDNCC FROM NHAPKHO";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                NhapKho_DTO nk = new NhapKho_DTO();
                nk.setMaPNK(rs.getInt("MAPNK"));
                nk.setNgayNhap(rs.getString("NGAYNK"));
                nk.setTongTien(rs.getFloat("TONGTIEN"));
                nk.setMaNV(rs.getString("IDNV"));
                nk.setMaNCC(rs.getString("IDNCC"));
 
                listNK.add(nk);
            }
            return listNK;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
         return null;
     }
     
     public void AddCTPhieuNhapKho(NhapKho_DTO nk){
        String sql = "INSERT INTO NHAPKHO(NGAYNHAP,TONGTIEN, IDNV, IDNCC) VALUES (?, ?, ?, ?)";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nk.getNgayNhap());
            preparedStatement.setFloat(2, nk.getTongTien());
            preparedStatement.setString(3, nk.getMaNV());
            preparedStatement.setString(4, nk.getMaNCC());
            
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     
    public List<NhapKho_DTO> listSearchPNK(String ngaylap){
        List<NhapKho_DTO> listNK = new ArrayList<>();
        String sql = "SELECT MAPNK, FORMAT (NGAYNHAP, 'dd/MM/yyyy') as NGAYNK, TONGTIEN, IDNV, IDNCC FROM NHAPKHO WHERE NGAYNHAP = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ngaylap);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                NhapKho_DTO nk = new NhapKho_DTO();
                nk.setMaPNK(rs.getInt("MAPNK"));
                nk.setNgayNhap(rs.getString("NGAYNK"));
                nk.setTongTien(rs.getFloat("TONGTIEN"));
                nk.setMaNV(rs.getString("IDNV"));
                nk.setMaNCC(rs.getString("IDNCC"));
 
                listNK.add(nk);
            }
            
            return listNK;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
}
