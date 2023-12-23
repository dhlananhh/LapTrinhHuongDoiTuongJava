package bai07;

public class Employee extends Person {
	private double heSoLuong;

	
	public Employee() {
		super();
		heSoLuong = 0;
	}
	
	
	public Employee (String hoTen, String diaChi, double heSoLuong) {
		super(hoTen, diaChi);
		setHeSoLuong(heSoLuong);
	}


	public double getHeSoLuong() {
		return heSoLuong;
	}


	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	
//	public double tinhLuong() {
//		return 
//	}
}
