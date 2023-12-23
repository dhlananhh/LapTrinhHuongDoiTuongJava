package bai05;

import java.text.DecimalFormat;

public class CommissionEmployee extends Employee {
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee() {
		super();
		grossSales = 0;
		commissionRate = 0;
	}

	public CommissionEmployee(String fName, String lName, String SSN, double grossSales, double commissionRate) {
		super(fName, lName, SSN);
		setGrossSales(grossSales);
		setCommissionRate(commissionRate);
	}
	
	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		if (commissionRate > 0 && commissionRate < 1)
			this.commissionRate = commissionRate;
		else
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		if (grossSales >= 0)
			this.grossSales = grossSales;
		else
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
	}
	
	@Override                                                           
	public double earnings() {
		return getCommissionRate() * getGrossSales();
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		return String.format("%s: %s\n%s: $%s; %s: %s", "commission employee", super.toString(), "gross sales", df.format(getGrossSales()), "commission rate", df.format(getCommissionRate()));
	}
}
