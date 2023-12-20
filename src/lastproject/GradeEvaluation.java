package lastproject;

public interface GradeEvaluation {

	public String getGrade(int score);
}

class MajorEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int score) {
		String grade;
		
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}

		return grade;
	}

}

class PassFailEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int score) {
		String grade;

		if (score >= 70) {
			grade = "P";
		} else
			grade = "F";
		return grade;
	}

}