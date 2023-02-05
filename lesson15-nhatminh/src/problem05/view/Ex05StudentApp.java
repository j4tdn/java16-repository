package problem05.view;

import java.io.File;
import java.util.List;

import problem05.bean.Student;
import problem05.utils.StudentUtils;

public class Ex05StudentApp {
	private static final String pathname = String.join(File.separator, "data", "student.txt");

	public static void main(String[] args) {
		List<Student> students = StudentUtils.getStudentList(pathname);

		System.out.println("1.Sorted List:");
		StudentUtils.getSortedStudentList(students).forEach(System.out::println);
		System.out.println("2.GPA > 8.0:");
		StudentUtils.getMoreThan8GpaStudents(students).forEach(System.out::println);
		System.out.println("3.Female students:");
		StudentUtils.getFemaleStudents(students).forEach(System.out::println);
		System.out.println("4.Not duplicated students:");
		StudentUtils.getNotDuplicatedStudents(students).forEach(System.out::println);
	}
}
