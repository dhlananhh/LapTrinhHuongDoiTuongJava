package bai06;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class HangSanhSu extends HangHoa {
	private String nhaSanXuat;
	private LocalDate ngayNhapKho;
	
	public HangSanhSu() {
		super();
		this.nhaSanXuat = "xxx";
		this.ngayNhapKho = LocalDate.now();
	}
	
	public HangSanhSu(String maHang, String tenHang, double donGia, int soLuongTon, String nhaSanXuat, LocalDate ngayNhapKho) {
		super(maHang, tenHang, donGia, soLuongTon);
		setNhaSanXuat(nhaSanXuat);
		setNgayNhapKho(ngayNhapKho);
	}

	public String getNhaSanXuat() {
		return nhaSanXuat;
	}

	public void setNhaSanXuat(String nhaSanXuat) {
		if (!nhaSanXuat.trim().equals(""))
			this.nhaSanXuat = nhaSanXuat;
		else
			this.nhaSanXuat = "chua xac dinh";
	}

	public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}

	public void setNgayNhapKho(LocalDate ngayNhapKho) {
		if (ngayNhapKho.isBefore(LocalDate.now()))
			this.ngayNhapKho = ngayNhapKho;
		else
			this.ngayNhapKho = LocalDate.now();
	}
	
	@Override
	public double tinhVAT() {
		return 0.1;
	}
	
	@Override
	public String danhGiaMucDoBanBuon() {
		long sn = LocalDate.now().until(ngayNhapKho, ChronoUnit.DAYS);
		
		if(super.getSoLuongTon() > 50 && sn > 10)
			return "ban cham";
		return "khong danh gia";
	}
	
	
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat mf = new DecimalFormat("#,##0 VND");

		return String.format("%s | %-20s | %-20s | %-20s | %-10s", super.toString(), nhaSanXuat, dtf.format(ngayNhapKho), danhGiaMucDoBanBuon(), mf.format(tinhVAT()));
	}
}
