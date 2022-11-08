package manipulation;

import java.util.Arrays;
import common.Tuple;

/*
   Ex01: Give an array int[] = {1, 9, 5, 36, 12, 33};
	With k from 0 - (length-1)
	+ Calculate sum of odd numbers 
	+ Find max, min in one loop
	
	+ Add element at index k
	+ Remove element from index k
	+ Update element at index k
	+ Get element at index k
 */

public class Ex01CrudApp {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		Arrays.stream(arr).boxed().sorted( (o1,o2) -> o2-o1).forEach(o -> System.out.print(o + " "));
		System.out.println();
		
		int[] arrays = { 1, 9, 5, 36, 12, 33 };
		System.out.println("ARRAYS : " + Arrays.toString(arrays));
		System.out.println("=========================");
		System.out.println("Sum of odd numbers : " + sum(arrays));
		System.out.println("=========================");
		System.out.println("Find max, min : " + getMinMax(arrays).toString());
		System.out.println("=========================");
		System.out.println("Add 100 at index 3 : " + Arrays.toString(add(arrays, 100, 3)));
		arrays = add(arrays, 100, 3);
		System.out.println("=========================");
		System.out.println("Remove element from index 5 : " + Arrays.toString(remove(arrays, 5)));
		System.out.println("=========================");
		System.out.print("Update 1000 at index 5 : ");
		update(arrays, 1000, 5);
		System.out.println(Arrays.toString(arrays));
		System.out.println("=========================");
		System.out.println("Get element at index 5 : " + arrays[5]);
		System.out.println("=========================");

	}

	private static int sum(int[] array) {
		int sum = 0;
		for (int i : array) {
			if (i % 2 != 0)
				sum += i;
		}
		return sum;
	}

	private static Tuple getMinMax(int[] array) {
		int max = -9999;
		int min = 9999;
		for (int i : array) {
			if (i > max)
				max = i;
			if (i < min)
				min = i;
		}
		return new Tuple(max, min);
	}

	private static int[] add(int[] source, int value, int k) {
		if (k > source.length)
			throw new IndexOutOfBoundsException("Index out of bounds");

		int[] tmp = new int[source.length + 1];
		for (int i = 0; i < k; i++) {
			tmp[i] = source[i];
		}
		for (int i = k + 1; i < tmp.length; i++) {
			tmp[i] = source[i - 1];
		}
		tmp[k] = value;

		return tmp;
	}

	private static int[] remove(int[] source, int k) {
		if (k > source.length)
			throw new IndexOutOfBoundsException("Index out of bounds");

		int[] tmp = new int[source.length - 1];
		for (int i = 0; i < k; i++) {
			tmp[i] = source[i];
		}
		for (int i = k; i < tmp.length; i++) {
			tmp[i] = source[i + 1];
		}

		return tmp;
	}

	private static void update(int[] source, int value, int k) {
		source[k] = value;
	}

}
