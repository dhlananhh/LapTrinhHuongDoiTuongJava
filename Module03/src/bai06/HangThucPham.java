package bai06;


import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class HangThucPham extends HangHoa {
	protected String nhaCungCap;
	protected LocalDate ngaySanXuat;
	protected LocalDate ngayHetHan;
	
	
	public HangThucPham() {
		super();
		this.nhaCungCap = "chua xac dinh";
		this.ngaySanXuat = LocalDate.now();
		this.ngayHetHan = this.ngaySanXuat;
	}

	
	public HangThucPham(String maHang, String tenHang, double donGia, int soLuongTon, String nhaCungCap, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
		super(maHang, tenHang, donGia, soLuongTon);
		this.nhaCungCap = nhaCungCap;
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
	}
	
	
	public String getNhaCungCap() {
		return nhaCungCap;
	}

	
	public void setNhaCungCap(String nhaCungCap) {
		if (!nhaCungCap.trim().equals(""))
			this.nhaCungCap = nhaCungCap;
		else
			this.nhaCungCap = "chua xac dinh";
	}

	
	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	
	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if (ngaySanXuat.isBefore(LocalDate.now()))
			this.ngaySanXuat = ngaySanXuat;
		else
			this.ngaySanXuat = LocalDate.now();
	}

	
	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	
	public void setNgayHetHan(LocalDate ngayHetHan) throws Exception {
		if (ngayHetHan.isAfter(this.getNgaySanXuat()))
			this.ngayHetHan = ngayHetHan;
		else
			this.ngayHetHan = getNgaySanXuat();
	}
	
	
	public boolean ktHetHan() {
		if (ngayHetHan.isBefore(LocalDate.now()))
			return true;
		else
			return false;
	}
	
	
	@Override
	public double tinhVAT() {
		return 0.05;
	}
	
	
	public String danhGiaMucDoBanBuon() {
		if (getSoLuongTon() > 0 && ktHetHan())
			return "kho ban";
		else
			return "khong danh gia";
	}
	
	
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat mf = new DecimalFormat("#,##0 VND");
		
		return String.format("%s | %-20s | %-20s | %-20s | %-20s | %-10s", super.toString(), nhaCungCap, dtf.format(ngaySanXuat), dtf.format(ngayHetHan), danhGiaMucDoBanBuon(), mf.format(tinhVAT()));
	 }
}
