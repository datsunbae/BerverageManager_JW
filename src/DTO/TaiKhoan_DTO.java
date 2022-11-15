/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author datsu
 */
public class TaiKhoan_DTO {
    
    private String maTK;
    private String matKhau;

    public TaiKhoan_DTO() {
    }
    
    

    public TaiKhoan_DTO(String maTK, String matKhau) {
        this.maTK = maTK;
        this.matKhau = matKhau;
    }

    public String getMaTK() {
        return maTK;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMaTK(String maTK) {
        this.maTK = maTK;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    
    
    
    
    
}
