package school;

public class RequireCalc implements Calc {
	String grade;

	@Override
	public String grade(int score) {

		if (score >= 95 && score <= 100) {
			grade = "S";
			return grade;
		} else if (score >= 90 && score < 95) {
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
