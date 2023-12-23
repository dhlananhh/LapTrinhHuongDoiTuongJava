/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lan Anh
 */

package bai11;

import java.time.LocalDate;

public class Tester {
    public static void main(String[] args) {
        KhachHang kh1= new KhachHang("KH001", "Nguyen Van A", 10);
		try {
			kh1.themSoTietKiem("111", LocalDate.of(2022, 2, 1), 1000000, 3, 0.005f);
			kh1.themSoTietKiem("112", LocalDate.of(2021, 5, 1), 10000000, 6, 0.006f);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(kh1);
    }
}
