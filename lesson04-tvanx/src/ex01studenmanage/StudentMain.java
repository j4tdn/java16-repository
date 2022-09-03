package ex01studenmanage;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		Student sv1 = new Student(5742, "Tran Van Nhan", 9, 9);
		Student sv2 = new Student(5743, "Nhan Dep Trai", 9, 8);
		Student sv3 = new Student();
		nhap(sv3);

		System.out.println("Danh sách Sinh viên");
		System.out.println(sv1.toString());
		System.out.println(sv2.toString());
		System.out.println(sv3.toString());

		Student[] list = { sv1, sv2, sv3 };
		findMediumMoreThan8(list);
		findInfoSt(list);
	}

	public static void nhap(Student v3) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter Student ID: ");
		v3.setStudentId(ip.nextInt());
		ip.nextLine();
		System.out.print("Enter Full name Student: ");
		v3.setFullName(ip.nextLine());
		System.out.print("Enter Student Theory Score: ");
		v3.setTheoryPoint(ip.nextFloat());
		System.out.print("Enter Student Practice Score: ");
		v3.setPracPoint(ip.nextFloat());
	}

	public static void findMediumMoreThan8(Student[] list) {
		System.out.println("***** Danh sách sinh viên có điểm trung bình*****");
		for (Student i : list) {
			if (i.findmediumScore() > 8.5) {
				System.out.println(i.toString());
			}
		}
	}

	public static void findInfoSt(Student[] list) {
		System.out.println("*****Danh sách sinh viên có điểm LT lớn hơn điểm TH*****");
		for(Student i : list) {
			if(i.getTheoryPoint()>i.getPracPoint()) {
				System.out.println(i.toString());
			}
		}
	}
}
