package exercise01_StudentManagement;

public class StudentUtil {
	public static float calculateMark(Student student) {
		return (float) (student.getMarkTheory()*0.4 + student.getMarkPractice()*0.6);
	}
	
	public static void findGoodStudent(Student[] students) {
		System.out.println("List of good students:");
		for(Student student:students) {
			if (calculateMark(student) >= 8.5)
				System.out.println(student);
		}
	}
	
	public static void findStudentTheoryHigherThanPractice(Student[] students){
		System.out.println("List of students with theory mark higher than practice mark:");
		for(Student student:students) {
			if (student.getMarkTheory() > student.getMarkPractice())
				System.out.println(student);
		}
	}
}
