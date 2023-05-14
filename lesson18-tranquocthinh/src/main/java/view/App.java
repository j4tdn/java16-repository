package view;

import service.ClassService;
import service.ClassServiceImpl;
import service.StudentService;
import service.StudentServiceImpl;

public class App {
	
	private static StudentService studentService;
	
	private static ClassService classService;
	
	static {
		studentService = new StudentServiceImpl();
		classService = new ClassServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println(studentService.getAllStudentByClassId(1));
		
		System.out.println(studentService.getStudentsByAvgScore(8.2));
		
		System.out.println(classService.statisticStudentPerClass());
	}
}
