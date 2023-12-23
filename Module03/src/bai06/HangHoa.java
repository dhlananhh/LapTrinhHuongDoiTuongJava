package bai06;


import java.text.DecimalFormat;
import java.util.Objects;


public abstract class HangHoa {
	protected String maHang;
	protected String tenHang;
	protected double donGia;
	protected int soLuongTon;
	
	
	public HangHoa() {
		maHang = "xxx";
		tenHang = "xxx";
		donGia = 0;
		soLuongTon = 0;
	}
	
	
	public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
		this.soLuongTon = soLuongTon;
	}
	
	
	public String getMaHang() {
		return maHang;
	}

	
	public void setMaHang(String maHang) {
		if (!maHang.trim().equals(""))
			this.maHang = maHang;
		else
			this.maHang = "xxx";
	}

	
	public String getTenHang() {
		return tenHang;
	}

	
	public void setTenHang(String tenHang) {
		if (!tenHang.trim().equals(""))
			this.tenHang = tenHang;
		else
			this.tenHang = "xxx";
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

	
	public int getSoLuongTon() {
		return soLuongTon;
	}

	
	public void setSoLuongTon(int soLuongTon) {
		if (soLuongTon > 0)
			this.soLuongTon = soLuongTon;
		else
			this.soLuongTon = 0;
	}
	
	
	@Override
	public String toString() {
		DecimalFormat mf = new DecimalFormat("#,##0 VND");
		return String.format("%-10s | %-20s |%-10s | %-10d", maHang, tenHang, mf.format(donGia), soLuongTon);
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(maHang);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HangHoa other = (HangHoa) obj;
		return Objects.equals(maHang, other.maHang);
	}


	public abstract double tinhVAT();
	public abstract String danhGiaMucDoBanBuon(); //enum
}
