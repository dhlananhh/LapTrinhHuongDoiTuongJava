package bai08;

public class Faculty extends Person {
	private String facultyID;
	private String office;
	
	
	public Faculty() {
		super();
		facultyID = "not defined";
		office = "not defined";
	}


	public Faculty(String lastName, String firstName, String facultyID, String office) {
		super(lastName, firstName);
		setFacultyID(facultyID);
		setOffice(office);
	}


	public String getFacultyID() {
		return facultyID;
	}
	
	
	public void setFacultyID(String facultyID) {
		if (!facultyID.equals(""))
			this.facultyID = facultyID;
		else
			this.facultyID = "xxx";
	}
	
	
	public String getOffice() {
		return office;
	}
	
	
	public void setOffice(String office) {
		if (!office.trim().equals(""))
			this.office = office;
		else
			this.office = "not defined";
	}
	
	
	@Override
	public String toString() {
		return String.format("%-20s %-20s", facultyID, office);
	}
}
