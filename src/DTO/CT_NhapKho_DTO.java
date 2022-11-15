/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author datsu
 */
public class CT_NhapKho_DTO {
    private int maCT_PNK;
    private int maPNK;
    private String maSP;
    private int soLuong;
    private String maDVT;
    private float thanhTien;

    public CT_NhapKho_DTO() {
    }
    
    

    public CT_NhapKho_DTO(int maCT_PNK, int maPNK, String maSP, int soLuong, String maDVT, float thanhTien) {
        this.maCT_PNK = maCT_PNK;
        this.maPNK = maPNK;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.maDVT = maDVT;
        this.thanhTien = thanhTien;
    }

    public int getMaCT_PNK() {
        return maCT_PNK;
    }

    public int getMaPNK() {
        return maPNK;
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

    public void setMaCT_PNK(int maCT_PNK) {
        this.maCT_PNK = maCT_PNK;
    }

    public void setMaPNK(int maPNK) {
        this.maPNK = maPNK;
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
