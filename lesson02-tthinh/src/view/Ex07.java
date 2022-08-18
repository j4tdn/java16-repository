package view;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		int[] number = new int[5];
		int n = new Random().nextInt(20, 30);
		int n1 = new Random().nextInt(20, 30);
		int n2 = new Random().nextInt(20, 30);
		int n3 = new Random().nextInt(20, 30);
		int n4 = new Random().nextInt(20, 30);
		if (n == n1 || n == n2 || n == n3 || n == n4 || n1 == n2 || n1 == n3 || n1 == n4 || n2 == n3 || n2 == n4|| n3 == n4) {
			Ex07.main(args);
		} else {
			System.out.println("Number 0: " + n);
			System.out.println("Number 1: " + n1);
			System.out.println("Number 2: " + n2);
			System.out.println("Number 3: " + n3);
			System.out.println("Number 4: " + n4);
		}
	}
}
