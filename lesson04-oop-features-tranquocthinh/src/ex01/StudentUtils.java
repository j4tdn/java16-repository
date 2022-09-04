package ex01;

import java.util.Scanner;

public class StudentUtils {
	public static Student inputStudent() {
		Scanner sc = new Scanner(System.in);
		Student sv = new Student();
		System.out.println("Enter id: ");
		sv.setId(Integer.valueOf(sc.nextLine()));
		System.out.println("Enter name: ");
		sv.setName(sc.nextLine());
		do {
			System.out.println("Enter theoreticalPoint: ");
			sv.setTheoreticalPoint(Float.valueOf(sc.nextLine()));
			System.out.println("Enter practicePoints: ");
			sv.setPracticePoints(Float.valueOf(sc.nextLine()));
		} while(sv.getTheoreticalPoint()>10 || sv.getTheoreticalPoint()<0 || sv.getPracticePoints()>10 || sv.getPracticePoints()<0);
		return sv;
	}

	public static void GPAHigherThan85(Student[] sv) {
		for (Student st : sv) {
			if (st.mediumScore() > 8.5) {
				System.out.println(st);
			}
		}
	}

	public static void theoreticalPointThanPracticePoints(Student[] sv) {
		for (Student st : sv) {
			if (st.getTheoreticalPoint() > st.getPracticePoints()) {
				System.out.println(st);
			}
		}
	}

}
