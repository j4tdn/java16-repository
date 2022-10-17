package problem01;

import java.util.Arrays;

import problem01.dto.Student;

public class Ex01StudentManagementApp {
	public static void main(String[] args) {
		Student[] listAllStudents = getAllStudents();
		Student[] listStudentswithAScore = getStudentbyScore(Student.Score.A, listAllStudents);
		Student[] listStudentsStudyAgain = getStudentStudyAgain(listAllStudents);

		System.out.println("Danh sách SV trong lớp CTDL:");
		printStudents(listAllStudents);
		System.out.println("===============");
		System.out.println("Danh sách SV đạt loại A:");
		printStudents(listStudentswithAScore);
		System.out.println("===============");
		System.out.println("Danh sách SV học lại:");
		printStudents(listStudentsStudyAgain);
	}

	private static void printStudents(Student[] listStudents) {
		for (Student student : listStudents)
			System.out.println(student);
	}

	private static Student[] getAllStudents() {
		Student[] listStudents = { new Student(102, "Nam", Student.Score.C), new Student(103, "Bảo", Student.Score.F),
				new Student(104, "Hoàng", Student.Score.D), new Student(105, "Nguyên", Student.Score.B),
				new Student(107, "Vũ", Student.Score.F), new Student(109, "Lan", Student.Score.A),
				new Student(202, "Đạt", Student.Score.C), new Student(103, "Bảo", Student.Score.F),
				new Student(107, "Vũ", Student.Score.C), new Student(104, "Hoàng", Student.Score.B), };
		return listStudents;
	}

	private static Student[] getStudentbyScore(Student.Score score, Student[] listStudents) {
		Student[] result = new Student[listStudents.length];
		int i = 0;
		for (Student student : listStudents)
			if (student.getScore() == score) {
				result[i] = student;
				i++;
			}
		return Arrays.copyOfRange(result, 0, i);
	}

	private static Student[] getStudentStudyAgain(Student[] listStudents) {
		Student[] result = new Student[listStudents.length];
		int i = 0;
		for (Student student : listStudents)
			if (student.getScore() == Student.Score.F) {
				result[i] = student;
				i++;
			}
		return Arrays.copyOfRange(result, 0, i);
	}
}
