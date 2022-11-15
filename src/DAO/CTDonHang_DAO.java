/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.CT_DonHang_DTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author datsu
 */
public class CTDonHang_DAO {
    Connection connection = JDBCConnectionSQLServer.getJDBCConnection();
    
    public List<CT_DonHang_DTO> getCTDonHang(int maDH){
        
        List<CT_DonHang_DTO> listDH = new ArrayList<>();
        String sql = "SELECT * FROM CT_DONHANG WHERE MADH = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, maDH);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                CT_DonHang_DTO ctdh = new CT_DonHang_DTO();
                ctdh.setMaCT_DH(rs.getInt("IDCTDH"));
                ctdh.setMaDH(rs.getInt("MADH"));
                ctdh.setMaSP(rs.getString("MASP"));
                ctdh.setSoLuong(rs.getInt("SL"));
                ctdh.setMaDVT(rs.getString("DVT"));
                ctdh.setThanhTien(rs.getFloat("THANHTIEN"));
                
                
                listDH.add(ctdh);
            }
            return listDH;
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
    
    public void addCTDonHang(CT_DonHang_DTO ctdh){
        String sql = "INSERT INTO CT_DONHANG(MADH, MASP, SL, DVT, THANHTIEN) VALUES (?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, ctdh.getMaDH());
            preparedStatement.setString(2, ctdh.getMaSP());
            preparedStatement.setInt(3, ctdh.getSoLuong());
            preparedStatement.setString(4, ctdh.getMaDVT());
            preparedStatement.setFloat(5, ctdh.getThanhTien());
            
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
