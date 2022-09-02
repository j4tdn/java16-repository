package exercise01_StudentManagement;

import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] students = new Student[3];
		students[0] = new Student(1, "Bill", 7.5f, 9.6f);
		students[1] = new Student(1, "Jasmine", 9.6f, 9.9f);
		students[2] = new Student();
		students[2].setId(3);
		System.out.print("Enter name of student 3: ");
		students[2].setName(sc.nextLine());
		System.out.print("Enter theory mark of student 3: ");
		students[2].setMarkTheory(sc.nextFloat());
		System.out.print("Enter practice mark of student 3: ");
		students[2].setMarkPractice((float) sc.nextDouble());
		StudentUtil.findGoodStudent(students);
		StudentUtil.findStudentTheoryHigherThanPractice(students);
		
		sc.close();
	}
}
