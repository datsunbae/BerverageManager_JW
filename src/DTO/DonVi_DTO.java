/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author datsu
 */
public class DonVi_DTO {

    
    private String maDV;
    private String tenDV;
    private int dvtc;
    
    public DonVi_DTO() {
    }
    
    public DonVi_DTO(String maDV, String tenDV, int dvtc){
        this.maDV = maDV;
        this.tenDV = tenDV;
        this.dvtc = dvtc;
    }

    @Override
    public String toString() {
        return tenDV;
    }
    
    
    
    public String getMaDV() {
        return maDV;
    }

    public String getTenDV() {
        return tenDV;
    }
    
    public int getDVTC() {
        return dvtc;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }
    
    public void setDVTC(int dvtc) {
        this.dvtc = dvtc;
    }
    
}
