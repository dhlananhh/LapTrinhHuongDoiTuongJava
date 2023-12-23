package bai05;

import java.text.DecimalFormat;

public class PayrollSystemTest {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("$#,##0.00");
		
		SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
		CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, 0.06);
		BasePlusCommissionEmployee basePlusCommissionEmployee =  new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, 0.04, 300);
		
//		System.out.println("Employees processed individually: \n");
//		System.out.println(salariedEmployee + "\nearned " + df.format(salariedEmployee.earnings()) + "\n");
//		System.out.println(hourlyEmployee + "\nearned " + df.format(hourlyEmployee.earnings()) + "\n");
//		System.out.println(commissionEmployee + "\nearned " + df.format(commissionEmployee.earnings()) + "\n");
//		System.out.println(basePlusCommissionEmployee + "\nearned " + df.format(basePlusCommissionEmployee.earnings()) + "\n");
		
		Employee[] employees = new Employee[4];
		employees[0] = salariedEmployee; 
		employees[1] = hourlyEmployee; 
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommissionEmployee;
		
		printList(employees);
		
	}
	
	public static void printList (Employee[] employees) {
		DecimalFormat df = new DecimalFormat("$#,##0.00");
		
		for (Employee currentEmployee : employees) {
			System.out.println(currentEmployee);
			if (currentEmployee instanceof BasePlusCommissionEmployee) {
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
				employee.setBaseSalary(1.10 * employee.getBaseSalary());
				System.out.printf("new base salary with 10%% increase is: %s\n", df.format(employee.getBaseSalary()));
			}
			
			 System.out.printf("earned %s\n\n", df.format(currentEmployee.earnings()));
		}
	}
}
