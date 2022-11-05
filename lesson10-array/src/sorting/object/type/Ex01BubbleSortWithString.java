package sorting.object.type;

import common.NullOption;
import utils.ArrayUtils;

public class Ex01BubbleSortWithString {
	
	public static void main(String[] args) {
		String[] data = {"a1", "c3", "b2", "f5", "d4"};
				
		bubbleSortAscending(data);
		ArrayUtils.printf("Bubble Sort Ascending with string un-handle null values", data);
	
		System.out.println("=====================");
		data = new String[] {null, "a1", "c3", null, "b2", "f5", "d4", null};
		bubbleSortAscending(data,NullOption.NULL_LAST);
		ArrayUtils.printf("Bubble Sort Ascending with string handle null values", data);
	}
	
	//sorting ascending
	//un-handle NULL values
	private static void bubbleSortAscending(String[] elements) {
		for (int round = 0; round < elements.length; round++) {
			for (int i = 0; i < elements.length - round - 1; i++) {				
				//x > 0 --> asc
				//x < 0 --> desc
				if (elements[i].compareTo(elements[i+1]) < 0) {
					String temp = elements[i];
					elements[i] = elements[i+1];
					elements[i+1] = temp;
				}
			}
		}
	}

	//null last, null first
	//handle NULL values
	//NULL first ==> ASC, DESC
	//NULL last	 ==> ASC, DESC
	//require: NULL first, ASC
	private static void bubbleSortAscending(String[] elements, NullOption no) {
		//process 2 jobs:
		//	1. Handle sort for null values --> first, last
		//	2. Others will not be null --> sort by asc, desc
		for (int round = 0; round < elements.length; round++) {
			for (int i = 0; i < elements.length - round - 1; i++) {						
				String s1 = elements[i]; //pre
				String s2 = elements[i+1]; //next
				//step 1 --> handle null values --> null first
				if (NullOption.NULL_FIRST.equals(no)) {
					//expected ==> null null null ... others ...
					//pre (NULL), next(NULL || !NULL) --> no-swap
					//pre (!NULL), next(NULL) --> swap
					if (s1 == null) {
						continue;
					}
					// sure --> s1(!NULL)
					if (s2 == null) {
						String temp = elements[i];
						elements[i] = elements[i+1];
						elements[i+1] = temp;
						continue;
					}
					
				} else {
					//expected ==> ... others ... null null null
					//pre (NULL), next(!NULL) --> swap
					//pre (!NULL), next(NULL || !NULL) --> no-swap
					if (s1 == null && s2 != null) {
						String temp = elements[i];
						elements[i] = elements[i+1];
						elements[i+1] = temp;
						continue;
					}
					// sure --> s1(!NULL)
					if (s2 == null) {
						continue;
					}
				}
					//x > 0 --> asc
				//x < 0 --> desc
				if (elements[i].compareTo(elements[i+1]) < 0) {
					String temp = elements[i];
					elements[i] = elements[i+1];
					elements[i+1] = temp;
				}
			}
		}
	}
}
