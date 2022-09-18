package view;

import java.util.Arrays;

import bean.NbrStas;

public class Ex04NumberStatistic {
	public static void main(String[] args) {
		int[] numbers = { 3, 15, 21, 0, 15, 17, 21 };
		// Class: NbrStas: number, count
		// NbrStas[numbers.length]: (3,1), (15,2), (21,2), (0,1), (17,1)
		// Loop element in numbers
		int[] result = statistic(numbers);
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));
	}

	private static int[] statistic(int[] numbers) {
		// old school
		int[] validNumbers = new int[numbers.length];
		int k = 0;
		NbrStas[] nbrStases = groupBy(numbers);
		for (NbrStas n : nbrStases) {
			if (n.getCount() == 1) {
				validNumbers[k++] = n.getNumber();
			}
		}
		return Arrays.copyOfRange(validNumbers, 0, k);
	}

	private static NbrStas[] groupBy(int[] numbers) {
		// null, null, ..., null
		NbrStas[] nbrStases = new NbrStas[numbers.length];
		int k = 0;
		for (int number : numbers) {
			int indexOf = indexOf(nbrStases, number, k);
			if (indexOf >= 0) {
				// count+1
				nbrStases[indexOf].plusCount();
			} else {
				// add, count = 1
				nbrStases[k++] = new NbrStas(number, 1);
			}
		}
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
