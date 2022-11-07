package sorting.object.type;

import common.NullOption;
import utils.ArrayUtils;

public class Ex01BubleSortWithString {
	public static void main(String[] args) {
		String[] data = new String[]{"a", "c", "b", "f", "d"};
		bubbleSort(data);
		
		ArrayUtils.printf("data", data);
		data = new String[]{null, "a", "c", "b", "f", "d", null};
		
		bubbleSort(data, NullOption.NULL_LAST);
		ArrayUtils.printf("data", data);
	}
	
	// null last, null first
	// handle NULL values
	// NULL first ==> ASC, DESC
	// NULL last ==> ASC, DESC
	// required: NULL first, ASC
	private static void bubbleSort(String[] elements, NullOption no) {
		// Array has N elements --> N - 1 rounds
		// Each round --> find max, min (asc/desc) per round
		
		// Process 2 jobs
		// 1. Handle sort for null values --> first, last
		// 2. others will not be null --> sort, by asc, desc
		
		for (int round = 0; round < elements.length - 1; round++) {
			for (int i = 0; i < elements.length - round - 1; i++) {
				String s1 = elements[i];
				String s2 = elements[i + 1];
				// step 1
				if (NullOption.NULL_FIRST.equals(no)) {
					// expected ==> null null null ... others ...
					// pre(NULL), next (NULL || !NULL) --> no-swap
					// pre(!NULL), next(NULL) --> swap
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
					// sure --> s1(!null) s2(!null)
				} else if (NullOption.NULL_LAST.equals(no)) {
					if (s1 == null && s2 != null) {
						String tmp = elements[i];
						elements[i] = elements[i + 1];
						elements[i + 1] = tmp;
						continue;
					}
					// sure -- s1(!null)
					if (s2 == null) {
						continue;
					}
					
				}
				
				
				// if (elements[i] < elements[i + 1]) {
				// if (elements[i] - elements[i + 1] > 0)
				
				if (elements[i].compareTo(elements[i + 1]) > 0) {
				// swap
					String tmp = elements[i];
					elements[i] = elements[i + 1];
					elements[i + 1] = tmp;
				}
			}
		}
	}
	
	// not handle NULL values
	private static void bubbleSort(String[] elements) {
		// Array has N elements --> N - 1 rounds
		// Each round --> find max, min (asc/desc) per round
		for (int round = 0; round < elements.length - 1; round++) {
			for (int i = 0; i < elements.length - round - 1; i++) {
				// if (elements[i] < elements[i + 1]) {
				// if (elements[i] - elements[i + 1] > 0)
				
				// String implement Comparable<String>
				if (elements[i].compareTo(elements[i + 1]) < 0) {
				// swap
					String tmp = elements[i];
					elements[i] = elements[i + 1];
					elements[i + 1] = tmp;
				}
			}
		}
	}
}
