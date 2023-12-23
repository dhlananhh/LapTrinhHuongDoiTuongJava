package bai01;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
	private String noiDen;
	private int soNgayDiDuoc;
	
	public ChuyenXeNgoaiThanh() {
		super();
		this.noiDen = "chua xac dinh";
		this.soNgayDiDuoc = 0;
	}
	
	public ChuyenXeNgoaiThanh(String maSoChuyenXe, String hoTenTaiXe, String soXe, double doanhThu, String noiDen, int soNgayDiDuoc) {
		super(maSoChuyenXe, hoTenTaiXe, soXe, doanhThu);
		setNoiDen(noiDen);
		setSoNgayDiDuoc(soNgayDiDuoc);
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("%-20s %-10d", noiDen, soNgayDiDuoc);
	}
	
	public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		if (!noiDen.trim().equals(""))
			this.noiDen = noiDen;
		else
			this.noiDen = "chua xac dinh";
	}

	public int getSoNgayDiDuoc() {
		return soNgayDiDuoc;
	}

	public void setSoNgayDiDuoc(int soNgayDiDuoc) {
		if (soNgayDiDuoc > 0)
			this.soNgayDiDuoc = soNgayDiDuoc;
		else
			this.soNgayDiDuoc = 0;
	}
}
