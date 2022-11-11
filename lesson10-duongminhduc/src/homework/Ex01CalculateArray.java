package homework;

import java.util.Arrays;

public class Ex01CalculateArray {
	public static void main(String[] args) {

		int[] array = new int[]{1, 2, 3, 1, 4, 2, 5, 5};
		System.out.println("Remove Duplicate Elements: " + Arrays.toString(removeDuplicateElements(array)));
		compareTheMean(array);
		System.out.println("Number 3rd Largest : "+ findNumber3rdLargest(array));
	}

	public static int[] removeDuplicateElements(int[] a) {

		int[] b = new int[a.length];
		int[] c;

		int j = 0;
		int dem;
		for (int i = 0; i < a.length; i++) {
			dem = 0;
			for (int k = 0; k < a.length; k++) {
				if (a[i] == a[k]) {
					dem++;
				}
			}
			if(dem < 2)
			{
				b[j++] = a[i];
			}

		}
		c = Arrays.copyOfRange(b, 0, j);
		return c;
	}
	public static double medium(int a[])
	{
		double sumArray = 0;
		for(int i = 0;i<a.length;i++)
		{
			sumArray += a[i];
		}
		return sumArray/a.length;
	}
	public static void compareTheMean(int[] a)
	{
		int[] firtArray = Arrays.copyOfRange(a, 0, a.length/2);
		int[] lastArray = Arrays.copyOfRange(a, a.length/2, a.length);
		double mediumFA = medium(firtArray);
		double mediumLA = medium(lastArray);
		System.out.println("Medium firtArray = " + mediumFA);
		System.out.println("Medium lastArray = " + mediumLA);
		if(mediumFA == mediumLA)
		{
			System.out.println("Medium firtArray = Medium lastArray");
		}
		else if(mediumFA > mediumLA)
		{
			System.out.println("Medium firtArray > Medium lastArray");
		}
		else
		{
			System.out.println("Medium firtArray < Medium lastArray");
		}
	}
	public static int findNumber3rdLargest(int[] a)
	{
		int number;
		int[] b = new int[a.length];
		int  i=0,j=0;
		b[0] = a[0];
		for(i = 1;i<a.length;i++)
		{
			if(check(b, a[i]) == false)
			{
				b[j++] = a[i];
			}
		}
		int[] c = Arrays.copyOfRange(b, 0, j);
		Arrays.sort(c);
		number = c[c.length-3];
		
		return number;
	}
	public static boolean check(int[] a, int n)
	{
		for(int i = 0;i<a.length;i++)
		{
			if(a[i] == n)
			{
				return true;
			}
		}
		return false;
	}

}
