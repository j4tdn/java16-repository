package view;

public class Ex01 {
	public static void main(String[] args) {
		Student[] students = {
			new Student(102, "Nam", "C"),
			new Student(103, "Bao", "F"),
			new Student(104, "Hoang", "D"),
			new Student(105, "Nguyen", "B"),
			new Student(107, "Vu", "C"),
			new Student(109, "Lan", "A"),
			new Student(202, "Dat", "C"),
			new Student(103, "Bao", "F"),
			new Student(107, "Vu", "C"),
			new Student(104, "Hoang","B"),
			
		};
		System.out.println(students);
		
		
	}
	private static enum XepLoai{
		A,B,C,D,E,F
	};
	
	private static void getStudent(Student student) {
		
	}

}
