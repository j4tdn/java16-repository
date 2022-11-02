package sorting.object.type;

import common.NullOption;
import utils.ArrayUtils;

public class Ex01BubbleSortWithString {
	//enumchuwas biên giá trị hằng số

	public static void main(String[] args) {
		String[] data = {"a1", "b2", "c3", "d4", "f5" };
		bubbleSort(data);
		ArrayUtils.printf("data", data);
		
		System.out.println("-----------------------");
		data = new String[] {null, "a1", "c3", null, "b2", "f5", "d4", null};
		bubbleSort(data, NullOption.NULL_LAST);
		ArrayUtils.printf("data: ",  data);
		
		
		
	}
	//null last, null first
	//handle Null values
	// Null first ==> ASC,DESC
	// Null last ==> ASC,DESC
	//require: Null first, ACS	
	
	private static void bubbleSort(String[] elements, NullOption no) {
		//array has N element  --> n round
		//each round --> find max, min(asc/desc) per round
		// Process 2 jobs
		//1. Handle sort Null values --> first, last
		//2. Other will not be null --> sort by ASC || DESC
		for(int round = 0; round < elements.length; round++) {
			for(int i = 0; i < elements.length - round -1; i++) {
				String s1 = elements[i];
				String s2 = elements[i + 1];
				//Step1: Handle null values --> null first
				if(NullOption.NULL_FIRST.equals(no)) {
					//expected ==> null, null, null, ...others..
					//pre(null), next(null || not null) ==> no swap
					//pre(not null), next(null) ==> swap
					if(s1 == null) {
						continue;
					}
					// sure s1 != null
					if(s2 == null) {
						String tmp = elements[i];
						elements[i] = elements[i+1];
						elements[i+1] = tmp;
						continue;
					}
					
					// sure s1 != null and s2 != null
					
				}else if(NullOption.NULL_LAST.equals(no)){
					//expected ==> ...others..., null, null, null
					//pre(null), next(not null) ==> swap
					//pre(not null), next(null || != null) ==> no swap
					if(s1 == null && s2 != null) {
						String tmp = elements[i];
						elements[i] = elements[i+1];
						elements[i+1] = tmp;
						continue;
					}
					// sure s1 != null
					if(s2 == null) {
						continue;
					}
				}
				
				//Step 2 --> handle non-null values --> ASC
				// if(elements[i] > elements[i + 1]
				//if(elements[i] - elements[i + 1	] > 0
				
			//elements[i].compareTo(elements[i+1]) =x
				// x > 0 ==> pre > next --> asc
				// x < 0 ==> pre < next --> desc
			
				//String implement Comparable<String>
				if(s1.compareTo(s2) > 0) {
					String tmp = elements[i];
					elements[i] = elements[i+1];
					elements[i+1] = tmp;
				}
					
			}
		}
		
	}
	
	
	
	
	
	//sorting ascending
	// not handle Null values
	private static void bubbleSort(String[] elements) {
		//array has N element  --> n round
		//each round --> find max, min(asc/desc) per round
		for(int round = 0; round < elements.length; round++) {
			for(int i = 0; i < elements.length - round -1; i++) {
			//elements[i].compareTo(elements[i+1]) =x
				// x > 0 ==> pre > next --> asc
				// x < 0 ==> pre < next --> desc
			
				if(elements[i].compareTo(elements[i+1]) < 0) {
					String tmp = elements[i];
					elements[i] = elements[i+1];
					elements[i+1] = tmp;
				}
					
			}
		}
		
	}
	
	

}
