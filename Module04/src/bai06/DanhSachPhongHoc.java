package bai06;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class DanhSachPhongHoc {
	private List<PhongHoc> list;
	
	
	public DanhSachPhongHoc() {
		list = new ArrayList<PhongHoc>();
	}
	
	
	public boolean themPhongHoc (PhongHoc a) {
		if (list.contains(a))
			return false;
		list.add(a);
		return true;
	}
	
	
	//lay thong tin danh sach phong hoc
	@Override
	public String toString() {
		String s = "";
		for (PhongHoc phongHoc : list)
			s += phongHoc + "\n";
		return s;
	}
	
	
	public int getSize() {
		return list.size();
	}
		
	
	//tim va xuat thong tin phong hoc khi biet ma
	public String timPhongHoc (String ma) {
		for (int i=0; i < list.size(); i++) {
			if (list.get(i).getMaPhong().equals(ma))
				return list.get(i).toString();
		}
		return String.format("Khong tim thay");
	}
	
	
	//xoa phong hoc theo ma
	public boolean xoa (String ma) {
		for (int i=0; i < list.size(); i++) {
			if (list.get(i).getMaPhong().equals(ma)) 				
				list.remove(i);
			return true;
		}
		
		return false;
	}
		
	
	//lay thong tin danh sach phong hoc dat chuan
	public DanhSachPhongHoc layDSPhongHocDatChuan() {
		DanhSachPhongHoc ds = new DanhSachPhongHoc();
		
		for (PhongHoc phongHoc : list) {
			if (phongHoc.danhGiaPhongHoc().equalsIgnoreCase("Phong hoc dat chuan"))
				ds.themPhongHoc(phongHoc);
		}
		
		return ds;
	}
	
	
	//sap xep DS tang dan theo day nha
		public void sapXepDSTangDanTheoDayNha() {
			Collections.sort(list, new Comparator<PhongHoc>() {

				@Override
				public int compare(PhongHoc o1, PhongHoc o2) {
					return o1.getDayNha().compareToIgnoreCase(o2.getDayNha());
				}
			});
		}
	
	
	//sap xep DS giam dan theo dien tich
	public void sapXepDSGiamDanTheoDienTich() {
		Collections.sort(list, new Comparator<PhongHoc>() {

			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				return Double.compare(o1.getDienTich(), o2.getDienTich());
			}
		});
	}
	
	
	//sap xep DS tang dan theo so bong den
	public void sapXepDSTangDanTheoSoBongDen() {
		Collections.sort(list, new Comparator<PhongHoc>() {

			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				return Integer.compare(o1.getSoBongDen(), o2.getSoBongDen());
			}
		});
	}
	
	
	//cap nhat so may tinh trong phong may
	public String capNhat (String ma, int soMayTinh) {
		for (PhongHoc phongHoc : list) {
			if (phongHoc instanceof PhongMayTinh) {
				if (phongHoc.getMaPhong().equals(ma)) {
					((PhongMayTinh) phongHoc).setSoMayTinh(soMayTinh);
					return "Cap nhat thanh cong";
				}
			}
		}
		
		return "Khong tim thay ma de cap nhat";
	}
	
	
	//xuat danh sach phong hoc ly thuyet
	public String xuatDSPhongLyThuyet() {
		String s = "";
		s += String.format("%-15s %-15s %-15s %-15s %-15s %-25s", "Ma phong", "Day nha", "Dien tich", "So bong den", "May chieu", "Danh gia");
		
		for (PhongHoc phongHoc : list) {
			if(phongHoc instanceof PhongHocLyThuyet)
				s += "\n" + phongHoc;
		}
		
		return s;
	}
	
	
	//xuat danh sach phong may tinh
	public String xuatDSPhongMayTinh() {
		String s = "";
		s += String.format("%-15s %-15s %-15s %-15s %-15s %-25s", "Ma phong", "Day nha", "Dien tich", "So bong den", "So may tinh", "Danh gia");
		
		for (PhongHoc phongHoc : list) {
			if (phongHoc instanceof PhongMayTinh)
				s += "\n" + phongHoc;
		}
		
		return s;
	}
	
	
	//xuat danh sach phong thi nghiem
	public String xuatDSPhongThiNghiem() {
		String s = "";
		s += String.format("%-15s %-15s %-15s %-15s %-25s %-15s %-15s %-25s", "Ma phong", "Day nha", "Dien tich", "So bong den", "Thong tin chuyen nganh", "Suc chua", "Bon rua", "Danh gia");
		
		for (PhongHoc phongHoc : list) {
			if (phongHoc instanceof PhongThiNghiem)
				s += "\n" + phongHoc ;
		}
		return s;
	}
	
	
	//tinh tong so luong phong hoc trong danh sach
	public int tinhTongSoLuongPhongHoc() {
		int count = 0;
		for (PhongHoc phongHoc : list)
			count++;
		return count;
	}
	
	
	//lay danh sach cac phong may co 60 may
	public DanhSachPhongHoc layDSPhongMay() {
		DanhSachPhongHoc ds = new DanhSachPhongHoc();
		
		for (PhongHoc phongHoc : list) {
			if (phongHoc instanceof PhongMayTinh)
				if(((PhongMayTinh) phongHoc).getSoMayTinh() > 60)
					ds.themPhongHoc(phongHoc);
		}
		
		return ds;
	}
}
