package lastproject;

import java.util.List;

class Score {

	String studentId;

	Subject subject;

	int score;

	public Score(String studentId, Subject subject, int score) {
		super();
		this.studentId = studentId;
		this.subject = subject;
		this.score = score;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Score [studentId=" + studentId + ", subject=" + subject + ", score=" + score + "]";
	}

}
