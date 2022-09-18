package view;

import java.util.Arrays;

import bean.NbrStas;

public class Ex04NumberStatistics {
	public static void main(String[] args) {
		int[] numbers = { 3, 15, 21, 0, 15, 17, 21 };
		int[] result = statistic(numbers);
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));
	}
	
	private static int[] statistic(int[] numbers) {
		int[] validNumbers = new int[numbers.length];
		int k=0;
		NbrStas[] nbrStases = groupBy(numbers);
		for(NbrStas nbrStas : nbrStases) {
			if(nbrStas.getCount() == 1) {
				validNumbers[k++] = nbrStas.getNumber();
			}
		}
		return Arrays.copyOfRange(validNumbers, 0, k);
	}

	private static NbrStas[] groupBy(int[] numbers) {
		NbrStas[] nbrStases = new NbrStas[numbers.length];
		int k = 0;
		for (int number : numbers) {
			int index = indexOf(nbrStases, number, k);
			if (index != -1) {
				nbrStases[index].plusCount();
			} else {
				nbrStases[k++] = new NbrStas(number, 1);
			}
		}
		return Arrays.copyOfRange(nbrStases, 0, k);
	}

	private static int indexOf(NbrStas[] nbrStases, int number, int nonNullElement) {
		for (int i = 0; i < nonNullElement; i++) {
			if (nbrStases[i].getNumber() == number)
				return i;
		}
		return -1;
	}
}
