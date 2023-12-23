package bai04;

import java.util.ArrayList;

public class DanhMucSach {
	private ArrayList<Sach> ds;
		
	public DanhMucSach() {
		ds = new ArrayList<Sach>();
	}
		
	public ArrayList<Sach> getDs() {
		return ds;
	}

	public void setDs(ArrayList<Sach> ds) {
		this.ds = ds;
	}

	public void addSach (Sach s) {
		this.ds.add(s);
	}
	
	public double tinhTongThanhTien() {
		double sum = 0;
		for (Sach s: this.ds)
			sum += s.getThanhTien();
		return sum;
	}
	
	public double tinhThanhTienSGK() {
		double tienSGK = 0;
		for (Sach s: this.ds)
			if (s instanceof SachGiaoKhoa)
				tienSGK += s.getThanhTien();
		return tienSGK;
	}
	
	public DanhMucSach timSGKTheoNXB (String keyWord) {
		DanhMucSach kq = new DanhMucSach();
		
		keyWord = keyWord.toLowerCase();
		for (Sach s: this.ds) {
			if (s.getNhaXuatBan().toLowerCase().contains(keyWord))
				kq.addSach(s);
		}
		
		return kq;	
	}
	
	public double getThanhTienCaoNhat() {
		double max = 0;
		for (Sach s: this.ds)
			if (s.getThanhTien() > max)
				max = s.getThanhTien();
		return max;
	}
		
	@Override
	public String toString() {
		String str = "";
		for (Sach s: this.ds)
			str += s.toString() + "\n";
		return str;
	}
}
