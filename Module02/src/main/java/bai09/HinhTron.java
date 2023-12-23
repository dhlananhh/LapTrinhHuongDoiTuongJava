/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * 
 */

package bai09;

public class HinhTron {
    private ToaDo tam;
    private double banKinh;
    
    public HinhTron() {
        this.tam = new ToaDo();
        this.banKinh = 0;
    }
    
    public HinhTron (ToaDo tam, double banKinh) {
        this.tam = tam;
        this.banKinh = banKinh;
    }

    public ToaDo getTam() {
        return tam;
    }

    public void setTam(ToaDo tam) {
        this.tam = tam;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }
    
    public double tinhChuVi() {
        return 2 * banKinh * 3.14;
    }
    
    public double tinhDienTich() {
        return banKinh * banKinh * 3.14;
    }
    
    @Override
    public String toString() {
        return String.format("\nDien tich va chu vi hinh tron tam %s co ban kinh %.2fm la %.2f va %.2f", tam.toString(), banKinh, tinhDienTich(), tinhChuVi());
    }
}
