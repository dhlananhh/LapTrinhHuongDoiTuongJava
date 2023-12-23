package bai06;

import java.text.DecimalFormat;
import java.util.Objects;

public abstract class PhongHoc {
	protected String maPhong;
	protected String dayNha;
	protected double dienTich;
	protected int soBongDen;
	
	
	public PhongHoc() {
		maPhong = "xxx";
		dayNha = "xxx";
		dienTich = 0;
		soBongDen = 0;
	}
	
	
	public PhongHoc (String maPhong, String dayNha, double dienTich, int soBongDen) {
		setMaPhong(maPhong);
		setDayNha(dayNha);
		setDienTich(dienTich);
		setSoBongDen(soBongDen);
	}
	
	
	public String getMaPhong() {
		return maPhong;
	}


	public void setMaPhong(String maPhong) {
		if (!maPhong.trim().equals(""))
			this.maPhong = maPhong;
		else
			this.maPhong = "xxx";
	}


	public String getDayNha() {
		return dayNha;
	}


	public void setDayNha(String dayNha) {
		if (!dayNha.trim().equals(""))
			this.dayNha = dayNha;
		else
			this.dayNha = "xxx";
	}


	public double getDienTich() {
		return dienTich;
	}


	public void setDienTich(double dienTich) {
		if (dienTich > 0)
			this.dienTich = dienTich;
		else
			this.dienTich = 0;
	}


	public int getSoBongDen() {
		return soBongDen;
	}


	public void setSoBongDen(int soBongDen) {
		if (soBongDen > 0)
			this.soBongDen = soBongDen;
		else
			this.soBongDen = 0;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(maPhong);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhongHoc other = (PhongHoc) obj;
		return Objects.equals(maPhong, other.maPhong);
	}


	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		return String.format("%-15s %-15s %-15s %-20d", maPhong, dayNha, df.format(dienTich), soBongDen);
	}
	
	
	public String danhGiaDatChuan () {
		if (dienTich / 10 <= soBongDen)
			return "Phong hoc dat chuan";
		return "Phong hoc khong dat chuan";
	}
	
	
	public abstract String danhGiaPhongHoc();
}
