package sorting.object.type;

import common.NullOption;
import utils.ArrayUtils;

public class Ex01BubbleSortWithString {

	public static void main(String[] args) {
		String[] data = { "a1", "c3", "b2", "f5", "d4" };
		bubbleSort(data);
		ArrayUtils.printf("date", data);

		System.out.println("==========");
		data = new String[] { null, "a1", "c3", "b2", "f5", null, "d4", null };
		bubbleSort(data, NullOption.NULL_FIRST);
		ArrayUtils.printf("date", data);
	}

	// null last,null first
	// handle null value
	// NULL_FIRST ==> ascending,descending
	// NULL_LAST ==> ascending,descending
	// Require: Null First,ascending
	private static void bubbleSort(String[] elements, NullOption no) {
		// Array has N element --> N rounds
		// Each round --> find max,min(asc,desc) per round

		// Loop left --> right
		// if(a[left] > a[right] --> swap --> ASC
		// if(a[left] < a[right] --> swap --> DESC

		// process 2 jobs
		// 1. Handle sort for null values -->first,last
		// 2. others will not be null --> sort by asc,desc
		for (int row = 0; row < elements.length; row++) {
			for (int i = 0; i < elements.length - row - 1; i++) {
				String s1 = elements[i]; // pre
				String s2 = elements[i + 1]; // next
				// Step1: handle for null values --> null first
				if (NullOption.NULL_FIRST.equals(no)) {
					// expected ==> Null.Null.Null,...,others(not null)
					// pre(NULL),next(NULL||!=Null)--> no swap
					// pre(!NULL),next(NULL) --> swap
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
					//sure --> s1!=null,s2!=null
					
				} else if (NullOption.NULL_LAST.equals(no)) {
					// expected ==> others(not null),....,Null.Null.Null,
					// pre(NULL),next(!=Null)--> swap
					// pre(!NULL),next(!=NULL || NULL) --> no swap
					if(s1 == null && s2 != null) {
						String tmp = elements[i];
						elements[i] = elements[i + 1];
						elements[i + 1] = tmp;
						continue;
					}
					//sure --> != null
					if(s2 == null) {
						continue;
					}
				}

				// Step2: Handle for not null values
				// if (element[column] > element[column + 1])
				// if (element[column] - element[column + 1] > 0)

				// element[i].compareTo(element[i+1]) = x
				// x > 0 if pre > next --> asc
				// x < 0 if pre < next --> desc
				if (s1.compareTo(s2) > 0) {
					// swap==> ASC
					// i : previous
					// i+1 : next
					String tmp = elements[i];
					elements[i] = elements[i + 1];
					elements[i + 1] = tmp;
				}
			}
		}
	}

	// sorting ascending
	// unhandle null values
	private static void bubbleSort(String[] element) {
		// Array has N element --> N rounds
		// Each round --> find max,min(asc,desc) per round

		// Loop left --> right
		// if(a[left] > a[right] --> swap --> ASC
		// if(a[left] < a[right] --> swap --> DESC
		for (int row = 0; row < element.length; row++) {
			for (int i = 0; i < element.length - row - 1; i++) {
				// if (element[column] > element[column + 1])
				// if (element[column] - element[column + 1] > 0)

				// element[i].compareTo(element[i+1]) = x
				// x > 0 if pre > next --> asc
				// x < 0 if pre < next --> desc
				if (element[i].compareTo(element[i + 1]) > 0) {
					// swap==> ASC
					// i : previous
					// i+1 : next
					String tmp = element[i];
					element[i] = element[i + 1];
					element[i + 1] = tmp;
				}
			}
		}
	}

}