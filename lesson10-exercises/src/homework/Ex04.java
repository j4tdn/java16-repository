package homework;

import java.util.Arrays;
import java.util.Comparator;

public class Ex04 {
	public static void main(String[] args) {
		String[] arrays = { "-5", "6", "a", null, "b", "C", "ds",  "8", "h(*","$" };
		Arrays.sort(arrays, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if (s1 == null) {
					return -1;
				}
				if (s2 == null) {
					return 1;
				}
				if (s2.matches("[{~!@#$%^&*():<>?}]")) {
					return 1;
				}
				if (s1.matches("-?\\d+") && s2.matches("-?\\d+")) {
					return Integer.compare(Integer.parseInt(s1), Integer.parseInt(s2));
				}
				return s1.compareTo(s2);
			}
		});
		System.out.println(Arrays.toString(arrays));
	}

	private static void sort(String[] arrays) {
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays.length - i - 1; j++) {
				String s1 = arrays[j];
				String s2 = arrays[j+1];
				if (s1 == null) {
					continue;
				}
				if (s2 == null) {
					String temp = arrays[j];
					arrays[j] = arrays[j+1];
					arrays[j+1] = temp;
					continue;
				}
				if (s1.matches("-?\\d+") && s2.matches("-?\\d+")) {
					if (s1.compareTo(s2) < 0) {
						continue;
					}
					if (s1.compareTo(s2) > 0) {
						String temp = arrays[j];
						arrays[j] = arrays[j+1];
						arrays[j+1] = temp;
						continue;
					}
				}
			}
		}
		for(String array: arrays) {
			System.out.print(array + " ");
		}
	}
}
