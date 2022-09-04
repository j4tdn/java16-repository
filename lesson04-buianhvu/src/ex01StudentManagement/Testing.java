package ex01StudentManagement;

import java.util.Scanner;

public class Testing {
	public static void main(String[] args) {
		Student st1 = new Student(102210141, "Bui Anh Vu", 7.8f, 8.0f);
		Student st2 = new Student(102210004, "Vo The Dat", 9.2f, 9.5f);
		Student st3 = new Student();

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter student's ID: ");
			st3.setId(sc.nextInt());
			System.out.println("\n--------------------------------------------------");

			System.out.println("Enter student's name: ");
			st3.setName(sc.next());
			System.out.println("\n--------------------------------------------------");

			System.out.println("Enter student's Theory Score: ");
			st3.setTheoScore(sc.nextFloat());
			System.out.println("\n--------------------------------------------------");

			System.out.println("Enter student's Practice Score: ");
			st3.setPractScore(sc.nextFloat());
		}
		System.out.println("\n--------------------------------------------------");

		Student[] student = { st1, st2, st3 };

		System.out.println("Students have Average Score > 8.5 are: ");
		StudentUtils.goodStudent(student);
		System.out.println("\n--------------------------------------------------");

		System.out.println("Students have Practice Score > Theory Score are: ");
		StudentUtils.theoryMoreThanPractice(student);
		System.out.println("\n--------------------------------------------------");
	}
}
