package lastproject;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {

//		List<Score> score = new ArrayList<>();
		Student student1 = new Student("181213", "안성원", new ArrayList<>());
		Student student2 = new Student("182330", "오태훈", new ArrayList<>());
		Student student3 = new Student("171518", "이동호", new ArrayList<>());
		Student student4 = new Student("172350", "조성욱", new ArrayList<>());
		Student student5 = new Student("171290", "최태평", new ArrayList<>());

		Subject subject1 = new Subject("국어", 1, "AF", new ArrayList<>());
		Subject subject2 = new Subject("수학", 2, "AF", new ArrayList<>());
		Subject subject3 = new Subject("방송댄스", 3, "PF", new ArrayList<>());

		Score ahnScore1 = new Score("181213", subject1, 95);
		Score ahnScore2 = new Score("181213", subject2, 56);
		Score ahnScore3 = new Score("181213", subject3, 95);

		Score ohScore1 = new Score("181213", subject1, 95);
		Score ohScore2 = new Score("181213", subject2, 56);
		Score ohScore3 = new Score("181213", subject3, 95);

		Score leeScore1 = new Score("181213", subject1, 95);
		Score leeScore2 = new Score("181213", subject2, 56);
		Score leeScore3 = new Score("181213", subject3, 95);

		Score joScore1 = new Score("181213", subject1, 95);
		Score joScore2 = new Score("181213", subject2, 56);
		Score joScore3 = new Score("181213", subject3, 95);

		Score choiScore1 = new Score("181213", subject1, 95);
		Score choiScore2 = new Score("181213", subject2, 56);
		Score choiScore3 = new Score("181213", subject3, 95);
	}

}
