/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai03;

/**
 *
 * @author Lan Anh
 */
public class CylinderTester {
    public static void main(String[] args) throws Exception {
        Cylinder H = new Cylinder("H", 2, 6);
        System.out.println("Thong tin cua hinh tru H la: " + H.toString());
        System.out.println("Dien tich xung quanh cua hinh tru H la: " + H.tinhDienTichXungQuanh());
        System.out.println("Dien tich toan phan cua hinh tru H la: " + H.tinhDienTichToanPhan());
        System.out.println("The tich cua hinh tru H la: " + H.tinhTheTich());
    }
}
