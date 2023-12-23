/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * BAI 10: Cai dat cho mo hinh lop
 */

package bai10;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class LopHocPhan {
    private String maLHP;
    private String tenLHP;
    private String tenGV;
    private String thongTinLopHoc;
    private List<SinhVien> dsSV;
    
    public LopHocPhan() {
        this.dsSV = new ArrayList<>();
    }
    
    
    
    public LopHocPhan (String maLHP, String tenLHP, String tenGV, String TTLopHoc) {
        this.maLHP = maLHP;
        this.tenLHP = tenLHP;
        this.tenGV = tenGV;
        this.thongTinLopHoc = TTLopHoc;
    }

    @Override
    public String toString() {
        return String.format("\nMa LHP: %s\nTen LHP: %s\nGV giang day: %s\nThong tin buoi hoc: %s", this.maLHP, this.tenLHP, this.tenGV, this.thongTinLopHoc);
    }

    public String getMaLHP() {
        return maLHP;
    }

    public void setMaLHP(String maLHP) {
        this.maLHP = maLHP;
    }

    public String getTenLHP() {
        return tenLHP;
    }

    public void setTenLHP(String tenLHP) {
        this.tenLHP = tenLHP;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getThongTinLopHoc() {
        return thongTinLopHoc;
    }

    public void setThongTinLopHoc(String thongTinLopHoc) {
        this.thongTinLopHoc = thongTinLopHoc;
    }

    public List<SinhVien> getDsSV() {
        return dsSV;
    }

    public void setDsSV(List<SinhVien> dsSV) {
        this.dsSV = dsSV;
    }
}
