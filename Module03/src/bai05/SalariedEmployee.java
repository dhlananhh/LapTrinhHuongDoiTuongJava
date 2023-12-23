package bai05;

import java.text.DecimalFormat;

public class SalariedEmployee extends Employee {
	private double weeklySalary;
	
	public SalariedEmployee() {
		super();
		weeklySalary = 0;
	}

	public SalariedEmployee(String fName, String lName, String SSN, double weeklySalary) {
		super(fName, lName, SSN);
		setWeeklySalary(weeklySalary);
	}
	
	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary >= 0)
			this.weeklySalary = weeklySalary;
		else
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
	}

	@Override
	public double earnings() {
		return getWeeklySalary();
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("$#,##0.00");
		return String.format("salaried employee: %s\n%s: %s", super.toString(), "weekly salary", df.format(getWeeklySalary()));
	}
}
