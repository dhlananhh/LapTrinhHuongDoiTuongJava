package bai05;

import java.text.DecimalFormat;

public class HourlyEmployee extends Employee {
	private double wage;
	private double hours;
	
	public HourlyEmployee() {
		super();
		wage = 0;
		hours = 0;
	}
	
	public HourlyEmployee(String fName, String lName, String SSN, double wage, double hours) {
		super(fName, lName, SSN);
		setWage(wage);
		setHours(hours);
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if (wage >= 0)
			this.wage = wage;
		else
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		if (hours >= 0 && hours <= 168)
			this.hours = hours;
		else
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
	}

	@Override
	public double earnings() {
		if (getHours() <= 40)
			return getWage() * getHours();
		else
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;	
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		return String.format("hourly employee: %s\n%s: %s; %s: %s", super.toString(), "hourly wage", df.format(getWage()), "hours worked", df.format(getHours()));
	}
}
