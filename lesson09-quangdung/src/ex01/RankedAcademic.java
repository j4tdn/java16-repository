package ex01;

public class RankedAcademic extends Student {

	public static void main(String[] args) {
		
//		Classfication A = Classfication.A;
//		Classfication B = Classfication.B;
//		Classfication C = Classfication.C;
//		Classfication D = Classfication.D;
//		Classfication E = Classfication.E;
//		Classfication F = Classfication.F;
		
		Student[] students = { 
				new Student(102, "Nam", "C"), 
				new Student(104, "Hoàng", "D"),
				new Student(109, "Lan", "A"), 
				new Student(103, "Bảo", "F"), 
				new Student(105, "Nguyên", "B"),
				new Student(107, "Vũ", "F"), 
				new Student(103, "Bảo", "F"), 
				new Student(202, "Đạt", "C"),
				new Student(107, "Vũ", "C"), 
				new Student(193, "Bảo", "B"), 
				new Student(199, "Tài", "A") 
		};

		findStudentA(students);
		findStudentReStudy(students);
	}

	private static void findStudentA(Student[] students) {
		System.out.println("List of students with grade A: ");
		for (Student student : students) {
			if (student.getClassification().equals("A")) {
				System.out.println(student.toString());
			}
		}
	}

	private static void findStudentReStudy(Student[] students) {
		System.out.println("List of students re-study: ");
		String[] str = new String[15];
		int count = 0;
		boolean check = false;
		for (Student student : students) {
			if (student.getClassification().equals("F")) {
				for (int i = 0; i < str.length; ++i) {
					if (student.toString().equals(str[i])) {
						check = false;
						break;
					} else 
						check = true;
				}
				
				if (check) {
					str[count++] = student.toString();
					System.out.println(student.toString());
				}
			}
		}
	}

}
