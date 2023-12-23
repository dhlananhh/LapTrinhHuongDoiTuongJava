/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * Bai 12: Xay dung lop CDList de luu danh sach cac CD
 */

package bai12;

import java.util.ArrayList;


public class CDList {
    private ArrayList<CD> CDCollection;
    
    public CDList() {
        CDCollection = new ArrayList<CD>();
    }
    
    public void getCDCollection() {
        for (int i=0; i<CDCollection.size(); i++) {
            System.out.println(CDCollection.get(i).toString());
            System.out.println("\n");
        }
    }

    public void setCDCollection(ArrayList<CD> CDCollection) {
        this.CDCollection = CDCollection;
    }
        
    public void addCD (CD cd) {
        this.CDCollection.add(cd);
    }
    
    public void removeCD (int id) {
        this.CDCollection.remove(id);
    }
    
    public CD searchCD (int kw) {
        for (CD cd: this.CDCollection)
            if (cd.getId() == kw)
                return cd;
        return null;
    }
    
    public void compareCost() {
        this.CDCollection.sort((cd1, cd2)->cd1.compareCost(cd2));
    }
    
    public void compareCDName() {
        this.CDCollection.sort((cd1, cd2)->cd1.compareCDName(cd2));
    }
    
    public int getNumOfCD() {
        return this.CDCollection.size();
    }
    
    public double getSumOfCost() {
        double sum = 0;
        for (int i=0; i<this.CDCollection.size(); i++)
            sum += CDCollection.get(i).getCost();
        return sum;
    }
}
