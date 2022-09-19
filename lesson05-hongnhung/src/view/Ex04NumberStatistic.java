package view;
import java.lang.reflect.Array;
import java.util.Arrays;
import bean.NbrStart;

public class Ex04NumberStatistic {
	public static void main(String[] args) {
		int[] numbers = { 3, 15, 21, 0, 15, 17, 21 };
		int[] result = staticstic(numbers);
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] staticstic(int[] numbers) {
		int[] validNumbers = new int[numbers.length];
		int k = 0;
		NbrStart[] nbrStates = groupBy(numbers);
		for(NbrStart nbrStas : nbrStates) {
			if(nbrStas.getCount() == 1)
				System.out.println(nbrStas);
		}
		return Arrays.copyOfRange(validNumbers, 0, k);
	}

	
	private static NbrStart[] groupBy(int[] numbers) {
		NbrStart[] nbrStates = new NbrStart[numbers.length];
		int k = 0;
		for(int number : numbers) {
			int indexOf = indexOf(nbrStates, number ,k);
			if(indexOf == -1)
				//add new number
				nbrStates[k++] = new NbrStart(number, 1);
			else
				nbrStates[indexOf].plusCount();
				
		}
		return Arrays.copyOfRange(nbrStates, 0, k);
	}


	private static int indexOf(NbrStart[] nbrStates, int number, int nonNullElement) {
		for(int i = 0; i < nonNullElement; i++) {
			if(nbrStates[i].getNumber() == number)
				return i;
		}
		return -1;
	}

	
}
