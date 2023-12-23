/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * Bài 2: Cài đặt lớp Point
 */

package bai02;

public class Point {
    private String ten;
    private double x;
    private double y;
    
    public Point() {
        ten = " ";
        x = 0;
        y = 0;
    }
    
    public Point (String ten, double x, double y) {
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
    
    @Override
    public String toString() {
        return String.format("%s (%.2f ; %.2f)", ten, x, y);
    }
    
    public double getDistance() {
        return Math.sqrt(x*x + y*y);
    }
    
    public Point getNegate() {
        Point dx = new Point();
        dx.x = x*(-1);
        dx.y = y*(-1);
        return dx;
    }
}
