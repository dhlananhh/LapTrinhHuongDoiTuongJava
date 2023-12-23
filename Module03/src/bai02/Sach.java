package bai02;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Sach {
	protected String maSach;
	protected LocalDate ngayNhap;
	protected double donGia;
	protected int soLuong;
	protected String nhaXuatBan;
	
	public Sach() {
		this.maSach = "";
		this.ngayNhap = LocalDate.now();
		this.donGia = 0;
		this.soLuong = 0;
		this.nhaXuatBan = "";
		
	}
	
	public Sach (String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
		setMaSach(maSach);
		setNgayNhap(ngayNhap);
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
	
	public double getThanhTien() {
		return soLuong * donGia;
	}
	
	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		if (!maSach.equals(""))
			this.maSach = maSach;
		else
			this.maSach = "xxx";
	}

	public LocalDate getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(LocalDate ngayNhap) {
		if (ngayNhap.isAfter(LocalDate.now()))
			this.ngayNhap = ngayNhap;
		else
			this.ngayNhap = LocalDate.now();
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		if (donGia > 0)
			this.donGia = donGia;
		else
			this.donGia = 0;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		if (soLuong > 0)
			this.soLuong = soLuong;
		else
			this.soLuong = 0;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		if (!nhaXuatBan.trim().equals(""))
			this.nhaXuatBan = nhaXuatBan;
		else
			this.nhaXuatBan = "chua xac dinh";
	}
}
