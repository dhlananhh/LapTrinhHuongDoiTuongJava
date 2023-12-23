/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * BAI 5: Viet chuong trinh tim UCLN cua 2 so nhap vao
 */

package phan03;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            int a, b;

            System.out.println("Nhap a: ");
            a = scanner.nextInt();

            System.out.println("Nhap b: ");
            b = scanner.nextInt();

            System.out.printf("\nUCLN cua %d va %d la: %d", a, b, tinhUCLN(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Nhap vao so nguyen");
        }
    }
    
    
    public static int tinhUCLN (int a, int b) {
        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }
}