/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lan Anh
 */

package bai08;


public class AccountTester {
    public static void main(String[] args) {
        Account acc1 = new Account("Ted Murphy", 72354, 100000);
        Account acc2 = new Account("Jane Smith", 69713, 40000);
        Account acc3 = new Account("Edward Demsey", 93757, 700000);
        
    /** Goi them so tien cho:
     * acc1 la 250 000
     * acc2 la 500 000
     */    
        try {
            acc1.deposit(250000);
            acc2.deposit(500000);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Goi them so tien cho: acc1 la 250 000, acc2 la 500 000");
        System.out.println(acc1);
        System.out.println(acc2);
        
    /** Rut khoi acc2 so tien la 430 000, muc phi la 2000 **/
        try {
            acc2.withdraw(430000, 2000);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println();
        System.out.println("Rut khoi acc2 so tien la 430 000, muc phi la 2000");
        System.out.println(acc2);
        
    /** Tinh tien lai cho acc3 **/    
        double temp;
        temp = acc3.getBalance();
        acc3.addInterest();
        System.out.println();
        System.out.println("Tinh tien lai cho acc3: ");
        System.out.println("So tien lai acc3: " + acc3.getBalance());
        
    /** Chuyen tien tu acc1 sang cho acc2 so tien la 100000, phi chuyen la 1000 **/    
        System.out.println();
        System.out.println("Chuyen tien tu acc1 sang cho acc2 so tien la 100000, phi chuyen la 1000");
        acc1.transfer(acc2, 100.00, 1000);
        System.out.println(acc1);
        System.out.println(acc2);
    }
}
