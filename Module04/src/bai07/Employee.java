package bai07;

import java.text.DecimalFormat;
import java.util.Objects;

public abstract class Employee {
	protected int thePayRollNumber;
	protected String theName;
	protected double theBasicMonthlySalary;
	
	
	public Employee() {
		thePayRollNumber = 0;
		theName = "not defined";
		theBasicMonthlySalary = 0;
	}
	
	
	public Employee(int thePayRollNumber, String theName, double theBasicMonthlySalary) {
		super();
		setThePayRollNumber(thePayRollNumber);
		setTheName(theName);
		setTheBasicMonthlySalary(theBasicMonthlySalary);
	}

	
	public int getThePayRollNumber() {
		return thePayRollNumber;
	}


	public void setThePayRollNumber(int thePayRollNumber) {
		if (thePayRollNumber > 0)
			this.thePayRollNumber = thePayRollNumber;
		else
			this.thePayRollNumber = 0;
	}


	public String getTheName() {
		return theName;
	}


	public void setTheName(String theName) {
		if (!theName.trim().equals(""))
			this.theName = theName;
		else
			this.theName = "not defined";
	}


	public double getTheBasicMonthlySalary() {
		return theBasicMonthlySalary;
	}


	public void setTheBasicMonthlySalary(double theBasicMonthlySalary) {
		if (theBasicMonthlySalary > 0)
			this.theBasicMonthlySalary = theBasicMonthlySalary;
		else
			this.theBasicMonthlySalary = 0;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(theName, thePayRollNumber);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(theName, other.theName) && thePayRollNumber == other.thePayRollNumber;
	}


	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		return String.format("%-10d %-20s %-10s", thePayRollNumber, theName, theBasicMonthlySalary);
	}

	
	public abstract double getMonthlySalary();
}
