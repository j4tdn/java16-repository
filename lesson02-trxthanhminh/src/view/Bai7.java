package view;

import java.util.Random;

public class Bai7 {
	public static void main(String[] args) {
		
		
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		Random rd = new Random();
		int rdIndex;
		int rdValue = 20 + rd.nextInt(30);
		
		for (int i = 0; i < arr.length; i++) {
			
			rdIndex = rd.nextInt(arr.length);
			rdValue = arr[rdIndex];
			arr[rdIndex] = arr[i];
			arr[i] = rdValue;
			System.out.println(arr[i]);
			
		}
	}
}
