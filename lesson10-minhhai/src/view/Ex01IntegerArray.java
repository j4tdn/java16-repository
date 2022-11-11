package view;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Ex01IntegerArray {
	public static void main(String[] args) {
		int[] array = {5,6,9,4,5,7,6,8,9};
		System.out.println("Input array: "+ Arrays.toString(array));
		System.out.print("Mang sau khi xoa phan tu trung: ");
		removeDuplicate(array);
		System.out.println();
		int[] num1= Arrays.copyOfRange(array, 0, array.length/2);
		int[] num2 = Arrays.copyOfRange(array,  array.length/2,  array.length);
		if(average(num1) > average(num2)) {
			System.out.println("Trung binnh cong cua n/2 phan tu dau lon hon n/2 phan tu cuoi");
			}
		else {
			System.out.println("Trung binnh cong cua n/2 phan tu dau be hon n/2 phan tu cuoi");
		}
		System.out.print("Pha tu thu lon thu 3 trong mang: ");
		getThirdMaxItem(array);		
	}	
	public static void removeDuplicate(int[] numbers) {
		HashMap<Integer, Integer> dupItem = new HashMap<Integer, Integer>();
		for(int i = 0; i < numbers.length; i++) {
			if(dupItem.containsKey(numbers[i]))
				dupItem.remove(numbers[i]);
			else
				dupItem.put(numbers[i], numbers[i]);
		}
	    System.out.print("{ ");
		for(int value: dupItem.values()){		
			System.out.print(value + ",");
		}
		  System.out.print("}");
	}
	
	public static float average(int[] numbers) {
		int s = 0;
		for(int n : numbers) {
			s += n;
		}
		return s/numbers.length;
	}	
	
	public static void getThirdMaxItem(int[] numbers) {
		Set<Integer> check = new HashSet<Integer>();
		for (int value : numbers) {
			check.add(value);
		}
		Object[] arrTmp = check.toArray();
		System.out.println(arrTmp[arrTmp.length-3]);
	}
}
