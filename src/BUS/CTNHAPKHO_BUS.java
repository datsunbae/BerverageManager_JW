/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.CTNhapKho_DAO;
import DTO.CT_NhapKho_DTO;
import java.util.List;

/**
 *
 * @author datsu
 */
public class CTNHAPKHO_BUS {
    CTNhapKho_DAO cTNhapKho_DAO;

    public CTNHAPKHO_BUS() {
        cTNhapKho_DAO = new CTNhapKho_DAO();
    }
    
    public List<CT_NhapKho_DTO> getCTNhapKho(int maPNK) {
        return cTNhapKho_DAO.getCTNhapKho(maPNK);
    }
    
    public void AddCTPhieuNhapKho(CT_NhapKho_DTO ctnk) {
       cTNhapKho_DAO.AddCTPhieuNhapKho(ctnk);
    }
    
    
}
