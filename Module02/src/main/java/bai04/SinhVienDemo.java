/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lan Anh
 */

package bai04;

import java.util.Scanner;
public class SinhVienDemo {
    public static void main(String[] args) {
    //tạo đối tượng sv1 bằng constructor đầy đủ tham số
    DiemSinhVien sv1 = new DiemSinhVien(1111, "Nguyen Thanh An", 6.5f, 8.5f);
    
    //tạo đối tượng sv1 bằng default constructor
    DiemSinhVien sv2 = new DiemSinhVien();
    sv2.setMaSV(2222);
    sv2.setHoTen("Le Thi Bong");
    sv2.setDiemLT(7.5f);
    sv2.setDiemTH(8.0f);
    
    //tạo đối tượng sv3
    DiemSinhVien sv3 = new DiemSinhVien();
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Nhap vao ma so cua sinh vien sv3: ");
    int mssv = scanner.nextInt();
        
    scanner.nextLine();
    System.out.println("Nhap vao ho ten cua sinh vien sv3: ");
    String hoTen = scanner.nextLine();
        
    System.out.println("Nhap vao diem ly thuyet cua sinh vien sv3: ");
    double diemLT = scanner.nextDouble();
        
    System.out.println("Nhap vao diem thuc hanh cua sinh vien sv3: ");
    double diemTH = scanner.nextDouble();
        
    //gán giá trị cho sv3
    sv3 = new DiemSinhVien(mssv, hoTen, diemLT, diemTH);
        
    //in thông tin của 3 đối tượng sv1, sv2, sv3 ra cửa sổ console
    System.out.printf(DiemSinhVien.getTitle());
    System.out.println(sv1);
    System.out.println(sv2);
    System.out.println(sv3);
    }
}
