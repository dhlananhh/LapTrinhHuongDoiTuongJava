/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * Bai 12: Xay dung lop doi tuong CD
 */

package bai12;

import java.text.NumberFormat;
import java.util.Locale;

public class CD {
    private int id;
    private String name;
    private String singerName;
    private int numOfSong;
    private double cost;
    
    public CD() {
        
    }
    
    public CD (int id, String name, String singerName, int numOfSong, int cost) {
        this.id = id;
        this.name = name;
        this.singerName = singerName;
        this.numOfSong = numOfSong;
        this.cost = cost;
    }
    
    public static String getTitle() {
        return String.format("%-10s %-30s %-30s %-20s %-20s", "Ma CD", "Ten CD", "Ten ca sy", "SL bai hat", "Gia thanh");
    }
    
    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        return String.format("%-10d %-30s %-30s %-20d %-20s", id, name, singerName, numOfSong, nf.format(getCost()));
    }

    public int compareCost (CD cd) {
        return this.getCost() > cd.getCost() ? -1: 1;
    }
    
    public int compareCDName (CD cd) {
        return this.getName().compareTo(cd.getName());
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public int getNumOfSong() {
        return numOfSong;
    }

    public void setNumOfSong(int numOfSong) {
        this.numOfSong = numOfSong;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
