/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * 
 */

package bai13;

public class CongNhan {
    private String mHo, mTen;
    private int mSoSP, mMa;
    private double donGia, tienLuong;
        
    public CongNhan() {
        
    }
    
    public CongNhan (String ho, String ten, int soSP, int ma) {
        this.mHo = ho;
        this.mTen = ten;
        this.mSoSP = soSP;
        this.mMa = ma;
    }
    
    public static String getTitle() {
        return String.format("\n%-10s %-20s %-20s %-20s", "Ma", "Ho", "Ten", "So SP");
    }
    
    @Override
    public String toString() {
        return String.format("%-10d %-20s %-20s %-20d", mMa, mHo, mTen, mSoSP);
    }
    
    public double getTienLuong (int soSP) {
        if (soSP>=1 && soSP<=199)
            donGia = 0.5;
        else if (soSP>=200 && soSP<=399)
            donGia = 0.55;
        else if (soSP>=400 && soSP<=599)
            donGia = 0.6;
        else
            donGia = 0.65;
        
        tienLuong = (double) soSP * donGia;
        return tienLuong;
    }
    
    public int compareCost (CongNhan cn) {
        return this.getmSoSP() > cn.getmSoSP() ? -1: 1;
    }

    public String getmHo() {
        return mHo;
    }

    public void setmHo(String mHo) throws Exception {
        if (!mHo.equals(""))
            this.mHo = mHo;
        else
            this.mHo = "";
    }

    public String getmTen() {
        return mTen;
    }

    public void setmTen(String mTen) throws Exception {
        if (!mTen.equals(""))
            this.mTen = mTen;
        else
            this.mTen = "";
    }

    public int getmSoSP() {
        return mSoSP;
    }

    public void setmSoSP(int mSoSP) {
        this.mSoSP = mSoSP;
    }

    public int getmMa() {
        return mMa;
    }

    public void setmMa(int ma) {
        this.mMa = ma;
    }
}
