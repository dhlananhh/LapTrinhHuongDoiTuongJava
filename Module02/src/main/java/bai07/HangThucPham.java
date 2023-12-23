/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * Bài 7: Cài đặt lớp HangThucPham
 */

package bai07;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
    private String maHang;
    private String tenHang;
    private double donGia;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;
	
    public HangThucPham(String maHang) throws Exception {
        setMaHang(maHang);
        this.tenHang="xxx";
        this.donGia=0;
        this.ngaySanXuat=LocalDate.now();
        this.ngayHetHan=this.ngaySanXuat;
    }
	
    public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySX, LocalDate ngayHH) throws Exception {
        setMaHang(maHang);
        setTenHang(tenHang);
        setDonGia(donGia);
        setNgaySX(ngaySX);
        setNgayHH(ngayHH);
    }

    private void setMaHang(String maHang) throws Exception {
        if (!maHang.equals(""))
            this.maHang = maHang;
        else
            throw new Exception("Loi: Ma Hang Rong!!");
    }
	
    public String getTenHang() {
            return tenHang;
    }

    public void setTenHang(String tenHang) {
        if (!maHang.equals(""))
            this.tenHang = tenHang;
        else
            this.tenHang = "xxx";
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if (donGia>=0)
            this.donGia = donGia;
        else
            this.donGia = 0;
    }

    public LocalDate getNgaySX() {
        return ngaySanXuat;
    }

    public void setNgaySX(LocalDate ngaySX) {
        if (ngaySX.isBefore(LocalDate.now()))
            this.ngaySanXuat = ngaySX;
        else
            this.ngaySanXuat = LocalDate.now();
    }

    public LocalDate getNgayHH() {
        return ngayHetHan;
    }

    public void setNgayHH(LocalDate ngayHH) {
        if (ngayHH.isAfter(this.getNgaySX()))
            this.ngayHetHan = ngayHH;
        else
            this.ngayHetHan = getNgaySX();
    }

    public String getMaHang() {
        return maHang;
    }

    public boolean ktHetHan() {
        if(ngayHetHan.isAfter(LocalDate.now()))
            return false; 
        return true;
    }

    public static String layTieuDe() {
        return String.format("%-10s %-10s %-20s %-20s %-20s %-10s", "Ma Hang", "Ten Hang", "Don Gia", "Ngay San Xuat" ,"Ngay Het Han", "Ghi chu"); 
    }
	
    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String ghiChu = "";
        if(ktHetHan())
                ghiChu = "Hang het han";
        return String.format("%-10s %-10s %-20s %-20s %-20s %-10s", maHang, tenHang ,df.format(donGia), dtf.format(getNgaySX()), dtf.format(getNgayHH()), ghiChu);
    }
}
