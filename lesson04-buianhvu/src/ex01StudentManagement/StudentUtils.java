package ex01StudentManagement;

public class StudentUtils {

	private static double averagePoint(Student student) {
		return (student.getTheoScore() + student.getPractScore()) / 2;

	}

	public static void goodStudent(Student[] students) {
		for (Student student : students) {
			if (averagePoint(student) >= 8.5) {
				System.out.println(student.getName() + "\tis good student !");
			} 
		}
	}

	public static void theoryMoreThanPractice(Student[] students) {
		for (Student student : students) {
			if (student.getTheoScore() > student.getPractScore()) {
				System.out.println(student.getName() + "\thas Practice Score > Theory Score");
			} 
		}
	}
}
