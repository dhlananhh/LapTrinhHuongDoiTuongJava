package bai03;

import java.time.LocalDate;

public class GiaoDichVang extends GiaoDich {
	private String loaiVang;
	
	public GiaoDichVang() {
		super();
		loaiVang = "chua xac dinh";
	}
	
	public GiaoDichVang (String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong, String loaiVang) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		setLoaiVang(loaiVang);
	}
	
	public String getLoaiVang() {
		return loaiVang;
	}

	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("%-20s", loaiVang);
	}
}
