package school;

public class NormalCalc implements Calc {
	String grade;

	@Override
	public String grade(int score) {
		if (score >= 90 && score <= 100 ) {
			grade = "A";
			return grade;
		} else if (score >= 80 && score < 90) {
			grade = "B";
			return grade;
		} else if (score >= 70 && score < 80) {
			grade = "C";
			return grade;
		} else if (score >= 60 && score < 70) {
			grade = "D";
			return grade;
		} else {
			grade = "F";
			return grade;
		}

	}
}
