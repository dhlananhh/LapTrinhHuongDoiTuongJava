package bai02;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,##0 VND");
		Scanner scanner = new Scanner(System.in);
		
		Sach[] ds = new Sach[6];
		ds[0] = new SachGiaoKhoa("SGK001", LocalDate.of(2022, 10, 30), 30000, 4, "NXB DH SPKT TpHCM", true); 
		ds[1] = new SachGiaoKhoa("SGK002", LocalDate.of(2022, 10, 23), 15000, 2, "NXB Tong hop TpHCM", true);
		ds[2] = new SachGiaoKhoa("SGK003", LocalDate.of(2022, 11, 23), 20000, 6, "NXB Giao duc", false);
		ds[3] = new SachThamKhao("STK001", LocalDate.of(2022, 11, 11), 15000, 1, "Saigon Books", 2000);
		ds[4] = new SachThamKhao("STK002", LocalDate.of(2022, 11, 30), 15000, 1, "NXB Tre", 2000);
		ds[5] = new SachThamKhao("STK003", LocalDate.of(2022, 12, 25), 15000, 1, "NXB Hoi nha van", 2000);
		xuatDSSach(ds);
		
		System.out.println("Tien sach giao khoa: " + df.format(tinhTongThanhTien(ds) - tinhThanhTienSachThamKhao(ds)));
		System.out.println("Tien sach tham khao: " + df.format(tinhThanhTienSachThamKhao(ds)));
		
		scanner.nextLine();
		System.out.println("Nhap vao nxb muon tim: ");
		String s = scanner.nextLine();
		
		Sach[] kq = timSachGiaoKhoaTheoNXB(ds, s);
		if (kq.length == 0)
			System.out.println("Khong tim thay");
		else {
			System.out.println("Ket qua tim: ");
			for (Sach sach : kq) {
				System.out.println(sach);
			}
		}
		
		System.out.println("Thanh tien cao nhat: " + df.format(timThanhTienCaoNhat(ds)));
	}
	
	
	public static void xuatDSSach (Sach[] a) {
		System.out.println("DS sach giao khoa");
		for (Sach sach : a) {
			if (sach instanceof SachGiaoKhoa)
				System.out.println(sach);
		}
		
		System.out.println("DS sach tham khao");
		for (Sach sach : a) {
			if (sach instanceof SachThamKhao)
				System.out.println(sach);
		}
	}
	
	
	public static double tinhTongThanhTien (Sach[] s) {
		double sum = 0;
		for (int i=0; i < s.length; i++)
			sum += s[i].getThanhTien();
		return sum;
	}
	
	
	public static double tinhThanhTienSachThamKhao (Sach[] s) {
		double sum = 0;
		for (int i=0; i < s.length; i++)
			if (s[i] instanceof SachThamKhao)
				sum += s[i].getThanhTien();
		return sum;
	}
	
	
	public static Sach[] timSachGiaoKhoaTheoNXB (Sach[] a, String nxb) {
		Sach[] temp = new Sach[a.length];
		int i=0;
		
		for (Sach sach : a) {
			if (sach instanceof SachGiaoKhoa && sach.getNhaXuatBan().equalsIgnoreCase(nxb))
				temp[i++] = sach;
		}
		
		Sach[] kq = Arrays.copyOfRange(temp,  0,  i);
		return kq;
	}
	
	
	public static double timThanhTienCaoNhat (Sach[] a) {
		double max = a[0].getThanhTien();
		for (Sach sach : a) {
			if (sach.getThanhTien() > max)
				max = sach.getThanhTien();
		}
		return max;
	}
}
