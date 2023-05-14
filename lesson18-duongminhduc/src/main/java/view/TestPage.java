package view;

import service.StudentService;
import service.StudentServiceIpml;
import utils.PrintUtils;

public class TestPage {

	private static StudentService studentService;
	
	static {
	   studentService = new StudentServiceIpml();
	}
	public static void main(String[] args) {
		

		PrintUtils.print("Câu 1: ", studentService.findByClassId(2));
	}
}
