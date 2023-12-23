package bai06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester {
	private static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		DanhSachPhongHoc ql = new DanhSachPhongHoc();
		String ma;
		int soMayTinh;
		boolean flag = true;
		
		ql.themPhongHoc(new PhongHocLyThuyet("A30", "H5.1", 260, 50, false));
		ql.themPhongHoc(new PhongHocLyThuyet("A29","H6.1", 360, 150, true));
		ql.themPhongHoc(new PhongMayTinh("A33", "D4.2", 300, 40, 50));
		ql.themPhongHoc(new PhongMayTinh("A35", "D3.1", 500, 30, 100));
		ql.themPhongHoc(new PhongThiNghiem("B54", "X2.4", 450, 45,"Hoa huu co", 50, false));
		ql.themPhongHoc(new PhongThiNghiem("B55", "X1.4", 550, 145,"Hoa phan tich", 150, true));
		
		do {
			System.out.println("MENU QUAN LY PHONG HOC");
			System.out.println("1. Lay thong tin toan bo danh sach cac phong hoc");
			System.out.println("2. Xuat danh sach cac phong hoc ly thuyet");
			System.out.println("3. Xuat danh sach cac phong may tinh");
			System.out.println("4. Xuat danh sach cac phong thi nghiem");
			System.out.println("5. Tim kiem 1 phong hoc nao do khi biet ma phong");
			System.out.println("6. Lay danh sach cac phong hoc dat chuan");
			System.out.println("7. Sap xep danh sach tang dan theo day nha");
			System.out.println("8. Sap xep danh sach giam dan theo dien tich");
			System.out.println("9. Sap xep danh sach tang dan theo so bong den");
			System.out.println("10. Cap nhat so may tinh cho 1 phong may tinh nao do khi biet ma phong");
			System.out.println("11. Xoa 1 phong hoc nao do khi biet ma phong");
			System.out.println("12. Tinh tong so phong hoc");
			System.out.println("13. Lay danh sach cac phong may tinh co 60 may");
			System.out.println("14. Thoat");
			
			System.out.println("Nhap vao lua chon cua ban: ");
			int c = scanner.nextInt();
			
			
			switch (c) {
				case 0:
					flag = false;
					break;
			
				case 1:
					System.out.println("1. Lay thong tin toan bo danh sach cac phong hoc");
					System.out.println(ql);
					break;
					
				case 2:
					System.out.println("2. Xuat danh sach cac phong hoc ly thuyet");
					System.out.println(ql.xuatDSPhongLyThuyet());
					break;
					
				case 3:
					System.out.println("3. Xuat danh sach cac phong may tinh");
					System.out.println(ql.xuatDSPhongMayTinh());
					break;
					
				case 4:
					System.out.println("4. Xuat danh sach cac phong thi nghiem");
					System.out.println(ql.xuatDSPhongThiNghiem());
					break;
					
					
				case 5:
					System.out.println("5. Tim kiem 1 phong hoc nao do khi biet ma phong");
					
					scanner.nextLine();
					System.out.println("Nhap vao ma phong can tim la: ");
					ma = scanner.nextLine();
					System.out.println(ql.timPhongHoc(ma));
					
					break;
					
				case 6:
					System.out.println("6. Lay danh sach cac phong hoc dat chuan");
					
					if (ql.getSize() != 0) {
						System.out.println("Danh sach cac phong hoc dat chuan la: ");
						System.out.println(ql.layDSPhongHocDatChuan());
					} else {
						System.out.println("Khong co phong hoc dat chuan");
					}
					
					break;
					
				case 7:
					System.out.println("7. Sap xep danh sach tang dan theo day nha");
					ql.sapXepDSTangDanTheoDayNha();
					System.out.println(ql);
					break;
					
				case 8:
					System.out.println("8. Sap xep danh sach giam dan theo dien tich");
					ql.sapXepDSGiamDanTheoDienTich();
					System.out.println(ql);
					break;
					
				case 9:	
					System.out.println("9. Sap xep danh sach tang dan theo so bong den");
					ql.sapXepDSTangDanTheoSoBongDen();
					System.out.println(ql);
					break;
					
				case 10:
					System.out.println("10. Cap nhat so may tinh cho 1 phong may tinh nao do khi biet ma phong");
					
					scanner.nextLine();
					System.out.println("Nhap vao ma phong may tinh can cap nhat la: ");
					ma = scanner.nextLine();
					
					System.out.println("Nhap vao so may tinh moi: ");
					soMayTinh = scanner.nextInt();
					System.out.println(ql.capNhat(ma, soMayTinh));
					
					break;
					
				case 11:	
					System.out.println("11. Xoa 1 phong hoc nao do khi biet ma phong");
					
					scanner.nextLine();
					System.out.println("Nhap vao ma phong can xoa la: ");
					ma = scanner.nextLine();
					
					if (ql.xoa(ma) == true) 
						System.out.println("Xoa thanh cong");
					 else 
						System.out.println("Khong tim thay ma de xoa");
					
					
					break;
					
				case 12:
					System.out.println("12. Tinh tong so phong hoc");
					System.out.println(ql.tinhTongSoLuongPhongHoc());
					break;
					
				case 13:
					System.out.println("13. Lay danh sach cac phong may tinh co 60 may");
					
					if (ql.getSize() != 0) {
						System.out.println("Danh sach phong may tinh co 60 may la: ");
						System.out.println(ql.layDSPhongMay());
					} else {
						System.out.println("Khong co phong nhu the");
					}
					
					break;
					
				case 14:
					System.out.println("14. Thoat");
					flag = false;
					break;
					
				default:
					System.out.println("Chuong trinh khong ho tro chuc nang nay");
					flag = false;
					break;
			}
		} while (flag);
	}
}