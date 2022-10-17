package view;

import java.util.Arrays;

public class Ex01Topic02 {
	
	public static void main(String[] args) {
		int [] a = { 2 , 8 ,9 ,1 ,6};
		int [] b = { 2 , 1 ,1 ,8 ,9};
		int [] c =  equalData(a, b);
		System.out.println(Arrays.toString(equalData(a, b)));
		
		int size = 0;
		int [] arr = new int[c.length];
		boolean isExist = false;
		for(int i = 0; i < c.length ; i ++) {
			isExist = false;
			for(int j = 0; j < c.length ; j ++) {
				if(c[i] == arr[j]) {
					isExist = true;
					break;
				}
			}
			if(!isExist) {
				arr[size++] = c[i];
			}
			
		}
		
		int v = 0;
		for (int i = 0; i < arr.length; i++) {
	        if (arr[i] != 0) {
	        	
	            arr[v] = arr[i];
	            v++;
	            System.out.print(arr[i] + "  ");
	        }
	    }
		
		
	}
	
	public static int[] equalData(int []a, int []b) {
		int[] c = new int[a.length + b.length];
		int count = 0;
		for(int i = 0 ; i < a.length ; i ++) {
			for(int j = 0; j < b.length ; j ++) {
				if(a[i] == b[j]) {
					c[count] = a[i];
					count++;
				}
			}
		}
		return Arrays.copyOfRange(c, 0, count);
	}

}
