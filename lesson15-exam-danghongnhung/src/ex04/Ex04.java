package ex04;

import java.io.File;
import java.util.Comparator;
import java.util.List;

import utils.FileUtils;

public class Ex04 {
	private static final String pathname = "text\\student.txt";
	public static void main(String[] args) {
		File file = new File(pathname);
		List<Student> students = FileUtils.readObjeacts(file);
		System.out.println("Danh sách sinh viên");
		students.forEach(System.out::println);
		
		System.out.println("\n1. Danh sách sinh viên tăng dần theo ĐTB & họ tên");
		students.stream()
			.sorted(Comparator.comparing(Student::getScore)
					.thenComparing(Student::getName)).forEach(System.out::println);
			
		System.out.println("\n2. Danh sách SV ĐTB > 8");
		students.stream()
			.filter(student -> student.getScore() > 8)
			.forEach(System.out::println);
		
		System.out.println("\n3. Danh sách Sv Nữ");
		students.stream()
			.filter(student -> student.getGender().equals("Nu"))
			.forEach(System.out::println);
		
		System.out.println("\n4. Sinh viên chỉ xuất hiện một lần trong student.txt.");
		students.stream()
			.map(Student::getName)
			.distinct()
			.forEach(System.out::println);
	}

}
