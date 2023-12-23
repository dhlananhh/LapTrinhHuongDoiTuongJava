package bai07;

import java.text.DecimalFormat;

public class ProjectLeader extends Programmer {
	public ProjectLeader() {
		super();
	}


	public ProjectLeader(int thePayRollNumber, String theName, double theBasicMonthlySalary, String theLanguage) {
		super(thePayRollNumber, theName, theBasicMonthlySalary, theLanguage);
	}


	@Override
	public double getMonthlySalary() {
		return theBasicMonthlySalary * 0.4;
	}
	
	
	@Override
	public String toString() {
		DecimalFormat mf = new DecimalFormat("#,##0.00$");
		return super.toString() + String.format("%-20s %-20s", theLanguage, mf.format(getMonthlySalary()));
	}
}
