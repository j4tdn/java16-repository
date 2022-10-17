package view;

import java.util.Iterator;

public class Ex05 {
	public static void main(String[] args) {
		String s1 = "ABCEDEABC";
		String s2 = "ABCEDEABC";
		listDataEqual(s1, s2);
		
	}

	private static String listDataEqual(String s1, String s2) {
	  for(int i  =  s1.length() ; i > 0  ; i --) {
		  for(int j = 0; j < s1.length()   ; j ++) {
			  if((i + j ) > s1.length()) {
				  break;
			  }
			  String dataequal = s1.substring( j , i + j);
			  System.out.println(dataequal);
			  if(s2.contains(dataequal)) {
				  return dataequal;
			  }
		  }
	  }
	  return "";
	}
	
	
	

}
