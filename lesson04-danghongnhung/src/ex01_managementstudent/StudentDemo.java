package ex01_managementstudent;

import java.util.ArrayList;
import java.util.List;

public class StudentDemo {
	public static void main(String[] args) {
		List<Student> listst = new ArrayList<Student>();
		Student sv1 = new Student(1, "Đặng Hồng Nhung", 9, 8);
		System.out.println(sv1.toString());
		System.out.println("-------------------------------------------------");
		
		Student sv2 = new Student(2, "Huỳnh Thanh Thịnh", 9, 9);
		System.out.println(sv2.toString());
		System.out.println("-------------------------------------------------");
		
		Student sv3 = new Student();
		StudentUtil.input(sv3);
		System.out.println(sv3.toString());
		System.out.println("-------------------------------------------------");
		
		listst.add(sv1);
		listst.add(sv2);
		listst.add(sv3);
		
		for(Student sv : listst) {
			if(StudentUtil.average(sv))
				System.out.println("Student wit GPA getter than 8.5: " + sv.toString());
		}
		
		System.out.println("-------------------------------------------------");
		
		for(Student sv : listst) {
			if(StudentUtil.theoGreaterPrac(sv))
				System.out.println("Student with theoretical score is greater than the practical score: " + sv.toString());
		}
		
	}
}
