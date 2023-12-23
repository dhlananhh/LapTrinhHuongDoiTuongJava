/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lan Anh
 */

package bai06;
public class ThongTinDangKyXe {
    private String chu;
    private String loai;
    private double triGia;
    private int dungTichXyLanh;
    private double thue;

    public ThongTinDangKyXe() {
        chu = " ";
        loai = " ";
        triGia = 0;
        dungTichXyLanh = 0;
        thue = 0;
    }
    
    public ThongTinDangKyXe (String chuXe, String loaiXe, int dtxl, double triGiaXe, double thue) {
        this.chu = chuXe;
        this.loai = loaiXe;
        this.triGia = triGiaXe;
        this.dungTichXyLanh = dtxl;
        this.thue = thue;
    }
    
    public String getChu() {
        return chu;
    }

    public void setChu(String chu) {
        this.chu = chu;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    public int getDungTichXyLanh() {
        return dungTichXyLanh;
    }

    public void setDungTichXyLanh(int dungTichXyLanh) {
        this.dungTichXyLanh = dungTichXyLanh;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }
    
    public static String getTitle() {
        return String.format("\n%-30s %-30s %10s %25s %25s\n", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue phai nop");
    }
    
    @Override
    public String toString() {
        return String.format("%-30s %-30s %10d %25.2f %25.2f", chu, loai, dungTichXyLanh, triGia, thue);
    }
}
