package bai04;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class SachThamKhao extends Sach {
	private double thue;
	Scanner scanner = new Scanner(System.in);
	
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
		this.thue = thue;
	}
	

	@Override
	public void input() {
		super.input();
		System.out.println("Nhap thue: ");
		thue = scanner.nextDouble();
	}
}
