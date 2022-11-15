/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.DonVi_DTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author datsu
 */
public class DonVi_DAO {
    
    Connection connection = JDBCConnectionSQLServer.getJDBCConnection();
    
    public List<DonVi_DTO> getAllDVT(){
        List<DonVi_DTO> listDVT = new ArrayList<>();
         String sql = "SELECT * FROM DONVI";
         
         try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()){
                DonVi_DTO dvt = new DonVi_DTO();
                dvt.setMaDV(rs.getString("MADV"));
                dvt.setTenDV(rs.getString("TENDV"));
                dvt.setDVTC(rs.getInt("DVTC"));
                listDVT.add(dvt);
            }
            
            return listDVT;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    
    public List<DonVi_DTO> getAllDVTChinh(){
        
        List<DonVi_DTO> listDVT = new ArrayList<>();
        String sql = "SELECT * FROM DONVI WHERE DVTC = 1";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()){
                DonVi_DTO dvt = new DonVi_DTO();
                dvt.setMaDV(rs.getString("MADV"));
                dvt.setTenDV(rs.getString("TENDV"));
                listDVT.add(dvt);
            }
            
            return listDVT;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    public List<DonVi_DTO> getAllDVTPhu(){
        List<DonVi_DTO> listDVT = new ArrayList<>();
        String sql = "SELECT * FROM DONVI WHERE DVTC = 0";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()){
                DonVi_DTO dvt = new DonVi_DTO();
                dvt.setMaDV(rs.getString("MADV"));
                dvt.setTenDV(rs.getString("TENDV"));
                listDVT.add(dvt);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listDVT;
    }
    
    public DonVi_DTO getDVTCByTenDVT(String tenDVT, List<DonVi_DTO> listDVT){
        for(DonVi_DTO dvt : listDVT){
            if(dvt.getTenDV().compareTo(tenDVT) == 0){
                return dvt;
            }
        }
        return null;
    }
}
