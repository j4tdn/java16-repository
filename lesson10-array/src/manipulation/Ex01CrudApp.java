package manipulation;

import java.util.Arrays;

import common.Tuple;

public class Ex01CrudApp {
	public static void main(String[] args) {
		int[] number = { 1,9,2,5,Integer.MAX_VALUE,12,33 };
		Tuple minmax = getMinMax(number);

		System.out.println(sum(number));
		System.out.println(minmax.getLeft() + " ---- " + minmax.getRight());
		int[] numberadd = add(number, 7, 18);
		int[] numberrm = remove(number, 3);
		System.out.println("mảng gốc "+Arrays.toString(number));
		System.out.println("add "+Arrays.toString(numberadd));
		System.out.println("xóa"+Arrays.toString(numberrm));
	}

	private static int sum(int[] arr) {
		int sum = 0;
		for (int element : arr) {
			if (element % 2 != 0) {
				sum = sum + element;
			}
		}
		return sum;
	}

	//
	private static Tuple getMinMax(int[] number) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int element : number) {
			if (element > max) {
				max = element;
			}
			if (element < min) {
				min = element;
			}
		}

		return new Tuple(min, max);

	}

	private static int[] add(int[] number, int k, int value) {
		int[] clone = new int[number.length + 1];
		k = k-1;
		for (int i = 0 ;i < clone.length;i++) {
			if(i < k ) {
				clone[i] = number[i];
			}
			if(i == k) {
				clone[i] = value;
			}
			if(i > k) {
				clone[i] = number[i-1];
			}
		}

		return clone;

	}
	private static int[] insert(int[] number, int k, int value) {
		int[] clone = new int[number.length + 1];
		k = k-1;
		for (int i = 0 ;i < number.length;i++) {
			
			
		}

		return clone;

	}

	private static int[] remove(int[] number, int k) {
		int[] clone = new int[number.length - 1];
		k = k-1;
		for (int i = 0 ;i < clone.length;i++) {
			if(i < k ) {
				clone[i] = number[i];
			}
			
			if(i >= k) {
				clone[i] = number[i+1];
			}
		}

		return clone;

	}

}
