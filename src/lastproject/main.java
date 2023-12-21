package lastproject;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {

//		List<Score> score = new ArrayList<>();  안 해도 됨
		Student student1 = new Student("181213", "안성원", new ArrayList<>()); // 스코어리스트임
		Student student2 = new Student("182330", "오태훈", new ArrayList<>());
		Student student3 = new Student("171518", "이동호", new ArrayList<>());
		Student student4 = new Student("172350", "조성욱", new ArrayList<>());
		Student student5 = new Student("171290", "최태평", new ArrayList<>());

		Subject subject1 = new Subject("국어", Define.KOREAN, Define.TYPE1, new ArrayList<>()); // 학생리스트임
		Subject subject2 = new Subject("수학", Define.MATH, Define.TYPE1, new ArrayList<>());
		Subject subject3 = new Subject("방송댄스", Define.DANCE, Define.TYPE2, new ArrayList<>());

		Score ahnScore1 = new Score("181213", subject1, 95);
		Score ahnScore2 = new Score("181213", subject2, 56);
		Score ahnScore3 = new Score("181213", subject3, 95);

		Score ohScore1 = new Score("182330", subject1, 95);
		Score ohScore2 = new Score("182330", subject2, 98);
		Score ohScore3 = new Score("182330", subject3, 85);

		Score leeScore1 = new Score("171518", subject1, 100);
		Score leeScore2 = new Score("171518", subject2, 88);
		Score leeScore3 = new Score("171518", subject3, 55);

		Score joScore1 = new Score("172350", subject1, 89);
		Score joScore2 = new Score("172350", subject2, 95);

		Score choiScore1 = new Score("171290", subject1, 83);
		Score choiScore2 = new Score("171290", subject2, 56);

		MajorEvaluation majorEvaluation = new MajorEvaluation();
		PassFailEvaluation passFailEvaluation = new PassFailEvaluation();

		// 과목마다 학생 추가 -> 과목별 학생리스트가 만들어짐
		subject1.addStudentList(student1);
		subject1.addStudentList(student2);
		subject1.addStudentList(student3);
		subject1.addStudentList(student4);
		subject1.addStudentList(student5);

		subject2.addStudentList(student1);
		subject2.addStudentList(student2);
		subject2.addStudentList(student3);
		subject2.addStudentList(student4);
		subject2.addStudentList(student5);

		subject3.addStudentList(student1);
		subject3.addStudentList(student2);
		subject3.addStudentList(student3);

		// 학생마다 점수를 리스트에 추가 -> 학생별 점수리스트가 만들어짐
		student1.addScoreList(ahnScore1);
		student1.addScoreList(ahnScore2);
		student1.addScoreList(ahnScore3);

		student2.addScoreList(ohScore1);
		student2.addScoreList(ohScore2);
		student2.addScoreList(ohScore3);

		student3.addScoreList(leeScore1);
		student3.addScoreList(leeScore2);
		student3.addScoreList(leeScore3);

		student4.addScoreList(joScore1);
		student4.addScoreList(joScore2);

		student5.addScoreList(choiScore1);
		student5.addScoreList(choiScore2);

		Report report1 = new Report();
		report1.printReport(subject1);
//		Report report2 = new Report();
//		report2.printReport(subject2.studentList, majorEvaluation);
//		Report report3 = new Report();
//		report3.printReport(subject3.studentList, majorEvaluation);

//		// 과목별 결과 리포트
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
//
//		System.out.println("--------------------");
//		System.out.println("    " + "수학 " + "수강생 " + "학점");
//		System.out.println("   " + "이름" + " | " + "학번" + " | " + "점수");
//		System.out.println("--------------------");
//		System.out.println(student1.studentName + " | " + student1.studentId + " | " + ahnScore2.score + ":"
//				+ majorEvaluation.getGrade(ahnScore2.score) + " |");
//		System.out.println(student2.studentName + " | " + student2.studentId + " | " + ohScore2.score + ":"
//				+ majorEvaluation.getGrade(ohScore2.score) + " |");
//		System.out.println(student3.studentName + " | " + student3.studentId + " | " + leeScore2.score + ":"
//				+ majorEvaluation.getGrade(leeScore2.score) + " |");
//		System.out.println(student4.studentName + " | " + student4.studentId + " | " + joScore2.score + ":"
//				+ majorEvaluation.getGrade(joScore2.score) + " |");
//		System.out.println(student5.studentName + " | " + student5.studentId + " | " + choiScore2.score + ":"
//				+ majorEvaluation.getGrade(choiScore2.score) + " |");
//
//		System.out.println("--------------------");
//		System.out.println("    " + "댄스 " + "수강생 " + "학점");
//		System.out.println("   " + "이름" + " | " + "학번" + " | " + "점수");
//		System.out.println("--------------------");
//		System.out.println(student1.studentName + " | " + student1.studentId + " | " + ahnScore3.score + ":"
//				+ passFailEvaluation.getGrade(ahnScore3.score) + " |");
//		System.out.println(student2.studentName + " | " + student2.studentId + " | " + ohScore3.score + ":"
//				+ passFailEvaluation.getGrade(ohScore3.score) + " |");
//		System.out.println(student3.studentName + " | " + student3.studentId + " | " + leeScore3.score + ":"
//				+ passFailEvaluation.getGrade(leeScore3.score) + " |");

	}

}
