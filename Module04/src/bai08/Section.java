package bai08;

import java.util.HashSet;
import java.util.Set;


public class Section {
	private String semester;
	private String sectionNbr;
	private String room;
	private Faculty facultyMember;
	private Set<Enrollment> listEnrolls ;
	
	
	public Section() {
		semester = "not defined";
		sectionNbr = "xxx";
		room = "xxx";
		facultyMember = null;
		listEnrolls = new HashSet<Enrollment>();
	}
	
	
	public Section (String semester, String sectionNbr, String room, Faculty facultyMember,
			Set<Enrollment> listEnrolls) {
		setSemester(semester);
		setSectionNbr(sectionNbr);
		setRoom(room);
		setFacultyMember(facultyMember);
		listEnrolls = new HashSet<Enrollment>();
	}


	public String getSemester() {
		return semester;
	}


	public void setSemester(String semester) {
		if (!semester.equals(""))
			this.semester = semester;
		else
			this.semester = "not defined";
	}


	public String getSectionNbr() {
		return sectionNbr;
	}


	public void setSectionNbr(String sectionNbr) {
		if (!sectionNbr.equals(""))
			this.sectionNbr = sectionNbr;
		else
			this.sectionNbr = "xxx";
	}


	public String getRoom() {
		return room;
	}


	public void setRoom(String room) {
		if (!room.equals(""))
			this.room = room;
		else
			this.room = "xxx";
	}


	public Faculty getFacultyMember() {
		return facultyMember;
	}


	public void setFacultyMember(Faculty facultyMember) {
		if (facultyMember != null)
			this.facultyMember = facultyMember;
		else
			this.facultyMember = null;
	}


	public Set<Enrollment> getListEnrolls() {
		return listEnrolls;
	}

	
	@Override
	public String toString() {
		String s = "";
		for (Enrollment enrollment : listEnrolls)
			s += enrollment + "\n";
		return String.format("%-10s %-10s %-10s %-20s %-30s", semester, sectionNbr, room, facultyMember, s);
	}
}
