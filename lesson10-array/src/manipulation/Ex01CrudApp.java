package manipulation;

import java.util.Arrays;

import common.Tuple;

// Create/Read/Update/Delete
public class Ex01CrudApp {
	public static void main(String[] args) {

		/*
		 * Ex01: Give an array int[] = {1, 9, 5, 36, 12, 33};
		 *  With k from 0 - (length-1)
		 * + Calculate sum of odd numbers 
		 * + Find max, min in one loop (one loop)
		 * + Add element at index k 
		 * + Remove element from index k 
           + Update element at index k 
           + Get element at index k
		 */
		int[] numbers = {1, 9, 5, 36, 12, 33};
		System.out.println("sum: " + sum(numbers));
		
		System.out.println("Tuple: " + getMinMax(numbers));
		
		System.out.println("Add new Array: " + Arrays.toString(add(numbers, 99, 3)));
		
		System.out.println("Remove new Array: " + Arrays.toString(remove(numbers, 3)));
		
		

	}
	private static int sum(int[] numbers)
	{
		int sum = 0;
		for(int i = 0; i<numbers.length; i++)
		{
			if(numbers[i] % 2 != 0)
			{
				sum += numbers[i];
				
			}
		}
		return sum;
	}
	private static Tuple getMinMax(int[] numbers)
	{
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		Tuple tp = new Tuple();
		
		for(int number : numbers)
		{
			if(max < number)
			{
				max = number;
			}
			if(min > number)
			{
				min = number;
			}
		}
		tp.setLeft(min);
		tp.setRight(max);
		
		return tp;
		
	}
	private static int[] add(int[] source, int value,int k)
	{
		int[] a = new int [source.length + 1];
		
		//-------Cách 1
//		for(int i = 0; i< k;i++)
//		{
//			a[i] = source[i];
//		}
//		a[k] = value;
//		for(int i = k + 1 ; i< a.length;i++)
//		{
//			a[i] = source[i - 1];
//		}
		
		// -------Cách 2
		for(int i  = 0; i < source.length; i++)
		{
			a[i] = source[i];
		}
		for(int i = a.length - 1;i  > k;i--)
		{
			a[i] = a[i - 1];
		}
		a[k] = value;
		return a;
	}
	private static int[] remove(int[] source, int k)
	{
		int[] a = new int [source.length - 1];
//		for(int i = 0; i<k; i++)
//		{
//			a[i] = source[i];
//		}
//		for(int i = k + 1;i<source.length;i++)
//		{
//			a[i - 1] = source[i];
//		}
		for(int i = k;i<source.length-1;i++)
		{
			source[i] = source[i + 1];
		}
	
		return Arrays.copyOfRange(source,0, source.length-1);
	}
	
	
}
