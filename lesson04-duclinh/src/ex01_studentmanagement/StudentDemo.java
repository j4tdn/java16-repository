package ex01_studentmanagement;

import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		Student[] student = new Student[3];
		student[0] = new Student(1,"Huỳnh Đoàn Đức Linh", 8.3f, 7.1f);
		student[1] = new Student(2,"Nguyễn Phước Thiện", 9f, 9);
		student[2] = new Student();
		student[2].setIdStudent(3);
		System.out.println("Name : ");
		student[2].setFullName(ip.nextLine());
		System.out.println("theoryPoin: ");
		student[2].setTheoryPoint(ip.nextFloat());
		System.out.println("pacticePoint: ");
		student[2].setPacticePoint((Float)ip.nextFloat());
		
		StudentUtil.findGoodStudent(student);
		StudentUtil.findStudentTheoryBetterPractice(student);
		
		
	}
}
