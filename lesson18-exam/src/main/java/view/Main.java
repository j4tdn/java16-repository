package view;

package view;

import service.StudentService;
import service.StudentServiceImp;

public class Main {
	private static StudentService studentService ;
	static {
		studentService = new StudentServiceImp();
	}
	public static void main(String[] args) {
		System.out.println("1.List all student by class id");
		studentService.getAll().forEach(System.out::println);

	}
}