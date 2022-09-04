package Ex01ManagementStudent;

import java.util.Scanner;

public class StudentUtil {
	public static void input(Student sv) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter id student: ");
		sv.setIdStudent(ip.nextInt());
		ip.nextLine();
		System.out.println("Enter full name: ");
		sv.setFullName(ip.nextLine());
		
		String tp=""; 
		do
		{
			System.out.println("Enter theoretical point: ");
			tp=ip.next();
		}
		while(!checkNumber(tp));
		sv.settheoryPoint(Float.parseFloat(tp));	
		
		String pp="";
		do
		{
			System.out.println("Enter practice point: ");
			pp=ip.next();
		}
		while(!checkNumber(pp));
		sv.setpracticePoints(Float.parseFloat(pp));
	}
	
	public static boolean checkNumber(String s) {
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) < '0'|| s.charAt(i) > '9') {
				if(s.charAt(i) != '.')
					return false;
			}
		}
		return true;
	}
	

	
	public static boolean average(Student sv) {
		return (sv.averageScore() > 8.5);	
	}
	
	public static boolean theoGreaterPrac(Student sv) {
		return (sv.gettheoryPoint() > sv.getpracticePoints());
	}
}
