package lastproject;

import java.util.List;

public class Subject {

	String subject;
	int subjectNo;
	String evaTool;
	List<Student> studentList;

	public Subject(String subjectName, int subjectNo, String evaTool, List<Student> studentList) {
		super();
		this.subject = subjectName;
		this.subjectNo = subjectNo;
		this.evaTool = evaTool;
		this.studentList = studentList;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getSubjectNo() {
		return subjectNo;
	}

	public void setSubjectNo(int subjectNo) {
		this.subjectNo = subjectNo;
	}

	public String getEvaTool() {
		return evaTool;
	}

	public void setEvaTool(String evaTool) {
		this.evaTool = evaTool;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

}
