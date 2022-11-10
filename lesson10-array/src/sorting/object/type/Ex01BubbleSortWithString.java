package sorting.object.type;

import utils.ArrayUtils;

public class Ex01BubbleSortWithString {
	private enum NullOption {
		NULL_FIRST, NULL_LAST

	}

	public static void main(String[] args) {
		String[] data = { "a1", "c2", "b3", "f4", "d5" };
		bubbleSort(data);
		ArrayUtils.printf("data", data);

		System.out.println("======================");
		data = new String[] { null, "a1", "c3", null, "b2", "f5", null };
		bubbleSort(data, NullOption.NULL_LAST);
		ArrayUtils.printf("data", data);
	}

	// null last, null first
	// handle NULL values
	// NULL FIRST --> ASC, DESC
	// NULL LAST --> ASC, DESC
	// require --> NULL first, ASC
	private static void bubbleSort(String[] elements, NullOption no) {
		// Array has N elements -----> N rounds
		// Each round -----> find max, min(asc/desc) per pound

		// Loop left --> right
		// if (a[left] > a[right]) --> swap --> ASC
		// if (a[left] < a[right]) --> swap --> DESC

		// Process 2 jobs:
		// 1. Handle sort for NULL values --> first, last
		// 2. Others will not be null --> sort by ASC, DESC
		for (int round = 0; round < elements.length; round++) {
			for (int i = 0; i < elements.length - round - 1; i++) {
				String s1 = elements[i]; // previous
				String s2 = elements[i + 1]; // next

				if (NullOption.NULL_FIRST.equals(no)) {
					// expected: null, null, null, others...
					// pre(NULL), next(!NULL || NULL) --> no swap
					// pre(!NULL), next(NULL) --> swap
					if (s1 == null) {
						continue;
					}
					// sure --> s1 != null
					if (s2 == null) {
						String tmp = elements[i];
						elements[i] = elements[i + 1];
						elements[i + 1] = tmp;
						continue;
					}
					// sure --> (s1!=null && s2 != null)
				} else if (NullOption.NULL_LAST.equals(no)) {
					// expected: ...others..., null, null, null
					// pre(NULL), next(!NULL || NULL) --> swap
					// pre(!NULL), next(NULL) --> no swap
					if (s1 == null && s2 != null) {
						String tmp = elements[i];
						elements[i] = elements[i + 1];
						elements[i + 1] = tmp;
						continue;
					}
					// sure --> s1 != null
					if (s2 == null) {
						continue;
					}
				}

				// if (elements[i]) > elements[i+1]
				// if (elements[i]) - elements[i+1] > 0

				// elements[i].compareTo(elements[i + 1]) = x
				// x > 0 ==> pre > next ---> asc
				// x < 0 ==> pre < next ---> desc
				// step 2
				if (s1.compareTo(s2) > 0) {
					// swap ==> ASC
					// i: previous
					// i+1: next
					String tmp = elements[i];
					elements[i] = elements[i + 1];
					elements[i + 1] = tmp;
				}
			}
		}
	}

	// sorting ascending
	// not handle NULL VALUES
	private static void bubbleSort(String[] elements) {
		// Array has N elements -----> N rounds
		// Each round -----> find max, min(asc/desc) per pound

		// Loop left --> right
		// if (a[left] > a[right]) --> swap --> ASC
		// if (a[left] < a[right]) --> swap --> DESC
		for (int round = 0; round < elements.length; round++) {
			for (int i = 0; i < elements.length - round - 1; i++) {
				// if (elements[i]) > elements[i+1]
				// if (elements[i]) - elements[i+1] > 0

				// elements[i].compareTo(elements[i + 1]) = x
				// x > 0 ==> pre > next ---> asc
				// x < 0 ==> pre < next ---> desc
				if (elements[i].compareTo(elements[i + 1]) > 0) {
					// swap ==> ASC
					// i: previous
					// i+1: next
					String tmp = elements[i];
					elements[i] = elements[i + 1];
					elements[i + 1] = tmp;
				}
			}
		}
	}
}
