package ex01Student;

import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {
		Student sinhvien1 = new Student(01, "Huynh Tan Phat", 7.5f, 8.5f);
		Student sinhvien2 = new Student(02, "Tran Dac Dung", 8.5f, 6.5f);
		Student sinhvien3 = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập mã sinh viên: ");
		sinhvien3.setStudentId(sc.nextInt());
		sc.nextLine();
		System.out.print("Nhập họ tên sinh viên: ");
		sinhvien3.setStudentName(sc.nextLine());
		System.out.print("Nhập điểm lý thuyết: ");
		sinhvien3.setTheoryPoint(sc.nextFloat());
		System.out.print("Nhập điểm thực hành: ");
		sinhvien3.setPracticePoint(sc.nextFloat());
		System.out.println(sinhvien1.toString());
		System.out.println(sinhvien2.toString());
		System.out.println(sinhvien3.toString());
		Student[] list = { sinhvien1, sinhvien2, sinhvien3 };
		isAvengare(list);
		isBiggerLT(list);
	}

	public static void isAvengare(Student[] list) {
		System.out.println("=== Danh sach sinh vien co diem trung binh > 8.5 ===");
		for (Student i : list) {
			if (i.averagePoint() > 8.5f)
				System.out.println(i.getStudentName());
		}
	}
	public static void isBiggerLT(Student[] list) {
		System.out.println("=== Danh sach sinh vien co diem LT > TH ===");
		for (Student i : list) {
			if (i.getTheoryPoint() > i.getPracticePoint())
				System.out.println(i.getStudentName());
		}
	}

}
