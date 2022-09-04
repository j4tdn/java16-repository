package Ex01ManagementStudent;

import java.util.ArrayList;
import java.util.List;

public class StudentDemo {
	public static void main(String[] args) {
		List<Student> listst = new ArrayList<Student>();
		Student ms1 = new Student(1, "Tran Khanh Huy", 7, 7);
		System.out.println(ms1.toString());
		
		Student ms2 = new Student(2, "Tran Khanh Huan", 8, 8);
		System.out.println(ms2.toString());
		
		Student ms3 = new Student();
		StudentUtil.input(ms3);
		System.out.println(ms3.toString());
	
		listst.add(ms1);
		listst.add(ms2);
		listst.add(ms3);
		
		for(Student sv : listst) {
			if(StudentUtil.average(sv))
				System.out.println("Student with GPA getter than 8.5: " + sv.toString());
		}
		
		
		for(Student sv : listst) {
			if(StudentUtil.theoGreaterPrac(sv))
				System.out.println("Student with theoretical score is greater than the practical score: " + sv.toString());
		}
		
	}
}
