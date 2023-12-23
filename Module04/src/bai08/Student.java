package bai08;

public class Student extends Person {
	private String studentID;
	private int yearMatriculated;
	
	
	public Student() {
		super();
		studentID = "not defined";
		yearMatriculated = 0;
	}
	
	
	public Student(String lastName, String firstName, String studentID, int yearMatriculated) {
		super(lastName, firstName);
		setStudentID(studentID);
		setYearMatriculated(yearMatriculated);
	}
	
	
	public String getStudentID() {
		return studentID;
	}


	public void setStudentID(String studentID) {
		if (!studentID.equals(""))
			this.studentID = studentID;
		else
			this.studentID = "not defined";
	}


	public int getYearMatriculated() {
		return yearMatriculated;
	}


	public void setYearMatriculated(int yearMatriculated) {
		if (yearMatriculated > 0)
			this.yearMatriculated = yearMatriculated;
		else
			this.yearMatriculated = 0;
	}


	@Override
	public String toString() {
		return String.format("%-20s %-20d", studentID, yearMatriculated);
	}
}
