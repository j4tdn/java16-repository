package ex01.view;

import java.util.Scanner;

import ex01.bean.Student;

public class StudentDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] students = new Student[3];
		students[0] = new Student(1, "phuoc thien", 7.5f, 9.6f);
		students[1] = new Student(2, "duc linh", 9.6f, 9.9f);
		students[2] = new Student();
		students[2].setId(3);
		System.out.print("Enter name of student 3: ");
		students[2].setName(sc.nextLine());
		System.out.print("Enter theory mark of student 3: ");
		students[2].setMarkTheory(sc.nextFloat());
		System.out.print("Enter practice mark of student 3: ");
		students[2].setMarkPractice(sc.nextFloat());
		System.out.println("List of good students:");
		findGood(students);
		System.out.println("List of students with theory mark higher than practice mark:");
		findStudentTheoryHigherThanPractice(students);
		sc.close();
	}

	

	public static void findGood(Student[] students) {
		for(Student student:students) {
			if ((student.avg()) >= 8.5)
				System.out.println(student);
		}
	}
	public static void findStudentTheoryHigherThanPractice(Student[] students) {
		for(Student student:students) {
			if ((student.getMarkTheory()) > student.getMarkPractice())
				System.out.println(student);
		}
	}
	
}
