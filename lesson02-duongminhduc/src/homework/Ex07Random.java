package homework; 

import java.util.Random;

public class Ex07Random {
	public static void main(String[] args) {

		Random rd = new Random();
		
		int[] n = new int[5];
		int number;
		int i= 0;
		while(true)
		{
			number = 20 + rd.nextInt(11);
			if(checknumber(n, number))
			{
				n[i] = number;
				System.out.println(n[i]+" ");
				i++;
				if(i == 5)
				{
					break;
				}
			
			}
			
			
		}
		
		
	}
	private static boolean checknumber(int[] a, int n)
	{
		for(int i = 0; i< a.length;i++)
		{
			if(a[i] == n)
			{
				return false;
			}
		}
		return true;
		
	}
}
