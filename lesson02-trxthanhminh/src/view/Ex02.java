package view;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		Random rd = new Random();
		int nb1 = rd.nextInt(10);
		System.out.println("Random: " + nb1);
		Random ab = new Random();
		int nb2 = ab.nextInt(10);
		System.out.println("Random: " + nb2);
		Random bc = new Random();
		int nb3 = bc.nextInt(10);
		System.out.println("Random: " + nb3);
		Random cd = new Random();
		int nb4 = cd.nextInt(10);
		System.out.println("Random: " + nb4);
		giaithua(nb1);
		giaithua(nb2);
		giaithua(nb3);
		giaithua(nb4);
		double sum = 0.0f;
		
		sum = giaithua(nb1) + giaithua(nb2) + giaithua(nb3) + giaithua(nb4);
		System.out.println("Result: " + sum);
			
		}
		

	public static double giaithua(int n) {
	double tmp = 1;
		if (n > 1) {
		for (int i = 2; i <= n; i++) {
		tmp *= i;
		}
		}
		return tmp;
		}
	
}
