package ex01;

public class App {
	public static void main(String[] args) {
		Student[] students = { 
				new Student(102, "Nam", "C"), 
				new Student(103, "Bảo", "F"),
				new Student(104, "Hoàng", "D"), 
				new Student(105, "Nguyên", "B"), 
				new Student(107, "Vũ", "F"),
				new Student(109, "Lan", "A"), 
				new Student(202, "Đạt", "C"), 
				new Student(103, "Bảo", "F"),
				new Student(107, "Vũ", "C"), 
				new Student(104, "Hoàng", "B") 
				};
		findStudentsLevelA(students);
		System.out.println("==================");
		findStudentsLearnAgain(students);
	}
	
	private static void findStudentsLevelA(Student[] students) {
		for(Student student:students) {
			if(student.getLevel().startsWith("A")) {
				System.out.println("List students have level A in 2021: \n" + student );
			}
		}
	}
	
	private static void findStudentsLearnAgain(Student[] students) {
		System.out.println("List student learn again in 2021: ");
		for (int i = 0; i < students.length; i++) {
			for(int j = i + 1; j < students.length; j++) {
				if(students[i].getName() == students[j].getName()) {
					System.out.println( students[i]);
				}
			}
		}
	}
}
