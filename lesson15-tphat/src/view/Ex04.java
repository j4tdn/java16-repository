package view;

import java.io.File;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import bean.Student;
import modal.DataModal;

public class Ex04 {
	private static final String path = "student.txt";

	public static void main(String[] args) {
		File file = new File(path);
		List<Student> students = DataModal.getStudents();
		students.forEach(System.out::println);
		System.out.println("1. Sắp xếp danh sách sinh viên tăng dần theo ĐTB. Nếu DTB bằng nhau sắp xếp\r\n"
				+ "		// tăng dần theo họ tên.");
		students.stream().sorted(Comparator.comparing(Student::getGpa).thenComparing(Student::getName))
				.collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("Viết hàm tìm kiếm danh sách sinh viên có ĐTB > 8");
		students.stream().filter(gpa -> gpa.getGpa() > 8).collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("Viết hàm tìm kiếm toàn bộ các sinh viên NỮ");
		students.stream().filter(gender -> gender.getGender().equals("Nu")).collect(Collectors.toList())
				.forEach(System.out::println);

		System.out.println("Tìm kiếm sinh viên chỉ xuất hiện một lần trong student.txt. Biết rằng 2\r\n"
				+ "		// sinh viên được phân biệt với nhau thông qua MSSV");
		students.stream().filter(id -> {
			int count = 0;
			for (Student student : students) {
				if (id.getId().equals(student.getId())) {
					count++;
				}
			}
			return count == 1;
		}).collect(Collectors.toList()).forEach(System.out::println);
	}

}
