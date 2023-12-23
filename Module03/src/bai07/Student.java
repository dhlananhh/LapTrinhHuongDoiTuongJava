package bai07;

import java.text.DecimalFormat;

public class Student extends Person {
	private double diemMonHoc1, diemMonHoc2;
	
	public Student() {
		super();
		diemMonHoc1 = 0;
		diemMonHoc2 = 0;
	}
	
	public Student (String hoTen, String diaChi, double diemMonHoc1, double diemMonHoc2) {
		super(hoTen, diaChi);
		setDiemMonHoc1(diemMonHoc1);
		setDiemMonHoc2(diemMonHoc2);
	}

	public double getDiemMonHoc1() {
		return diemMonHoc1;
	}

	public void setDiemMonHoc1(double diemMonHoc1) {
		this.diemMonHoc1 = diemMonHoc1;
	}

	public double getDiemMonHoc2() {
		return diemMonHoc2;
	}

	public void setDiemMonHoc2(double diemMonHoc2) {
		this.diemMonHoc2 = diemMonHoc2;
	}
	
	public double tinhDiemTrungBinh() {
		return (getDiemMonHoc1() + getDiemMonHoc2())/2;
	}
	
	public String danhGia() {
		String s = "";
		
		if (tinhDiemTrungBinh() < 0 || tinhDiemTrungBinh() > 10)
			s += "Loi";
		else {
			if (tinhDiemTrungBinh() < 5)
				s += "Yeu";
			else if (tinhDiemTrungBinh() < 6)
				s += "Trung binh";
			else if (tinhDiemTrungBinh() < 7)
				s += "Trung binh kha";
			else if (tinhDiemTrungBinh() < 8)
				s += "Kha";
			else if (tinhDiemTrungBinh() < 9)
				s += "Gioi";
			else
				s += "Xuat sac";
		}
		
		return s;
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		return super.toString() + String.format("%-20s %-20s %-20s %-20s", df.format(diemMonHoc1), df.format(diemMonHoc2), df.format(tinhDiemTrungBinh()), danhGia());
	}
}
