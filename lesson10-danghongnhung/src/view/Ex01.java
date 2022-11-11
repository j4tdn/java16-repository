package view;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 1, 2, 5, 6, 7, 8, 8, 6};
		System.out.println("Numbers: "+ Arrays.toString(numbers));
		System.out.println("=================================");
		System.out.println("Remove duplicate elements: ");
		removeDuplicate(numbers);
		System.out.println("=================================");
		int[] num1= Arrays.copyOfRange(numbers, 0, numbers.length/2);
		int[] num2 = Arrays.copyOfRange(numbers,  numbers.length/2,  numbers.length);
		if(average(num1) > average(num2)) {
			System.out.println("the mean of the first n/2 elements is greater than the last n/2 elements");
			}
		else {
			System.out.println("the mean of the first n/2 elements is less than the last n/2 elements");
		}
		System.out.println("=================================");
		System.out.println("the 3rd largest number in the array: ");
		getThirdMaxVal(numbers);
		
		
	}
	
	public static void removeDuplicate(int[] numbers) {
		HashMap<Integer, Integer> check = new HashMap<Integer, Integer>();
		for(int i = 0; i < numbers.length; i++) {
			if(check.containsKey(numbers[i]))
				check.remove(numbers[i]);
			else
				check.put(numbers[i], numbers[i]);
		}
		
		for(int value: check.values()){
		    System.out.println(value);
		}
//		int[] result=new int[check.size()];
//		int i=0;
//		for(int value:check.values())
//		{
//			result[i]=value;
//			i++;
//		}
//		return result;


	}
	
	public static void getThirdMaxVal(int[] numbers) {
		Set<Integer> check = new HashSet<Integer>();
		for (int value : numbers) {
			check.add(value);
		}

		Object[] arrTmp = check.toArray();
		System.out.println(arrTmp[arrTmp.length-3]);
	}

	
	public static float average(int[] numbers) {
		int s = 0;
		for(int n : numbers) {
			s += n;
		}
		return s/numbers.length;
	}

	
}
