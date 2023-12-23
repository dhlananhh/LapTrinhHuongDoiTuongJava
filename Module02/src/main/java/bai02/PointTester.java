/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * Bài 2: Viết lớp kiểm thử cho lớp Point
 */

package bai02;

public class PointTester {
    public static void main(String[] args) {
        Point A = new Point("A", -2, -3);
        System.out.println("Thong tin cua toa do diem A: " + A.toString());
        System.out.println("Diem doi xung cua diem A qua O la: " + A.getNegate());
        System.out.println("Khoang cach tu diem A den goc O la: " + A.getDistance());
    }
}
