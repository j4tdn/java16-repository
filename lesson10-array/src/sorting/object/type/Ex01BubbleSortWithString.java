package sorting.object.type;

import common.NullOption;
import utils.ArrayUtils;

public class Ex01BubbleSortWithString {

	

	public static void main(String[] args) {
		String[] data = { "a1", "c3", "b2", "f5", "d4" };
		bubbleSort(data);
		ArrayUtils.prinf("data", data);
		System.out.println("===============");
		data = new String[] { null, "a1", "c3", null, "b2", "f5", "d4", null };
		bubbleSort(data, NullOption.NULL_LAST);
		ArrayUtils.prinf("data", data);
	}

	// null last, null first
	// handle NULL values
	// NULL first --> ASC, DESC
	// NULL last --> ASC, DESC
	private static void bubbleSort(String[] elements, NullOption no) {
		// Array has N elements --> N round
		// Each round --> find max, min(asc/desc) per round

		// Loop left -> right
		// if (a[left]>a[right]) --> swap --> ASC
		// if (a[left]<a[right]) --> swap --> DESC
		// Process 2 jobs
		// 1.Handle sort for null values --> first, last
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length - i - 1; j++) {
				String s1 = elements[j]; // pre
				String s2 = elements[j + 1]; // next
				// step 1 --> handle null values --> null first
				if (NullOption.NULL_FIRST.equals(no)) {
					// pre(NULL), next(NULL || ! NULL) --> no-swap
					// pre(!NULL), next(NULL) --> swap
					if (s1 == null) {
						continue;
					}
					if (s2 == null) {
						String tmp = elements[j];
						elements[j] = elements[j + 1];
						elements[j + 1] = tmp;
						continue;
					}

				} else if (NullOption.NULL_LAST.equals(no)) {
					// pre(NULL), next( ! NULL) --> swap
					// pre(!NULL), next(NULL || !NULL) --> no-swap
					if (s1 == null && s2 != null) {
						String tmp = elements[j];
						elements[j] = elements[j + 1];
						elements[j + 1] = tmp;
						continue;
					}
					if (s2 == null) {
						continue;
					}
				}
				// step 2 --> handle non-null values --> ASC
//				if (elements[j] > elements[j + 1]) 
//				if (elements[j] - elements[j + 1])
				// elements[i].compareTo(elements[j + 1]) = x)
				// x > 0 ==> pre > next -->asc
				// x < 0 ==> pre < next -->desc
				if (s1.compareTo(s2) > 0) {
					// swap
					String tmp = elements[j];
					elements[j] = elements[j + 1];
					elements[j + 1] = tmp;
				}
			}
		}
	}

	// sorting ascending
	// not handle
	private static void bubbleSort(String[] elements) {
		// Array has N elements --> N round
		// Each round --> find max, min(asc/desc) per round

		// Loop left -> right
		// if (a[left]>a[right]) --> swap --> ASC
		// if (a[left]<a[right]) --> swap --> DESC
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length - i - 1; j++) {
//				if (elements[j] > elements[j + 1]) 
//				if (elements[j] - elements[j + 1])
				// elements[i].compareTo(elements[j + 1]) = x)
				// x > 0 ==> pre > next -->asc
				// x < 0 ==> pre < next -->desc
				if (elements[j].compareTo(elements[j + 1]) < 0) {
					// swap
					String tmp = elements[j];
					elements[j] = elements[j + 1];
					elements[j + 1] = tmp;
				}
			}
		}
	}
}
