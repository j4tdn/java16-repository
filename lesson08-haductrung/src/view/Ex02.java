package view;

import java.util.Arrays;

public class Ex02 {
	
	public static void main(String[] args) {
		String name= "ha duc trung";
		if(name.matches("[a-zA-Z\s]+")) {
			 System.out.println("valid");
		}else {
			System.out.println("enter again ");
		}
		
	   
	    System.out.println("=======2=======");
	    capital(name);
	    
		System.out.println("=======3=======");
		String s1 = "ha       duc    trung";
		s1 = s1.replaceAll("\\s+", " ");
		
		Arrays.asList(s1).forEach(a -> System.out.print(a));

	}
	private static void capital (String s) {
		String[] da = s.split(" ");;
		for (String string : da) {
		    String da1 = string.substring(0, 1).toUpperCase();
		    System.out.println(da1 + string.substring(1, string.length()));
	
		}

}
}