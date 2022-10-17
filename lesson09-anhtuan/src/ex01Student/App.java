package ex01Student;



public class App {
	
	public static void main(String[] args) {
		
		Enum<e> A = e.A;
		Enum<e> B = e.B;
		Enum<e> C = e.C;
		Enum<e> D = e.D;
		Enum<e> F = e.F;
		
		
		Student[] students = {
				new Student(102, "Nam", C),
				new Student(103, "Bảo", F),
				new Student(104, "Hoàng", D),
				new Student(105, "Nguyên", B),
				new Student(107, "Vũ", F),
				new Student(109, "Lan", A),
				new Student(202, "Đạt", C),
				new Student(103, "Bảo", F),
				new Student(107, "Vũ", C),
				new Student(104, "Hoàng", B)
				
		};
		studentA(students);
		System.out.println("=================");
		studentF(students);
	}
	private static void studentA(Student[] students) {
		for(Student s:students) {
			if(s.getEn().equals(e.A)) {
				System.out.println(s.toString());
			}
		}
	}
	private static void studentF(Student[] students) {
		for(Student s:students) {
			if(s.getEn().equals(e.F)) {
				System.out.println(s.toString());
			}
		}
	}
	
}
	


