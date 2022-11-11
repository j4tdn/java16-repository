package view;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex04SortString {
	public static void main(String[] args) {
		String[] strings = { "-2", "-6", "10", null, "4", "8", 
				null, "Special", "a", "c", "b", "xx" };
		Arrays.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if (s2 == null) {
					return -1;
				}
				if (s1 == null && s2 != null) {
					return 1;
				}

				if (s1.equals("Special")) {
					return -1;
				}
				if (s2.equals("Special")) {
					return 1;
				}
				
				if (isNumeric(s1) && isNumeric(s2)) {
					return Integer.valueOf(s1) - Integer.valueOf(s2);
				}

				return s1.compareTo(s2);
			}
		});

		ArrayUtils.printf("Tang dan:", strings);
		Collections.reverse(Arrays.asList(strings));
		ArrayUtils.printf("Giam dan:", strings);
	}

	private static boolean isNumeric(String str) {
		return str.matches("-?\\d+(\\.\\d+)?");
	}
}
