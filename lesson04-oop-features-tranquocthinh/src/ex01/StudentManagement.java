package ex01;

public class StudentManagement {
	public static void main(String[] args) {
		Student sv1 = new Student(1, "Trần Quốc Thịnh", 9.9f, 9.89f);
		System.out.println(sv1);
		System.out.println("==========================================================");
		
		Student sv2 = new Student(2, "Nguyễn Công Phượng", 8.89f, 7.98f);
		System.out.println(sv2);
		System.out.println("==========================================================");
		
		Student sv3 = new Student();
		sv3 = StudentUtils.inputStudent();
		System.out.println(sv3);
		System.out.println("==========================================================");
		
		System.out.println("SV có điểm trung bình lớn hơn 8.5 là: ");
		Student[] sv = {sv1, sv2, sv3};
		StudentUtils.GPAHigherThan85(sv);
		System.out.println("==========================================================");
		
		System.out.println("SV có điểm lý thuyết cao hơn điểm thực hành là: ");
		StudentUtils.theoreticalPointThanPracticePoints(sv);


	}

}
