package sorting.object.type;

import java.util.Arrays;

import common.NullOption;
import utils.ArrayUtils;

public class Ex01BubbleSortWithString {
	

	public static void main(String[] args) {
		String[] data = { "a1", "c3", "b2", "f5", "d4" };
		bubbleSort(data);
		ArrayUtils.printf("data", data);

		System.out.println("============");
		data = new String[] { null, "a1", "c3", "b2", null, "f5", "d4", null };
		bubbleSort(data, NullOption.NULL_LAST);
		ArrayUtils.printf("data", data);
	}

	// null last; null first
	// handle NULL value
	// NULL first -> ASC, DESC
	// NULL last  -> ASC, DESC
	// require: NULL First, ASC
	// Project 2 jobs
	// 1. Handle sort for null value --> first, last
	// 2. others will not be null --> sort by asc, desc
	private static void bubbleSort(String[] elements, NullOption no) {
		// Array has N elements --> has N rounds
		// each round --> find max, min in each round
		// ASC
		for (int round = 0; round < elements.length; round++) {
			for (int i = 0; i < elements.length - round - 1; i++) {
				String s1 = elements[i];
				String s2 = elements[i+ 1];
				// step 1 --> handle null values --> null first
				if (NullOption.NULL_FIRST.equals(no)) {
					// expected ==> null null null ... others ...
					// pre(NULL) , next(NULL || !NULL) --> no-swap
					// pre(!NULL), next(NULL) --> swap
					if (s1 == null) {
						continue;
					}
					// sure s1(!null)
					if (s2 == null) {
						String temp = elements[i];
						elements[i] = elements[i+1];
						elements[i+1] = temp;
						continue;
					}
					// sure s1(!null) s2(!null)
				} else if (NullOption.NULL_LAST.equals(no)) {
					// expected ==> ... others ... null null null
					// pre(NULL), next(!NULL) --> swap
					// pre(!NULL), next(NULL) --> no-swap
					if (s1 == null && s2 != null) {
						String temp = elements[i];
						elements[i] = elements[i+1];
						elements[i+1] = temp;
						continue;
					}
					// sure --> s1(!null)
					if (s2 == null) {
						continue;
					}
				}
				// step 2: --> handle non-null values --> ASC
				// if (elements[i] > elements[i + 1] )
				// if (elements[i] - elements[i + 1] > 0)

				// elements[i].compareTo(elements[i + 1] = x
				// x > 0 ==> pre > next --> asc
				// x < 0 ==> pre < next --> desc
				if (s1.compareTo(s2) > 0) {
					
					// swap
					String temp = elements[i];
					elements[i] = elements[i+1];
					elements[i+1] = temp;
				}
			}
		}
	}

// not handle null value
	private static void bubbleSort(String[] elements) {
		// Array has N elements --> has N rounds
		// each round --> find max, min in each round
		// ASC
		for (int round = 0; round < elements.length; round++) {
			for (int i = 0; i < elements.length - round - 1; i++) {
				// if (elements[i] > elements[i + 1] )
				// if (elements[i] - elements[i + 1] > 0)

				// elements[i].compareTo(elements[i + 1] = x
				// x > 0 ==> pre > next --> asc
				// x < 0 ==> pre < next --> desc
				if (elements[i].compareTo(elements[i + 1]) > 0) {
					// swap
					String temp = elements[i];
					elements[i] = elements[i + 1];
					elements[i + 1] = temp;
				}
			}
		}
	}

}
