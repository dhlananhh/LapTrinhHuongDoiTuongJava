package bai07;

public class Person {
	protected String hoTen;
	protected String diaChi;
	
	public Person() {
		hoTen = "";
		diaChi = "";
	}
	
	public Person (String hoTen, String diaChi) {
		setHoTen(hoTen);
		setDiaChi(diaChi);
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	@Override
	public String toString() {
		return String.format("%-30s %-20s", hoTen, diaChi);
	}
}
