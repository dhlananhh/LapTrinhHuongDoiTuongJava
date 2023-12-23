package bai06;

public class PhongMayTinh extends PhongHoc {
	private int soMayTinh;

	
	public PhongMayTinh() {
		super();
		soMayTinh = 0;
	}

	public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		setSoMayTinh(soMayTinh);
	}
	
	
	public int getSoMayTinh() {
		return soMayTinh;
	}
	

	public void setSoMayTinh(int soMayTinh) {
		if (soMayTinh > 0)
			this.soMayTinh = soMayTinh;
		else
			this.soMayTinh = 0;
	}
	
	
	@Override
	public String danhGiaPhongHoc() {
		if(((1.5 * soMayTinh) / super.getDienTich()) >= 1 && ((10 * super.getSoBongDen()) / super.getDienTich()) >= 1)
			return "Phong hoc dat chuan";
		return "Phong hoc khong dat chuan";
	}
	

	@Override
	public String toString() {
		return super.toString() + String.format("%-15s %-25s", soMayTinh, danhGiaPhongHoc());
	}
}
