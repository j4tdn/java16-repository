package ex01_studentmanagement;

import java.util.Scanner;

public class StudentUtils {
	private StudentUtils() {
	}

	public static void inputStudent(Student student) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập id sinh viên: ");
		student.setId(enterInt());
		System.out.print("Nhập h�? và tên: ");
		student.setFullName(ip.nextLine());
		System.out.print("Nhập điểm lý thuyết: ");
		student.setLecPoint(enterFloat());
		System.out.print("Nhập điểm thực hành: ");
		student.setLabPoint(enterFloat());
	}

	public static void printf(Student[] students, Condition con) {
		for (int i = 0; i < students.length; i++) {
			if (con.test(students[i].getLecPoint(), students[i].getLabPoint())) {
				System.out.println(students[i] + " ");
			}
		}
		System.out.println("\n==================================================");
	}

	private static int enterInt() {
		String intAsStr = null;
		Scanner ip = new Scanner(System.in);

		do {
			intAsStr = ip.nextLine();
			if (intAsStr.matches("\\d+")) {
				break;
			}
		} while (true);

		return Integer.parseInt(intAsStr);
	}

	private static float enterFloat() {
		String floatAsStr = null;
		Scanner ip = new Scanner(System.in);

		do {
			floatAsStr = ip.nextLine();

			if (floatAsStr.matches("10(\\.0*)?")) {
				break;
			}

			if (floatAsStr.matches("\\d(\\.\\d*)?")) {
				break;
			}

			System.out.println("�?iểm không hợp lệ!!! Xin hãy nhập lại.");
		} while (true);

		return Float.parseFloat(floatAsStr);
	}

	public static boolean avgGreaterThan(Student student, float point) {
		return ((student.getLecPoint() + student.getLabPoint()) / 2) > point;
	}

	public static boolean lecGreaterThanLab(Student student) {
		return student.getLecPoint() > student.getLabPoint();
	}
}
