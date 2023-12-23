package bai03;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class GiaoDichTienTe extends GiaoDich {
	private double tiGia;
	private String loaiTien;
	
	public GiaoDichTienTe() {
		super();
		tiGia = 0;
		loaiTien = "";
	}
	
	public GiaoDichTienTe (String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong, double tiGia, String loaiTien) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		setTiGia(tiGia);
		setLoaiTien(loaiTien);
	}

	public double getTiGia() {
		return tiGia;
	}

	public void setTiGia(double tiGia) {
		this.tiGia = tiGia;
	}
	
	public String getLoaiTien() {
		return loaiTien;
	}

	public void setLoaiTien(String loaiTien) {
		this.loaiTien = loaiTien;
	}

	@Override
	public double getThanhTien() {
		double kq = 0;
		if(loaiTien.equalsIgnoreCase("USD") || loaiTien.equalsIgnoreCase("Euro"))
			kq = super.getThanhTien() * tiGia;
		if(loaiTien.equalsIgnoreCase("Viet Nam"))
			kq = super.getThanhTien();
		return kq;
	}
	
	@Override
	public String toString() {
		DecimalFormat mf = new DecimalFormat("#,##0 VND");
		return super.toString() + String.format("%-20s %-20s", mf.format(tiGia), loaiTien);
	}
}
