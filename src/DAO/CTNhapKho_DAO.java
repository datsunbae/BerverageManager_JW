/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.CT_NhapKho_DTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author datsu
 */
public class CTNhapKho_DAO {
    Connection connection = JDBCConnectionSQLServer.getJDBCConnection();
    
    public List<CT_NhapKho_DTO> getCTNhapKho(int maPNK){
        
        List<CT_NhapKho_DTO> listCTNK = new ArrayList<>();
        String sql = "SELECT * FROM CT_PNHAPKHO WHERE IDPNK = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, maPNK);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                CT_NhapKho_DTO ctnk = new CT_NhapKho_DTO();
                ctnk.setMaCT_PNK(rs.getInt("IDCTPNK"));
                ctnk.setMaPNK(rs.getInt("IDPNK"));
                ctnk.setMaSP(rs.getString("IDSP"));
                ctnk.setSoLuong(rs.getInt("SL"));
                ctnk.setMaDVT(rs.getString("DVT"));
                ctnk.setThanhTien(rs.getFloat("THANHTIEN"));
                
                
                listCTNK.add(ctnk);
            }
            return listCTNK;
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
    
    public void AddCTPhieuNhapKho(CT_NhapKho_DTO ctnk){
        String sql = "INSERT INTO CT_PNHAPKHO(IDPNK,IDSP, SL, DVT, THANHTIEN) VALUES (?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, ctnk.getMaPNK());
            preparedStatement.setString(2, ctnk.getMaSP());
            preparedStatement.setInt(3, ctnk.getSoLuong());
            preparedStatement.setString(4, ctnk.getMaDVT());
            preparedStatement.setFloat(5, ctnk.getThanhTien());
            
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
