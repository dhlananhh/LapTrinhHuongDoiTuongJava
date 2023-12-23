package bai01;

import java.text.DecimalFormat;

public class Test {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,##0 VND");
		ChuyenXe[] CX = new ChuyenXe[4];
		CX[0] = new ChuyenXeNgoaiThanh("C1", "Dinh Van A", "77F1-0262", 500000, "TpHCM", 1);
		CX[1] = new ChuyenXeNoiThanh("D1", "Nguyen Van B", "66B2-3189", 1500000, 233, 657);
		CX[2] = new ChuyenXeNoiThanh("B5", "Tran Thanh C", "88AA-6666", 250000, 12, 55);
		CX[3] = new ChuyenXeNgoaiThanh("P3", "Le Ngoc D", "11DD-1111", 10000000, "Hoi An", 3);
		xuatDSChuyenXe(CX);
		System.out.println("Tong doanh thu cac chuyen xe la: " + df.format(getTongDoanhThuCacCX(CX)));
		System.out.println("Doanh thu chuyen xe noi thanh la: " + df.format(getDoanhThuCXNoiThanh(CX)));
		System.out.println("Doanh thu chuyen xe ngoai thanh la: " + df.format(getDoanhThuCXNgoaiThanh(CX)));
	}
	
	public static void xuatDSChuyenXe (ChuyenXe[] CX) {
		for (ChuyenXe chuyenXe : CX) {
			System.out.println(chuyenXe);
		}
	}
	
	public static double getTongDoanhThuCacCX (ChuyenXe[] CX) {
		double sum = 0;
		for (int i=0; i < CX.length; i++) 
			sum += CX[i].getDoanhThu();
		return sum;
	}
	
	public static double getDoanhThuCXNoiThanh (ChuyenXe[] CX) {
		double result = 0;
		for (int i=0; i < CX.length; i++) {
			if (CX[i] instanceof ChuyenXeNoiThanh)
				result += CX[i].getDoanhThu();
		}
		return result;
	}

	public static double getDoanhThuCXNgoaiThanh (ChuyenXe[] CX) {
		double result = 0;
		for (int i=0; i < CX.length; i++) {
			if (CX[i] instanceof ChuyenXeNgoaiThanh)
				result += CX[i].getDoanhThu();
		}
		return result;
	}
}