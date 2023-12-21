package lastproject;

import java.util.ArrayList;
import java.util.List;

public class Student {

	public String studentId;
	public String studentName;
	public List<Score> scoreList;

	public Student(String studentId, String studentName, List<Score> scoreList) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.scoreList = scoreList;
		scoreList = new ArrayList<Score>();
	}

	public void addScoreList(Score score) {
		scoreList.add(score);
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<Score> getScoreList() {
		return scoreList;
	}

	public void setScoreList(List<Score> scoreList) {
		this.scoreList = scoreList;
	}

}