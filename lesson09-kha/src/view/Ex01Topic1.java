package view;

import java.util.Arrays;

import bean.Rank;
import bean.Student;

public class Ex01Topic1 {
	public static void main(String[] args) {
		Student[] students = new Student[] {
				new Student(102, "Nam", Rank.C),
				new Student(103, "Bảo", Rank.F),
				new Student(104, "Hoàng", Rank.D),
				new Student(105, "Nguyên", Rank.B),
				new Student(107, "Vũ", Rank.F),
				new Student(109, "Lan", Rank.A),
				new Student(202, "Đạt", Rank.C),
				new Student(103, "Bảo", Rank.F),
				new Student(107, "Vũ", Rank.C),
				new Student(104, "Hoàng", Rank.B)
		};
		System.out.println("Học sinh đạt loại A");
		System.out.println(Arrays.toString(getStudentsWithRank(students, Rank.A)));
		
		System.out.println("Học sinh Học lại");
		System.out.println(Arrays.toString(getStudentsWithRank(students, Rank.F)));
	}
	
	private static Object[] getStudentsWithRank(Student[] listStudents, Rank rank) {
		return Arrays.asList(listStudents).stream().filter(o->o.getRank() == rank).toArray();
	}
}
