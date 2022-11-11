package sorting.object.type;

import common.NullOption;
import utils.ArrayUtils;

public class Ex01BubbleSortWithString {
	
	public static void main(String[] args) {
		String[] data = { "a1", "c3", "b2", "f5", "d4" };
		bubbleSort(data);
		ArrayUtils.printf("data", data);

		System.out.println("===============");

		data = new String[] { null, "a1", "c3", null, "b2", "f5", "d4", null };
		bubbleSort(data, NullOption.NULL_FISRT);
		ArrayUtils.printf("data", data);
	}

	// null last, null first
	// handle NULL values
	// NULL_FISRT --> ASC, DESC
	// NULL_LAST  --> ASC, DESC
	// require: NULL first, ASC
	// process 2 jobs
	// 1. handle sort for null values --> first, last
	// 2. others will not be null --> sort by asc, desc
	private static void bubbleSort(String[] elements, NullOption no) {
		// step 1 --> handle for null values
		
		// step 2 --> handle for not-null values
		// Array has N elements --> N round
		// Each round --> find max, min(asc/desc) per round

		// Loop left --> right
		// if (a[left] > a[right] --> swap --> ASC
		// if (a[left] < a[right] --> swap --> DESC
		for (int round = 0; round < elements.length; round++) {
			for (int i = 0; i < elements.length - round - 1; i++) {
				String s1 = elements[i];
				String s2 = elements[i + 1];
				
				if (NullOption.NULL_FISRT.equals(no)) {
					// expected ==> null null null ...others...
					if (s1 == null) {
						continue;
					}
					// sure --> s1(!null)
					if (s2 == null) {
						String tmp = elements[i];
						elements[i] = elements[i + 1];
						elements[i + 1] = tmp;
						continue;
					}
				}
				else if (NullOption.NULL_LAST.equals(no)) {
					// expected ==> ...others... nul nul nul
					if (s1 == null && s2 != null) {
						String tmp = elements[i];
						elements[i] = elements[i + 1];
						elements[i + 1] = tmp;
						continue;
					}
					// sure --> s1(!null)
					if (s2 == null) {
						continue;
					}
				}
				// elements[i].compareTo(elements[i + 1]) > 0 = x
				// x > 0: pre > next --> asc
				// x < 0: pre < next --> desc
				// String implements Comparable<String>
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
	// not-handle NULL values
	private static void bubbleSort(String[] elements) {
		// Array has N elements --> N round
		// Each round --> find max, min(asc/desc) per round

		// Loop left --> right
		// if (a[left] > a[right] --> swap --> ASC
		// if (a[left] < a[right] --> swap --> DESC
		for (int round = 0; round < elements.length; round++) {
			for (int i = 0; i < elements.length - round - 1; i++) {

				// elements[i].compareTo(elements[i + 1]) > 0 = x
				// x > 0: pre > next --> asc
				// x < 0: pre < next --> desc
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
