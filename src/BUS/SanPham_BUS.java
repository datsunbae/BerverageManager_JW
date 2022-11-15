/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.SanPham_DAO;
import DTO.SanPham_DTO;
import DTO.DonVi_DTO;
import java.util.List;

/**
 *
 * @author datsu
 */
public class SanPham_BUS {
    SanPham_DAO product_DAO;

    public SanPham_BUS() {
        product_DAO = new SanPham_DAO();
    }
   
    public int getQuiDoiByMASP(String maSP){
        return product_DAO.getQuiDoiByMASP(maSP);
    }
    
    
    public List<SanPham_DTO> getAllProduct(){
        return product_DAO.getAllProduct();
    }
    
    public void AddProduct(SanPham_DTO product){
        product_DAO.AddProduct(product);
    }
    
    public void UpdateProduct(SanPham_DTO product) {
        product_DAO.UpdateProduct(product);
    }
    
    public void DeleteProduct(String maSP) {
        product_DAO.DeleteProduct(maSP);
    }
    
    public List<SanPham_DTO> SearchProduct(String tenSP) {
        return product_DAO.SearchProduct(tenSP);
    }
}
