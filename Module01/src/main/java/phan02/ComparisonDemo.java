/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lan Anh
 */
public class ComparisonDemo {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;
        
        System.out.println("value1 == value2: " + (value1 == value2));
        System.out.println("value1 != value2: " + (value1 != value2));
        System.out.println("value1 > value2: " + (value1 > value2));
        System.out.println("value1 < value2: " + (value1 < value2));
        System.out.println("value1 <= value2: " + (value1 <= value2));
        System.out.println("(value <= value2) && (value1 == value2): " + ((value1 <= value2) && (value1 == value2)));
    }
}
