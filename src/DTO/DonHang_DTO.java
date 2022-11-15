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
public class DonHang_DTO {
    private int maDH;
    private String ngayLap;
    private String maNV;
    private String maKH;
    private float tongTien;

    public DonHang_DTO() {
    }
    
    

    public DonHang_DTO(int maDH, String ngayLap, String maNV, String maKH, float tongTien) {
        this.maDH = maDH;
        this.ngayLap = ngayLap;
        this.maNV = maNV;
        this.maKH = maKH;
        this.tongTien = tongTien;
    }

    public int getMaDH() {
        return maDH;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getMaKH() {
        return maKH;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setMaDH(int maDH) {
        this.maDH = maDH;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }
    
    
    
}
