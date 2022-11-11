package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		String[] str = new String[] { "-2", "special", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b",
				"xx" };
		System.out.println("Initial : " + Arrays.toString(str));
		Arrays.sort(str, Comparator.nullsLast(Comparator.comparing(o -> o)));
		String[] s1 = new String[str.length];
		String[] s2 = new String[str.length];
		String[] s3 = new String[str.length];
		int i = 0, j = 0, k = 0;
		for (String s : str) {
			if (s == null)
				continue;
			if (s == "Special" || s == "special") {
				s1[i++] = s;
			}
			if (s.matches("\\d+") || s.matches("-\\d+")) {
				s2[j++] = s;
			}
			if (s.matches("[a-zA-Z]+") && (!s.equals("Special")) && (!s.equals("special"))) {
				s3[k++] = s;
			}
		}
		s1 = Arrays.copyOfRange(s1, 0, i);
		s2 = Arrays.copyOfRange(s2, 0, j);
		s3 = Arrays.copyOfRange(s3, 0, k);

		Arrays.sort(s1);
		Arrays.sort(s3);

		int[] s2_int = new int[s2.length];
		for (int index = 0; index < s2_int.length; index++) {
			s2_int[index] = Integer.parseInt(s2[index]);
		}
		Arrays.sort(s2_int);
		
		for (int index = 0; index < i; index++) {
			str[index] = s1[index];
		}
		for (int index = 0; index < j; index++) {
			str[i + index] = (s2_int[index] + "");
		}
		for (int index = 0; index < k; index++) {
			str[i + j + index] = s3[index];
		}
		System.out.println("Filtered : " + Arrays.toString(str));
	}
}
