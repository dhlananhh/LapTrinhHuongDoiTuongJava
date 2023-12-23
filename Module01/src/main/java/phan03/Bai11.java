/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * BAI 11: Viet chuong trinh nhap vao so nguyen n va thuc hien:
 * Xuat ra man hinh n so dau tien cua chuoi Fibonacci (co 2 gia tri dau la 1 va 1)
 */

package phan03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            int n;
            System.out.println("Nhap n: ");
            n = scanner.nextInt();

            System.out.printf("\n%d so dau dau tien cua chuoi Fibonacci la: ", n);
            for (int i=0; i<n; i++)
                System.out.printf("\t%d", Fibonacci(i));
        } catch (InputMismatchException e) {
            System.out.println("Nhap vao so nguyen");
        }
    }
    
    
    public static int Fibonacci (int n) {
        if (n < 0)
            return -1;
        else if (n == 0 || n == 1)
            return 1;
        else
            return Fibonacci(n-1) + Fibonacci(n-2);
    }
}