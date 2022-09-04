package view;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		String nAsText = "";
		do {
		System.out.print("Nhập n : ");
		nAsText = sc.nextLine();
		}while(!nAsText.matches("\\d+"));
		n = Integer.parseInt(nAsText);
		prinPascal(n);
	}
	
	public static void prinfArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void prinPascal(int n) {
		int[] arr = {1,1};
		prinfArr(arr);
		for (int i = 0; i < n; i++) {
			int[] tmp = new int[arr.length+1];
			for (int j = 0; j < tmp.length; j++) {
				if(j == 0 || j == tmp.length-1) {
					tmp[j] = 1;
				}else {
					tmp[j] = arr[j] + arr[j-1];
				}
			}
			arr = tmp;
			prinfArr(arr);
		}
	}

}
