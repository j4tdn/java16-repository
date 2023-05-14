package view;

import java.util.List;

import persistence.Student;
import service.StudentService;
import service.StudentServiceImpl;
import utils.PrintUtils;

public class StudentPage {
	private static final StudentService sService;
	static {
		sService = new StudentServiceImpl();
	}
	public static void main(String[] args) {
		List<Student> studentsByClassId = sService.get(1);
		PrintUtils.print("Question 1: studentsByClassId", studentsByClassId);
		
		List<Student> goodStudents = sService.getGoodStudents();
		PrintUtils.print("Question 2: goodStudents", goodStudents);
		
	}
}
