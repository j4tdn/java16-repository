package view;

import java.lang.reflect.Array;
import java.util.Arrays;

import bean.NbrStas;

public class Ex04NumberStatistic {
	public static void main(String[] args) {
		int[] numbers = {3,15,0,21,15,17,21};
		int[] result = statistic(numbers);
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));
	}
	
	private static int[] statistic(int[] numbers) {
		int[] validNumbers = new int[numbers.length];
		int k=0;
		NbrStas[] nbrStases = groupBy(numbers);			
		for(NbrStas nbrStas : nbrStases) {
			if(nbrStas.getCount()==1) {
				System.out.println(nbrStas);
			}
		}
		return Arrays.copyOfRange(validNumbers, 0, k);
	}
	
	private static NbrStas[] groupBy(int[] numbers) {
		NbrStas[] nbrStases = new NbrStas[numbers.length];
		int k=0;
		for(int number : numbers) {
			int indexOf=indexOf(nbrStases,number,k);
			if(indexOf == -1) {
				nbrStases[k++]=new NbrStas(number,1);
			}else {
				nbrStases[indexOf].plusCount();
			}
		}
		return Arrays.copyOfRange(nbrStases, 0, k);
	}
	
	private static int indexOf(NbrStas[] nbrStases,int number,int notnullElements) {
		for(int i=0;i<notnullElements;i++) {
			if(nbrStases[i].getNumber() ==number) {
				return i;
			}
		}
		return -1;
	}
}

