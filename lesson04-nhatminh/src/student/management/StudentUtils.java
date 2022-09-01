package student.management;

import java.util.Scanner;

public class StudentUtils {
	public static void setStudent(Student s) {
		System.out.println("-Nhap thong tin sinh vien:");
		Scanner sc = new Scanner(System.in);

		System.out.print("\t+Nhap ID sinh vien:");
		s.setStudentId(Integer.parseInt(sc.nextLine()));

		System.out.print("\t+Nhap ho ten sinh vien:");
		s.setStudentName(sc.nextLine());

		System.out.print("\t+Nhap diem ly thuyet:");
		s.setTheoriticalPoint((float) Double.parseDouble(sc.nextLine()));

		System.out.print("\t+Nhap diem thuc hanh:");
		s.setPracticePoint((float) Double.parseDouble(sc.nextLine()));
	}

	public static void isA(Student... students) {
		System.out.println("Danh sach sinh vien AvgPoint > 8.5:");
		for (Student s : students)
			if (s.averagePoint() > 8.5f)
				System.out.println(s.toString());
	}

	public static void isTheoPointbiggerthanPracPoint(Student... students) {
		System.out.println("Danh sach sinh vien co diem LT > diem TH:");
		for (Student s : students)
			if (s.getTheoriticalPoint() > s.getPracticePoint())
				System.out.println(s.toString());
	}
}
