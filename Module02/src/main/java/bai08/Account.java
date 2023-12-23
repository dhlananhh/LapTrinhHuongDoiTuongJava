/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * Bài 8: Cài đặt cho lớp tài khoản (Account) theo thiết kế
 */

package bai08;

import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    private long accountNumber;
    private String name;
    private double balance;
    private final double RATE = 0.035;

    public Account() {
        accountNumber = 999999;
        name = "chua xac dinh";
        balance = 50000;
    }
    
    public Account (String name, long accNum, double balance) {
        setName(name);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }
    
    public Account (String name, long accNum) {
        setName(name);
        setAccountNumber(accountNumber);
    }
    
    /**
     * Tien gui
     */
    public boolean deposit (double amount) throws Exception {
        if (amount < 0) {
            throw new Exception("Condition: amount>0");
        } else {
            balance += amount;
            return true;
        }
    }
    
    /**
     * Rut tien
     */
    public boolean withdraw (double amount, double fee) throws Exception {
        if (amount<0 || (amount+fee)>=balance) {
            throw new Exception("Error. Withdraw conditions: amount>0 & (amount+fee)<=balance");
        } else {
            balance = balance - (amount + fee);
            return true;
        }
    }
    
    /**
     * Chuyen giao tien
     */
    public void transfer (Account acc2, double amount, double fee) {
        try {
            this.withdraw(amount, fee);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        try {
            acc2.deposit(amount);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    /**
     * Tinh tien lai
     */
    public void addInterest() {
        balance = balance + (balance*RATE);
    }
    
    @Override
    public String toString() {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
        return "[accountNumber = " + accountNumber + ", name = " + name + ", balance = " + numberFormat.format(getBalance()) + ", RATE = " + RATE + "]";
    }
    
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        if (accountNumber>0)
            this.accountNumber = accountNumber;
        else
            this.accountNumber = 999999;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.trim().equals(""))
            this.name = name;
        else
            this.name = "Chua xac dinh";
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance>=50000)
            this.balance = balance;
        else
            this.balance = 50000;
    }
}
