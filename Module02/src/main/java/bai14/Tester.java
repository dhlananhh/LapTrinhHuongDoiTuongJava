/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * Bài 14: Hiện thực mô hình lớp sau bằng ngôn ngữ lập trình Java
 */

package bai14;

import java.time.LocalDate;

public class Tester {
    public static void main(String[] args) {
        try {
            Order a = new Order(1, LocalDate.of(2015, 9, 20));
            Product p1 = new Product("sp1", "Gao", 18000);
            Product p2 = new Product("sp4", "Nuoc tuong", 8000);
            Product p3 = new Product("sp3", "Duong", 10000);
            a.addLineItems(p2, 10);
            a.addLineItems(p1, 5);
            a.addLineItems(p3, 1);
            a.addLineItems(p1, 1);
            System.out.println(a);
        } catch (Exception e) {
                System.out.println(e.getMessage());
        }
    }
}
