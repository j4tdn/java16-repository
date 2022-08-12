package view;

import java.util.Iterator;
import java.util.Scanner;

public class Ex04GreatestOddNumber {

	public static void main(String[] args) {
		double[] array;
		int max = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("integer sequence: ");
		int n  = sc.nextInt();
		array = new double[n];
		for (int i = 0; i < array.length; i++) {
			System.out.print("enter the th element " + i +":");
			array[i] = sc.nextDouble();
		}
		for (int i = 0; i < n; i++) {
			if (array[i] % 2 == 1 && array[i] > max ) {
				max = (int) array[i];
			}
		}
		System.out.println("largest odd number= " + max);
	}

}
