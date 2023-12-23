package bai05;

import java.util.ArrayList;
import java.util.List;

public class DanhSachGiaoDich {
	private List<GiaoDich> list;
	
	public DanhSachGiaoDich() {
		list = new ArrayList<GiaoDich>();
	}
	
	public boolean them (GiaoDich gd) {
		if (list.contains(gd))
			return false;
		list.add(gd);
		return true;
	}
	
	public int tongSoLuongChoGDVang() {
		int sum = 0;
		for (GiaoDich giaoDich : list) {
			if (giaoDich instanceof GiaoDichVang)
				sum += giaoDich.getSoLuong();
		}
		return sum;
	}
	
	public int tongSoLuongChoGDTienTe() {
		int sum = 0;
		for (GiaoDich giaoDich : list) {
			if (giaoDich instanceof GiaoDichTienTe)
				sum += giaoDich.getSoLuong();
		}
		return sum;
	}
	
	public double tinhTBGiaoDichTienTe() {
		double sum = 0, dem = 0;
		for (GiaoDich giaoDich : list) {
			if (giaoDich instanceof GiaoDichTienTe) {
				sum += giaoDich.getThanhTien();
				dem++;
			}
		}
		return sum / dem;
	}
	
	@Override
	public String toString() {
		String s = "";
		for (GiaoDich giaoDich : list)
			s += giaoDich.toString() + "\n";
		return s;
	}
	
	public String xuatGD() {
		String s = "";
		for (int i=0; i < list.size(); i++) {
			if (list.get(i).getThanhTien() > 1000000000)
				s += list.get(i).toString() + "\n";
		}
		return s;
	}
}
