package bai06;

public class PhongHocLyThuyet extends PhongHoc {
	private boolean mayChieu;
	
	
	public PhongHocLyThuyet() {
		super();
		mayChieu = false;
	}


	public PhongHocLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean mayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		setMayChieu(mayChieu);
	}


	public boolean isMayChieu() {
		return mayChieu;
	}

	
	public void setMayChieu(boolean mayChieu) {
		this.mayChieu = mayChieu;
	}

	
	@Override
	public String danhGiaPhongHoc() {
		if (isMayChieu() && ((10 * super.getSoBongDen()) / super.getDienTich()) >= 1)
			return "Phong hoc dat chuan";
		return "Phong hoc khong dat chuan";
	}
	
	
	@Override
	public String toString() {
		return super.toString() + String.format("%-15s %-25s", mayChieu, danhGiaPhongHoc());
	}
}
