/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.NhaCungCap_DTO;
import java.sql.Connection;
import java.util.List;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author datsu
 */
public class NhaCungCap_DAO {
    
    Connection connection = JDBCConnectionSQLServer.getJDBCConnection();

    public NhaCungCap_DAO() {
    }
    
    public List<NhaCungCap_DTO> getAllSupplier(){
        
        List<NhaCungCap_DTO> listSupplier = new ArrayList<>();
        
        String sql = "SELECT * FROM NHACUNGCAP";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
               NhaCungCap_DTO ncc = new NhaCungCap_DTO();
                
               ncc.setMaNCC(rs.getString("MANCC"));
               ncc.setTenNCC(rs.getString("TENNCC"));
               ncc.setSdtNCC(rs.getString("SDTNCC"));
               ncc.setEmailNCC(rs.getString("EMAILNCC"));
               ncc.setDiaChiNCC(rs.getString("DIACHINCC"));
               
               listSupplier.add(ncc);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listSupplier;  
    }
    
    public void AddSupplier(NhaCungCap_DTO ncc){
        String sql = "INSERT INTO NHACUNGCAP VALUES(?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ncc.getMaNCC());
            preparedStatement.setString(2, ncc.getTenNCC());
            preparedStatement.setString(3, ncc.getSdtNCC());
            preparedStatement.setString(4, ncc.getEmailNCC());
            preparedStatement.setString(5, ncc.getDiaChiNCC());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void UpdateSupplier(NhaCungCap_DTO ncc){
        String sql = "UPDATE NHACUNGCAP SET TENNCC = ?, SDTNCC = ?, EMAILNCC = ?, DIACHINCC = ? WHERE MANCC = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, ncc.getTenNCC());
            preparedStatement.setString(2, ncc.getSdtNCC());
            preparedStatement.setString(3, ncc.getEmailNCC());
            preparedStatement.setString(4, ncc.getDiaChiNCC());
            preparedStatement.setString(5, ncc.getMaNCC());
            
            preparedStatement.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void DeleteSupplier(String maNCC){
        String sql = "DELETE FROM NHACUNGCAP WHERE MANCC = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maNCC);
            preparedStatement.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
    

    
    public List<NhaCungCap_DTO> SearchSupplier(String tenNCC){
        List<NhaCungCap_DTO> listSupplier = new ArrayList<>();
        String sql = "SELECT * FROM NHACUNGCAP WHERE TENNCC LIKE N'%" + tenNCC +"%'";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                NhaCungCap_DTO ncc = new NhaCungCap_DTO();
                
                ncc.setMaNCC(rs.getString("MANCC"));
                ncc.setTenNCC(rs.getString("TENNCC"));
                ncc.setSdtNCC(rs.getString("SDTNCC"));
                ncc.setEmailNCC(rs.getString("EMAILNCC"));
                ncc.setDiaChiNCC(rs.getString("DIACHINCC"));
                
                listSupplier.add(ncc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listSupplier;
    }
    
    
}
