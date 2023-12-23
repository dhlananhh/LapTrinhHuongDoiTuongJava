/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * Bài 3: Cài đặt lớp Cylinder
 */

package bai03;
public class Cylinder {
    private String ten;
    private double banKinh;
    private double chieuCao;

    public Cylinder() {
        ten = " ";
        banKinh = 0;
        chieuCao = 0;
    }
    
    public Cylinder (String t, double bk, double cc) throws Exception {
        setTen(t);
        setBanKinh(bk);
        setChieuCao(cc);
    }
    
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh (double banKinh) throws Exception {
        if (banKinh>0)
            this.banKinh = banKinh;
        else
            throw new Exception("Ban kinh phai lon hon 0");
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) throws Exception {
        if (chieuCao>0)
            this.chieuCao = chieuCao;
        else
            throw new Exception("Chieu cao phai lon hon 0");
    }
    
    @Override
    public String toString() {
        return String.format("%s %10.2f %10.2f", ten, banKinh, chieuCao);
    }
    
    public double tinhDienTichXungQuanh() {
        return Math.PI * 2 * banKinh * chieuCao;
    }
    
    public double tinhDienTichToanPhan() {
        return (Math.PI * 2 * Math.pow(banKinh, 2) + (Math.PI * 2 * banKinh * chieuCao));
    }
    
    public double tinhTheTich() {
        return Math.PI * Math.pow(banKinh, 2) * chieuCao;
    }
}
