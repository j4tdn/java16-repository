package ex01_managementstudent;

import java.util.Scanner;

public class StudentUtil {
	public static void input(Student sv) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Input id student: ");
		sv.setIdStudent(ip.nextInt());
		ip.nextLine();
		System.out.println("Input full name: ");
		sv.setFullName(ip.nextLine());
		
		String tp=""; 
		do
		{
			System.out.println("Input theoretical point: ");
			tp=ip.next();
		}
		while(!checkNumber(tp));
		sv.settheoPoint(Float.parseFloat(tp));	
		
		String pt="";
		do
		{
			System.out.println("Input practice point: ");
			pt=ip.next();
		}
		while(!checkNumber(pt));
		sv.setPracPoints(Float.parseFloat(pt));
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
		return (sv.gettheoPoint() > sv.getPracPoints());
	}
}
