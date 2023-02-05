package Ex05;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StudentApp {
	public static void main(String[] args) {
		List<Student> student = Utils.student();
		student.stream().sorted((s1,s2) -> Double.compare(s1.getPoint(), s2.getPoint()))
		.forEach(d -> System.out.println(d));
		
		System.out.println("==== cau 2 =====");
		student.stream().filter(d -> d.getPoint() > 8)
		.forEach(d -> System.out.println(d));
		
		System.out.println("==== cau 3======");
		student.stream().filter(d -> d.getGender().equals(Gender.FEMALE))
		.forEach(d -> System.out.println(d));
		
		System.out.println("=======cau 4==========");
		
	}
	

}
