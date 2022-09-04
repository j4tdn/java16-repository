package Ex01;

import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {

		Info sv1 = new Info(123, "TruongMinhHai", 9, 9);
		Info sv2 = new Info(234, "NguyenVanTuan", 8, 7);
		Info sv3 = new Info();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Id of student 3: ");
		sv3.setIdStudent(sc.nextInt());
		System.out.println("Enter fullname of student 3");
		sv3.setFullName(sc.next());
		System.out.println("Enter Theoretical Point of student 3");
		sv3.setTheoreticalPoint(sc.nextFloat());
		System.out.println("Enter Practice Point of student 3");
		sv3.setPracticePoint(sc.nextFloat());

		Info[] infor = { sv1, sv2, sv3 };
		System.out.println("List of student have score > 8.5");

		StudentUtil.pointOfStudent(infor);

		System.out.println("List of student have score TH> LT");

		StudentUtil.compare(infor);

	}

}
