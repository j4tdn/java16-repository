package view;

import service.ClassService;
import service.ClassServiceImpl;
import utils.PrintUtils;

public class ClassPage {
	private static final ClassService cService;
	static {
		cService = new ClassServiceImpl();
	}
	public static void main(String[] args) {
		PrintUtils.print("3. Count number of students in each class ", cService.countAmount());
	}
}
