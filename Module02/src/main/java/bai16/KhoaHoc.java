/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai16;

/**
 *
 * @author Lan Anh
 */

import java.time.LocalDate;


public class KhoaHoc {
    private HocVien[] dsHocVien;
    private String ten;
    private LocalDate ngayMo;
    private LocalDate thoiGianHoc;
    
    public 
    
	public HocVien[] getDsHocVien() {
		return dsHocVien;
	}
	
	public void setDsHocVien(HocVien[] dsHocVien) {
		this.dsHocVien = dsHocVien;
	}
	
	public String getTen() {
		return ten;
	}
	
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	public LocalDate getNgayMo() {
		return ngayMo;
	}
	
	public void setNgayMo(LocalDate ngayMo) {
		this.ngayMo = ngayMo;
	}
	
	public LocalDate getThoiGianHoc() {
		return thoiGianHoc;
	}
	
	public void setThoiGianHoc(LocalDate thoiGianHoc) {
		this.thoiGianHoc = thoiGianHoc;
	}
}
