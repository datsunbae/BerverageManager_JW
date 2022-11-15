/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author datsu
 */
public class CT_DonHang_DTO {
    private int maCT_DH;
    private int maDH;
    private String maSP;
    private int soLuong;
    private String maDVT;
    private float thanhTien;

    public CT_DonHang_DTO() {
    }
    
    

    public CT_DonHang_DTO(int maCT_DH, int maDH, String maSP, int soLuong, String maDVT, float thanhTien) {
        this.maCT_DH = maCT_DH;
        this.maDH = maDH;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.maDVT = maDVT;
        this.thanhTien = thanhTien;
    }

    public int getMaCT_DH() {
        return maCT_DH;
    }

    public int getMaDH() {
        return maDH;
    }

    public String getMaSP() {
        return maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String getMaDVT() {
        return maDVT;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setMaCT_DH(int maCT_DH) {
        this.maCT_DH = maCT_DH;
    }

    public void setMaDH(int maDH) {
        this.maDH = maDH;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setMaDVT(String maDVT) {
        this.maDVT = maDVT;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }
    
    
   
}
