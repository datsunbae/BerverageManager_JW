/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.KhachHang_DAO;
import DTO.KhachHang_DTO;
import java.util.List;

/**
 *
 * @author datsu
 */
public class KhachHang_BUS {
    private KhachHang_DAO customer_DAO;

    public KhachHang_BUS() {
        customer_DAO = new KhachHang_DAO();
    }
    
    public List<KhachHang_DTO> getAllCustomer(){
        return customer_DAO.getAllCustomer();
    }
    
    public List<KhachHang_DTO> getAllKhachSi(){
        return customer_DAO.getAllKhachSi();
    }
    
    public KhachHang_DTO KHLe(){
        return customer_DAO.KHLe();
    }
    
    public void AddCustomer(KhachHang_DTO kh) {
        customer_DAO.AddCustomer(kh);
    }
    
    public void UpdateCustomer(KhachHang_DTO kh){
        customer_DAO.UpdateCustomer(kh);
    }
    
    public void DeleteCustomer(String maKH){
        customer_DAO.DeleteCustomer(maKH);
    }
    
    public List<KhachHang_DTO> SearchCustomer(String tenKH){
        return customer_DAO.SearchCustomer(tenKH);
    }
    
}
