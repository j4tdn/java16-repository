package work;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex04 {

	public static void main(String[] args) {
		String[] strings = { "-2 ", "-6", "-10", null, "4", "8", null, "#", "a", "b", "c", "xx" };
		Arrays.sort(strings, Comparator.nullsLast(Comparator.comparing(o -> o)));
		System.out.println("cach nay khong phai luc nao cung dung : " + Arrays.toString(strings));
		sortStringUp(strings);
		sortStringDown(strings);
	}
	private static void sortStringDown(String[] intput) {
		List<String> da = Arrays.asList(intput);

		da.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1 == null) {
					return -1;
				}
				if (o2 == null) {
					return 1;
				}
				
				return o2.compareTo(o1);
			}

		});
		System.out.println("Down   : " + da);
	}
	private static void sortStringUp(String[] intput) {
		List<String> da = Arrays.asList(intput);

		da.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1 == null) {
					return 1;
				}
				if (o2 == null) {
					return -1;
				}
				
				return o1.compareTo(o2);
			}

		});
		System.out.println("Up     : " + da);
	}

}
