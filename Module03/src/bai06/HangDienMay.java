package bai06;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class HangDienMay extends HangHoa {
	private int thoiGianBaoHanh;
	private double congSuat;
	
	
	public HangDienMay() {
		super();
		thoiGianBaoHanh = 0;
		congSuat = 0;
	}
	

	public HangDienMay(String maHang, String tenHang, double donGia, int soLuongTon, int thoiGianBaoHanh) {
		super(maHang, tenHang, donGia, soLuongTon);
		setThoiGianBaoHanh(thoiGianBaoHanh);
	}
	
	
	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}


	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}


	public double getCongSuat() {
		return congSuat;
	}

	
	public void setCongSuat(double congSuat) {
		if (congSuat > 0)
			this.congSuat = congSuat;
		else
			this.congSuat = 0;
	}
	
	
	@Override
	public double tinhVAT() {
		return 0.1;
	}
	
	
	@Override
	public String danhGiaMucDoBanBuon() {
		if(getSoLuongTon() < 3)
			return "ban duoc";
		else
			return "khong danh gia"; 
	}
	
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0,00");
		DecimalFormat mf = new DecimalFormat("#,##0 VND");
		
		return String.format("%s | %-10d | %-10s | %-20s | %-10s", super.toString(), thoiGianBaoHanh, df.format(congSuat), danhGiaMucDoBanBuon(), mf.format(tinhVAT()));
	}
}
