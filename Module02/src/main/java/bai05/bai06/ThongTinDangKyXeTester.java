/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai06;

/**
 *
 * @author Lan Anh
 */
public class ThongTinDangKyXeTester {
    public static void main(String[] args) {
        ThongTinDangKyXe xe1 = new ThongTinDangKyXe("Nguyen Thu Loan", "Future Neo", 100, 35000000, 1050000);
        ThongTinDangKyXe xe2 = new ThongTinDangKyXe("Le Minh Tinh", "Ford Ranger", 3000, 250000000, 12500000);
        ThongTinDangKyXe xe3 = new ThongTinDangKyXe("Nguyen Minh Triet", "Landscape", 1500, 1000000000, 50000000);
        
        System.out.printf(ThongTinDangKyXe.getTitle());
        System.out.println(xe1);
        System.out.println(xe2);
        System.out.println(xe3);
    }
}
