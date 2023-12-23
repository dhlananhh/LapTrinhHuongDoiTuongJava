/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * 
 */

package bai11;

import java.time.LocalDate;

public class KhachHang {
    private String maKH;
    private String hoTenKH;
    private SoTietKiem[] dsSoTietKiem;
    private int soLuongSoHienCo;

    public KhachHang (String maKH, String hoTenKH, int n) {
        this.maKH = maKH;
        this.hoTenKH = hoTenKH;
        dsSoTietKiem = new SoTietKiem[n];
        soLuongSoHienCo = 0;
    }

    public boolean themSoTietKiem (String maSo, LocalDate ngayMoSo, double soTienGoi, int kyHan, float laiSuat) throws Exception {
        if (soLuongSoHienCo < dsSoTietKiem.length) {
            dsSoTietKiem[soLuongSoHienCo++] = new SoTietKiem(maSo, ngayMoSo, soTienGoi, kyHan, laiSuat);
            return true;
        } else {
            throw new Exception ("Vuot qua kich thuoc mang cho phep");
        }
    }
    
    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoTenKH() {
        return hoTenKH;
    }

    public void setHoTenKH(String hoTenKH) {
        this.hoTenKH = hoTenKH;
    }

    public SoTietKiem[] getDsSoTietKiem() {
        return dsSoTietKiem;
    }

    public void setDsSoTietKiem(SoTietKiem[] dsSoTietKiem) {
        this.dsSoTietKiem = dsSoTietKiem;
    }

    public int getSoLuongSoHienCo() {
        return soLuongSoHienCo;
    }

    public void setSoLuongSoHienCo(int soLuongSoHienCo) {
        this.soLuongSoHienCo = soLuongSoHienCo;
    }
    
    @Override
    public String toString() {
        String s = "";
        
        for (int i=0; i<soLuongSoHienCo; i++)
            s += dsSoTietKiem[i] + "\n";
        
        return "Khach hang: " + maKH + " - " + hoTenKH + "\n" + s;
    }
}
