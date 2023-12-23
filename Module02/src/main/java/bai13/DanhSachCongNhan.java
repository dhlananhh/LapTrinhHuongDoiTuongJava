/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * Bai 13: Cai dat lop DanhSachCongNhan
 */

package bai13;

import java.util.ArrayList;

public class DanhSachCongNhan {
    private ArrayList<CongNhan> ds;
    
    public DanhSachCongNhan() {
        ds = new ArrayList<CongNhan>();
    }
    
    public void getDs() {
        for (int i=0; i<ds.size(); i++) {
            System.out.println(ds.get(i).toString());
            System.out.println("\n");
        }
    }

    public void setDs(ArrayList<CongNhan> ds) {
        this.ds = ds;
    }
    
    public void addCN (CongNhan cn) {
        this.ds.add(cn);
    }
    
    public void removeCN (int id) {
        this.ds.remove(id);
    }
    
    public int getNumOfCN() {
        return this.ds.size();
    }
    
    public void compareSoSP() {
        this.ds.sort((cn1, cn2)->cn1.compareCost(cn2));
    }
    
    public CongNhan searchMaCN (int id) {
        for (CongNhan cn: this.ds)
            if (cn.getmMa() == id)
                return cn;
        return null;
    }
    
    public ArrayList<CongNhan> searchCN (String kw) {
        ArrayList<CongNhan> kq = new ArrayList<CongNhan>();
        
        for (CongNhan cn: this.ds)
            if (cn.getmHo().contains(kw)==true || cn.getmTen().contains(kw)==true)
                kq.add(cn);
        
        return kq;
    }

    public ArrayList<CongNhan> getDSCNLamTren200SP() {
        ArrayList<CongNhan> dskq = new ArrayList<CongNhan>();
        
        for (CongNhan cn: this.ds)
            if (cn.getmSoSP()>=200)
                dskq.add(cn);
        
        return dskq;
    }
}
