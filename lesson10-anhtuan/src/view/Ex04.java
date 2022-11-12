package view;

import java.util.Arrays;
import java.util.Comparator;

public class Ex04 {
	
	public static void main(String[] args) {
		String[] strings = {"-2","-6", "10", null, "4", "8", null, "Special", "a", "c","b", "xx"};
		
		Arrays.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				
				if(s1 == null) {
					return 1;
				}if(s1 != null) {
					if(s2 == null) {
						return -1;
					}if(s2 == "Special") {
						return 1;
					}
				}
				

				if(s1.matches("\\d+") && s2.matches("\\d+")) {
					return Integer.compare(Integer.parseInt(s1), Integer.parseInt(s2));
				}
				
				
				return s1.compareTo(s2);
				
			}
		});
		System.out.println("asc " +Arrays.toString(strings));
		
		
	}
	
	
	

}
