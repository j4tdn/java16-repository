package immutable;

import java.util.Iterator;

public class Ex03Coding {
	public static void main(String[] args) {
//		String s = "Java15";
//		String s1 = "Course"; 
//		System.out.println("chieu dai s " + s.length());
//		System.out.println("ki tu thu 3 " + s.charAt(3));
//		System.out.println(s + "" +s1);
//		for (int i = 0; i < s.length(); i++) {
//			System.out.println(s.charAt(i));
//			
//		}
//		System.out.println("indexOf " + s.indexOf("a"));
//		
//		String s = "today is good day";
//		String s1 ="day";
//		System.out.println(s.startsWith(s1));
//		System.out.println(s.endsWith(s1));
//		s1 = "good";
//		String s2 ="great";
//		s = s.replace(s1, s2);
//		System.out.println(s);
//		
//		String s3 = "hope    you      have a great working   day";
//		s3 = s3.replaceAll("\\s+"," ");
//		System.out.println(s3);
//		//4
//		s2 = s.substring(2, 8); 
//		System.out.println("s2 = " +s2 );
//		s1= "day";
//		System.out.println(s1.contains(s2));
		
		String s = "123337292333";
		
		System.out.println(count(s));
		
		int uptocase = (int)s.chars().filter(s1 ->Character.isUpperCase(s1)).count();
		int lowticase =(int)s.chars().filter(s1 ->Character.isLowerCase(s1)).count();
		int special = s.length() - uptocase - lowticase;
		
	
		System.out.println(uptocase);
		
	}
	private static ObjectCharator count(String s) {
		int NumberOfUptower = 0;
		int NumberOflowtower = 0;
		int isDdigit = 0;	
		char[] letters = s.toCharArray();
		for (char letter :  letters) {
			if(Character.isUpperCase(letter)) {
				NumberOfUptower++;
				System.out.println(NumberOfUptower);
				continue;
			}
			if(Character.isLowerCase(letter)) {
				NumberOflowtower++;
				System.out.println(NumberOflowtower);
				continue;
			}
			if(Character.isDigit(letter)) {
				isDdigit++;
				System.out.print(isDdigit);
			}
			
		}
		return new ObjectCharator(NumberOfUptower, NumberOflowtower, isDdigit);				
	}
	
//	private static void countVer2(String s) {
//		int numberUpto = (int)(Character.isUpperCase(s)) -> {}
//	}
}
