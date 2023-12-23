package bai04;


import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Sach {
	protected String maSach;
	protected LocalDate ngayNhap;
	protected double donGia;
	protected int soLuong;
	protected String nhaXuatBan;
	Scanner scanner = new Scanner(System.in);
	
	
	protected Sach() {
		maSach = "";
		ngayNhap = LocalDate.now();
		donGia = 0;
		soLuong = 0;
		nhaXuatBan = "";
		
	}
	
	
	protected Sach (String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
		setMaSach(maSach);
		setNgayNhap(ngayNhap);
		setDonGia(donGia);
		setSoLuong(soLuong);
		setNhaXuatBan(nhaXuatBan);
	}
	
	
	protected Sach (String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
		setMaSach(maSach);
		this.ngayNhap = LocalDate.parse(ngayNhap);
		setDonGia(donGia);
		setSoLuong(soLuong);
		setNhaXuatBan(nhaXuatBan);
	}
	
	
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("#,##0" + " VND");
		
		return String.format(" [Ma sach: %s \tNgay nhap: %s \tDon gia: %s \tSo luong: %d \tNha xuat ban: %s] ", maSach, dtf.format(ngayNhap), df.format(donGia), soLuong, nhaXuatBan);
	}
	
	
	protected double getThanhTien() {
		return soLuong * donGia;
	}
	
	
	protected String getMaSach() {
		return maSach;
	}

	
	protected void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	
	public LocalDate getNgayNhap() {
		return ngayNhap;
	}

	
	protected void setNgayNhap(LocalDate ngayNhap) {
		if (ngayNhap.isAfter(LocalDate.now()))
			this.ngayNhap = ngayNhap;
		else
			this.ngayNhap = LocalDate.now();
	}

	
	protected double getDonGia() {
		return donGia;
	}

	
	protected void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	
	protected int getSoLuong() {
		return soLuong;
	}

	
	protected void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	

	protected String getNhaXuatBan() {
		return nhaXuatBan;
	}
	

	protected void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}
	
	
	protected void input() {
		scanner.nextLine();
		System.out.println("Nhap ma sach: ");
		maSach = scanner.nextLine();
		
		scanner.nextLine();
		System.out.println("Nhap ngay nhap: ");
		ngayNhap = LocalDate.parse(scanner.nextLine());
		
		System.out.println("Nhap don gia: ");
		donGia = scanner.nextDouble();
		
		System.out.println("Nhap so luong: ");
		soLuong = scanner.nextInt();
		
		scanner.nextLine();
		System.out.println("Nhap nha xuat ban: ");
		nhaXuatBan = scanner.nextLine();
	}
}
