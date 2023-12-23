package bai01;

import java.text.DecimalFormat;

public class ChuyenXeNoiThanh extends ChuyenXe {
	private double soTuyen;
	private double soKmDiDuoc;
		
	public ChuyenXeNoiThanh() {
		super();
		this.soTuyen = 0;
		this.soKmDiDuoc = 0;
	}

        public ChuyenXeNoiThanh(String maSoChuyenXe, String hoTenTaiXe, String soXe, double doanhThu, double soTuyen, double soKmDiDuoc) {
		super(maSoChuyenXe, hoTenTaiXe, soXe, doanhThu);
		setSoTuyen(soTuyen);
		setSoKmDiDuoc(soKmDiDuoc);
	}
		
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		return super.toString() + String.format("%-20s %-20s", df.format(soTuyen), df.format(soKmDiDuoc));
	}

	public double getSoTuyen() {
		return soTuyen;
	}
	
	public void setSoTuyen(double soTuyen) {
		if (soTuyen > 0)
			this.soTuyen = soTuyen;
		else
			this.soTuyen = 0;
	}
	
	public double getSoKmDiDuoc() {
		return soKmDiDuoc;
	}
	
	public void setSoKmDiDuoc(double soKmDiDuoc) {
		if (soKmDiDuoc > 0)
			this.soKmDiDuoc = soKmDiDuoc;
		else
			this.soKmDiDuoc = 0;
	}
}
