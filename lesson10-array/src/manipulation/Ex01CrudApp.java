package manipulation;

import java.util.Arrays;
import java.util.Random;

import common.Tuple;

public class Ex01CrudApp {
	public static void main(String[] args) {
		/*
		 * Ex01: Give an array int[] = {1, 9, 5, 36, 12, 33};
		 * With k from 0 - (length-1)
		 * + Calculate sum of odd numbers 
		 * + Find max, min in one loop
		 * + Add element at index k
	 	 * + Remove element from index k
		 * + Update element at index k
		 * + Get element at index k
		 */
		int[] numbers = {1, 9, 5, 36, 12, 33};
		System.out.println("input: " + Arrays.toString(numbers));
		System.out.println();
		
		System.out.println("Tong cac phan tu le: " + sum(numbers));
		System.out.println();
		
		Tuple tu = getMinMax(numbers);
		System.out.println("Min of Arrays: " + tu.getLeft());
		System.out.println("Max of Arrays: " + tu.getRight());
		System.out.println();
		
		Random rd = new Random();
		int k = rd.nextInt(5)+1;
		int value = rd.nextInt(100);
		System.out.println("mang sau khi chen gia tri " + value + " vao vi tri thu " + k + " la: ");
		System.out.println(Arrays.toString(add(numbers, value, k)));
		System.out.println();
		
		k = rd.nextInt(5)+1;
		System.out.println("mang sau khi xoa phan tu thu " + k + " la: ");
		System.out.println(Arrays.toString(remove(numbers, k)));
		
	}
	private static int sum(int[] numbers) {
	   int sumNumbers = 0;
	   for (int i = 0; i < numbers.length; i++) {
		   if (numbers[i]%2 != 0) {
			   sumNumbers+= numbers[i];
		   }
	   }
	   return sumNumbers;
	}
	
	private static Tuple getMinMax(int[] numbers) {
		Tuple minMax = new Tuple(0, 0);
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > minMax.getRight()) {
				minMax.setRight(numbers[i]);
			}
			if (numbers[i] < minMax.getLeft()) {
				minMax.setLeft(numbers[i]);
			}
		}
		return minMax;
	}
	
	private static int[] add(int[] numbers, int value, int k) {
		int[] output = new int[numbers.length+1];
		for (int i = 0; i < output.length; i++) {
			if (i < k - 1 ) {
				output[i] = numbers[i];
			}
			if (i == k - 1) {
				output[i] = value;
			}
			if (i > k - 1) {
				output[i] = numbers[i-1];
			}
		}
		return output;
	}
	
	private static int[] remove(int[] numbers, int k) {
		int[] output = new int[numbers.length-1];
		for (int i = 0; i < output.length; i++) {
			if (i < k - 1) {
				output[i] = numbers[i];
			} else {
				output[i] = numbers[i+1];
			}
		}
		return output;
	}
}
