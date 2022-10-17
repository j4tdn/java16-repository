package ex01studentmanagement;

import java.util.Arrays;
import java.util.Collections;

import common.Rank;

public class App {
	/*
	 * Bài 1(30đ): Trong năm 2021 có N sinh viên khoa CNTT đăng ký học phần cấu trúc
	 * dữ liệu. Thông tin mỗi sinh viên được lưu trữ tại hệ thống gồm: Mã sinh viên,
	 * Họ tên, Xếp loại Xếp loại học lực được lưu trong Enum với các giá trị: A, B,
	 * C, D, E, F - Tìm danh sách sinh viên từng đạt loại A trong năm 2021. - Tìm
	 * danh sách sinh viên đã tham gia học lại môn cấu trúc dữ liệu trong năm 2021.
	 */
	public static void main(String[] args) {
		Student[] students = { new Student(102, "Nam", Rank.C), new Student(103, "Bảo", Rank.F),
				new Student(104, "Hoàng", Rank.D), new Student(105, "Nguyên", Rank.B),
				new Student(107, "Vũ", Rank.F), new Student(109, "Lan", Rank.A), new Student(202, "Đạt", Rank.C),
				new Student(103, "Bảo", Rank.F), new Student(107, "Vũ", Rank.C),
				new Student(104, "Hoàng", Rank.B) };

		System.out.println("danh sách sinh viên từng đạt loại A trong năm 2021: ");
		for (Student student : getStudents(students)) {
			System.out.println(student);
		}
		System.out.println("====================");

		System.out.println("danh sách sinh viên đã tham gia học lại môn cấu trúc dữ liệu trong năm 2021: ");
		for (Student student : getStudentsToStudyAgain(students)) {
			System.out.println(student);
		}

	}

	public static Student[] getStudents(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for (Student student : students) {
			if (student.getRank() == Rank.A) {
				result[count] = student;
				count++;
			}
		}

		return Arrays.copyOfRange(result, 0, count);
	}

	public static Student[] getStudentsToStudyAgain(Student[] students) {

		boolean[] flags = new boolean[students.length];

		for (int studentIndex = 0; studentIndex < students.length; studentIndex++) {
			if (flags[studentIndex])
				continue;
			for (int i = 0; i < students.length; i++) {
				if (studentIndex != i && students[studentIndex].getStudentId() == students[i].getStudentId()) {
					flags[studentIndex] = true;
					flags[i] = true;
				}
			}
		}
		Student[] result = new Student[students.length];
		int count = 0;
		for (int i = 0; i < flags.length; i++) {
			if (flags[i]) {
				result[count++] = students[i];
			}
		}

		return Arrays.copyOfRange(result, 0, count);
	}
}
