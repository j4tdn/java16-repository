package ex03;

import java.util.Scanner;


public class Ex03 {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Enter n: ");
        int n = scanner.nextInt();
        
        int [] arr = new int [n];
        System.out.print("\nEnter array: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        
        sort(arr);
        show(arr);
    }
		
	
	
	public static int Count(int N)
	{
	    int count = 0;
	    for (int i = 1; i <= N; i++)
	    {
	        if (N % i == 0)
	            count++;
	    }

	    return count;
	}
	
	 public static void sort(int [] arr) {
	        int temp = arr[0];
	        for (int i = 0 ; i < arr.length - 1; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (Count(arr[i]) > Count(arr[j])) {
	                    temp = arr[j];
	                    arr[j] = arr[i];
	                    arr[i] = temp;
	                }
	            }
	        }
	    }
	 public static void show(int [] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}
	


