package studentmanagement;

import java.util.Scanner;

public class view {
	public static void main(String[] args) {

		student st1 = new student(1, "Doan Vu Duy", 8, 9);
		Scanner ip = new Scanner(System.in);
		student st2 = new student(2, "nguyen van a", 6, 7);

		student st3 = new student();

		System.out.println("nhap id cua sinh vien 3:");
		st3.setStudentId(ip.nextInt());
		System.out.println("nhap ten cua sinh vien 3:");
		st3.setName(ip.next());
		System.out.println("nhap diem LT cua sinh vien 3:");
		st3.setTheoreticalpoint(ip.nextFloat());
		System.out.println("nhap diem TH cua sinh vien 3:");
		st3.setPracticepoints(ip.nextFloat());
		st3.mediumscore();
		st1.output();
		st2.output();
		st3.output();

	}
}
