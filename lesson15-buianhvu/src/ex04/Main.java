package ex04;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Student> students = readStudentsFromFile("student.txt");
		Collections.sort(students);
		for (Student student : students) {
			System.out.println(student);
		}
	}

	public static List<Student> readStudentsFromFile(String fileName) {
		List<Student> students = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] parts = line.split(", ");
				int id = Integer.parseInt(parts[0]);
				String name = parts[1];
				double gpa = Double.parseDouble(parts[2]);
				String gender = parts[3];
				students.add(new Student(id, name, gpa, gender));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return students;
	}
}
