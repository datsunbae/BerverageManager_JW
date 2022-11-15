/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.NhaCungCap_DAO;
import DTO.NhaCungCap_DTO;
import java.util.List;

/**
 *
 * @author datsu
 */
public class NhaCungCap_BUS {

    NhaCungCap_DAO supplier_DAO;
    
    public NhaCungCap_BUS() {
        supplier_DAO = new NhaCungCap_DAO();
    }
    
    public List<NhaCungCap_DTO> getAllSupplier(){
        return supplier_DAO.getAllSupplier();
    }
    
    public void AddSupplier(NhaCungCap_DTO ncc){
        supplier_DAO.AddSupplier(ncc);
    }
    
    public void UpdateSupplier(NhaCungCap_DTO ncc){
        supplier_DAO.UpdateSupplier(ncc);
    }
    
    public void DeleteSupplier(String maNCC){
        supplier_DAO.DeleteSupplier(maNCC);
    }
    
    public List<NhaCungCap_DTO> SearchSupplier(String tenNCC){
        return supplier_DAO.SearchSupplier(tenNCC);
    }
    
}
