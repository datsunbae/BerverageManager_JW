/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.DonVi_DAO;
import DTO.DonVi_DTO;
import java.util.List;

/**
 *
 * @author datsu
 */
public class DonVi_BUS {
    
    DonVi_DAO donVi_DAO;
    
    public DonVi_BUS() {
        donVi_DAO = new DonVi_DAO();
    }
    
    public List<DonVi_DTO> getAllDVT(){
        return donVi_DAO.getAllDVT();
    }

    public List<DonVi_DTO> getAllDVTChinh(){
        return donVi_DAO.getAllDVTChinh();
    }
    
    public List<DonVi_DTO> getAllDVTPhu(){
        return donVi_DAO.getAllDVTPhu();
    }
    
    public DonVi_DTO getDVTCByTenDVT(String tenDVT, List<DonVi_DTO> listDVT){
        return donVi_DAO.getDVTCByTenDVT(tenDVT, listDVT);
    }
}
