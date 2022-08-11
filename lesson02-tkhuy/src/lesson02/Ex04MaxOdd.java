package lesson02;

import java.util.Scanner;

public class Ex04MaxOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner ip = new Scanner(System.in);
			System.out.print("Nhập n: ");
			int n = ip.nextInt();
			int [] a = new int[n];
			for(int i = 0; i < n; i++) {
				System.out.println("Nhập phần tử thứ : " +i);
				a[i] = ip.nextInt();
			}
			
			System.out.println("Số lẻ lớn nhất trong mảng: " + MaxOdd(a,n));

		}
		private static int MaxOdd(int []a, int n) {
			int max = a[0];
			for(int i = 1; i < n; i++) {
				if((a[i] % 2 != 0) && (a[i] > max))
					max = a[i];
			}
			return max;

	}

}
