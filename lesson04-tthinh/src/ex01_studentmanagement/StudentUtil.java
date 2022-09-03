package ex01_studentmanagement;

public class StudentUtil {
	public static void arr(Student... students) {
		for(Student student:students) {
			if(student.arrPoint()> 8.5) {
				System.out.println(student.toString());
			}
		}
	}
	
	public static void theoGreaterThanPrac(Student...students) {
		for(Student student:students) {
			if(student.getTheoreticalPoint() > student.getPracticePoint()) {
				System.out.println(student.toString());
			}
		}
	}
}
