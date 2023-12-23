package bai08;

import java.util.List;
import java.util.ArrayList;

import bai07.Employee;

public class Enrollment {
	private String status;
	private String grade;
	private float numGrade;
	private Student student;
	
	
	public Enrollment (Student student, String status, String grade, float numGrade) {
		setStudent(student);
		setStatus(status);
		setGrade(grade);
		setNumGrade(numGrade);
	}
	
	
	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public float getNumGrade() {
		return numGrade;
	}


	public void setNumGrade(float numGrade) {
		this.numGrade = numGrade;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	@Override
	public String toString() {
		return String.format("%10s %10s %10.2f %10s", student, status, numGrade, grade);
	}
}
