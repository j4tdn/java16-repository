package student;

import java.util.Scanner;

public class Manage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Information sv1 = new Information(3007, "Dung", 9, 9);
		Information sv2 = new Information(0000, "Phat", 7, 8);
		Information sv3 = new Information();
		
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
		
		Information[] infor = {sv1, sv2, sv3} ;
		System.out.println("List of student have score > 8.5");
		for(Information in : infor) {
			Utils.list(in); 
		}
		
		System.out.println("List of student have score LT > TH");
		for(Information in : infor) {
			Utils.find(in); 
		}
	}

}
