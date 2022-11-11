package ex01;
import java.util.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Ex01ArrIteger {
	public static void main(String[] args) {
		//int[] numbers = {1, 2, 3, 4, 1, 2, 5, 6, 7, 8, 8, 6};
		int n, sum = 0, tempSort;
	    Scanner scanner = new Scanner(System.in);
	         
	    do {
	        System.out.println("Enter element number array: ");
	        n = scanner.nextInt();
	    } while (n < 0);
	    int arrayNumber[] = new int[n];
	         
	    System.out.println("Value: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print("arr " +i+ " : ");
	        arrayNumber[i] = scanner.nextInt();
	    }
		System.out.println("arrayNumber: "+ Arrays.toString(arrayNumber));
		System.out.println("Remove duplicate elements: ");
		removeDuplicate(arrayNumber);
		
		int[] num1= Arrays.copyOfRange(arrayNumber, 0, arrayNumber.length/2);
		int[] num2 = Arrays.copyOfRange(arrayNumber,  arrayNumber.length/2,  arrayNumber.length);
		if(average(num1) > average(num2)) {
			System.out.println("The mean of the first n/2 elements is greater than the last n/2 elements");
			}
		else {
			System.out.println("The mean of the first n/2 elements is less than the last n/2 elements");
		}
		System.out.println("the 3rd largest number in the array: ");
		getThirdMaxVal(arrayNumber);
		
		
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


	}
	
	public static void getThirdMaxVal(int[] numbers) {
		Set<Integer> check = new HashSet<Integer>();
		for (int value : numbers) {
			check.add(value);
		}

		Object[] tmp = check.toArray();
		System.out.println(tmp[tmp.length-3]);
	}

	
	public static float average(int[] numbers) {
		int s = 0;
		for(int n : numbers) {
			s += n;
		}
		return s/numbers.length;
	}

	
}