package sorting.object.type;

import common.NullOption;
import utils.ArrayUtils;

public class Ex01BubbleSortWithString {
	public static void main(String[] args) {
		String[] data = new String[] { "a", "c", "b", "f", "d" };
		bubbleSort(data);
		ArrayUtils.printf("digits", data);

		System.out.println("=================");
		data = new String[] { null, "a1", "c3", null, "b2", "f5", "d4", null };
		bubbleSort(data, NullOption.NULL_LAST);
		ArrayUtils.printf("String", data);
	}

	// null first, null last
	// handle NULL values
	// NULL FIRST ==> ASC, DESC
	// NULL LAST ==> ASC, DESC
	private static void bubbleSort(String[] elements, NullOption no) {
		for (int round = elements.length - 1; round >= 1; round--) {
			for (int i = 0; i < round; i++) {
				// step 1 --> handle null values --> null first
				if (NullOption.NULL_FIRST.equals(no)) {
					// Expected: null null null ..Other..
					if (elements[i] == null) {
						continue;
					} else if (elements[i + 1] == null) {
						swap(elements, i, i + 1);
						continue;
					}
				} else if (NullOption.NULL_LAST.equals(no)) {
					// Expected: ..Other.. null null null
					if (elements[i] == null) {
						swap(elements, i, i + 1);
						continue;
					} else if (elements[i + 1] == null) {
						continue;
					}
				}
				// step 2 --> handle non Null values -> ASC
				// elements[i].compareTo(elements[i + 1]) = x
				// x > 0 ==> pre > next --> asc
				// x < 0 ==> pre < next --> desc
				if (elements[i].compareTo(elements[i + 1]) > 0) {
					swap(elements, i, i + 1);
				}
			}
		}
	}

	// Unhandle NULL value
	private static void bubbleSort(String[] elements) {
		for (int round = elements.length - 1; round >= 1; round--) {
			for (int i = 0; i < round; i++) {
				// elements[i].compareTo(elements[i + 1]) = x
				// x > 0 ==> pre > next --> asc
				// x < 0 ==> pre < next --> desc
				// String implements Comparable<String>
				if (elements[i].compareTo(elements[i + 1]) > 0) {
					swap(elements, i, i + 1);
				}
			}
		}
	}

	private static void swap(String[] elements, int i, int j) {
		String temp = elements[i];
		elements[i] = elements[j];
		elements[j] = temp;
	}
}
