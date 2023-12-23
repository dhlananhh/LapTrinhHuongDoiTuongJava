/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * Bài 1: Cài đặt lớp đối tượng ToaDo
 */

package bai01;

public class ToaDo {
    //Cac thuoc tinh
    private String ten;
    private double x;
    private double y;
    
    public ToaDo() {
        ten = " ";
        x = 0;
        y = 0;
    }
    
    public ToaDo (String ten, double x, double y) {
        this.ten = ten;
        this.x = x;
        this.y = y;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double[] getXY() {
        double[] kq = new double[2];
        kq[0] = x;
        kq[1] = y;
        return kq;
    }
    
    public void setXY (double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public String getThongTin() {
        return String.format("%s (%.0f;%.0f)", ten, x, y);
    }
}
