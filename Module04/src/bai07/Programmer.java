package bai07;

import java.text.DecimalFormat;

public class Programmer extends Employee {
	protected String theLanguage;
	
	
	public Programmer() {
		super();
		theLanguage = "not defined";
	}

	
	public Programmer(int thePayRollNumber, String theName, double theBasicMonthlySalary, String theLanguage) {
		super(thePayRollNumber, theName, theBasicMonthlySalary);
		setTheLanguage(theLanguage);
	}

	
	public String getTheLanguage() {
		return theLanguage;
	}


	public void setTheLanguage(String theLanguage) {
		this.theLanguage = theLanguage;
	}


	@Override
	public double getMonthlySalary() {
		double allowance = 0;
		if (theLanguage.equalsIgnoreCase("Java"))
			allowance = theBasicMonthlySalary * 0.2;
		return allowance;
	}
	
	
	@Override
	public String toString() {
		DecimalFormat mf = new DecimalFormat("#,##0.00$");
		return super.toString() + String.format("%-20s %-20s", theLanguage, mf.format(getMonthlySalary()));
	}
}
