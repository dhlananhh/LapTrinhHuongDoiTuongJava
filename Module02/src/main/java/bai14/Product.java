/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * Bài 14: Hiện thực mô hình lớp sau bằng ngôn ngữ lập trình Java
 */

package bai14;

import java.text.DecimalFormat;

public class Product {
    private String description;
    private String productID;
    private double price;
    
    public Product() {
        this.productID = "xxx";
        this.description = "not defined";
        this.price = 0;
    }
    
    public Product (String maHang, String moTa, double donGia) {
        this.productID = maHang;
        this.description = moTa;
        this.price = donGia;
    }
    
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0");
        return String.format("| %-5s | %-15s | %10s |", productID, description, df.format(price));
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = "xxx";
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price>=0)
            this.price = price;
        else
            this.price = 0;
    }
}
