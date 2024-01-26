package view;

import bean.PerSon;
import bean.Student;

public class Main {
	public static void main(String[] args) {
		String a = "acc?7??sss?3rr1??????5";
		System.out.println(QuestionsMarks(a));
		
	}

	  public static String QuestionsMarks(String str) {
		
	    for(int i=0;i<str.length();i++) {
	    	for(int j=str.length()-1;j>=0;j--) {
	    		if(i<j) {
	    			if(Character.isDigit(str.charAt(i)) &&Character.isDigit(str.charAt(j)) && Character.getNumericValue(str.charAt(i))+Character.getNumericValue(str.charAt(j)) ==10) {
	    			String	a = str.substring(i, j+1);
	    			if(iscontainmark(a)== true) {
	    				return "true";
	    			}
	    			}
	    		}
	    	}
	    }
	    return "false";
	  }
	  public static boolean iscontainmark(String str) {
		  int count =0;
		  for(int i=0;i<=str.length()-1;i++) {
			  if(str.charAt(i)=='?') {
				  count ++;
			  }
		  }
		  if(count ==3) {
			  return true;
		  }
		  else {
			return false;
		}
	  }
	
}
