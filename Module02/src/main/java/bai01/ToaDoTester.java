/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * Bài 1: Viết lớp kiểm thử cho lớp ToaDo
 */

package bai01;

public class ToaDoTester {
    public static void main(String[] args) {
        ToaDo A = new ToaDo("A", 2, 3);
        System.out.println("Thong tin cua toa do diem A la: " + A.getThongTin());
    }
}