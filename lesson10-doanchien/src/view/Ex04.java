package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		String[] input = {"-2","-6", "-10", null, "4", "8", null, "!@#$%^&*", "a", "b", "c", "xx"}; 
		System.out.println("input" + Arrays.toString(input));
		sortASC(input);
		sortDESC(input);
	
	}
	
	public static void sortDESC(String[] sequences) {
		List<String> sqs = Arrays.asList(sequences);
		
		sqs.sort(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if(s1 == null) {
					return -1;
				}
				if(s2 == null) {
					return 1;
				}
				if(s1.matches("-?\\d+") && s2.matches("-?\\d+")) {
					return Integer.compare(Integer.parseInt(s2), Integer.parseInt(s1));
				}
				return s2.compareTo(s1);
			}
		});
		System.out.println("sortDESC: " + sqs);
	}
	
	public static void sortASC(String[] sequences) {
		List<String> sqs = Arrays.asList(sequences);
		
		sqs.sort(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if(s1 == null) {
					return 1;
				}
				if(s2 == null) {
					return -1;
				}
				if(s1.matches("-?\\d+") && s2.matches("-?\\d+")) {
					return Integer.compare(Integer.parseInt(s2), Integer.parseInt(s1));
				}
				return s1.compareTo(s2);
			}
		});
		System.out.println("sortASC" + sqs);
	}
}
