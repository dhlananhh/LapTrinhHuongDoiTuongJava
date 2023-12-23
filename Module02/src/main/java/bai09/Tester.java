/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lan Anh
 */

package bai09;
public class Tester {
    public static void main(String[] args) {
//        ToaDo A = new ToaDo("Diem A", 2, 3);
//        System.out.println(A);
        
        ToaDo tam = new ToaDo("P", 5, 5);
        
        HinhTron h = new HinhTron(tam, 10.5);
        System.out.println(h);
    }
}
