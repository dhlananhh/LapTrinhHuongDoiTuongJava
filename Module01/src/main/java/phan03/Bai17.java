/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * BAI 17: Viet chuong trinh nhap vao m va n, xuat ra cac hinh sau (dung cau truc lap)
 */

package phan03;
import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        System.out.println("Nhap n: ");
        n = scanner.nextInt();
        
        //hinh a
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
            
        
        //hinh b
        System.out.println("Nhap n: ");
        n = scanner.nextInt();
        
        for (int i=n; i>=1; i--) {
            for (int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
        
        //hinh c
        System.out.println("Nhap n: ");
        n = scanner.nextInt();
        
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print("  ");
            } 
            for (int k=1; k<=2*i-1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        //hinh d
        System.out.println("Nhap n: ");
        n = scanner.nextInt();
        
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for (int k=1; k<=2*i-1; k++) {
                if (k==1 || k==2*i-1 || i==n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
