package school;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		System.out.println("-----------------------");
		System.out.println("이름 | 학번  |과목이름| 점수 ");
		System.out.println("-----------------------");
		List<Student> list=	 new ArrayList<Student>();
		Student hong = new	Student("홍길동","컴퓨터공학과",123123);
		Student lee = new	Student("이기우","국어국문학과",123123);
		String stu2= hong.evalMajor("수학", 96);
		String stu1 =	lee.evalMajor("수학",96);
	
		list.add(hong);
		list.add(lee);
        System.out.println(stu2);

        System.out.println(stu1);
        
        for(Student stu: list) {	
        	System.out.printf("%S | %d | %S | ", stu.name, stu.stuNum,stu.major);
        	System.out.println();
        }
		
		
		
	
	}
}
