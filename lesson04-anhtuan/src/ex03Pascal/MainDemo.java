package ex03Pascal;

import java.util.Scanner;

public class MainDemo {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap n= ");
		int n = ip.nextInt();
		int [][] a = new int [n+1][n+2];
		for(int i = 0; i <= n; i++) {
			for(int j =0; j <= n+1; j++) {
				a[i][0] = 1;
				a[i][j] = a[i-1][j-1] + a[i-1][j];
				a[i][j=i+1]= 1;
			}
		}
		for(int i =0; i <= n; i++) {
			for(int j =0; j<= n+1; j++){
				System.out.println(a[i][j] +"\t");
			}
			System.out.println("\n");
		}ip.close();
	}

}
