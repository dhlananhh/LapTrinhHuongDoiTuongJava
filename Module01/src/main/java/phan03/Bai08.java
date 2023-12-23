/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * BAI 8: Viet chuong trinh in ra so lan ki tu 'a xuat hien trong 1 chuoi
 */

package phan03;
import java.util.Scanner;

public class Bai08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        
        System.out.println("Nhap chuoi: ");
        str = scanner.nextLine();
        
        System.out.printf("\nSo lan xuat hien cua ky tu 'a' trong chuoi la: %d", demKyTu(str, 'a'));
    }
    
    
    public static int demKyTu (String str, char c) {
        int count = 0;
        for (int i=0; i<str.length(); i++)
            if (str.charAt(i)==c)
                count++;
        return count;
    }
}