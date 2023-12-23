package bai08;

public class Person {
	protected String lastName;
	protected String firstName;
	
	
	public Person() {
		lastName = "not defined";
		firstName = "not defined";
	}
	
	
	public Person (String lastName, String firstName) {
		setLastName(lastName);
		setFirstName(firstName);
	}
	
	
	public String getLastName() {
		return lastName;
	}

	
	public void setLastName(String lastName) {
		if (!lastName.equals(""))
			this.lastName = lastName;
		else
			this.lastName = "not defined";
	}
	

	public String getFirstName() {
		return firstName;
	}
	

	public void setFirstName(String firstName) {
		if (!firstName.equals(""))
			this.firstName = firstName;
		else
			this.firstName = "not defined";
	}

	
	@Override
	public String toString() {
		return String.format("%-20s %-20s", lastName, firstName);
	}
}