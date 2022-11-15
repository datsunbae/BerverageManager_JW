/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.DonHang_DAO;
import DTO.DonHang_DTO;
import java.util.List;

/**
 *
 * @author datsu
 */
public class DonHang_BUS {
    DonHang_DAO donHang_DAO;

    public DonHang_BUS() {
        donHang_DAO = new DonHang_DAO();
    }
    
    public List<DonHang_DTO> getAllDonHang(){
        return donHang_DAO.getAllDonHang();
    }
    
    public void addDonHang(DonHang_DTO dh){
        donHang_DAO.addDonHang(dh);
    }
    
    public int getMaDHVuaThem(){
        return donHang_DAO.getMaDHVuaThem();
    }
    
    public List<DonHang_DTO> listSearchDH(String ngaylap){
        return donHang_DAO.listSearchDH(ngaylap);
    }
}
