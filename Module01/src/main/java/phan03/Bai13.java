/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * BAI 13: Viet chuong trinh in ra tong cua 10 so chan dau tien
 */

package phan03;

public class Bai13 {
    public static void main(String[] args) {
        System.out.printf("\nTong cua 10 so chan dau tien la: %d", sumEvenNumbers(10));
    }
    
    public static int isEvenNumber (int n) {
        if (n % 2 == 0)
            return 1;
        else
            return 0;
    }
    
    public static int sumEvenNumbers (int n) {
        int sum = 0;
        
        for (int i=0; i<=n; i++)
            if (isEvenNumber(i)==1)
                sum += i;
        
        return sum;
    }
}