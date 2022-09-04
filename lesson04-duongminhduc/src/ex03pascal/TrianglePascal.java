package ex03pascal;

import java.util.Scanner;

public class TrianglePascal {
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Enter n: ");
		n = sc.nextInt();
		int a[][] = new int[n+1][n+2];
		
		for (int i = 0;i <= n;i++)
		{
			a[i][0] = 1;
			System.out.print(a[i][0]+ " ");
			a[i][i+1] = 1;
			
			for(int j = 1;j<=i;j++)
			{
				a[i][j] = a[i-1][j-1] + a[i-1][j];
				System.out.print(a[i][j] + " ");
			}
			System.out.print(a[i][i+1] + " ");
			System.out.println("\n");
		}
	}
}
