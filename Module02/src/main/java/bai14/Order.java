/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * 
 */
package bai14;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Order {
    private int orderID;
    private LocalDate orderDate;
    private OrderDetail[] lineItems;
    private int count;

    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        lineItems = new OrderDetail[20];
    }

    public void addLineItems (Product p, int x) throws Exception {
        if (count < lineItems.length) {
                lineItems[count++] = new OrderDetail(p, x);
        } else
                throw new Exception("Vuot qua kich thuoc mang cho phep");
    }

    public double calcTotalCharge() {
        double sum = 0;
        for (int i = 0; i < count; i++) {
                sum += lineItems[i].calcTotalPrice();
        }
        return sum;
    }

    public LocalDate getOderDate() {
        return orderDate;
    }

    public void setOderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public int getOrderID() {
        return orderID;
    }

    public OrderDetail[] getLineItems() {
        return lineItems;
    }
	
	@Override
	public String toString() {
            String s1 = "";
            for (int i = 0; i < count; i++) {
                    s1 += String.format("%-5d %s", i+1,lineItems[i]);
                    s1 += "\n";
            }
            String s2 = "";
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            DecimalFormat df = new DecimalFormat("#,##0");
            s2 += String.format("%-5s | %-5s | %-15s | %10s | %10s | %15s","STT","Ma SP","Mo ta","Don gia","S Luong","Thanh Tien");

            return "Ma HD: " + orderID + "\nNgay lap hoa don: " + dtf.format(orderDate) + "\n" + s2 + "\n" + s1
                + "\nTong tien thanh toan: " + df.format(calcTotalCharge() + " VND");
	}
}