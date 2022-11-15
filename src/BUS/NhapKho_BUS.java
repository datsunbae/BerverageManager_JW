/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.NhapKho_DAO;
import DTO.NhapKho_DTO;
import java.util.List;

/**
 *
 * @author datsu
 */
public class NhapKho_BUS {
    NhapKho_DAO nhapKho_DAO;

    public NhapKho_BUS() {
        nhapKho_DAO = new NhapKho_DAO();
    }
    
    public List<NhapKho_DTO> getAllPhieuNhapKho() {
        return nhapKho_DAO.getAllPhieuNhapKho();
    }
    
    public void AddCTPhieuNhapKho(NhapKho_DTO nk) {
         nhapKho_DAO.AddCTPhieuNhapKho(nk);
    }
    
    public List<NhapKho_DTO> listSearchPNK(String ngaylap) {
        return nhapKho_DAO.listSearchPNK(ngaylap);
    }
    
    
}
