package sorting.object.type;

import java.util.Arrays;

import common.NullOption;
import utils.ArrayUtils;

public class Ex01BubbleSortWithString {
	
	public static void main(String[] args) {
		String[] data = {"a1" , "c3", "b2" , "f5" , "d4"};
		bubbleSort(data);
		ArrayUtils.printf("data", data);
		
		System.out.println("=======================");
		data = new String[] {null ,"a1" , "c3",null, "b2" , "f5" , "d4" , null};
		bubbleSort(data, NullOption.NULL_FIRST);
		ArrayUtils.printf("data", data);
	}
		// null last , null first
		// Handle Null values
		// NULL first ==> ASC, DESC
		// NULL last  ==> ASC, DESC
		// require: NULL first , ASC
	private static void bubbleSort(String[] elements , NullOption no) {
		// Array has N elements --> N rounds
		// Each round --> find max , min (asc/desc) per round
		
		// Loop left --> right
		// if(a[left] > a[right]) --> swap --> ASC
		// if(a[left] < a[right]) --> swap --> DESC
		//Process 2 jobs
		// 1, Handle sort for null values --> first ,last
		// 2. Others will not be null --> sort by asc , desc 		
		for(int round = 0; round < elements.length; round ++) {
			for(int i = 0; i < elements.length - round -1; i++) {
				String s1 = elements[i]; // Pre
				String s2 = elements[i+1]; // Next
				//step 1 --> handle null values --> null first
				if(NullOption.NULL_FIRST.equals(no)) {
					// expected ==> null,......others.....
					// pre(NULL) , next (NULL || !NULL) --> no-swap
					// pre(!NULL) , next(NULL) --> swap
					if (s1 == null) {
						continue;
					}
					
					//sure --> s1(!null)
					if (s2 == null) {
						String tmp = elements[i];
						elements[i] = elements[i+1];
						elements[i+1] = tmp;
						continue;
					}
					// sure --> s1(!null) , s2(!null)
				} else if(NullOption.NULL_LAST.equals(no)) {
					if(s1 == null && s2 != null) {
						String tmp = elements[i];
						elements[i] = elements[i+1];
						elements[i+1] = tmp;
						continue;
					}
					//expected ==> ...others... null null null
					}
					if (s2 == null ) {
						continue;
				}
				//step 2 --> handle non-null values --> asc 
				//if(elements[i] > elements[i+1])
				//if(elements[i] - elements[i+1] >0)
				//if(elements[i].compareTo(elements[i+1]
				
				// x > 0 ==> pre > next
				// x < 0 ==> pre < next
				if(s1.compareTo(s2)> 0) {
					// swap ==>ASC
					// i: previous
					//i+1: next
					String tmp = elements[i];
					elements[i] = elements[i+1];
					elements[i+1] = tmp;
				}
			}
		}
	}
		// sorting ascending
		// not handle NULL values
	private static void bubbleSort(String[] elements) {
		// Array has N elements --> N rounds
		// Each round --> find max , min (asc/desc) per round
		// if(a[left] > a[right]) --> swap --> ASC
		// if(a[left] < a[right]) --> swap --> DESC
		for(int round = 0; round < elements.length; round ++) {
			for(int i = 0; i < elements.length - round -1; i++) {
				if(elements[i].compareTo(elements[i+1]) < 0) {
					// swap ==>ASC
					// i: previous
					//i+1: next
					String tmp = elements[i];
					elements[i] = elements[i+1];
					elements[i+1] = tmp;
				}
			}
		}
	}

}
