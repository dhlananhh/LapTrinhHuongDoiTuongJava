/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * 
 */

package bai05;
public class Triangle {
    //Thuoc tinh
    private String ten;
    private double ma, mb, mc;
    
    //Phuong thuc
    //Ham khoi tao mac dinh
    public Triangle() {
        ten = " ";
        ma = 0;
        mb = 0;
        mc = 0;
    }
    
    //Ham khoi tao chua day du tham so
    public Triangle (String ten, double ma, double mb, double mc) {
        this.ten = ten;
        if (ma+mb<=mc || ma+mc<=mb || mb+mc<=ma) {
            ma = 0;
            mb = 0;
            mc = 0;
        } else {
            this.ma = ma;
            this.mb = mb;
            this.mc = mc;
        }
    }

    //Ham kiem tra tam giac
    public boolean ktTamGiac() {
        if (ma+mb<=mc || ma+mc<=mb || mb+mc<=ma)
            return false;
        return true;
    }
    
    //Ham kiem tra tam giac deu
    public boolean ktTamGiacDeu() {
        if ((ma==mb)&&(mb==mc))
            return true;
        return false;
    }
    
    //Ham kiem tra tam giac can
    public boolean ktTamGiacCan() {
        if ((ma==mb || mb==mc || ma==mc))
            return true;
        return false;
    }
    
    //Ham kiem tra tam giac vuong
    public boolean ktTamGiacVuong() {
        if (ma*ma==mb*mb+mc*mc ||
            mb*mb==ma*ma+mc*mc ||
            mc*mc==ma*ma+mb*mb)
            return true;
        return false;
    }
    
    //Ham kiem tra tam giac vuong
    public boolean ktTamGiacVuongCan() {
        if ((mc*mc == ma*ma + mb*mb )&&(ma==mb) ||
             (ma*ma == mb*mb + mc*mc)&&(mb==mc) ||
             (mb*mb == ma*ma + mc*mc)&&(ma==mc))
            return true;
        return false;
    }
    
    //Ham tra ve thong tin kieu tam giac
    public String getKieuTamGiac() {
        if (ktTamGiac()) {
            if (ktTamGiacCan())
                return "Tam giac can";
            else if (ktTamGiacDeu())
                return "Tam giac deu";
            else if (ktTamGiacVuong())
                return "Tam giac vuong";
            else if (ktTamGiacVuongCan())
                return "Tam giac vuong can";
            return "Tam giac thuong";
        } else {
            return "Day khong phai tam giac";
        }
    }
    
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getMa() {
        return ma;
    }

    public void setMa(double ma) {
        this.ma = ma;
    }

    public double getMb() {
        return mb;
    }

    public void setMb(double mb) {
        this.mb = mb;
    }

    public double getMc() {
        return mc;
    }

    public void setMc(double mc) {
        this.mc = mc;
    }
    
    //Ham tinh chu vi tam giac
    public double tinhChuVi() {
        return ma+mb+mc;
    }
    
    //Ham tinh dien tich tam giac
    public double tinhDienTich() {
        double p = (ma+mb+mc)/2;
        return Math.sqrt(p*(p-ma)*(p-mb)*(p-mc));
    }
    
    //Ham tra ve thong tin canh tam giac, kieu tam giac, va dien tich
    public String getThongTin() {
        return String.format("\nDo dai cac canh lan luot la: %5.2f %5.2f %5.2f\nLoai tam giac: %s\nChu vi tam giac la: %5.2f\nDien tich tam giac la: %5.2f", ma, mb, mc, getKieuTamGiac(), tinhChuVi(), tinhDienTich());
    }
}
