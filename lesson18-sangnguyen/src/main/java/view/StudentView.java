package view;

import service.StudentService;
import service.StudentServiceImpl;
import utils.PrintUtils;

public class StudentView {

	private static StudentService studentService;
	
	static {
		studentService = new StudentServiceImpl();
	}
	
	public static void main(String[] args) {
			
		PrintUtils.print("Ex 01: List all student by class id", studentService.getAllStudentByClassId(2));
	}
}
