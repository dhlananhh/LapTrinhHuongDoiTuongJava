/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * Bai 12: Viet lop cho phan kiem nghiem. Co the dung menu case thuc hien cac chuc nang yeu cau
 */

package bai12;

import java.util.ArrayList;
import java.util.Scanner;

public class CDTester {
    private static Scanner scanner = new Scanner(System.in);
    
    
    public static void inputCD (CD cd) {
        scanner.nextLine();
        System.out.println("Nhap ma CD: ");
        cd.setId(scanner.nextInt());
        
        scanner.nextLine();
        System.out.println("Nhap ten CD: ");
        cd.setName(scanner.nextLine());
        
        scanner.nextLine();
        System.out.println("Nhap ten ca si: ");
        cd.setSingerName(scanner.nextLine());
        
        System.out.println("Nhap so luong bai hat: ");
        cd.setNumOfSong(scanner.nextInt());
        
        System.out.println("Nhap gia thanh: ");
        cd.setCost(scanner.nextDouble());
    }
    
    
    public static void main(String[] args) {
        CDList ql = new CDList();
        CD cd;
        int id;
        boolean flag = true;
        int c;
    
        do {
            System.out.println("CHUONG TRINH QUAN LY CD");
            System.out.println("1. Nhap danh sach thong tin CD");
            System.out.println("2. Xuat danh sach CD");
            System.out.println("3. Tinh tong so luong CD");
            System.out.println("4. Xoa CD theo ma");
            System.out.println("5. Tinh tong gia thanh");
            System.out.println("6. Tim kiem theo ma CD");
            System.out.println("7. Sap xep giam dan theo gia thanh");
            System.out.println("8. Sap xep tang dan theo ten CD");
            
            System.out.println("Nhap vao lua chon cua ban: ");
            c = scanner.nextInt();
                        
            switch (c) {
                case 0:
                    flag = false;
                    break;
                    
                case 1:
                    System.out.println("Ban da chon nhap danh sach thong tin CD");
                    cd = new CD();
                    inputCD(cd);
                    ql.addCD(cd);
                    System.out.println("Nhap lieu thanh cong");
                    break;
                    
                case 2:
                    System.out.println("Ban da chon xuat danh sach CD");
                    System.out.println(CD.getTitle());
                    ql.getCDCollection();
                    System.out.println("Xuat danh sach CD thanh cong");
                    break;
                    
                case 3:
                    System.out.println("Tong so luong CD: " + ql.getNumOfCD());
                    break;
                    
                case 4:
                    System.out.println("Ban da chon xoa CD theo ma");
                    System.out.println("Nhap vao ma CD muon xoa: ");
                    id = scanner.nextInt();
                    cd = new CD();
                    ql.removeCD(cd.getId());
                    System.out.println("Da xoa thanh cong");
                    break;
                    
                case 5:
                    System.out.println("Tong gia thanh: " + ql.getSumOfCost());
                    break;
                    
                case 6:
                    System.out.println("Ban da chon tim kiem theo ma CD");
                    System.out.println("Nhap vao ma CD muon tim kiem: ");
                    id = scanner.nextInt();
                    cd = new CD();
                    cd = ql.searchCD(id);
                    if (cd==null)
                        System.out.println("KHONG TIM THAY");
                    else {
                        System.out.println("DA TIM THAY");
                        System.out.println(CD.getTitle());
                        System.out.println(cd);
                    }
                    break;
                    
                case 7:
                    System.out.println("Ban da chon sap xep giam dan theo gia thanh");
                    ql.compareCost();
                    System.out.println("Danh sach sau khi sap xep giam dan theo gia thanh la: ");
                    ql.getCDCollection();
                    System.out.println("Sap xep thanh cong");
                    break;
                    
                case 8:
                    System.out.println("Ban da chon sap xep tang dan theo ten CD");
                    ql.compareCDName();
                    System.out.println("Danh sach sau khi sap xep tang dan theo ten CD la: ");
                    ql.getCDCollection();
                    System.out.println("Sap xep thanh cong");
                    break;
                    
                default:
                    System.out.println("Chuong trinh khong co chuc nang nay");
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
