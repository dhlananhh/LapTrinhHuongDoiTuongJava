/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * Bai 11: Cai dat cho mo hinh lop sau
 */

package bai11;

import java.time.LocalDate;
import java.time.Period;
import java.text.DecimalFormat;

public class SoTietKiem {
    private String maSo;
    private LocalDate ngayMoSo;
    private double soTienGoi;
    private int kyHan;
    private float laiSuat;
    
    public SoTietKiem (String maSo, LocalDate ngayMoSo, double soTienGoi, int kyHan, float laiSuat) {
        setMaSo(maSo);
        setNgayMoSo(ngayMoSo);
        setSoTienGoi(soTienGoi);
        setKyHan(kyHan);
        setLaiSuat(laiSuat);
    }
    
    public int tinhSoThangGoiThuc() {
        Period age = Period.between(ngayMoSo, LocalDate.now());
        int dt_nam = age.getYears();
        int dt_thang = age.getMonths();
        int soThangGoi = dt_nam * 12 + dt_thang;
        if (soThangGoi % kyHan == 0)
            return soThangGoi;
        else
            return soThangGoi / kyHan * kyHan;
    }
    
    public double tinhTienLai() {
        DecimalFormat df = new DecimalFormat("#, ##0.00");
        return laiSuat * tinhSoThangGoiThuc() * soTienGoi;
    }
    
    public static String getTitle() {
        return String.format("%-10s %-20s %-20s %-10s %-10s", "Ma so", "Ngay mo so", "So tien goi", "Ky han", "Lai suat");
    }
    
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return "STK " + maSo 
                        + "[" + ngayMoSo + "-" + LocalDate.now()+"]"+ 
                        "KH " + kyHan + " thang"
                        + ", so thang tinh lai: " + tinhSoThangGoiThuc()
                        + ", ls " + laiSuat
                        + ", So tien: " + df.format(soTienGoi)
                        + " --> Tien lai: " + df.format(tinhTienLai());
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public LocalDate getNgayMoSo() {
        return ngayMoSo;
    }

    public void setNgayMoSo(LocalDate ngayMoSo) {
        this.ngayMoSo = ngayMoSo;
    }

    public double getSoTienGoi() {
        return soTienGoi;
    }

    public void setSoTienGoi(double soTienGoi) {
        this.soTienGoi = soTienGoi;
    }

    public int getKyHan() {
        return kyHan;
    }

    public void setKyHan(int kyHan) {
        this.kyHan = kyHan;
    }

    public float getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(float laiSuat) {
        this.laiSuat = laiSuat;
    }
}
