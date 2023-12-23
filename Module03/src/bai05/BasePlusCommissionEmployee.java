package bai05;

import java.text.DecimalFormat;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;

	public BasePlusCommissionEmployee() {
		super();
		baseSalary = 0;
	}

	public BasePlusCommissionEmployee(String fName, String lName, String SSN, double grossSales,
			double commissionRate, double baseSalary) {
		super(fName, lName, SSN, grossSales, commissionRate);
		setBaseSalary(baseSalary);
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if (baseSalary >= 0)
			this.baseSalary = baseSalary;
		else
			throw new IllegalArgumentException("Base salary must be >= 0.0");
	}
	
	@Override                                                           
	public double earnings() {
		return getBaseSalary() + super.earnings();
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		return String.format("%s %s; %s: $%s", "base-salaried", super.toString(), "base salary", df.format(getBaseSalary()));
	}
}
