package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex04AvailableSortWithString {
	
	public static void main(String[] args) {
		String [] sequences = {"a1","c3","b2","e5","d4"};
		
		//1. Sorting seq asc
		Arrays.sort(sequences);
		ArrayUtils.printf("sequence--> ", sequences);
		
		//2. Sorting seq dsc
	    // Comparator --> sorting asc/dsc - handle null/non-null values
		// Co
		Arrays.sort(sequences, new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
				return s2.compareTo(s1);
				
			}
		});
		ArrayUtils.printf("2. sequences dsc", sequences);
		
		// 3. Sorting seq asc and null-first
		sequences = new String[] { null,"a1","c3",null,"b2","e5","d4",null};
       Arrays.sort(sequences, new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
				//1. asc/dsc non-null values
				if(s1==null && s2!= null) {
					return -1;
					
				}
				if(s2==null) {
					return 1;
					
				}
				return 0;
				
			}
		});
       ArrayUtils.printf("3. sequences dsc", sequences);
	}

}
