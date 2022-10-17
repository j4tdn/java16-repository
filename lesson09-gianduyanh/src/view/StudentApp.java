package view;

import java.util.Arrays;

import bean.Rank;
import bean.Student;

public class StudentApp {
	
	public static void main(String[] args) {
		System.out.println("Student Grade A ");
		Arrays.asList(allStudent()).stream().filter(o -> o.rank == o.rank.A).forEach(o -> System.out.println(o));
		System.out.println("=============================");
		System.out.println("Student Grade F ");
		Arrays.asList(allStudent()).stream().filter(o -> o.rank == o.rank.F).forEach(o -> System.out.println(o));
		
		
	}
	
	private static Student[] allStudent() {
		return new Student[] {
				new Student(1, "GDA", Rank.A),
				new Student(2, "B1T", Rank.A),
				new Student(3, "PTK", Rank.F),
				new Student(4, "Quyen", Rank.B),
				new Student(5, "Hoang", Rank.C),
				new Student(6, "Nhu", Rank.F),
				new Student(7, "Nhung", Rank.F),
				new Student(8, "Vy", Rank.F),
				
		};
	}

}
