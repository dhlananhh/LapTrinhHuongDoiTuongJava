/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * 
 */

package phan03;
import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s, str;
        
        System.out.println("Nhap vao str: ");
        str = scanner.nextLine();
        
        System.out.println("Nhap vao s: ");
        s = scanner.nextLine();

//        System.out.println("Nhap vao s2: ");
//        s2 = scanner.nextLine();
//        
//        System.out.println("Nhap vao s3: ");
//        s3 = scanner.nextLine();
        
        System.out.println(str.contains(s));
    }
}