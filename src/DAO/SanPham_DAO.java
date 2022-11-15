/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import DTO.SanPham_DTO;
import DTO.DonVi_DTO;
import java.sql.Connection;
import java.util.List;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author datsu
 */
public class SanPham_DAO {
    Connection connection = JDBCConnectionSQLServer.getJDBCConnection();

    public List<SanPham_DTO> getAllProduct(){
        List<SanPham_DTO> listProduct = new ArrayList<>();
        
        String sql = "SELECT MASP,TENSP, DV.TENDV AS DVTC , GIANHAP_DVTC, GIABANSI_DVTC, GIABANLE_DVTC, DV1.TENDV AS DVTP, GIABANSI_DVTP, GIABANLE_DVTP, QUIDOI FROM SANPHAM SP JOIN DONVI DV ON  DV.MADV = SP.DVTCHINH JOIN DONVI DV1 ON DV1.MADV = SP.DVTPHU";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                SanPham_DTO product = new SanPham_DTO();
                
                product.setMaSP(rs.getString("MASP"));
                product.setTenSP(rs.getString("TENSP"));
                product.setDvtChinh(rs.getString("DVTC"));
                product.setGiaNhap_DVTC(rs.getFloat("GIANHAP_DVTC"));
                product.setGiaBanSi_DVTC(rs.getFloat("GIABANSI_DVTC"));
                product.setGiaBanLe_DVTC(rs.getFloat("GIABANLE_DVTC"));
                product.setDvtPhu(rs.getString("DVTP"));
                product.setGiaBanSi_DVTP(rs.getFloat("GIABANSI_DVTP"));
                product.setGiabanLe_DVTP(rs.getFloat("GIABANLE_DVTP"));
                product.setQuiDoi(rs.getInt("QUIDOI"));
                
                listProduct.add(product);
            }
            
            return listProduct;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    public int getQuiDoiByMASP(String maSP){
        
        int slQuyDoi = 0;
        String sql = "SELECT * FROM SANPHAM WHERE MASP = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maSP);
            ResultSet rs = preparedStatement.executeQuery();
            if(rs.next()){
                slQuyDoi = rs.getInt("QUIDOI");
                return slQuyDoi;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return slQuyDoi;
    }
    
    
    
    public void AddProduct(SanPham_DTO product){
        String sql = "INSERT INTO SANPHAM(MASP,TENSP, DVTCHINH, GIANHAP_DVTC, GIABANSI_DVTC, GIABANLE_DVTC, DVTPHU, GIABANSI_DVTP, GIABANLE_DVTP, QUIDOI) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getMaSP());
            preparedStatement.setString(2, product.getTenSP());
            preparedStatement.setString(3, product.getDvtChinh());
            preparedStatement.setFloat(4, product.getGiaNhap_DVTC());
            preparedStatement.setFloat(5, product.getGiaBanSi_DVTC());
            preparedStatement.setFloat(6, product.getGiaBanLe_DVTC());
            preparedStatement.setString(7, product.getDvtPhu());
            preparedStatement.setFloat(8, product.getGiaBanSi_DVTP());
            preparedStatement.setFloat(9, product.getGiabanLe_DVTP());
            preparedStatement.setInt(10, product.getQuiDoi());
            
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void UpdateProduct(SanPham_DTO product){
        String sql = "UPDATE SANPHAM SET TENSP = ?, DVTCHINH = ?, GIANHAP_DVTC = ?, GIABANSI_DVTC = ?, GIABANLE_DVTC = ?, DVTPHU = ?, GIABANSI_DVTP = ?, GIABANLE_DVTP = ?, QUIDOI = ? WHERE MASP = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getTenSP());
            preparedStatement.setString(2, product.getDvtChinh());
            preparedStatement.setFloat(3, product.getGiaNhap_DVTC());
            preparedStatement.setFloat(4, product.getGiaBanSi_DVTC());
            preparedStatement.setFloat(5, product.getGiaBanLe_DVTC());
            preparedStatement.setString(6, product.getDvtPhu());
            preparedStatement.setFloat(7, product.getGiaBanSi_DVTP());
            preparedStatement.setFloat(8, product.getGiabanLe_DVTP());
            preparedStatement.setInt(9, product.getQuiDoi());
            preparedStatement.setString(10, product.getMaSP());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void DeleteProduct(String maSP){
        String sql = "DELETE FROM SANPHAM WHERE MASP = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maSP);
            preparedStatement.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public List<SanPham_DTO> SearchProduct(String tenSP){
        List<SanPham_DTO> listProduct = new ArrayList<>();
        String sql = "SELECT * FROM SANPHAM WHERE TENSP LIKE N'%" + tenSP +"%'";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                SanPham_DTO product = new SanPham_DTO();
                
                product.setMaSP(rs.getString("MASP"));
                product.setTenSP(rs.getString("TENSP"));
                product.setDvtChinh(rs.getString("DVTCHINH"));
                product.setGiaNhap_DVTC(rs.getFloat("GIANHAP_DVTC"));
                product.setGiaBanSi_DVTC(rs.getFloat("GIABANSI_DVTC"));
                product.setGiaBanLe_DVTC(rs.getFloat("GIABANLE_DVTC"));
                product.setDvtPhu(rs.getString("DVTPHU"));
                product.setGiaBanSi_DVTP(rs.getFloat("GIABANSI_DVTP"));
                product.setGiabanLe_DVTP(rs.getFloat("GIABANLE_DVTP"));
                product.setQuiDoi(rs.getInt("QUIDOI"));
                
                listProduct.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listProduct;
    }
    
    

}
