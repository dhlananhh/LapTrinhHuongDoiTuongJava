/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lan Anh
 */

package phan03;
import java.util.Scanner;


public class Bai15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int max = 100;
        int n;        
        int a[] = new int[max];
        
        System.out.println("Nhap n: ");
        n = scanner.nextInt();
        
        System.out.println("Nhap mang: ");
        for (int i=0; i<n; i++) {
            a[i] = scanner.nextInt();
        }
        
        System.out.println("Mang vua nhap la: ");
        for (int i=0; i<n; i++) {
            System.out.printf("\na[%d] = %d", i, a[i]);
        }
                
        System.out.printf("\nGTLN trong mang la: %d", timMax(a, n));
        System.out.printf("\nGTNN trong mang la: %d", timMin(a, n));
    }
    
    
    public static int timMax (int[]a , int n) {
        int max = a[0];
        
        for (int i=0; i<n; i++)
            if (a[i] > max)
                max = a[i];
        
        return max;
    }
    
    
    public static int timMin (int[]a , int n) {
        int min = a[0];
        
        for (int i=0; i<n; i++)
            if (a[i] < min)
                min = a[i];
        
        return min;
    }
}
