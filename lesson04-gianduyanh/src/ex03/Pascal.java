package ex03;

import java.util.Scanner;

public class Pascal {
	public static void main(String[] args) {
		outPutPascal();
	}
	
	static int pasCal(int k, int n) {
		if (k == 0 || k == n)
			return 1;
		else
			return pasCal(k, n - 1) + pasCal(k - 1, n - 1);
	}

	static void outPutPascal() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i <= n+1; i++) {
			for (int k = 0; k <= i; k++) {
				System.out.print(pasCal(k, i) + " ");
				
			}
			System.out.println(" ");
		}
	}
	

}
