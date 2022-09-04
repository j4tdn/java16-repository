package ex01student;

import java.util.Scanner;


public class Ex01Student {
	public static void main(String[] args) {
		
		Student sv1 = new Student(101,"Nguyễn Văn A",8,7);
		System.out.println(sv1);
		Student sv2 = new Student(102,"Trần Văn B",6,9);
		System.out.println(sv2);
		
		Student sv3 = new Student();
		Scanner sr = new Scanner(System.in);
		
		System.out.print("Enter id sv3: ");
		int msv = sr.nextInt();
		sr.nextLine();
		sv3.setId(msv);
		
		System.out.print("Enter fullname sv3: ");
		String fullName	 = sr.nextLine();
		sv3.setName(fullName);
		
		System.out.print("Enter theory piont sv3: ");
		float lt = sr.nextFloat();
		sv3.setTheoryPoint(lt);
		
		System.out.print("Enter practice piont sv3: ");
		float th = sr.nextFloat();
		sv3.setPracticePiont(th);
		System.out.println(sv3);
		
		Student[] students = { sv1, sv2, sv3};
		
		System.out.println("Student have core > 8.5: ");
		Ulitity.pointOfStudent(students);
		
		System.out.println("Student have theorypoint better pracrice point: ");
		Ulitity.compare(students);
	}
		
	
}

