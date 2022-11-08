package manipulation;

import java.util.Arrays;

import common.Tuple;

//Create/Read/Update/Delete
public class Ex01CrudApp {
	/*
	 * Ex01: Give an array int[] = {1, 9, 5, 36, 12, 33}; With k from 0 - (length-1)
	 * + Calculate sum of odd numbers + Find max, min in one loop
	 * 
	 * + Add element at index k + Remove element from index k + Update element at
	 * index k + Get element at index k
	 * 
	 */
	public static void main(String[] args) {
		int[] numbers = { 1, 9, 5, 36, 12, 33 };
		Arrays.stream(numbers).boxed().sorted((o1,o2) -> o2 - o1).forEach(o -> System.out.print(o + " "));
		System.out.println();

		System.out.println(sumOdd(numbers));
		System.out.println(maxMin(numbers));
		numbers  = add(numbers, 10, 2);
		System.out.println("Add : " + Arrays.toString(numbers));
		numbers = remove(numbers, 2);
		System.out.println("Remove : " + Arrays.toString(numbers));
		numbers = Update(numbers, 1, 10);
		System.out.println("Update : " + Arrays.toString(numbers));
		System.out.println("Get index k : " + getNumber(numbers, 4));
		

	}

	private static int sumOdd(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				sum += numbers[i];
			}

		}
		return sum;
	}

	private static Tuple maxMin(int[] array) {
		
		int max  = -999;
		int min = 999;
		for(int i : array) {
			if(i >= max ) 
				 max = i;
		 if (i <= min){
				min = i;
			}
		}
		return new Tuple(max, min);
	}
		
	private static int[] add(int[] source, int value, int k) {
		int[] numbers = new int[source.length + 1];
		for (int i = 0; i < k; i++) {
			numbers[i] = source[i];
			
		}
		for(int i = k   ; i < numbers.length ; i++) {
			numbers[i] = source[i - 1];
			
			
		}
		numbers[k] = value;
		return numbers;
	}

	private static int[] remove(int[] source, int k) {


		int[] numbers = new int[source.length -1 ];
		for (int i = 0; i < k; i++) {
			numbers[i] = source[i];
			
		}
		for(int i = k  ; i < numbers.length ; i ++){
			numbers[i] = source[i + 1];
		}
		return numbers;
		
		
	}
	
	private static int[] Update(int[] source, int k, int value) {
		
		for (int i = 0; i < source.length; i++) {
			source[k] = value; 
		}
		return source;
	}
	
	private static int getNumber(int [] source, int k) {
		return source[k];
	}
	

}
