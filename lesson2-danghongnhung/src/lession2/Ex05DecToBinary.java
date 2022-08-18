package lession2;

import java.util.Scanner;

public class Ex05DecToBinary {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập n: ");
		int n = ip.nextInt();
		System.out.println("giá trị nhị phân của " + n + " là: ");
		DecToBin(n);

	}
	
	private static void DecToBin(int n) {
		int []arr = new int[50];
		int index = 0;
		while(n > 0) {
			arr[index++] = n % 2;
			n /= 2;
		}
		
		 for(int i = index-1;i >= 0;i--){
	            System.out.print(arr[i]);
	      }
	}


}
