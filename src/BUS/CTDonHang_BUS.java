/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.CTDonHang_DAO;
import DTO.CT_DonHang_DTO;
import java.util.List;

/**
 *
 * @author datsu
 */
public class CTDonHang_BUS {
    CTDonHang_DAO cTDonHang_DAO;

    public CTDonHang_BUS() {
        cTDonHang_DAO = new CTDonHang_DAO();
    }
    
    public List<CT_DonHang_DTO> getCTDonHang(int maDH){
        return cTDonHang_DAO.getCTDonHang(maDH);
    }
    
    public void addCTDonHang(CT_DonHang_DTO ctdh){
        cTDonHang_DAO.addCTDonHang(ctdh);
    }
    
}
