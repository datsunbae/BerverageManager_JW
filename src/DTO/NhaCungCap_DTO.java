/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author datsu
 */
public class NhaCungCap_DTO {
    
    private String maNCC;
    private String tenNCC;
    private String sdtNCC;
    private String emailNCC;
    private String diaChiNCC;

    public NhaCungCap_DTO() {
    }
    
    
    
    public NhaCungCap_DTO(String maNCC, String tenNCC, String sdtNCC, String emailNCC, String diaChiNCC) {
        this.maNCC = maNCC;
        this.tenNCC = tenNCC;
        this.sdtNCC = sdtNCC;
        this.emailNCC = emailNCC;
        this.diaChiNCC = diaChiNCC;
    }

    @Override
    public String toString() {
        return tenNCC;
    }
    
    

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public void setSdtNCC(String sdtNCC) {
        this.sdtNCC = sdtNCC;
    }

    public void setEmailNCC(String emailNCC) {
        this.emailNCC = emailNCC;
    }

    public void setDiaChiNCC(String diaChiNCC) {
        this.diaChiNCC = diaChiNCC;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public String getSdtNCC() {
        return sdtNCC;
    }

    public String getEmailNCC() {
        return emailNCC;
    }

    public String getDiaChiNCC() {
        return diaChiNCC;
    }

}
