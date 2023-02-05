package ex;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import bean.Student;

public class Ex05 {
	private static void getStudentsWithHighMark(List<Student> students, double mark) {
		students.stream()
		.filter(student -> student.getMark() > mark)
		.forEach(System.out::println);
	}
	
	private static void getStudentsWithCertainGender(List<Student> students, String gender) {
		students.stream()
		.filter(student -> gender.equals(student.getGender()))
		.forEach(System.out::println);
	}
	
	private static void getStudentsAppearingOnce(List<Student> students) {
		students.stream()
		.collect(Collectors.groupingBy(student -> student.getId(), Collectors.counting())) // Map<Student, Long>
		.entrySet()
		.stream()
		.filter((e) -> e.getValue() == 1)
		.forEach((e) -> {
			System.out.println(getStudentById(students, e.getKey()));
		});
	}
	
	public static Student getStudentById(List<Student> students, int id) {
		for(Student s : students) {
			if (s.getId() == id) {
				return s;
			}
		}
		return null;
	}
	
	public static void main(String[] args) throws IOException {
		String pathname = "text\\data\\students.txt";
		File file = new File(pathname);
		if (file.exists()) {
			List<String> lines = Files.readAllLines(file.toPath());
			List<Student> students = new ArrayList<Student>();
			for(String line : lines) {
				String[] lineElement = line.split(",");
				int id = Integer.parseInt(lineElement[0].trim());
				String name = lineElement[1].trim();
				double mark = Double.parseDouble(lineElement[2].trim());
				String gender = lineElement[3].trim();
				students.add(new Student(id, name, mark, gender));
			}

//			1. Sắp xếp danh sách sinh viên tăng dần theo ĐTB. Nếu DTB bằng nhau sắp xếp tăng dần
//			theo họ tên.
			System.out.println("=======================\n1. Sắp xếp danh sách sinh viên tăng dần theo ĐTB. Nếu DTB bằng nhau sắp xếp tăng dần theo họ tên.");
			students.sort(Comparator.comparing(Student::getMark).thenComparing(Student::getName));
			students.forEach(System.out::println);
			
//			2. Viết hàm tìm kiếm danh sách sinh viên có ĐTB > 8
			System.out.println("=======================\n2. Viết hàm tìm kiếm danh sách sinh viên có ĐTB > 8");
			getStudentsWithHighMark(students, 8);
			
//			3. Viết hàm tìm kiếm toàn bộ các sinh viên NỮ
			System.out.println("=======================\n3. Viết hàm tìm kiếm toàn bộ các sinh viên NỮ");
			getStudentsWithCertainGender(students, "Nu");
			
			
//			4. Tìm kiếm sinh viên chỉ xuất hiện một lần trong student.txt. Biết rằng 2 sinh viên được
//			phân biệt với nhau thông qua MSSV
			System.out.println("=======================\n4. Tìm kiếm sinh viên chỉ xuất hiện một lần trong student.txt");
			getStudentsAppearingOnce(students);
		}
		
		
	}
}
