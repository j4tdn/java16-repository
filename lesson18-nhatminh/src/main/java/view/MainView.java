package view;

import service.ClassService;
import service.ClassServiceImpl;
import service.StudentService;
import service.StudentServiceImpl;

public class MainView {
	private static StudentService studentService;
	private static ClassService classService;
	static {
		classService = new ClassServiceImpl();
		studentService = new StudentServiceImpl();
	}

	public static void main(String[] args) {
		System.out.println("QUESTION 1:------------------------");
		System.out.println(studentService.getAllStudentByClassId(3));
		System.out.println("QUESTION 2:------------------------");
		System.out.println(classService.getNumberofStudentInClassWithCondition(8, 8));
		System.out.println("QUESTION 3:------------------------");
		System.out.println(classService.statisticStudentPerClass());
		System.out.println("QUESTION 4:------------------------");
		System.out.println(studentService.getStudentsByAvgScore(8.2));
		System.out.println("QUESTION 5:------------------------");
		System.out.println(studentService.statisticAvgScoreStudentPerClass());
	}
}
