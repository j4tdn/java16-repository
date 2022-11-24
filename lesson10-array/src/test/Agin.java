package test;

import java.util.Arrays;

import common.Tuple;

public class Agin {
	public static void main(String[] args) {
		int[] numbers = {1, 26 , 9 , 7 , 13, 6};
		Tuple tuple = getMinMax(numbers);
		System.out.println(tuple);
		int[] newArr = add(numbers, 18, 3);
		System.out.println(Arrays.toString(newArr));
		int[] newArr1 = insert(numbers, 20, 3);
		System.out.println(Arrays.toString(newArr1));
		System.out.println(Arrays.toString(numbers));
		int[] rv = remove(numbers, 3);
		System.out.println(Arrays.toString(rv));
	}
	private static Tuple getMinMax(int [] numbers) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int number:numbers) {
			if(number > max)
				max = number;
			if(number < min)
				min = number;
		}
		Tuple rs = new Tuple(min,max);
		return new Tuple(min,max);
	}
	private static int[] add(int[] source, int newValue,  int k) {
		int[] rs = new int[source.length + 1];
		for(int i = 0 ; i < k; i++) {
			rs[i] = source[i];
		}
		for(int i = k + 1 ; i < rs.length; i++) {
			rs[i] = source[i-1];
		}
		rs[k] = newValue;
		
		return rs; 
	}
	private static int[] insert(int[] source, int newValue, int k) {
		int[] rs = new int[source.length + 1];
		for(int i = 0; i < source.length; i++ ) {
			rs[i] = source[i];
		}
		for(int i = rs.length - 1; i > k; i--) {
			rs[i] = source[i-1];
		}
		rs[k] = newValue;
		return rs;
	}
	private static int[] remove(int[] source, int k) {
		int [] rs = new int[source.length-1];
		for(int i = 0; i < source.length-1; i++ ) {
			rs[i] = source[i];
		}
		for(int i = k; i < source.length-1; i++ ) {
			source[i] = source[i + 1];
			rs[i] = source[i];
		}	
		return rs;
	}
}
