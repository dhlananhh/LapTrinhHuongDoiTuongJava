/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * Bai 16: Xay dung lop doi tuong HocVien
 */

package bai16;

public class HocVien {
    private String hoTen;
    private String diaChi;
    private String soDienThoai;
    
    public HocVien() {
        
    }
    
    public HocVien (String ht, String dc, String sdt) throws Exception {
        setHoTen(ht);
        setDiaChi(dc);
        setSoDienThoai(sdt);
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) throws Exception {
        if (!hoTen.equals(""))
            this.hoTen = hoTen;
        else
            this.hoTen = "chua xac dinh";
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) throws Exception {
        if (!diaChi.equals(""))
            this.diaChi = diaChi;
        else
            this.diaChi = "chua xac dinh";
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) throws Exception {
        if (!soDienThoai.equals(""))
            this.soDienThoai = soDienThoai;
        else
            this.soDienThoai = "chua xac dinh";
    }
}
