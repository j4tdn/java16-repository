package view;

import java.util.List;

import bean.Datamodel;
import bean.Gender;
import bean.Student;

public class Ex05 {
	public static void main(String[] args) {
		List<Student> student = Datamodel.getStudent();
		
		System.out.println("danh sach sinh vien tang dan theo ĐTB");
		student.stream().sorted((t1,t2)->t1.getPoint().compareTo(t2.getPoint())).forEach(t->System.out.println(t));
		
		System.out.println("danh sach sinh vien co DTB > 8");
		student.stream().filter(t->t.getPoint()>8.0).forEach(System.out::println);
		
		System.out.println("toan bo cac sinh vien Nu");
		student.stream().filter(t->t.getGender()==Gender.Nu).forEach(System.out::println);
	}

}
