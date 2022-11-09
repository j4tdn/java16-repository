package manipulation;

import java.util.Arrays;

import common.Tuple;

public class Ex01CrudApp {
	public static void main(String[] args) {
		int[] numbers = {1,9,5,16,36,12,33};
		
		System.out.println(sum(numbers));
		System.out.println(getMinMax(numbers));
		System.out.println("numbers: " + Arrays.toString(numbers));
		System.out.println("add: " + Arrays.toString(add(numbers, 10, 3)));
		System.out.println("insert : " + Arrays.toString(insert(numbers, 55, 2)));
		System.out.println("remove: " + Arrays.toString(remove(numbers,5)));
	}
	private static int sum(int[] numbers) {
		int sum = 0;
		for(int s: numbers) {
			sum+=s;
		}
		return sum;
				
	}
	private static Tuple getMinMax(int[] numbers) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int number: numbers) {
			if(min > number) {
				min = number;
			}
			if(max < number) {
				max = number;
			}
		}
		
		Tuple tp = new Tuple(min, max);
		return tp;
		
	}
	private static int[] add(int[] input, int value, int k) {
		int[] result = new int[input.length + 1];
		for(int i = 0; i < k; i ++) {
			result[i] = input[i];
		}
		result[k] = value;
		for(int i = k + 1 ; i < result.length; i ++) {
			result[i] = input[i -1];
		}
		return result;
	}
	private static int[] insert(int[] input, int value, int k) {
		int[] result = new int[input.length + 1];
		for(int i = 0; i < input.length; i ++) {
			result[i] = input[i];
			
		}
		
		for(int i = result.length - 1; i > k ; i --) {
			result[i] = result[i-1];
		}
		result[k] = value;
		
		return result;
	}
    private static int[] remove(int[] input, int k) {
    	int[] result = new int[input.length - 1];
    	for(int i = 0; i < k; i ++) {
    		result[i] = input[i];
    	}
    	for(int i = k; i < result.length; i ++) {
    		result[i] = input[i +1];
    	}
    	return result;
	}
    
	

}
