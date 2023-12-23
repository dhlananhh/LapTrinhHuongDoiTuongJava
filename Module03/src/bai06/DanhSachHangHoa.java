package bai06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import bai07.Employee;

public class DanhSachHangHoa {
	private ArrayList<HangHoa> list;
	
	
	public DanhSachHangHoa() {
		list = new ArrayList<HangHoa>();
	}
	
	
	//them hang hoa
	public boolean them (HangHoa hh) {
		if(list.contains(hh))
			return false;
		list.add(hh);
		return true;
	}
	
	
	//lay thong tin toan bo hang hoa
	public String displayAllProducts() {
		String s = "";
		for (HangHoa hangHoa : list)
			s += hangHoa + "\n";
		return s;
	}
	
	
	public int getSize() {
		return list.size();
	}
	
	
	//lay thong tin DS hang dien may
	public String layThongTinDSHangDienMay() {
		String s = "";
		for (HangHoa hangHoa : list) {
			if (hangHoa instanceof HangDienMay)
				s += hangHoa + "\n";
		}
		return s;
	}
	
	
	//lay thong tin DS hang sanh su
	public String layThongTinDSHangSanhSu() {
		String s = "";
		for (HangHoa hangHoa : list) {
			if (hangHoa instanceof HangSanhSu)
				s += hangHoa + "\n";
		}
		return s;
	}
	
	//lay thong tin DS hang thuc pham
	public String layThongTinDSHangThucPham() {
		String s = "";
		for (HangHoa hangHoa : list) {
			if (hangHoa instanceof HangThucPham)
				s += hangHoa + "\n";
		}
		return s;
	}
	
	
	//lay thong tin DS hang thuc pham kho ban
	public DanhSachHangHoa layDSHangThucPhamKhoBan() {
		DanhSachHangHoa ds = new DanhSachHangHoa();
		for (HangHoa hangHoa : list) {
			if(hangHoa instanceof HangThucPham && hangHoa.danhGiaMucDoBanBuon().equalsIgnoreCase("kho ban"))
				ds.them(hangHoa);
		}
		return ds;
	}
	
	
	//tim kiem hang hoa khi biet ma hang
	public String timKiemTheoMa(String maHang) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getMaHang().equals(maHang))
				return list.get(i).toString();
		}
		return String.format("khong tim thay");
	}
	
	
	//sap xep DS hang hoa theo ten hang tang dan 
	public void sapXepDSTangTheoTenHang() {
		Collections.sort(list,new Comparator<HangHoa>() {

			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				return o1.getTenHang().compareToIgnoreCase(o2.getTenHang());
			}
		});
	}
	
	
	//sap xep DS hang hoa theo so luong ton giam dan
	public void sapXepDSGiamTheoSoLuongTon() {
		Collections.sort(list, new Comparator<HangHoa>() {

			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				
				return Float.compare(o1.getSoLuongTon(), o2.getSoLuongTon());
			}
		});
	}
			
	
	public int timViTriTheoMa(String ma) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getMaHang().equals(ma))
				return i;
		}
		return -1;
	}
	
	
	//xoa hang hoa khi biet ma hang
	public boolean xoaTheoMa (String ma) {
		for (int i=0; i < list.size(); i++) {
			if (list.get(i).getMaHang().equalsIgnoreCase(ma)) {
				list.remove(i);
				return true;
			}
		}
		return false;
	}

	
	//sua thong tin don gia cua hang hoa khi biet ma hang
	public boolean capNhatGia (String ma, double giaMoi) {
		for (HangHoa hangHoa : list) {
			if (hangHoa.getMaHang().equalsIgnoreCase(ma)) {
				hangHoa.setDonGia(giaMoi);
				return true;
			}
		}
		return false;
	}
}
