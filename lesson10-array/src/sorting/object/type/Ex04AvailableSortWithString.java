package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;

import ultis.ArraysUtils2;

public class Ex04AvailableSortWithString {
	public static void main(String[] args) {
		String[] sequences = {"a1", "c3", "d4","b2","e5"};
		//1.sort sequences asc
		Arrays.sort(sequences);
		ArraysUtils2.printf("Sequences: ", sequences);
		//2.sort sequences desc
		//Comaparator :sort asc/desc - handle null/non-null values
		Arrays.sort(sequences, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});
		ArraysUtils2.printf("2.Sequences desc: ", sequences);
		//3.sort sequences with NULL_FIRST
		sequences = new String[]{null,"a1", "c3",null, "d4","b2","e5",null};
		Arrays.sort(sequences, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if(s1 == null && s2 != null) {
					return -1;
				}
				if(s2 == null) {
					return 1;
				}
				return s2.compareTo(s1);
			}
		});
		ArraysUtils2.printf("2.Sequences asc and NULL_FIRST: ", sequences);
	}

}
