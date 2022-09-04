package pascal;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
		int n;
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap n: ");
	    n = ip.nextInt();
	  System.out.println("---------PASCAl---------"); 
	    for (int i = 0; i < n; i++) {
	        for (int j = n; j > i; j--)
	            System.out.print(" ");
	        for (int j = 0; j <= i; j++) 
	            System.out.print(pT(j, i) + " ");
	        	System.out.println();
	        }       
	}

	public static int pT(int k, int n) {
		if (k == 0 || k == n)
			return 1;
		if (k == 1)
			return n;
		return pT(k - 1, n - 1) + pT(k, n - 1);
	}
}
