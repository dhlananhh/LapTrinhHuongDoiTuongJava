package bai06;

import java.time.LocalDate;
import java.util.Scanner;

public class Tester {
	private static Scanner scanner = new Scanner(System.in);

	
	public static void main(String[] args) throws Exception {
		DanhSachHangHoa ql = new DanhSachHangHoa();
		String ma;
		double giaMoi;
		boolean flag = true;

		ql.them(new HangDienMay("HDM001", "Tivi Samsung", 20000000, 5, 12));
		ql.them(new HangDienMay("HDM002", "Tu lanh Panasonic", 25000000, 3, 24));
		ql.them(new HangDienMay("HDM003", "May giat Samsung", 35000000, 6, 24));
		ql.them(new HangThucPham("HTP001", "Sua tuoi tiet trung", 000, 10, "TH True Milk", LocalDate.of(2022, 9, 9), LocalDate.of(2022, 12, 12)));
		ql.them(new HangThucPham("HTP002", "Yougurt Nep Cam", 5000, 10, "TH True Milk", LocalDate.of(2022, 10, 10), LocalDate.of(2022, 12, 12)));
		ql.them(new HangThucPham("HTP003", "KitKat", 20000, 20, "TH True Milk", LocalDate.of(2022, 10, 10), LocalDate.of(2022, 12, 12)));
		ql.them(new HangSanhSu("HSS001", "Binh gom", 50000, 5, "Lang Gom Bat Trang", LocalDate.of(2023, 01, 01)));
		ql.them(new HangSanhSu("HSS002", "Chen su", 30000, 3, "Lang Gom Bat Trang", LocalDate.of(2023, 6, 6)));
		ql.them(new HangSanhSu("HSS003", "Bo am tra", 70000, 7, "Lang Gom Bat Trang", LocalDate.of(2023, 9, 9)));
				
		do {
			System.out.println("MENU QUAN LY HANG HOA");
			System.out.println("1. Lay thong tin toan bo DS hang hoa");
			System.out.println("2. Lay thong tin DS hang thuc pham");
			System.out.println("3. Lay thong tin DS hanh dien may");
			System.out.println("4. Lay thong tin DS hang sanh su");
			System.out.println("5. Tim kiem hang hoa khi biet ma hang");
			System.out.println("6. Sap xep hang hoa theo ten hang tang dan");
			System.out.println("7. Sap xep hang hoa theo so luong ton giam dan");
			System.out.println("8. Lay thong tin cac hang thuc pham kho ban");
			System.out.println("9. Xoa hang hoa khi biet ma hang");
			System.out.println("10. Sua thong tin don gia cua hang hoa khi biet ma hang");
			System.out.println("11. Thoat");
			
			System.out.println("Nhap vao lua chon cua ban: ");
			int c = scanner.nextInt();
			
			switch (c) {
				case 0:
					flag = false;
					break;
							
				case 1:
					System.out.println("1. Lay thong tin toan bo DS hang hoa");
					System.out.println(ql.displayAllProducts());
					break;
					
				case 2:
					System.out.println("2. Lay thong tin DS hang thuc pham");
					System.out.println(ql.layThongTinDSHangThucPham());
					break;
					
				case 3:
					System.out.println("3. Lay thong tin DS hang dien may");
					System.out.println(ql.layThongTinDSHangDienMay());
					break;
					
				case 4:
					System.out.println("4. Lay thong tin DS hang sanh su");
					System.out.println(ql.layThongTinDSHangSanhSu());
					break;
				
				case 5:
					System.out.println("5. Tim kiem hang hoa khi biet ma hang");
					
					scanner.nextLine();
					System.out.println("Nhap vao ma hang can tim: ");
					ma = scanner.nextLine();
					System.out.println(ql.timKiemTheoMa(ma));
					
					break;
					
				case 6:
					System.out.println("6. Sap xep hang hoa theo ten hang tang dan");
					ql.sapXepDSTangTheoTenHang();
					System.out.println(ql.displayAllProducts());
					break;
					
				case 7:
					System.out.println("7. Sap xep hang hoa theo so luong ton giam dan");
					ql.sapXepDSGiamTheoSoLuongTon();
					System.out.println(ql.displayAllProducts());
					break;
					
				case 8:
					System.out.println("8. Lay thong tin cac hang thuc pham kho ban");
					
					if (ql.getSize() != 0) {
						System.out.println("Danh sach cac hang thuc pham kho ban la: ");
						System.out.println(ql.layDSHangThucPhamKhoBan());
					} else {
						System.out.println("Khong co hang thuc pham kho ban");
					}
					
					break;
					
				case 9:
					System.out.println("9. Xoa hang hoa khi biet ma hang");
					
					scanner.nextLine();
					System.out.println("Nhap vao ma hang can xoa la: ");
					ma = scanner.nextLine();
					
					if (ql.xoaTheoMa(ma) == true)
						System.out.println("Xoa thanh cong");
					else 
						System.out.println("Khong tim thay ma de xoa");
					
					break;
					
				case 10:
					System.out.println("10. Sua thong tin don gia cua hang hoa khi biet ma hang");
					
					scanner.nextLine();
					System.out.println("Nhap vao ma hang can cap nhat gia la: ");
					ma = scanner.nextLine();
					
					System.out.println("Nhap vao gia moi: ");
					giaMoi = scanner.nextDouble();
					
					if (ql.capNhatGia(ma, giaMoi) == true)
						System.out.println("Cap nhat gia thanh cong");
					else
						System.out.println("Khong tim thay ma de cap nhat gia");
					
					break;
					
				case 11:
					System.out.println("11. Thoat");
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
