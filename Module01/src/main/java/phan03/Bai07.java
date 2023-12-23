/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * BAI 7: Viet chuong trinh tinh tong cac so nguyen to nho hon n
 */

package phan03;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            int n;

            System.out.println("Nhap n: ");
            n = scanner.nextInt();

            System.out.printf("\nTong cac so nguyen to nho hon %d la: %d", n, tinhTongSNT(n));
        } catch (InputMismatchException e) {
            System.out.println("Nhap vao so nguyen");
        }
    }
    
    
    public static int ktSNT (int n) {
        if (n < 2)
            return 0;
        
        int SquareRoot = (int) Math.sqrt(n);
        for (int i=2; i<=SquareRoot; i++)
            if (n%i==0)
                return 0;
        
        return 1;
    }
    
    
    public static int tinhTongSNT (int n) {
        int sum = 0;
        
        for (int i=0; i<n; i++)
            if (ktSNT(i)==1)
                sum += i;
        
        return sum;
    }
}