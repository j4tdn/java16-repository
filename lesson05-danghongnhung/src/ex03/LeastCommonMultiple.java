package ex03;

import java.util.Scanner;

public class LeastCommonMultiple {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n;
		do {
			System.out.println("Input n: ");
			n = ip.nextInt();
			if (n <= 2 || n >= 20) {
				System.out.print("error!! Enter 2<n<20: ");
			}
		} while (n <= 2 || n >= 20);

		int[] number = new int[n];
		
		for (int i = 0; i < number.length; i++) {
			do {
				System.out.println("Input number[" + i + "]: ");
				number[i] = ip.nextInt();
				if (number[i] < 1 || number[i] > 10) {
					System.out.print("error!! Enter Ak = [1, 10]: ");
				}
			} while (number[i] < 1 || number[i] > 10);
			
		}
		
		for(int num : number) {
			System.out.print(num + " ");
		}
		
		System.out.println("\nBCNN: " + getLeastCommonMultiple(number));
	}

	static int getLeastCommonMultiple(int a[]) {
		int b = 1;
		boolean check = true;
		
		while (true) {
			for (int i = 0; i < a.length; i++) {
				if (b % a[i] == 0) {
					check = false;
				} else {
					check = true;
					break;
				}
			}
			if (check == false)
				return b;
			b++;
		}
	}
}
