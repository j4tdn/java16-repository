package view;

import java.util.Arrays;

import bean.NbrStas;

public class Ex04NumberStatistic {
	public static void main(String[] args) {
		int[] numbers = { 3, 15, 21, 0, 15, 17, 21 };
		
		NbrStas[] nbrStases = groupBy(numbers);
		

		for(NbrStas nbrStas : nbrStases )
		{
			if(nbrStas.getCount() == 1)
			{
				System.out.println(nbrStas);
			}
		}
	}


	private static NbrStas[] groupBy(int[] numbers)
	{
		NbrStas[] nbrStases = new NbrStas[numbers.length];
		int k = 0;
		for(int number : numbers)
		{
			int indexOf = indexOf(nbrStases, number, k);
			if(indexOf == -1)
			{
				nbrStases[k ++] = new NbrStas(number, 1);
			}
			else
			{
				nbrStases[indexOf].plusCount();
			}
		}
		return Arrays.copyOfRange(nbrStases, 0, k);//copy [0,k) 
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