package lastproject;

import java.util.ArrayList;
import java.util.List;

public class Report {

	public void printReport(Subject subject) {
		List<Student> studentList = subject.studentList;
		for (Student student : studentList) {

			System.out.println("--------------------");
			System.out.println("    " + "국어 " + "수강생 " + "학점");
			System.out.println("   " + "이름" + " | " + "학번" + " | " + "점수");
			System.out.println("--------------------");
			System.out.println(student.studentName + " | " + student.studentId + " | "+);
		}
//		System.out.println("--------------------");
//		System.out.println("    " + "국어 " + "수강생 " + "학점");
//		System.out.println("   " + "이름" + " | " + "학번" + " | " + "점수");
//		System.out.println("--------------------");
//		System.out.println(student1.studentName + " | " + student1.studentId + " | " + ahnScore1.score + ":"
//				+ majorEvaluation.getGrade(ahnScore1.score) + " |");
//		System.out.println(student2.studentName + " | " + student2.studentId + " | " + ohScore1.score + ":"
//				+ majorEvaluation.getGrade(ohScore1.score) + " |");
//		System.out.println(student3.studentName + " | " + student3.studentId + " | " + leeScore1.score + ":"
//				+ majorEvaluation.getGrade(leeScore1.score) + " |");
//		System.out.println(student4.studentName + " | " + student4.studentId + " | " + joScore1.score + ":"
//				+ majorEvaluation.getGrade(joScore1.score) + " |");
//		System.out.println(student5.studentName + " | " + student5.studentId + " | " + choiScore1.score + ":"
//				+ majorEvaluation.getGrade(choiScore1.score) + " |");
	}

}
