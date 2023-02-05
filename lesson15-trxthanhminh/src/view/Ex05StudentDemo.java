package view;

import java.util.List;

import bean.Gender;
import bean.Student;
import model.DataModel;

public class Ex05StudentDemo {
	public static void main(String[] args) {
		
		List<Student> student = DataModel.getStudent();
		
		System.out.println("Danh sách sinh viên tăng dần theo ĐTB: ");
		student.stream()
			.sorted((t1, t2) -> Double.compare(t1.getPoint(), t2.getPoint()))
			.forEach(System.out::println);
	
		System.out.println("Danh sách sinh viên có ĐTB > 8: ");
		student.stream()
			.filter(t -> t.getPoint() > 8)
			.forEach(System.out::println);
		
		System.out.println("Danh sách các sinh viên NỮ: ");
		student.stream()
			.filter(t -> t.getGender() == Gender.NU)
			.forEach(System.out::println);
		
		System.out.println("Danh sách sinh viên chỉ xuất hiện một lần: ");
		student.stream()
			.distinct()
			.forEach(System.out::println);
	}
}
