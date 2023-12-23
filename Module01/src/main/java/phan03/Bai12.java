/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 * @author Lan Anh
 * 
 */

package phan03;


public class Bai12 {
    public static void main(String[] args) {
        System.out.println("Nhung so le tu 1 den 99 la: ");
        
        for (int i=0; i<100; i++)
                if (isOddNumber(i)==1)
                    System.out.printf("\t%d", i);
    }
    
    
    public static int isOddNumber (int n) {
        if (n % 2 != 0)
            return 1;
        else
            return 0;
    }
}
