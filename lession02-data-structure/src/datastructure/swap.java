package datastructure;

import bean.CustomerInteger;

public class swap {
	public static void main(String[] arges) {
		CustomerInteger nA = new CustomerInteger(22);
		CustomerInteger nB = new CustomerInteger(66);
		swap(nA, nB);
		System.out.println("nA " + nA);
		System.out.println("nB " + nB);
		
	}
	private static void swap(CustomerInteger first, CustomerInteger second) {
		int tmp = first.value;
		first.value = second.value;
		second.value= tmp;
	}

}
