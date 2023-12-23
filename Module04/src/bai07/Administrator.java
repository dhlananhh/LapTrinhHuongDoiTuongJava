package bai07;

import java.text.DecimalFormat;

public class Administrator extends Employee {
	private String theDepartment;
	
	
	public Administrator() {
		super();
		theDepartment = "not defined";	
	}

	
	public Administrator(int thePayRollNumber, String theName, double theBasicMonthlySalary, String theDepartment) {
		super(thePayRollNumber, theName, theBasicMonthlySalary);
		setTheDepartment(theDepartment);
	}

	
	public String getTheDepartment() {
		return theDepartment;
	}


	public void setTheDepartment(String theDepartment) {
		if (!theDepartment.trim().equals(""))
			this.theDepartment = theDepartment;
		else
			this.theDepartment = "not defined";
	}


	@Override
	public double getMonthlySalary() {
		return theBasicMonthlySalary * 0.2;
	}

	
	@Override
	public String toString() {
		DecimalFormat mf = new DecimalFormat("#,##0.00$");
		return super.toString() + String.format("%-20s %-20s", theDepartment, mf.format(getMonthlySalary()));
	}
}
