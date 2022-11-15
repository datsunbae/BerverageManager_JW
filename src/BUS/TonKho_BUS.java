/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.TonKho_DAO;
import DTO.TonKho_DTO;
import java.util.List;

/**
 *
 * @author datsu
 */
public class TonKho_BUS {
    TonKho_DAO tonKho_DAO;

    public TonKho_BUS() {
        tonKho_DAO = new TonKho_DAO();
    }
    
    public List<TonKho_DTO> getAllTonKho() {
        return tonKho_DAO.getAllTonKho();
    }
    
    public void AddTonKho(TonKho_DTO tk) {
        tonKho_DAO.AddTonKho(tk);
    }
    
    public void UpdateTonKho(TonKho_DTO tk) {
        tonKho_DAO.UpdateTonKho(tk);
    }
    
    public void DeleteTonKho(String maSP) {
        tonKho_DAO.DeleteTonKho(maSP);
    }
    
    public List<TonKho_DTO> SearchTonKho(String tenSP){
        return tonKho_DAO.SearchTonKho(tenSP);
    }
}
