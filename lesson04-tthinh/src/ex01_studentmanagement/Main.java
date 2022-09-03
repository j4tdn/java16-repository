package ex01_studentmanagement;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student sv1 = new Student(1,"Nguyễn Minh Thế Thịnh", 10, 9);
		Student sv2 = new Student(2,"Trần Quốc Thịnh", 7, 9);
		Student sv3 = new Student();
		System.out.println("Nhập vào mã sinh viên: ");
		sv3.setId(Integer.parseInt(sc.nextLine()));
		System.out.println("Nhập vào tên sinh viên: ");
		sv3.setName(sc.nextLine());
		System.out.println("Nhập vào điểm lý thuyết: ");
		sv3.setTheoreticalPoint(Float.parseFloat(sc.nextLine()));
		System.out.println("Nhập vào điểm thực hành: ");
		sv3.setPracticePoint(Float.parseFloat(sc.nextLine()));
		
		System.out.println("Danh sách sinh viên: ");
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
		
		System.out.println("=======================================================================");
		Student[] students = {sv1, sv2, sv3};
		System.out.println("Danh sách sinh viên có điểm trung bình > 8.5: ");
		StudentUtil.arr(students);
		
		System.out.println("=======================================================================");
		System.out.println("Danh sách sinh viên có điểm LT lớn hơn điểm TH: ");
		StudentUtil.theoGreaterThanPrac(students);
	}
}
