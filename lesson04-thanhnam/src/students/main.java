package students;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		student sv1 = new student(3007, "Na", 9, 9);
		student sv2 = new student(0000, "Nam", 7, 8);
		student sv3 = new student();
		
		System.out.println("Enter information student 3: ");
		System.out.print("Enter ID: ");
		sv3.setId(Integer.parseInt(sc.nextLine()));
		System.out.print("Enter name: ");
		sv3.setName(sc.nextLine());
		System.out.print("Enter score TH: ");
		sv3.setScoreTH(sc.nextFloat());
		System.out.print("Enter score LT: ");
		sv3.setScoreLT(sc.nextFloat());
		
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
		
		student[] infor = {sv1, sv2, sv3} ;
		System.out.println("List of student have score > 8.5");
		for(student in : infor) {
			function.list(in); 
		}
		
		System.out.println("List of student have score LT > TH");
		for(student in : infor) {
			function.find(in); 
		}
	}
}
	


