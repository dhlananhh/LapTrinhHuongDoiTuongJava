/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai09;

/**
 *
 * @author Lan Anh
 */

import java.lang.Object;

public class ToaDo {
    private String ten;
    private float x;
    private float y;
    
    
    /**
     * Constructor mặc định
     */
    public ToaDo() {
        ten = " ";
        x = 0;
        y = 0;
    }
    
    
    /**
     * Constructor chứa đầy đủ tham số
     * @param tenToaDo : tên tọa độ
     * @param hoanhDo : hoành độ
     * @param tungDo : tung độ
     */
    public ToaDo (String tenToaDo, float hoanhDo, float tungDo) {
        this.ten = tenToaDo;
        this.x = hoanhDo;
        this.y = tungDo;
    }
    
    /**
     * Phương thức getter hoành độ
     * @return : kết quả trả về hoành độ
     */
    public float getX() {
        return x;
    }
    
    
    /**
     * Phương thức setter hoành độ
     * @param hoanhDo : hoành độ
     */
    public void setX (float hoanhDo) {
        x = hoanhDo;
    }
    
    
    /**
     * Phương thức getter tung độ
     * @return : kết quả trả về tung độ
     */
    public float getY() {
        return y;
    }
    
    
    /**
     * Phương thức setter hoành độ
     * @param tungDo : tung độ
     */
    public void setY (float tungDo) {
        y = tungDo;
    }
    
    
    @Override
    /**
     * Phương thức toString trả về thông tin tọa độ
     */
    public String toString() {
        return String.format("\n%s (%.2f ; %.2f)", ten, x, y);
    }
}
