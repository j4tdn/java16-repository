package studentmanagement;

public class StudentFeatures {
	public static float calPoint(Student student) {
		return (float) (student.getPointTheory()*0.4 + student.getPointPractice()*0.6);
	}
	
	public static void findGoodStudent(Student[] students) {
		System.out.println("List of good students:");
		for(Student student:students) {
			if (calPoint(student) >= 8.5)
				System.out.println(student);
		}
	}
	
	public static void findStudentTheoryHigherThanPractice(Student[] students){
		System.out.println("List of students with point theory higher than point practice:");
		for(Student student:students) {
			if (student.getPointTheory() > student.getPointPractice())
				System.out.println(student);
		}
	}
}
