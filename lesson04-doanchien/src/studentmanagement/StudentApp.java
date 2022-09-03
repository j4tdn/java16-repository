package studentmanagement;

import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] std = new Student[3];
		Student sv1 = new Student(1 ,"Chien",7.0f,8.0f);
		System.out.println(sv1);
		Student sv2 = new Student(1,"Duc", 8.5f, 9.0f);
		System.out.println(sv2);
		Student sv3 = new Student();
		std[3].setId(3);
		System.out.println("Enter name of sv3: ");
		std[3].setFullname(sc.nextLine());
		System.out.println("Enter point theory of sv3: ");
		std[3].setPointTheory(sc.nextFloat());
		System.out.println("Enter point practice of sv3" );
		std[3].setPointPractice(sc.nextFloat());
		StudentFeatures.findGoodStudent(std);
		StudentFeatures.findStudentTheoryHigherThanPractice(std);
		
		sc.close();
		
	}
}
