package student.management;

public class StudentDemo {
	public static void main(String[] args) {
		Student sv1 = new Student(1, "Tran Nhat Minh", 9.5f, 8.2f);
		Student sv2 = new Student(2, "Tran Thi Ngoc Tram", 8.5f, 9.2f);
		Student sv3 = new Student();
		StudentUtils.setStudent(sv3);

		Student[] students = { sv1, sv2, sv3 };

		StudentUtils.isA(students);

		StudentUtils.isTheoPointbiggerthanPracPoint(students);
	}
}
