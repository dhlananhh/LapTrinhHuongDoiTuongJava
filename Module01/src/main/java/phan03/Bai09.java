/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * BAI 9: Viet ham tach chuoi goc thanh chuoi con
 */

package phan03;
import java.util.Scanner;

public class Bai09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
                
        System.out.println("Nhap chuoi: ");
        str = scanner.nextLine();
        
        System.out.println("Ket qua sau khi tach chuoi la: ");
        String[] kq = str.split("\\s");
        for (String kyTu: kq)
            System.out.println(kyTu);  
    }
}
