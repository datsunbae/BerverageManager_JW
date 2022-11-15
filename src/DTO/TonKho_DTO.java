/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author datsu
 */
public class TonKho_DTO {
    private int id;
    private String maSP;
    private int slTon;
    private String slTonQuiDoi;

    public TonKho_DTO() {
    }
    
    

    public TonKho_DTO(int id, String maSP, int slTon, String slTonQuiDoi) {
        this.id = id;
        this.maSP = maSP;
        this.slTon = slTon;
        this.slTonQuiDoi = slTonQuiDoi;
    }

    public int getId() {
        return id;
    }

    public String getMaSP() {
        return maSP;
    }
    

    public int getSlTon() {
        return slTon;
    }

    public String getSlTonQuiDoi() {
        return slTonQuiDoi;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setSlTon(int slTon) {
        this.slTon = slTon;
    }

    public void setSlTonQuiDoi(String slTonQuiDoi) {
        this.slTonQuiDoi = slTonQuiDoi;
    }
    
}
