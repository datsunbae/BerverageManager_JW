/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author datsu
 */
public class NhanVien_DTO {

    private String maNV;
    private String tenNV;
    private String sdtNV;
    private String emailNV;
    private String diaChiNV;

    
    public String getMaNV() {
        return maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public String getSdtNV() {
        return sdtNV;
    }

    public String getEmailNV() {
        return emailNV;
    }

    public String getDiaChiNV() {
        return diaChiNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public void setSdtNV(String sdtNV) {
        this.sdtNV = sdtNV;
    }

    public void setEmailNV(String emailNV) {
        this.emailNV = emailNV;
    }

    public void setDiaChiNV(String diaChiNV) {
        this.diaChiNV = diaChiNV;
    }
    
    public NhanVien_DTO(){}
    
    public NhanVien_DTO(String maNV, String tenNV, String sdtNV, String emailNV, String diaChiNV) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.sdtNV = sdtNV;
        this.emailNV = emailNV;
        this.diaChiNV = diaChiNV;
    }

    @Override
    public String toString() {
        return tenNV;
    }
    
    

  
}
