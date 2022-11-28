package manipulation;

import java.util.Arrays;

import common.Tuple;

public class Ex01CrudApp {
	public static void main(String[] args) {
		int[] numbers = { 1, 9, 5, 36, 12, 33 };

		System.out.println("sum odd number:" + sum(numbers));
		System.out.println("get min max:" + getMinMax(numbers));

		int[] newAddedArray = add(numbers,99,2);
		System.out.println("newAddedArray: "+Arrays.toString(newAddedArray));
		
		int[] newRemovedArray = remove(numbers, 3);
		System.out.println("remove:" + Arrays.toString(newRemovedArray));

	}

	private static int sum(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			if (number % 2 != 0) {
				sum += number;
			}
		}
		return sum;
	}

	private static Tuple getMinMax(int[] numbers) {
		Tuple tp = new Tuple();
		tp.setMax(Integer.MAX_VALUE);
		tp.setMin(Integer.MIN_VALUE);
		for (int number : numbers) {
			if (tp.getMax() >= number) {
				tp.setMax(number);
			}
			if (tp.getMin() <= number) {
				tp.setMin(number);
			}
		}
		return tp;
	}
	//Cách 1
	private static int[] add1(int[] numbers, int value, int k) {
		int[] result = new int[numbers.length+1];
		for(int i=0;i<k;i++) {
			result[i]=numbers[i];
		}
		result[k]=value;
		for(int i=k+1;i<result.length;i++) {
			result[i]=numbers[i-1];
		}

		return result;
	}
	//Cách 2
	private static int[] add(int[] numbers, int value, int k) {
		int[] result = new int[numbers.length+1];
		result = Arrays.copyOfRange(numbers, 0, result.length);
		for(int i=result.length-1;i>=k;i--) {
			result[i]=result[i-1];
		}
		result[k]=value;
		
		return result;
	}

	private static int[] remove(int[] numbers, int k) {
		for (int i = k; i < numbers.length-1; i++) {
			numbers[i] = numbers[i+1];
		}
		return Arrays.copyOfRange(numbers, 0, numbers.length-1);
	}
}
