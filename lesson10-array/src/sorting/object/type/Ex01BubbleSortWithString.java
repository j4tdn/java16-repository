package sorting.object.type;

import utils.ArrayUtils;

public class Ex01BubbleSortWithString {
	private enum NullOption{
		NULL_FIRST,
		NULL_LAST
	}
	public static void main(String[] args) {
		String[] data= {"a1","C","b2","F","D"};
		bubbleSort(data);
		ArrayUtils.printf("data", data);
		
		System.out.println("======================");
		data = new String[] {null,"a1","C",null,"b2","F","D",null};
	}
	// null last null first

	private static void bubbleSort(String[] elements) {
		// Array has N elements -->N rounds
		// each round--> find max, min(asc/desc) per round

		// loop left --> right
		// if(a[left]>a[right]--> swap-->ASC
		// if(a[left]<a[right]--> swap-->DESC

		for (int round = 0; round < elements.length; round++) {
			for (int i = 0; i < elements.length - round - 1; i++) {
				Strint s1 = elements
				if (NullOption.NULL_FIRST.equals(no)) {
					// swapt
					// i: previous
					// i+1: next
					if(s1==null) {
						continue;
					}if(s2==nul) {
						String tmp=elements[i];
						elements[i]=elements[i+1];
						elements[i+1]=tmp;
						continue;
					}
				}elsse(if(NullOption.NULL_LAST.equals(so)) {
					if(s1==null && s2!=null) {
						String tmp=elements[i];
						elements[i]=elements[i+1];
						elements[i+1]=tmp;
						continue;s
						
					}
				}
			}
		}
	}
	private static void bubbleSort(String[] elements) {
		// Array has N elements -->N rounds
		// each round--> find max, min(asc/desc) per round

		// loop left --> right
		// if(a[left]>a[right]--> swap-->ASC
		// if(a[left]<a[right]--> swap-->DESC

		for (int round = 0; round < elements.length; round++) {
			for (int i = 0; i < elements.length - round - 1; i++) {
				if (elements[i].compareTo(elements[i + 1]) > 0) {
					// swapt
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
