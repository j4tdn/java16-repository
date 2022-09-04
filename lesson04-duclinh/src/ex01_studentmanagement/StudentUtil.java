package ex01_studentmanagement;

public class StudentUtil {
	public static float mediumScore(Student student) {
		return (student.getTheoryPoint() + student.getPracticePoint())/2 ;
	}
	public static void findGoodStudent(Student[] students) {
		for(Student student:students) {
			if(mediumScore(student) > 8.5) {
				System.out.println(student);
			}
		}
	}
	public static void findStudentTheoryBetterPractice(Student[] students) {
		for(Student student:students) {
			if(student.getTheoryPoint() > student.getPracticePoint() ) {
				System.out.println(student);
			}
		}
	}
	
	
}
