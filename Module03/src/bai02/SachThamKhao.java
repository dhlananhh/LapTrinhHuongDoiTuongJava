package bai02;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class SachThamKhao extends Sach {
	private double thue;
	
	public SachThamKhao() {
		super();
		thue = 0;
	}

	public SachThamKhao(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		setThue(thue);
	}

	@Override
	public double getThanhTien() {
		return super.getSoLuong() * super.getDonGia() + getThue();
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0" + " VND");
		return "STK" + super.toString() + String.format("\tThue: %s", df.format(thue));
	}
	
	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		if (thue > 0)
			this.thue = thue;
		else
			this.thue = 0;
	}
}
