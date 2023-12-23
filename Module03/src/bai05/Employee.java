package bai05;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	public Employee() {
		firstName = "";
		lastName = "";
		socialSecurityNumber = "";
	}
	
	public Employee (String fName, String lName, String SSN) {
		setFirstName(fName);
		setLastName(lName);
		setSocialSecurityNumber(SSN);
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public String toString() {
		return String.format( "%s %s\nsocial security number: %s", getFirstName(), getLastName(), getSocialSecurityNumber() );
	}
	
	public abstract double earnings();
}
