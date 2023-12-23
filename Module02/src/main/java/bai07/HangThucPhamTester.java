/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lan Anh
 */

package bai07;
import java.time.LocalDate;

public class HangThucPhamTester {
    public static void main(String[] args) {
        try {
            HangThucPham a = new HangThucPham("001", "Gao", 100000, LocalDate.of(2022, 7, 10), LocalDate.of(2022, 12, 23));
            HangThucPham b = new HangThucPham("002", "Mi", 5000, LocalDate.of(2022, 9, 1), LocalDate.of(2023, 3, 1));
            HangThucPham c = new HangThucPham("003", "Nuoc", 10000, LocalDate.of(2022, 3, 1), LocalDate.of(2022, 4, 1));
            System.out.println(HangThucPham.layTieuDe());
            System.out.println(a.toString());
            System.out.println(b.toString());
            System.out.println(c.toString());
	} catch (Exception e) {
            System.out.println(e.getMessage());
	}
    }
}
