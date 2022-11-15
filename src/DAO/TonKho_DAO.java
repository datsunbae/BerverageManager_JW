/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import DTO.TonKho_DTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author datsu
 */
public class TonKho_DAO {
    Connection connection = JDBCConnectionSQLServer.getJDBCConnection();
    
    public List<TonKho_DTO> getAllTonKho(){
        List<TonKho_DTO> listTK = new ArrayList<>();
        
        String sql = "SELECT * FROM TONKHO WHERE SLTON > 0";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
        
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
              TonKho_DTO tk = new TonKho_DTO();
              tk.setId(rs.getInt("ID"));
              tk.setMaSP(rs.getString("IDSP"));
              tk.setSlTon(rs.getInt("SLTON"));
              tk.setSlTonQuiDoi(rs.getString("SLTONQUIDOI"));
              listTK.add(tk);
            }
            
            return listTK;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    public void AddTonKho(TonKho_DTO tk){
        String sql = "INSERT INTO TONKHO VALUES(?, ?, ?)";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, tk.getMaSP());
            preparedStatement.setInt(2, tk.getSlTon());
            preparedStatement.setString(3, tk.getSlTonQuiDoi());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void UpdateTonKho(TonKho_DTO tk){
        String sql = "UPDATE TONKHO SET SLTON = ?, SLTONQUIDOI = ? WHERE IDSP = ?";
      
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, tk.getSlTon());
            preparedStatement.setString(2, tk.getSlTonQuiDoi());
            preparedStatement.setString(3, tk.getMaSP());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void DeleteTonKho(String maSP){
        String sql = "DELETE FROM TONKHO WHERE IDSP = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maSP);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<TonKho_DTO> SearchTonKho(String tenSP){
        List<TonKho_DTO> lisTK = new ArrayList<>();
        
        String sql = "SELECT IDSP, SLTON, SLTONQUIDOI FROM TONKHO, SANPHAM WHERE TONKHO.IDSP = SANPHAM.MASP AND SANPHAM.TENSP LIKE N'%" + tenSP +"%'"; 
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                TonKho_DTO tk = new TonKho_DTO();
                tk.setMaSP(rs.getString("IDSP"));
                tk.setSlTon(rs.getInt("SLTON"));
                tk.setSlTonQuiDoi(rs.getString("SLTONQUIDOI"));
                
                lisTK.add(tk);
            }
            
            return lisTK;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
}
