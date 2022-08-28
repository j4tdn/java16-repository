package view;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập n: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Nhập các phần tử cho mảng: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print("Nhập phần tử thứ " + i + ": ");
	        arr[i] = sc.nextInt();
	    }
	         
	    System.out.println("\nDãy số đã nhập: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print(arr[i] + "\t");
	    }
	    int max = arr[0];
	    for (int i = 0; i < n; i++) {
	    	
	    	if (arr[i] > max && arr[i]%2 == 1 )
	    		max = arr[i];
	    }
	    
	    System.out.println("\nSố lẻ lớn nhất là: " + max);
	}
}
