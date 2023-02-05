package problem05.utils;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import problem05.bean.Student;

public class StudentUtils {
	private StudentUtils() {
	}

	public static List<Student> getStudentList(String pathname) {
		List<Student> result = new ArrayList<>();
		File file = new File(pathname);
		Path path = file.toPath();
		if (file.exists())
			result = FileUtils.readFile(path, Student::transfer);
		else
			System.out.println("File is not existed!");
		return result;
	}

	public static List<Student> getSortedStudentList(List<Student> students) {
		List<Student> result = students.stream()
				.sorted(Comparator.comparing(Student::getGpa).thenComparing(Student::getName))
				.collect(Collectors.toList());
		return result;
	}

	public static List<Student> getMoreThan8GpaStudents(List<Student> students) {
		List<Student> result = students.stream().filter(student -> student.getGpa() > 8.0).collect(Collectors.toList());
		return result;
	}

	public static List<Student> getFemaleStudents(List<Student> students) {
		List<Student> result = students.stream().filter(student -> "Nu".equals(student.getGender()))
				.collect(Collectors.toList());
		return result;
	}

	public static List<Student> getNotDuplicatedStudents(List<Student> students) {
		Map<String, List<Student>> counterList = students.stream().collect(Collectors.groupingBy(Student::getId));
		List<Student> result = counterList.entrySet().stream().filter(item -> item.getValue().size() == 1)
				.flatMap(item -> item.getValue().stream()).collect(Collectors.toList());
		return result;
	}
}
