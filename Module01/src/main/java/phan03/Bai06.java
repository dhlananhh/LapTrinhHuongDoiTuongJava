/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * BAI 6: Viet chuong trinh kiem tra so nhap vao co phai la so nguyen to hay khong
 */

package phan03;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            int n;
            System.out.println("Nhap n: ");
            n = scanner.nextInt();

            if (isPrimeNumber(n) == true)
                System.out.printf("\n%d la so nguyen to", n);
            else
                System.out.printf("\n%d khong phai la so nguyen to", n);
        } catch (InputMismatchException e) {
            System.out.println("Nhap vao so nguyen");
        }
    }
    
    public static boolean isPrimeNumber (int n) {
        if (n < 2)
            return false;
        
        int SquareRoot = (int) Math.sqrt(n);
        for (int i=2; i<=SquareRoot; i++)
            if (n%i==0)
                return false;
        return true;
    }
}
