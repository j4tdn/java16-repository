package view;

import java.util.Arrays;

import bean.NbrStas;

public class Ex04NumberStatistic {
	public static void main(String[] args) {
		int[] numbers = { 3, 15, 21, 0, 15, 17, 21 };
		
	
		int[] res = statistic(numbers);
		Arrays.sort(res);
		System.out.println(Arrays.toString(res));
	
	}


	private static int[] statistic(int[] numbers)
	{
		NbrStas[] nbrStases = groupBy(numbers);
		int k = 0;
		int[] valid = new int[numbers.length];
		for(NbrStas nbrStas : nbrStases)
		{
			if(nbrStas.getCount() == 1)
			{
				valid[k++] = nbrStas.getNumber();
			}
		}
		return Arrays.copyOfRange(valid, 0, k);//copy [0,k) 
	}
	// i >= 0 --> number existed in nbrStases
	// i = -1 --> not exist
	private static int indexOf(NbrStas[] nbrStases, int number, int nonNullElements)
	{
		for(int i = 0; i < nonNullElements;i++)
		{
			if(nbrStases[i].getNumber() == number)
			{
				return i;
			}
		}
		return -1;
	}
	
}