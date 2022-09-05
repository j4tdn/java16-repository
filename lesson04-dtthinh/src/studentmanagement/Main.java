package studentmanagement;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Student sv1 = new Student(101,"Nguyễn Văn A", 9.2f, 6f);
		Student sv2 = new Student(102,"Trần Văn B", 8.6f, 9f);
		Student sv3 = new Student();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ID Student: ");
		sv3.setId(Integer.parseInt(sc.nextLine()));
		System.out.println("Name of Student: ");
		sv3.setName(sc.nextLine());
		System.out.println("Theoritical Point: ");
		sv3.setTheoriticalPoint(Float.parseFloat(sc.nextLine()));
		System.out.println("Practice Point: ");
		sv3.setPracticePoint(Float.parseFloat(sc.nextLine()));
		
		System.out.println("List of students: ");
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
		
		System.out.println("=======================================================================");
		Student[] students = {sv1, sv2, sv3};
		System.out.println("List of students with GPA greater than 8.5: ");
		StudentUtil.GPA(students);
		
		System.out.println("=======================================================================");
		System.out.println("Danh sách sinh viên có điểm LT lớn hơn điểm TH: ");
		StudentUtil.theoGreaterThanPrac(students);
	}
}
