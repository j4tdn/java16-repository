package view;

import java.io.File;
import java.util.Comparator;
import java.util.List;

import bean.Student;
import utils.FileUtils;

public class Ex05 {
	private static final String pathname = "student.txt";

	public static void main(String[] args) {
		File file = new File(pathname);
		List<Student> student = FileUtils.readFile(file, Student::transfer);

		System.out.println("Cau 1");
		student.sort(Comparator.comparing(Student::getAvg).thenComparing(Student::getName));
		student.forEach(System.out::println);

		System.out.println("Cau 2:");
		student.stream().filter(o -> o.getAvg() > 8).forEach(System.out::println);

		System.out.println("Cau 3:");
		student.stream().filter(o -> o.getGender().equals("Nu")).forEach(System.out::println);

		System.out.println("Cau 4:");
		student.stream().filter(o -> {
			int count = 0;
			for (Student students : student) {
				if (o.getId().equals(students.getId())) {
					count++;
				}
			}
			return count == 1;
		}).toList();
		student.forEach(System.out::println);
	}
}
