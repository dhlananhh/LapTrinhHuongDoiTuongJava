/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * Bai 13: Viet lop cho phan kiem nghiem. Co the dung menu case thuc hien cac chuc nang yeu cau
 */

package bai13;


import java.util.ArrayList;
import java.util.Scanner;


public class CongNhanTester {
    public static Scanner scanner = new Scanner(System.in);
    
    
    public static void inputCN (CongNhan cn) throws Exception {
        System.out.println("Nhap vao ma cong nhan: ");
        cn.setmMa(scanner.nextInt());
        
        scanner.nextLine();
        System.out.println("Nhap vao ho cua cong nhan: ");
        cn.setmHo(scanner.nextLine());
        
        scanner.nextLine();
        System.out.println("Nhap vao ten cua cong nhan: ");
        cn.setmTen(scanner.nextLine());
        
        System.out.println("Nhap vao so luong san pham ma cong nhan da lam duoc: ");
        cn.setmSoSP(scanner.nextInt());
    }
    
    
    public static void main(String[] args) throws Exception {
        DanhSachCongNhan ql = new DanhSachCongNhan();
        ArrayList<CongNhan> kq;
        CongNhan cn;
        boolean flag = true;
        int c;
        int id;
        String kw;
        
        do {
            System.out.println("CHUONG TRINH QUAN LY CONG NHAN");
            System.out.println("1. Nhap danh sach thong tin cac cong nhan");
            System.out.println("2. Xuat danh sach cong nhan");
            System.out.println("3. Tinh tong so luong cong nhan co trong danh sach");
            System.out.println("4. Xoa cong nhan ra khoi danh sach khi biet ma");
            System.out.println("5. Lay danh sach cong nhan lam tren 200 san pham");
            System.out.println("6. Tim kiem cong nhan theo ma");
            System.out.println("7. Tim kiem cong nhan khi biet ho hoac ten");
            System.out.println("8. Sap xep cong nhan theo so san pham giam dan");
            
            System.out.println("Nhap vao lua chon cua ban: ");
            c = scanner.nextInt();
            
            switch (c) {
                case 1:
                    System.out.println("Ban da chon nhap danh sach thong tin cac cong nhan");
                    cn = new CongNhan();
                    inputCN(cn);
                    ql.addCN(cn);
                    System.out.println("Nhap lieu thanh cong");
                    break;
                    
                case 2:
                    System.out.println("Ban da chon xuat danh sach cong nhan");
                    System.out.println(CongNhan.getTitle());
                    ql.getDs();
                    System.out.println("Xuat danh sach thanh cong");
                    break;
                    
                case 3:
                    System.out.println("Tong so luong cong nhan co trong danh sach: " + ql.getNumOfCN());
                    break;
                    
                case 4:
                    System.out.println("Ban da chon xoa cong nhan ra khoi danh sach khi biet ma");
                    System.out.println("Nhap vao ma cong nhan muon xoa: ");
                    id = scanner.nextInt();
                    
                    cn = new CongNhan();
                    ql.removeCN(cn.getmMa());
                    System.out.println("Da xoa thanh cong");
                    break;
                    
                case 5:
                    System.out.println("Ban da chon lay danh sach cong nhan lam tren 200 san pham");
                    kq = new ArrayList<CongNhan>();
                    kq = ql.getDSCNLamTren200SP();
                    System.out.println(kq);
                    break;
                    
                case 6:
                    System.out.println("Ban da chon tim kiem cong nhan theo ma");
                    System.out.println("Nhap vao ma cong nhan muon xoa: ");
                    id = scanner.nextInt();
                    
                    cn = new CongNhan();
                    cn = ql.searchMaCN(id);
                    
                    if (cn == null)
                        System.out.println("KHONG TIM THAY");
                    else {
                        System.out.println("DA TIM THAY");
                        System.out.println(CongNhan.getTitle());
                        System.out.println(cn);
                    }
                    break;
                    
                case 7:
                    System.out.println("Ban da chon tim kiem cong nhan khi biet ho hoac ten");
                    scanner.nextLine();
                    System.out.println("Nhap vao tu khoa muon tim: ");
                    kw = scanner.nextLine();
                    
                    kq = new ArrayList<CongNhan>();
                    kq = ql.searchCN(kw);
                    System.out.println(kq);
                    break;
                    
                case 8:
                    System.out.println("Ban da chon sap xep cong nhan theo so san pham giam dan");
                    ql.compareSoSP();
                    System.out.println("Danh sach cong nhan sau khi sap xep giam dan theo so san pham la: ");
                    ql.getDs();
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
