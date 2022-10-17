package exam;

import bean.Student;

public class Ex01 {
	public static void main(String[] args) {
		
	}
	private static void printStudents(Student[] listStudents) {
		for (Student student : listStudents)
			System.out.println(student);
	}
	private static Student[] getAllStudents() {
		Student[] listStudents = { new Student(102, "Nam","C"), new Student(103, "Bảo", "F"),
				new Student(104, "Hoàng", "D"), new Student(105, "Nguyên", "B"),
				new Student(107, "Vũ", "F"), new Student(109, "Lan", "A"),
				new Student(202, "Đạt","C"), new Student(103, "Bảo","F"),
				new Student(107, "Vũ", "C"), new Student(104, "Hoàng","B"), };
		return listStudents;
	}
	private static void type(Student[] students) {
		for (Student st : students) {
			if (st.getScore().equals("A")) {
				System.out.println(st.getName());
			}
		}

	}
	private static void restudy(Student[] students) {
		for (Student st : students) {
			if (st.getScore().equals("F")) {
				System.out.print(st.getName() + " ");
			}
		}
	}

}
