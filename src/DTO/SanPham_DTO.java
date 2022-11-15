/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author datsu
 */
public class SanPham_DTO {
    
    private String maSP;
    private String tenSP;
    private String dvtChinh;
    private float giaNhap_DVTC;
    private float giaBanSi_DVTC;
    private float giaBanLe_DVTC;
    private String dvtPhu;
    private float giaBanSi_DVTP;
    private float giabanLe_DVTP;
    private int quiDoi;

    public SanPham_DTO() {
    }
    
    

    public SanPham_DTO(String maSP, String tenSP, String dvtChinh, float giaNhap_DVTC, float giaBanSi_DVTC, float giaBanLe_DVTC, String dvtPhu, float giaBanSi_DVTP, float giabanLe_DVTP, int quiDoi) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.dvtChinh = dvtChinh;
        this.giaNhap_DVTC = giaNhap_DVTC;
        this.giaBanSi_DVTC = giaBanSi_DVTC;
        this.giaBanLe_DVTC = giaBanLe_DVTC;
        this.dvtPhu = dvtPhu;
        this.giaBanSi_DVTP = giaBanSi_DVTP;
        this.giabanLe_DVTP = giabanLe_DVTP;
        this.quiDoi = quiDoi;
    }

    @Override
    public String toString() {
        return tenSP;
    }
    
    

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public String getDvtChinh() {
        return dvtChinh;
    }

    public float getGiaNhap_DVTC() {
        return giaNhap_DVTC;
    }

    public float getGiaBanSi_DVTC() {
        return giaBanSi_DVTC;
    }

    public float getGiaBanLe_DVTC() {
        return giaBanLe_DVTC;
    }

    public String getDvtPhu() {
        return dvtPhu;
    }

    public float getGiaBanSi_DVTP() {
        return giaBanSi_DVTP;
    }

    public float getGiabanLe_DVTP() {
        return giabanLe_DVTP;
    }

    public int getQuiDoi() {
        return quiDoi;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setDvtChinh(String dvtChinh) {
        this.dvtChinh = dvtChinh;
    }

    public void setGiaNhap_DVTC(float giaNhap_DVTC) {
        this.giaNhap_DVTC = giaNhap_DVTC;
    }

    public void setGiaBanSi_DVTC(float giaBanSi_DVTC) {
        this.giaBanSi_DVTC = giaBanSi_DVTC;
    }

    public void setGiaBanLe_DVTC(float giaBanLe_DVTC) {
        this.giaBanLe_DVTC = giaBanLe_DVTC;
    }

    public void setDvtPhu(String dvtPhu) {
        this.dvtPhu = dvtPhu;
    }

    public void setGiaBanSi_DVTP(float giaBanSi_DVTP) {
        this.giaBanSi_DVTP = giaBanSi_DVTP;
    }

    public void setGiabanLe_DVTP(float giabanLe_DVTP) {
        this.giabanLe_DVTP = giabanLe_DVTP;
    }

    public void setQuiDoi(int quiDoi) {
        this.quiDoi = quiDoi;
    }
    
    
            
}
