package homework;

import java.util.*;

public class Ex05RadixConversion {
	
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.print("Nhập giá trị: ");
		int n = t.nextInt();	
		System.out.println("Giá trị nhị phân của " + n + " là:");
		convert(n);
	}
	
	private static void convert(int n) {
		int b[] = new int [20];
		int a = 0;
		while(n > 0) {
			b[a++] = n%2;
			n = n/2;
		}
		for(int i = a-1; i >= 0; i--) {
			System.out.print(b[i]);			
		}
	}
}
