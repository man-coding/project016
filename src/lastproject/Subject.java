package lastproject;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	String subject; // 과목 이름
	int subjectNo; // 과목 고유 번호(1001: 국어, 2001: 수학, 3001: 댄스)
	int subjectType; // (1: 필수, 2: 교양)
	List<Student> studentList;

	public Subject(String subjectName, int subjectNo, int subjectType, List<Student> studentList) {
		super();
		this.subject = subjectName;
		this.subjectNo = subjectNo;
		this.subjectType = subjectType;
		this.studentList = studentList;
		studentList = new ArrayList<Student>();
	}

	public void addStudentList(Student student) {
		studentList.add(student);
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

	public int getEvaTool() {
		return subjectType;
	}

	public void setEvaTool(int subjectType) {
		this.subjectType = subjectType;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

}