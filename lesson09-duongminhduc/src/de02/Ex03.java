package de02;

public class Ex03 {
	public static void main(String[] args) {

		int arr[] = {8, 5 ,9, 20};
		 int temp = arr[0];
		 int a,b;
	        for (int i = 0 ; i < arr.length - 1; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	            	a = arr[i];
	            	b = arr[j];
					if (UC(a) > UC(b)) {
	                    temp = arr[j];
	                    arr[j] = arr[i];
	                    arr[i] = temp;
	                }
	            }
	        }
	        for(int i = 0;i<arr.length;i++)
	        {
	        	System.out.println(arr[i] + " ");
	        }
	}
	private static int UC(int n)
	{
		int dem= 0;
		for(int i = 1;i <= n;i++)
		{
			if(n % i == 0)
			{
				dem ++;
			}
		}
		return dem;
	}
	
}
