package exercise02_OrganizeArray;

import java.util.Random;
import java.util.Scanner;

public class OrganizeArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = rd.nextInt(100);
		}

		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println();

		int j = 0;
		
		for(int i = 0; i<n; i++) {
			if ((array[i] % 7 == 0) && (array[i] % 5 == 0)) {
				continue;
			}
			if (array[i] % 7 == 0) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				j++;
			}
		}
		
		int k = n-1;
		for(int i = n-1; i>=0; i--) {
			if ((array[i] % 7 == 0) && (array[i] % 5 == 0)) {
				continue;
			}
			
			if (array[i] % 5 == 0) {
				int temp = array[k];
				array[k] = array[i];
				array[i] = temp;
				k--;
			}
		}

		System.out.println("after organisation: ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + ", ");
		}
		sc.close();
	}
}
