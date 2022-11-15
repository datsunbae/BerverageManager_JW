/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.NhanVien_DAO;
import DTO.NhanVien_DTO;
import java.util.List;

/**
 *
 * @author datsu
 */
public class NhanVien_BUS {
    
    private NhanVien_DAO staff_DAO;

    public NhanVien_BUS() {
        staff_DAO = new NhanVien_DAO();
    }
    
    public List<NhanVien_DTO> getAllStaff(){
        return staff_DAO.getAllStaff();
    }
    
    public void AddStaff(NhanVien_DTO nv) {
        staff_DAO.AddStaff(nv);
    }
    
    public void UpdateStaff(NhanVien_DTO nv){
        staff_DAO.UpdateStaff(nv);
    }
    
    public void DeleteStaff(String maNV){
        staff_DAO.DeleteStaff(maNV);
    }
    
    public List<NhanVien_DTO> SearchStaff(String tenNV){
        return staff_DAO.SearchStaff(tenNV);
    }
    
}
