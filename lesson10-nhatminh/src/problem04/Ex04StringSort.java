package problem04;

import java.util.Arrays;
import java.util.Comparator;

public class Ex04StringSort {
	public static void main(String[] args) {
		String[] strings = { "-2", "-6", "10", null, "Special", "4", "8", null, "Special", "a", "c", "b", "xx" };
		sortString(strings, OrderOption.ASC);
		System.out.println(Arrays.toString(strings));
	}

	private static void sortString(String[] strList, OrderOption orderOption) {
		if (strList.length == 0 || strList.length == 1)
			return;
		// Sort String
		Arrays.sort(strList, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1 == "Special")
					return -1;
				if (o1 == null)
					return 1;
				if (o2 == "Special")
					return 1;
				if (o2 == null)
					return -1;
				return o1.compareTo(o2);
			}
		});
		// [Special, Special, -2, -6, 10, 4, 8, a, b, c, xx, null, null]
		// Sort Number
		int first = 0, last = 0;
		for (int i = 0; i < strList.length; i++)
			if (strList[i] != null && strList[i].matches("-?\\d+")) {
				first = i;
				break;
			}
		for (int i = strList.length - 1; i >= 0; i--)
			if (strList[i] != null && strList[i].matches("-?\\d+")) {
				last = i;
				break;
			}
		if (first < last) {
			int[] numList = new int[last - first + 1];
			for (int i = first, k = 0; i <= last; i++)
				numList[k++] = Integer.parseInt(strList[i]);
			Arrays.sort(numList);
			for (int i = first, k = 0; i <= last; k++, i++)
				strList[i] = Integer.toString(numList[k]);
		}
		// ASC or DESC
		if (orderOption == OrderOption.DESC)
			for (int i = 0; i < strList.length / 2; i++)
				swap(strList, i, strList.length - 1 - i);
	}

	private static void swap(String[] strList, int i, int j) {
		String temp = strList[i];
		strList[i] = strList[j];
		strList[j] = temp;
	}
}

enum OrderOption {
	ASC, DESC;
}
