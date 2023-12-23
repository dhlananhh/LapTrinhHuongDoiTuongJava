/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * Bài 4: Cài đặt lớp đối tượng DiemSinhVien
 */

package bai04;
import java.lang.Object;

public class DiemSinhVien {
    /**
     * Attribute mã số sinh viên
     */
    private int maSV;
    
    /**
     * Attribute họ tên sinh viên
     */
    private String hoTen;
    
    /**
     * Attribute điểm lý thuyết
     */
    private double diemLT;
    
    /**
     * Attribute điểm thực hành
     */
    private double diemTH;
    
       
    /**
     * Phương thức khởi tạo không có tham số
     */
    public DiemSinhVien() {
        maSV = 0;
        hoTen = " ";
        diemLT = 0.0;
        diemTH = 0.0;
    }
    
    
    /**
     * Phương thức khởi tạo có chứa tham số
     * @param mssv : mã số sinh viên
     * @param ht : họ tên sinh viên
     * @param lth : điểm lý thuyết
     * @param th : điểm thực hành
     */
    public DiemSinhVien (int mssv, String ht, double lth, double th) {
        maSV = mssv;
        hoTen = ht;
        diemLT = lth;
        diemTH = th;
    }
    
    
    /**
     * Phương thức getter mã số sinh viên
     * @return kết quả trả về mã số sinh viên
     */
    public int getMaSV() {
        return maSV;
    }
    
    
    /**
     * Phương thức setter mã số sinh viên
     * @param mssv : mã số sinh viên
     */
    public void setMaSV(int mssv) {
        if(mssv>0){
            this.maSV = mssv;
        }else{
            this.maSV = 0;
        }
    }
    
    
    /**
     * Phương thức getter họ tên sinh viên
     * @return kết quả trả về họ tên sinh viên
     */
    public String getHoTen() {
        return hoTen;
    }
    
    
    /**
     * Phương thức setter họ tên sinh viên
     * @param ht : họ tên sinh viên
     */
    public void setHoTen(String ht) {
        this.hoTen = ht;
    }
    
    
    /**
     * Phương thức getter điểm lý thuyết
     * @return kết quả trả về điểm lý thuyết
     */
    public double getDiemLT() {
        return diemLT;
    }
    
    
    /**
     * Phương thức setter điểm lý thuyết
     * @param lth : điểm lý thuyết
     */
    public void setDiemLT(double diemLT) {
        if(diemLT >= 0.0 && diemLT <= 10.0) {
            this.diemLT = diemLT;
        }else{
            this.diemLT = 0;
        }
    }
    
    
    /**
     * Phương thức getter điểm thực hành
     * @return kết quả trả về điểm thực hành
     */
    public double getDiemTH() {
        return diemTH;
    }
    
    
    /**
     * Phương thức setter điểm thực hành
     * @param th : điểm thực hành
     */
    public void setDiemTH(double diemTH) {
        if(diemTH >= 0.0 && diemTH <= 10.0) {
            this.diemTH = diemTH;
        }else{
            this.diemTH = 0;
        }
    }
    
    
    /**
     * Phương thức lấy điểm trung bình của sinh viên
     * @return kết quả trả về điểm trung bình
     */
    public double getDiemTB() {
        return (diemLT + diemTH)/2;
    }
    
    
    @Override
    /**
     * Phương thức hiển thị
     */
    public String toString() {
        return String.format("%-10d %-30s %10.2f %10.2f %10.2f", maSV, hoTen, diemLT, diemTH, getDiemTB());
    }
    
    public static String getTitle() {
        return String.format("\n%-10s %-30s %10s %10s %10s\n", "MSSV", "Ho ten SV", "Diem LT", "Diem TH", "Diem TB");
    }
}
