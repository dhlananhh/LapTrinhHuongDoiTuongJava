package bai04;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class Tester {
	private static Scanner scanner = new Scanner(System.in);
	
	
	public static void inputSach (Sach s) {
		scanner.nextLine();
		System.out.println("Nhap ma sach: ");
		s.setMaSach(scanner.nextLine());
		
		scanner.nextLine();
		System.out.println("Nhap ngay nhap: ");
		s.setNgayNhap(LocalDate.parse(scanner.nextLine()));
		
		System.out.println("Nhap don gia: ");
		s.setDonGia(scanner.nextDouble());
		
		System.out.println("Nhap so luong: ");
		s.setSoLuong(scanner.nextInt());
		
		scanner.nextLine();
		System.out.println("Nhap nha xuat ban: ");
		s.setNhaXuatBan(scanner.nextLine());
	}
	
	
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,##0 VND");
		DanhMucSach ds = new DanhMucSach();
		Sach s;
		boolean flag = true;
		
		do {
			System.out.println("CHUONG TRINH QUAN LY THU VIEN");
			System.out.println("1. Nhap danh sach thong tin cac quyen sach");
			System.out.println("2. Xuat danh sach cac quyen sach");
			System.out.println("3. Tinh thanh tien SGK");
			System.out.println("4. Tinh thanh tien STK");
			System.out.println("5. Tim sach giao khoa theo NXB");
			System.out.println("6. Tim thanh tien cao nhat");
			System.out.println("7. Thoat");
			System.out.println("Nhap vao lua chon cua ban: ");
			int c = scanner.nextInt();
			
			switch (c) {
				case 0:
					flag = false;
					break;
				case 1:
					System.out.println("1. Nhap danh sach thong tin cac quyen sach");
					s = new Sach();
					inputSach(s);
					ds.addSach(s);
					System.out.println("Nhap lieu thanh cong");
					break;
					
				case 2:
					System.out.println("2. Xuat danh sach cac quyen sach");
					System.out.println(ds);
					System.out.println("Xuat DS thanh cong");
					break;
					
				case 3:
					System.out.println("3. Tinh thanh tien SGK");
					System.out.println(df.format(ds.tinhThanhTienSGK()));
					break;
					
				case 4:
					System.out.println("4. Tinh thanh tien STK");
					System.out.println(df.format(ds.tinhTongThanhTien() - ds.tinhThanhTienSGK()));
					break;
					
				case 5:
					System.out.println("5. Tim sach giao khoa theo NXB");
					scanner.nextLine();
					System.out.println("Nhap vao NXB muon tim: ");
					String kw = scanner.nextLine();
					DanhMucSach kq = new DanhMucSach();
					kq = ds.timSGKTheoNXB(kw);
					System.out.println(kq);
					break;
					
				case 6:
					System.out.println("6. Tim thanh tien cao nhat");
					System.out.println(df.format(ds.getThanhTienCaoNhat()));
					break;
					
				case 7:
					System.out.println("7. Thoat");
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
