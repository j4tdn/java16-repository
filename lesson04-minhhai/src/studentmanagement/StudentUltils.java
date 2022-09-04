package studentmanagement;

import java.util.Scanner;

public class StudentUltils {
	public static float avPoint(StudentDetail Student) {
		float lt = Student.getLtPoint();
		float th = Student.getThPoint();
		return (lt + th) / 2;
	}
	public static void  studentInput(StudentDetail Ip) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap ma so sinh vien: ");
		Ip.setId(ip.nextInt());
		
		System.out.println("Nhap ho va ten: ");
		Ip.setName(ip.nextLine());
		
		System.out.println("Nhap diem ly thuyet: ");
		Ip.setLtPoint(ip.nextFloat());
		
		System.out.println("Nhap diem thuc hanh: ");
		Ip.setThPoint(ip.nextFloat());
	}
	public static void isGoodPoint(StudentDetail []GP) {
		System.out.println("Sinh vien co diem trung binh > 8.5:");
		for (StudentDetail p : GP)
			if (avPoint(p) > 8.5f)
				System.out.println(p.toString());
	}
	public static void isTheoryBetter(StudentDetail []GP) {
		System.out.println("Sinh vien co diem ly thuyet lon hon thuc hanh:");
		for (StudentDetail p : GP)
			if (p.getLtPoint() > p.getThPoint())
				System.out.println(p.toString());
	}
}
