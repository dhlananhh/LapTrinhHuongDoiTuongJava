package bai04;


import java.time.LocalDate;


public class SachGiaoKhoa extends Sach {
	private boolean tinhTrang;
	
	
	public SachGiaoKhoa() {
		super();
		tinhTrang = true;
	}

	
	public SachGiaoKhoa(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan, boolean tinhTrang) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		setTinhTrang(tinhTrang);
	}
	
	
	@Override
	public double getThanhTien() {
		double tien;
		//nếu tình trạng sgk mới:
		//thành tiền = số lượng * đơn giá
		if (isTinhTrang()==true)
			tien = getSoLuong() * getDonGia();
		//nếu tình trạng sgk cũ:
		//thành tiền = số lượng * đơn giá * 50%
		else
			tien = getSoLuong() * getDonGia() * 0.5;
			
		return tien;
	}
	
		
	@Override
	public String toString() {
		String s = "";
		if (isTinhTrang()==true)
			s += "moi";
		else
			s += "cu";
		
		return "SGK" + super.toString() + String.format("\t Tinh trang: %s", s);
	}

	
	public boolean isTinhTrang() {
		return tinhTrang;
	}

	
	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
}
