/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 * @author Lan Anh
 * BAI 3: Viet chuong trinh in ra tong 1+3+5+...+n neu n la so le, 2+4+6+...+n neu n la so chan
 */

package phan03;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            int n;
            System.out.println("Nhap n: ");
            n = scanner.nextInt();

            System.out.printf("Tong = %d", tinhTong(n));
        } catch (InputMismatchException e) {
            System.out.println("Nhap vao so nguyen");
        }
    }

    
    public static int tinhTong (int n) {
        int sum = 0;
        
        if (n%2==0) {
            for (int i=2; i<=n; i=i+2)
                sum += i;
        }else{
            for (int i=1; i<=n; i=i+2)
                sum += i;
        }
        
        return sum;
    }
}