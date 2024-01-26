package view;

import java.util.Iterator;

public class Ex03 {
public static void main(String[] args) {
	String s =    "ckahkzpikz";
	String goal = "hkzpikzcka";
	
	System.out.println(rotateString(s, goal));
	
}
public static boolean rotateString(String s, String goal) {
	int len = s.length();
	if(s.length() != goal.length()) {
		return false;
	}
	s = s.toLowerCase();
	goal = goal.toLowerCase();
	
	for(int i =0;i<s.toCharArray().length;i++) {
		for(int j=0;j <s.toCharArray().length;j++) {
			if(s.charAt(i) == goal.charAt(j)) {
				goal = goal.substring(++j ,len ) + goal.substring(0, j);
			}
		}
	}
	System.out.println(goal);
	if(s.equalsIgnoreCase(goal) == true) {
		return true;
	}
	else {
		return false;
	}
    
}
}
