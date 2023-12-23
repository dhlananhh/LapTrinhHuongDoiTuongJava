package bai05;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class Tester {
	public static void main(String[] args) {
		DecimalFormat mf = new DecimalFormat("#,##0");
		DanhSachGiaoDich ds = new DanhSachGiaoDich();
		ds.them(new GiaoDichVang("A31", LocalDate.of(2021, 8, 15),300000,200, "24"));
		ds.them(new GiaoDichVang("A32", LocalDate.of(2021, 9, 14),300000,200, "K2"));
		ds.them(new GiaoDichVang("A33", LocalDate.of(2021, 10, 13),300000,200, "A31"));
		ds.them(new GiaoDichVang("A34", LocalDate.of(2021, 11, 12),300000,200, "23"));
		ds.them(new GiaoDichTienTe("B21",LocalDate.of(2020, 12, 4), 320000, 1000, 230000, "USD"));
		ds.them(new GiaoDichTienTe("B22",LocalDate.of(2020, 1, 14), 520000, 1000, 350000, "Viet Nam"));
		ds.them(new GiaoDichTienTe("B23",LocalDate.of(2020, 3, 24), 420000, 1000, 40000, "Euro"));
		
		System.out.println(ds);
		System.out.println("So luong cua giao dich vang: " + ds.tongSoLuongChoGDVang());
		System.out.println("So luong giao dich tien: " + ds.tongSoLuongChoGDTienTe());
		System.out.println("Trung binh thanh tien cua giao dich tien te: " + mf.format(ds.tinhTBGiaoDichTienTe()));
		System.out.println("Danh sach cac giao dich hon 1 ti la: \n");
		System.out.println(ds.xuatGD());
	}
}
