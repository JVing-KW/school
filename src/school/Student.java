package school;

public class Student {
	String name;
	int stuNum;
	String major;
	Subject subName;
	public Student() {
	}
	
	public Student(String name,String major,int stuNum) {
		this.name=name;
		this.stuNum=stuNum;
		this.major=major;

	}

public 	String evalMajor(String subName,int score) {
		if ((major.equals("컴퓨터공학과") && subName.equals("수학")) || (major.equals("국어국문학과") && subName.equals("국어"))) {
			Calc cal = new RequireCalc();

			return cal.grade(score);
		}
		else {
			Calc cal = new NormalCalc();
			return cal.grade(score);
		}
	}
}
