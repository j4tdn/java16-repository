package ex01StudentManagement;

import java.util.Scanner;

public class Mainnn {
	public static void main(String[] args) {
		Student st1 = new Student(1235,"Phan Anh Tuan", 5.2f, 9.5f);
		Student st2 = new Student(1246,"Ha Duc Trung", 8.2f, 9.1f);
		Student st3 = new Student();
		
		try (Scanner ip = new Scanner(System.in)) {
			
			System.out.println("nhap ma sinh vien ");
			st3.setStudentcode(Integer.parseInt(ip.nextLine())); 
			
			System.out.println("nhap ho ten sinh vien ");
			st3.setFullname(ip.nextLine());
			
			System.out.println("nhap diem li thuyet ");
			st3.setTheoreticalpoint(ip.nextFloat());
			
			System.out.println("nhap diem thuc hanh ");
			st3.setPracticepoint(ip.nextFloat());
		}
		
		
		
		
		Student [] students = {st1, st2, st3};
		System.out.println("Danh sach sinh vien co diem trung binh hon 8.5");
		GpaPoint(students);
		System.out.println("Danh sach sinh vien co diem li thuyet hon diem trung binh");
		theoryBetterPractice(students);
	}
	
	
	private static void GpaPoint(Student...students) {
		for(Student s: students) {
			if(Ultility.sum(s) > 8.5f) {
				System.out.println(s.toString());
			}
		}
	}
	
	
	private static void theoryBetterPractice(Student...students) {
		for(Student s : students) {
			if(s.getTheoreticalpoint() > s.getPracticepoint()) {
				System.out.println(s.toString());
			}
		}
	}
	

}
