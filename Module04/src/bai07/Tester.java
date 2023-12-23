package bai07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester {
	private static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		SoftwareHouse a = new SoftwareHouse();
		String deptNew;
		int aPayrollNo;
		boolean flag = true;
		
		a.addEmployee(new Administrator(5, "Andrew", 2300, "Dev"));
		a.addEmployee(new Administrator(2, "Alfred", 3300.55, "UI/UX"));
		a.addEmployee(new Programmer(3, "Peter", 4500.33, "Java"));
		a.addEmployee(new Programmer(1, "Kylie", 3323.33, "Python"));
		a.addEmployee(new ProjectLeader(7, "Adelaide", 6000.54, "C#, PHP"));
		a.addEmployee(new ProjectLeader(8, "Selena", 8000.54, "ReatcJS, NodeJS"));
		
		do {
			System.out.println("MENU QUAN LY CONG TY PHAN MEM");
			System.out.println("1. Lay thong tin toan bo nhan vien");
			System.out.println("2. Xuat tong tien phai tra cho cac nhan vien");
			System.out.println("3. Sap xep danh sach nhan vien theo ten");
			System.out.println("4. Lay thong tin danh sach cac lap trinh vien");
			System.out.println("5. Cap nhat phong ban la deptNew cho nguoi quan ly co ma so la aPayrollNo");
			System.out.println("6. Xoa nhan vien theo ma so");
			System.out.println("7. Thoat");
			
			System.out.println("Nhap vao lua chon cua ban: ");
			int c = scanner.nextInt();
			
			
			switch (c) {
				case 0:
					flag = false;
					break;
			
				case 1:
					System.out.println("1. Lay thong tin toan bo nhan vien");
					System.out.println(a.displayAllStaffs());
					break;
					
				case 2:
					System.out.println("2. Xuat tong tien phai tra cho cac nhan vien");
					System.out.println(a.getMonthlySalaryBill());
					break;
					
				case 3:
					System.out.println("3. Sap xep danh sach nhan vien theo ten");
					a.sortAllStaffByName();
					System.out.println(a.displayAllStaffs());
					break;
					
				case 4:
					System.out.println("4. Lay thong tin danh sach cac lap trinh vien");
					System.out.println(a.displayListProgramer());
					break;
					
					
				case 5:
					System.out.println("5. Cap nhat phong ban la deptNew cho nguoi quan ly co ma so la aPayrollNo");
					
					
					System.out.println("Nhap vao ma nguoi quan ly can tim la: ");
					aPayrollNo = scanner.nextInt();
					
					scanner.nextLine();
					System.out.println("Nhap vao ten bo phan moi: ");
					deptNew = scanner.nextLine();
					
					if (a.updateDepartmentForAdmin(aPayrollNo, deptNew) == true) {
						System.out.println("Cap nhat thanh cong");
					} else {
						System.out.println("Khong tim thay ma nguoi quan ly de cap nhat");
					}
					
					break;
					
				case 6:
					System.out.println("6. Xoa nhan vien theo ma so");
					System.out.println("Nhap vao ma nhan vien can xoa: ");
					aPayrollNo = scanner.nextInt();
					
					if (a.deleteEmployee(aPayrollNo) == true) {
						System.out.println("Xoa nhan vien thanh cong");
					} else {
						System.out.println("Khong tim thay ma nhan vien de xoa");
					}
					
					break;
					
				case 7:
					System.out.println("7. Thoat");
					flag = false;
					break;
					
				default:
					System.out.println("Chuong trinh khong ho tro chuc nang nay");
					flag = false;
					break;
			}
		} while (flag);
	}
}