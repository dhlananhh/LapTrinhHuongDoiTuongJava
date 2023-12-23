package bai08;

import java.util.HashSet;
import java.util.Set;

import bai07.Employee;

public class Course {
	private String courseNbr;
	private String courseTitle;
	private int credits;
	private Set<Section> sections;
	
	
	public Course() {
		courseNbr = "xxx";
		courseTitle = "not defined";
		credits = 0;
		sections = new HashSet<Section>();
	}


	public Course(String courseNbr, String courseTitle, int credits, Set<Section> sections) {
		setCourseNbr(courseNbr);
		setCourseTitle(courseTitle);
		setCredits(credits);
		sections = new HashSet<Section>();
	}
	
	
	public String getCourseNbr() {
		return courseNbr;
	}


	public void setCourseNbr(String courseNbr) {
		this.courseNbr = courseNbr;
	}


	public String getCourseTitle() {
		return courseTitle;
	}


	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}


	public int getCredits() {
		return credits;
	}


	public void setCredits(int credits) {
		this.credits = credits;
	}


	public Set<Section> getSections() {
		return sections;
	}
		
	
	@Override
	public String toString() {
		return String.format("");
	}
}
