/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author datsu
 */
public class KhachHang_DTO {

    
    private String maKH;
    private String tenKH;
    private String sdtKH;
    private String emailKH;
    private String diaChiKH;

    public KhachHang_DTO() {
    }
    

    public KhachHang_DTO(String maKH, String tenKH, String sdtKH, String emailKH, String diaChiKH) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.sdtKH = sdtKH;
        this.emailKH = emailKH;
        this.diaChiKH = diaChiKH;
    }

    @Override
    public String toString() {
        return tenKH;
    }
    
    
    
    public String getMaKH() {
        return maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getSdtKH() {
        return sdtKH;
    }

    public String getEmailKH() {
        return emailKH;
    }

    public String getDiaChiKH() {
        return diaChiKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public void setSdtKH(String sdtKH) {
        this.sdtKH = sdtKH;
    }

    public void setEmailKH(String emailKH) {
        this.emailKH = emailKH;
    }

    public void setDiaChiKH(String diaChiKH) {
        this.diaChiKH = diaChiKH;
    }
    
    
    
}
