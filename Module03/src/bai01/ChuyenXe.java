package bai01;

import java.text.DecimalFormat;

public class ChuyenXe {
	protected String maSoChuyenXe;
	protected String hoTenTaiXe;
	protected String soXe;
	protected double doanhThu;
	
	public ChuyenXe() {
		this.maSoChuyenXe = "xxx";
		this.hoTenTaiXe = "chua xac dinh";
		this.soXe = "xxx";
		this.doanhThu = 0;
	}
	
	public ChuyenXe (String maSoChuyenXe, String hoTenTaiXe, String soXe, double doanhThu) {
		setMaSoChuyenXe(maSoChuyenXe);
		setHoTenTaiXe(hoTenTaiXe);
		setSoXe(soXe);
		setDoanhThu(doanhThu);
	}
	
//	public static String getTitle() {
//		return String.format("%-10s %-20s %-10d %15s", "Ma so chuyen xe", "Ho ten tai xe", "So xe", "Doanh thu");
//	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0 VND");
		return String.format("%-10s %-20s %-15s %-20s", maSoChuyenXe, hoTenTaiXe, soXe, df.format(doanhThu));
	}

	public String getMaSoChuyenXe() {
		return maSoChuyenXe;
	}

	public void setMaSoChuyenXe(String maSoChuyenXe) {
		if (!maSoChuyenXe.equals(""))
			this.maSoChuyenXe = maSoChuyenXe;
		else
			this.maSoChuyenXe = "xxx";
	}

	public String getHoTenTaiXe() {
		return hoTenTaiXe;
	}

	public void setHoTenTaiXe(String hoTenTaiXe) {
		if (!hoTenTaiXe.trim().equals(""))
			this.hoTenTaiXe = hoTenTaiXe;
		else
			this.hoTenTaiXe = "chua xac dinh";
	}

	public String getSoXe() {
		return soXe;
	}

	public void setSoXe(String soXe) {
		if (!soXe.equals(""))
			this.soXe = soXe;
		else
			this.soXe = "xxx";
	}

	public double getDoanhThu() {
		return doanhThu;
	}

	public void setDoanhThu(double doanhThu) {
		if (doanhThu > 0)
			this.doanhThu = doanhThu;
		else
			this.doanhThu = 0;
	}
}
