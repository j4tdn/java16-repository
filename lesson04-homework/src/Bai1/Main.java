package Bai1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Students[] student = new Students[3];
		student [0] = new Students(1, "Trung", 7.5f, 9.6f);
		student [1] = new Students(2, "Dũng", 9.6f, 9.9f);
		student [2] = new Students();
		System.out.println("Nhập ID: ");
		student [2].setId(sc.nextInt());
		System.out.print("Nhập tên sinh viên thứ 3: ");
		student [2].setName(sc.next());
		System.out.print("Nhập điểm lý thuyết của sinh viên thứ 3: ");
		student [2].setMarksTheory(sc.nextFloat());
		System.out.print("Nhập điểm thực hành của sinh viên thứ 3: ");
		student [2].setMarksPractice((float) sc.nextDouble());
		Students st = new Students();
		System.out.println("Thông tin sinh viên có điểm trung bình lớn hơn 8.5: ");
		Util.averageOverEight(student);
		System.out.println("Thông tin sinh viên có điểm thực hành lớn hơn điểm lý thuyết:");
		Util.practiceThanTheory(student);
	}
}
