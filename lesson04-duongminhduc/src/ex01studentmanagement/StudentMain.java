package ex01studentmanagement;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Student[] std = new Student[3];
		Scanner sc = new Scanner(System.in);
		 std[0] = new Student(112, "DuongMinhDuc", 9.0f, 8.9f);
		
		 std[1] = new Student(113, "NhatSang", 7.9f, 5.3f);
		
		std[2] = new Student();
		std[2].setId(113);
		System.out.print("Enter name of student 3: ");
		std[2].setName(sc.nextLine());
		System.out.print("Enter theory mark of student 3: ");
		std[2].setPointTheory(sc.nextFloat());
		System.out.print("Enter practice mark of student 3: ");
		std[2].setPointPractice(sc.nextFloat());
		System.out.println("------------STUDENT LIST-------------");
		System.out.println(std[2]);
		System.out.println(std[0]);
		System.out.println(std[1]);
	
		System.out.println("=====================================");
		StudentUtil.findStudent(std);
		System.out.println("=====================================");
		StudentUtil.findStudentTheoryHigherThanPractice(std);
		
		sc.close();
		
		
	}
}
