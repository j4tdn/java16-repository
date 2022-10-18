package homework;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {

		int a = 75;
		int b = 15;
		int[] arra = UC(a);
		
		int[] arrb = UC(b);
	
		if(caculator(arra, arrb))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		
		
	}
	private static boolean isPrime(int n)
	{
		  if (n < 2) {
	            return false;
	        }
	        // check so nguyen to khi n >= 2
	        int squareRoot = (int) Math.sqrt(n);
	        for (int i = 2; i <= squareRoot; i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	}
	private static boolean caculator(int[] a, int[] b)
	{
		if(Arrays.equals(a, b))return true;
		return false;
	}
	private static int[] UC(int n)
	{
		int[] arr = new int[100];
		int k = 0;
		for(int i = 0;i <= n;i++)
		{
			if(isPrime(i) && (n % i == 0))
			{
				arr[k++] = i;
			}
		}
		return arr;
	}
}
