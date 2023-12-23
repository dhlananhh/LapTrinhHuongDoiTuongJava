package bai07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SoftwareHouse {
	private String theName;
	public List<Employee> aName;
	
	
	public SoftwareHouse() {
		aName = new ArrayList<Employee>();
	}
	
	
	//them nhan vien
	public boolean addEmployee (Employee emp) {
		if(aName.contains(emp))
			return false;
		aName.add(emp);
		return true;
	}
	
	
	//lay thong tin toan bo nhan vien
	public String displayAllStaffs() {
		String s = "";
		for (Employee employee : aName) {
			s+= employee + "\n";
		}
		return s;
	}
	
	
	//tinh tong tien phai tra cho cac nhan vien	
	public double getMonthlySalaryBill() {
		double sum = 0;
		for (Employee employee : aName) {
			sum += employee.getMonthlySalary();
		}
		return sum;		
	}
	
	
	//sap xep DS nhan vien theo ten
	public void sortAllStaffByName() {
		Collections.sort(aName,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getTheName().compareToIgnoreCase(o2.getTheName());
			}
		});
	}
	
	
	//lay thong tin cac lap trinh vien
	public String displayListProgramer() {
		String s = "";
		for (Employee employee : aName) {
			if(employee instanceof Programmer)
				s += employee + "\n";
		}
		return s;
	}
	
	
	//cap nhat phong ban la deptNew cho nguoi quan ly co ma so la aPayrollNo
	public boolean updateDepartmentForAdmin (int aPayrollNo,String deptNew) {
		for (Employee employee : aName) {
			if(employee instanceof Administrator)
				if(employee.getThePayRollNumber() ==  aPayrollNo)
					((Administrator) employee).setTheDepartment(deptNew);
						return true;
		}
		return false;
	}
	
	
	//xoa nhan vien theo ma so
	public boolean deleteEmployee (int id) {
		for(int i=0;i<aName.size();i++) {
			if(aName.get(i).getThePayRollNumber() == id) {
				aName.remove(i);
				return true;
			}	
		}
		return false;
	}
}
