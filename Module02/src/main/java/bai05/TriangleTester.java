/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai05;

/**
 *
 * @author Lan Anh
 */
public class TriangleTester {
    public static void main(String[] args) {
        Triangle ABC = new Triangle("ABC", 6, 8, 10);
        System.out.println(ABC.getThongTin());
        System.out.println("Thong tin cua tam giac ABC la: " + ABC.getKieuTamGiac());
        System.out.println("Chu vi cua tam giac ABC la: " + ABC.tinhChuVi());
        System.out.println("Dien tich cua tam giac ABC la: " + ABC.tinhDienTich());
    }
}
