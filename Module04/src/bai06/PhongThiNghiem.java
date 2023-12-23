package bai06;

import java.text.DecimalFormat;

public class PhongThiNghiem extends PhongHoc {
	private String thongTinChuyenNganh;
	private double sucChua;
	private boolean bonRua;
	
	
	public PhongThiNghiem() {
		super();
		sucChua = 0;
		bonRua = false;
	}

	
	public PhongThiNghiem (String maPhong, String dayNha, double dienTich, int soBongDen, String thongTinChuyenNganh, double sucChua, boolean bonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		setThongTinChuyenNganh(thongTinChuyenNganh);
		setSucChua(sucChua);
		setBonRua(bonRua);
	}

	
	public String getThongTinChuyenNganh() {
		return thongTinChuyenNganh;
	}


	public void setThongTinChuyenNganh(String thongTinChuyenNganh) {
		if (!thongTinChuyenNganh.trim().equals(""))
			this.thongTinChuyenNganh = thongTinChuyenNganh;
		else
			this.thongTinChuyenNganh = "chua xac dinh";
	}


	public double getSucChua() {
		return sucChua;
	}


	public void setSucChua(double sucChua) {
		if (sucChua > 0)
			this.sucChua = sucChua;
		else
			this.sucChua = 0;
	}


	public boolean isBonRua() {
		return bonRua;
	}


	public void setBonRua(boolean bonRua) {
		this.bonRua = bonRua;
	}


	@Override
	public String danhGiaPhongHoc() {
		if(isBonRua()==true && ((10 * super.getSoBongDen()) / super.getDienTich()) >= 1)
			return "Phong hoc dat chuan";
		return "Phong hoc khong dat chuan";
	}
	
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		return super.toString() + String.format("%-25s %-15s %-15s %-25s", thongTinChuyenNganh, df.format(sucChua), bonRua, danhGiaPhongHoc());
	}
}
