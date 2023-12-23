/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai10;

/**
 *
 * @author Lan Anh
 */


public class SinhVien {
    private String maSV;
    private String hoTen;
    
    public SinhVien() {
        
    }
    
    public SinhVien (String ht, String mssv) {
        maSV = mssv;
        hoTen = ht;
    }
    
    @Override
    public String toString() {
        return String.format("\nMSSV: %s\nHo ten SV: %s", this.maSV, this.hoTen);
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    
    
}
