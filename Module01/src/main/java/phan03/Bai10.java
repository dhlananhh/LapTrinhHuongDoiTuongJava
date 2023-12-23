/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * BAI 10: Viet chuong trinh de dem so luong ky tu la so co trong chuoi s. Chuoi s duoc nhap tu ban phim
 */

package phan03;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        
        System.out.println("Nhap chuoi: ");
        str = scanner.nextLine();
        
        System.out.printf("\nSo luong ky tu la so co trong chuoi s la: %d", demKyTuSo(str));
    }
    
    
    public static int demKyTuSo (String str) {
        int dem = 0;
        
        for (int i=0; i<str.length(); i++)
            if (Character.isDigit(str.charAt(i)))
                dem++;
        
        return dem;
    }
}
