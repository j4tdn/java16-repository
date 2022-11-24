package manipulation;

import java.util.Arrays;

import javax.xml.transform.Source;

import common.Tuple;

public class Ex01CrudApp {
	public static void main(String[] args) {
		int[] numbers = {9, 1, 5, 36, 12, 13 };
		System.out.println(sum(numbers));
		
		Tuple tuple = getMinMax(numbers);
		System.out.println("" + tuple);
		
		int[] newAdddedArray = add(numbers,18,3);
		System.out.println(Arrays.toString(newAdddedArray));
		
		int[] newRemoveArray =remove(numbers,3);
		System.out.println(Arrays.toString(newRemoveArray));
	}

	private static int sum(int[] numbers) {
		int sum = 0;
		for (int i = 0; i <= numbers.length - 1; i++) {
			if (numbers[i] % 2 != 0) {
				sum += numbers[i];
			}
		}
		return sum;
	}

	private static Tuple getMinMax(int[] numbers) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int number:numbers) {
			if (number > max) {
				max = number;
			}
			if(number < min) {
				min = number;
			}
		}
//		Tuple rs = new Tuple(min,max);
		return new Tuple(min, max);
	}
	private static int[] add(int[] source, int newValue, int k) {
		int [] rs = new int[source.length+1];
				
		for(int i = 0; i < k; i++) {
			rs[i] = source[i];
		}
		rs[k] = newValue;
		for(int i = k +1 ; i < rs.length;i++) {
			rs[i] = source[i-1];
		}
		return rs;
	}
	private static int[] insert(int[] source, int newValue, int k) {
		int [] rs = new int[source.length + 1];
		for(int i = 0; i < source.length; i++) {
			rs[i] = source[i];
		}
		for(int i = rs.length - 1; i > k; i--) {
			rs[i]= rs[i-1];
		}
		rs[k] = newValue;
		return rs;
	}
	private static int[] remove(int[] source, int k) {
		for(int i = k; i < source.length - 1; i++) {
			source[i] = source[i + 1];
		}
		
		return Arrays.copyOfRange(source, 0, source.length-1);
	}
}
