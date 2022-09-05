package studentmanagement;

public class StudentUtil {
	public static void GPA(Student... students) {
		for (Student student : students) {
			if (student.averagePoint() > 8.5) {
				System.out.println(student.toString());
			}
		}
	}

	public static void theoGreaterThanPrac(Student... students) {
		for (Student student : students) {
			if (student.getTheoriticalPoint() > student.getPracticePoint()) {
				System.out.println(student.toString());
			}
		}
	}
}
