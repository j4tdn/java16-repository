package view;

import java.util.Arrays;

import bean.NbrStas;

public class Ex04NumberStaticstis {
	public static void main(String[] args) {
		int[] numbers = { 3, 15, 21, 0, 15, 17, 21 }; // 3 0 17
		int[] result = statistic(numbers);
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));		
	}
	private static int[] statistic(int[] numbers) {
		int[] validNumber = new int[numbers.length];
		int k = 0;
		NbrStas[] nbsNbrStases = groupBy(numbers);
		for (NbrStas nbrStas : nbsNbrStases) {
			if (nbrStas.getCount() == 1) {
				validNumber[k++] = nbrStas.getNumber();
			}
		}
		return Arrays.copyOfRange(validNumber, 0, k);
	}

	private static NbrStas[] groupBy(int[] numbers) {
		NbrStas[] nbsStases = new NbrStas[numbers.length];
		int k = 0;
		for (int number : numbers) {
			int indexOf = indexOf(nbsStases, number, k);
			if (indexOf == -1) {
				nbsStases[k++] = new NbrStas(number, 1);
			} else {
				nbsStases[indexOf].plusCount();
			}
		}
		return Arrays.copyOfRange(nbsStases, 0, k); // copy[0, k]
	}

	// i >=0 --> number existed in nbrStas
	// i = -1 ---> not exists
	private static int indexOf(NbrStas[] nbsNbrStases, int number, int nonNullElement) {
		for (int i = 0; i < nonNullElement; i++) {
			if (nbsNbrStases[i].getNumber() == number) {
				return i;
			}
		}
		return -1;
	}

}
