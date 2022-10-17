package Ex01;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		Student[] students = { new Student(102, "Nam", Enum.C), new Student(103, "Bảo", Enum.F),
				new Student(104, "Hoàng", Enum.D), new Student(105, "Nguyên", Enum.B), new Student(107, "Vũ", Enum.F),
				new Student(109, "Lan", Enum.A), new Student(202, "Đạt", Enum.C), new Student(103, "Bảo", Enum.F),
				new Student(107, "Vũ", Enum.C), new Student(104, "Hoàng", Enum.B), };

		System.out.println("Danh sách sinh viên loại A:");
		Student[] studentGradeA = findStudentGradeA(students);
		for (int i = 0; i < studentGradeA.length; i++) {
			System.out.println(studentGradeA[i].toString());
		}
		System.out.println("===================================");

		System.out.println("Danh sách sinh viên đăng ký học lại:");
		Student[] studentLearnAgain = findStudentLearnAgain(students);
		for (int i = 0; i < studentLearnAgain.length; i++) {
			System.out.println(studentLearnAgain[i].toString());
		}

	}

	public static Student[] findStudentGradeA(Student[] students) {
		Student[] result = new Student[students.length];
		int index = 0;
		for (Student student : students) {
			if (student.getClassification().equals(Enum.A)) {
				result[index] = student;
				index++;
			}
		}
		result = Arrays.copyOf(result, index);
		return result;
	}

	private static Student[] findStudentLearnAgain(Student[] students) {
		Student[] result = new Student[students.length];
		int index = 0;
		for (int i = 0; i < students.length; i++) {
			for (int j = i + 1; j < students.length; j++) {
				if (students[i].getId() == students[j].getId()) {
					result[index] = students[i];
					index++;
				}
			}
		}
		result = Arrays.copyOf(result, index);
		return result;
	}

}
