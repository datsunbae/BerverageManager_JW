/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author datsu
 */
public class NhapKho_DTO {
    private int maPNK;
    private String ngayNhap;
    private float tongTien;
    private String maNV;
    private String maNCC;

    public NhapKho_DTO() {
    }


    public NhapKho_DTO(int maPNK, String ngayNhap, float tongTien, String maNV, String maNCC) {
        this.maPNK = maPNK;
        this.ngayNhap = ngayNhap;
        this.tongTien = tongTien;
        this.maNV = maNV;
        this.maNCC = maNCC;
    }

    public int getMaPNK() {
        return maPNK;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public float getTongTien() {
        return tongTien;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaPNK(int maPNK) {
        this.maPNK = maPNK;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    
}
