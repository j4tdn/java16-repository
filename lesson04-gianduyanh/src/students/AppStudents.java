package students;

import java.util.Iterator;
import java.util.Scanner;

public class AppStudents {
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		Students students[] = null;
		int  n = 0;
		System.out.println("Nhap so luong sinh vien can khai bao");
		n = sc.nextInt();
		students = new Students[n];
		for( int i = 0 ; i < n ; i ++) {
			System.out.println("Sinh vien thu" + ( i + 1) + ": ");
			students[i] = new Students();
			InputStudents(students[i]);
		}
		System.out.printf("%6s %8s %20s %10s %10s \n","Mã Sinh Viên","H�? tên","�?iểm lý thuyết","�?iểm thực hành","�?iểm trung bình");
		for (int i = 0; i < n; i++) {
            students[i].output();
            
        }
		for( int i = 0 ; i < n ; i ++) {
			students[i].findStudentTheoreTicalPointOut85();
			students[i].findStudentTheorythanPracTice();
		}
		
		
		
		
	}
	
	public static void InputStudents(Students infor) {
		System.out.println("Nhập mã số sinh viên");
		infor.setStudentcode(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhập h�? tên sinh viên");
		infor.setName(sc.nextLine());
		System.out.println("Nhap diem ly thuyet");
		infor.setTheoreticalpoint(sc.nextFloat());
		System.out.println("Nhap diem thuc hanh");
		infor.setPracticepoint(sc.nextFloat());
		
		}
	
}
