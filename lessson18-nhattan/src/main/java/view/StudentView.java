package view;

import java.util.List;

import persistence.Class;
import service.ClassService;
import service.ClassServiceImpl;
import service.StudentService;
import service.StudentServiceImpl;

public class StudentView {
	private static StudentService studentService;
	private static ClassService classService;
	
	static {
		studentService = new StudentServiceImpl();
		classService = new ClassServiceImpl();
	}
	
	public static void main(String[] args) {
		
		System.out.println("Ex01===============================");
		List<Class> classes = classService.getAll();
		
		classes.forEach(clazz -> {
			System.out.println(clazz.getName());
			clazz.getStudents().forEach(System.out::println);
		});
		
		System.out.println("Ex03==============================");
		classService.totalAmountStudent().forEach(System.out::println);
		
		System.out.println("Ex04==============================");
		studentService.haveAvgScoreGreat().forEach(System.out::println);
	}
}
