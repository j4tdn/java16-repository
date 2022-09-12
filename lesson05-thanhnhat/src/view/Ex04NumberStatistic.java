package view;

import java.util.Arrays;

import bean.NbrStas;

public class Ex04NumberStatistic {
	public static void main(String[] args) {
		int[] numbers = { 3, 15, 21, 0, 15, 17, 21 };
		int[] result = statistic(numbers);
		Arrays.sort(result); // sort ascending
		System.out.println(Arrays.toString(result));
	}

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
		// copy mảng nbrStases từ phần tử 0 -> k
		return Arrays.copyOfRange(nbrStases, 0, k);
	}

	private static int indexOf(NbrStas[] nbrStases, int number, int nonNullElements) {
		for (int i = 0; i < nonNullElements; i++) {
			if (nbrStases[i].getNumber() == number) {
				return i;
			}
		}
		return -1;
	}
}
