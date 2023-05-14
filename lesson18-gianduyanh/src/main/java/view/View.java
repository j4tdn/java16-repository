package view;

import bean.Student;
import service.StudentService;
import service.StudentServiceImp;

public class View {
	
	private static StudentService service;
	
	static {
		service = new StudentServiceImp();
	}
	
	public static void main(String[] args) {
		System.out.println("1.List all student by class id");
		service.getAll().forEach(o -> System.out.println(o + " "));
		
		System.out.println("4.Find Student who have avarege point >= 8.2");
		service.sortGrade().forEach(o -> System.out.println(o + " "));
	}

}
