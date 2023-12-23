package bai03;


import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;


public class GiaoDich {
	protected String maGiaoDich;
	protected LocalDate ngayGiaoDich;
	protected double donGia;
	protected int soLuong;
	
	
	public GiaoDich() {
		maGiaoDich = "";
		ngayGiaoDich = LocalDate.now();
		donGia = 0;
		soLuong = 0;
	}

	
	public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong) {
		super();
		this.maGiaoDich = maGiaoDich;
		this.ngayGiaoDich = ngayGiaoDich;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}

	
	public String getMaGiaoDich() {
		return maGiaoDich;
	}

	
	public void setMaGiaoDich(String maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}
	

	public LocalDate getNgayGiaoDich() {
		return ngayGiaoDich;
	}

	
	public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
		if (ngayGiaoDich.isBefore(LocalDate.now()))
			this.ngayGiaoDich = ngayGiaoDich;
		else
			this.ngayGiaoDich = LocalDate.now();
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
			this.soLuong = 	soLuong;
		else
			this.soLuong = 	0;
	}
	
		
	@Override
	public int hashCode() {
		return Objects.hash(donGia, maGiaoDich, ngayGiaoDich, soLuong);
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GiaoDich other = (GiaoDich) obj;
		return Double.doubleToLongBits(donGia) == Double.doubleToLongBits(other.donGia)
				&& Objects.equals(maGiaoDich, other.maGiaoDich) && Objects.equals(ngayGiaoDich, other.ngayGiaoDich)
				&& soLuong == other.soLuong;
	}
	

	public double getThanhTien() {
		return soLuong * donGia;
	}
	
	
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat mf = new DecimalFormat("#,##0 VND");
		return String.format("%-10s %-20s %-20s %-20d", maGiaoDich, dtf.format(ngayGiaoDich), mf.format(donGia), soLuong);
	}
}
