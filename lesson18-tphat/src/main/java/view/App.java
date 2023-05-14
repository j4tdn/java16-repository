package view;

import service.StudentService;
import service.StudentServiceImpl;

public class App {

	private static StudentService studentService;
	static {
		studentService = new StudentServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("cau 1");
		System.out.println(studentService.getAllById(1));
	}
}
