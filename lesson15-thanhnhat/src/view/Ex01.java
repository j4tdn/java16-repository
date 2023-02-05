package view;

import java.util.Arrays;

import bean.NbrStas;

public class Ex01 {
	public static void main(String[] args) {
		int[] numberN = { 1, 5, 4, 8, 9, 7, 15, 1, 2, 5, 4, 6, 4, 5, 1, 14, 5, 4 };
		
		int[] result1 = statistic(numberN);
		System.out.println(Arrays.toString(result1));
		
		int[] result2 = notStatistic(numberN);
		System.out.println(Arrays.toString(result2));
		
	}
	// Liệt kê các phần tử xuất nhiều hơn một lần trong dãy N
	private static int[] notStatistic(int[] numbers) {
		int[] validNumbers = new int[numbers.length];
		int k = 0;
		NbrStas[] nbrStases = groupBy(numbers);
		for (NbrStas nbrStas : nbrStases) {
			if (nbrStas.getCount() > 1) {
				validNumbers[k++] = nbrStas.getNumber();
			}
		}
		return Arrays.copyOfRange(validNumbers, 0, k);
	}
	// Liệt kê các phần tử chỉ xuất hiện một lần duy nhất trong dãy N
	private static int[] statistic(int[] numbers) {
		int[] validNumbers = new int[numbers.length];
		int k = 0;
		NbrStas[] nbrStases = groupBy(numbers);
		for (NbrStas nbrStas : nbrStases) {
			if (nbrStas.getCount() == 1) {
				validNumbers[k++] = nbrStas.getNumber();
			}
		}
		return Arrays.copyOfRange(validNumbers, 0, k);
	}

	private static NbrStas[] groupBy(int[] numbers) {
		NbrStas[] nbrStases = new NbrStas[numbers.length];
		int k = 0;
		for (int number : numbers) {
			int indexOf = indexOf(nbrStases, number, k);
			if (indexOf == -1) {
				nbrStases[k++] = new NbrStas(number, 1);
			} else {
				nbrStases[indexOf].plusCount();
			}
		}
		return Arrays.copyOfRange(nbrStases, 0, k);
	}

	private static int indexOf(NbrStas[] nbrStases, int number, int element) {
		for (int i = 0; i < element; i++) {
			if (nbrStases[i].getNumber() == number) {
				return i;
			}
		}
		return -1;
	}
}
