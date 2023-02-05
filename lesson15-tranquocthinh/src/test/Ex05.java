package test;

import java.io.File;
import java.util.Comparator;
import java.util.List;

import bean.Student;
import utils.FileUtils;

public class Ex05 {
	
	private static final String pathname = "student.txt";
	
	public static void main(String[] args) {
		File file = new File(pathname);
		List<Student> students = FileUtils.readLines(file, Student::transfer);
		
		System.out.println("========== CÂU 1 ==========");
		students.sort(Comparator.comparing(Student::getAvg).thenComparing(Student::getName));
		students.forEach(System.out::println);
		
		System.out.println("========== CÂU 2 ==========");
		students.stream()
		        .filter(s -> s.getAvg() > 8)
		        .forEach(System.out::println);
		
		System.out.println("========== CÂU 3 ==========");
		students.stream()
		        .filter(s -> "Nu".equals(s.getGender()))
		        .forEach(System.out::println);
		
		System.out.println("========== CÂU 4 ==========");
		List<Student> a = students.stream()
                .filter(s -> {
                	int count = 0;
                	for (Student student : students) {
                		if (s.getId().equals(student.getId())) {
                			count++;
                		}
                	}
                	return count == 1;
                }).toList();
		a.forEach(System.out::println);

	}
}
