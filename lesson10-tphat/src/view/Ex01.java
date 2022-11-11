package view;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int numbers[] = { 1, 4, 3, 2, 3, 1, 1 };
		System.out.println("Arrs after remove duplicate: " + Arrays.toString(remove_Duplicate_Elements(numbers)));
		int numbersComp[] = { 10, 4, 1, 1, 5, 33, 3 };
		if (compare_Elements(numbersComp) > 0) {
			System.out.println("Giá trị trung bình của n/2 phần tử đầu tiên > n/2 phần tử cuối cùng");
		} else if (compare_Elements(numbersComp) == 0) {
			System.out.println("Giá trị trung bình của n/2 phần tử đầu tiên = n/2 phần tử cuối cùng");
		} else {
			System.out.println("Giá trị trung bình của n/2 phần tử đầu tiên < n/2 phần tử cuối cùng");
		}
		int numbersMax[] = { 7, 8, 8, 8, 4, 2, 1 };
		System.out.println("Max = " + max_Three_Elemensts(numbersMax));
	}

	private static int[] remove_Duplicate_Elements(int elements[]) {
		int[] copyElements = new int[elements.length];
		int index = 0;
		for (int i = 0; i < elements.length; i++) {
			int count = 0;
			for (int j = 0; j < elements.length; j++) {
				if (elements[i] == elements[j]) {
					count++;
				}
			}
			if (count == 1) {
				copyElements[index] = elements[i];
				index++;
			}
		}
		return Arrays.copyOfRange(copyElements, 0, index);
	}

	private static int compare_Elements(int elements[]) {
		int sumFirst = 0;
		int sumLast = 0;
		int average = elements.length / 2;
		for (int i = 0; i < elements.length; i++) {
			if (i < average) {
				sumFirst += elements[i];
			} else {
				sumLast += elements[i];
			}
		}
		return (sumFirst - sumLast) / average;
	}

	public static int max_Three_Elemensts(int[] arr) {
		int[] b = new int[arr.length];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!contains(b, arr[i])) {
				b[index] = arr[i];
				index++;
			}
		}
		int[] c = Arrays.copyOfRange(b, 0, index);
		Arrays.sort(c);
		return c[c.length - 3];
	}

	private static boolean contains(int[] numbers, int value) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == value)
				return true;
		}
		return false;
	}
}
