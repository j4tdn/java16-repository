package view;

import java.util.Arrays;
import java.util.Comparator;

public class Ex04 {

	private static final int UP = -1;
	private static final int DOWN = 1;

	public static void main(String[] args) {
		String[] strings = { "-2", "-6", "10", null, "4", "6", null, "Special", "a", "c", "b", "xx" };
		sortArr(strings, DOWN);
		System.out.println("DOWN : " + Arrays.toString(strings));

		sortArr(strings, UP);
		System.out.println("UP :   " + Arrays.toString(strings));
	}

	private static void sortArr(String[] strings, int sorttype) {
		Arrays.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// sort type
				// null
				if (o1 == null && o2 != null)
					return -1 * sorttype;
				if (o2 == null && o1 != null)
					return 1 * sorttype;
				if (o2 == null && o1 == null)
					return 0 * sorttype;
				// special
				if ("Special".equals(o1) && !"Special".equals(o2))
					return 1 * sorttype;
				if (!"Special".equals(o1) && "Special".equals(o2))
					return -1 * sorttype;
				if ("Special".equals(o1) && "Special".equals(o2))
					return 0 * sorttype;
				// string + number
				if (o1.matches("-?\\d+") && !o2.matches("-?\\d+"))
					return 1 * sorttype;
				if (!o1.matches("-?\\d+") && o2.matches("-?\\d+"))
					return -1 * sorttype;
				// string
				if (o1.matches("-?\\d+") && o2.matches("-?\\d+")) {
					return Integer.compare(Integer.parseInt(o2), Integer.parseInt(o1)) * sorttype;
				}
				// number
				if (!o1.matches("-?\\d+") && !o2.matches("-?\\d+")) {
					return o2.compareTo(o1) * sorttype;
				}
				return o1.compareTo(o2) * sorttype;
			}
		});
	}
}