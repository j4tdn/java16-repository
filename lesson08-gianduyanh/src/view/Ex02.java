package view;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		String s = "gian duy anh";
	    if (onlyLetter(s) ) {
			System.out.println("Nhap dung");
		}
	    else {
			System.out.println("Nhap lai");
		}
	    String[] da = s.split(" ");
	    
	    System.out.println("=====cau 2=======");
		upperFirst(da);
		
		
		System.out.println(" ===== cau 3 =====");
		String s1 = "gian       duy    anh";
		s1 = s1.replaceAll("\\s+", " ");
		
		Arrays.asList(s1).forEach(a -> System.out.print(a));
	}
	private static boolean onlyLetter (String s) {
		if(s.matches("[a-zA-Z\s]+")){
		     System.out.println("string only contains letters");
		     return true;
		}
		return false;
	}
	
	private static void upperFirst (String[] s) {
		//Arrays.asList(s).forEach(a -> System.out.println(a));
		for (String string : s) {
		    String s1 = string.substring(0, 1).toUpperCase();
		    System.out.println(s1 + string.substring(1, string.length()));
		    
			
		}
		
	}

}
