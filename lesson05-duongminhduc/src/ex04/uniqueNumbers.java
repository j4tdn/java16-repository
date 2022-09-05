package ex04;

import java.lang.reflect.Array;

public class uniqueNumbers {

	public static void main(String[] args) {
		int a[] = {4,5,4,5,6,3,2,8,};
		 int[] arrData = getUniqueNumbers(a);
		 for(int i=0;i<arrData.length;i++) {
			 
			if(arrData[i] != 0)
			{
		      System.out.print(arrData[i] + " ");
		    }
		 }
	}
	public static int[] getUniqueNumbers(int a[])
	{
		
		int dem;
		int t=0;
		int[] b = new int[a.length];
		for(int i = 0;i<a.length;i++)
		{
			dem = 0;
		
			for(int j = 0;j<a.length;j++)
			{
				if(a[i] - a[j] == 0)
				{
					dem ++;
				}
			}
	
			if(dem == 1)
			{
				b[t] = a[i];
				t++;
			}
		}
	
		for(int i = 0; i< b.length-1;i++)
		{
			for(int j = i+1;j<b.length;j++)
			{
				if(b[i] > b[j])
				{
					int temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		return b;
	}
}
