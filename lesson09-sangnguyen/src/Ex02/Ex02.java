	package Ex02;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		
		Random rd = new Random();
		int n = rd.nextInt(1000);
		if (!sohanhphuc(n)) {
			System.out.print(n + " khong phai la so hanh phuc");
		} else {
			System.out.print(n + " la so hanh phuc");
		}
	}
	
	public static int chiahet(int n) {
		return n/10;
	}
	
	public static int chiadu(int n) {
		return n%10;
	}
	
	public static boolean sohanhphuc(int n) {
		int temp[] = new int[10];
        int count = 0;
        int superCount = 0;
		while(n > 1) {
			if (n >= 100) {
				temp[count++] = n%10;
				n = n/10;
			} else {	
				
				if (n < 100 && n >= 10) {
					n = (n/10)*(n/10) +(n%10)*(n%10);
					System.out.println(n);
				}
				if (n < 10) {
					n = n*n;
					System.out.println(n);
				}
				
				for (int i = 0; i < count; i++) {
					n = n + temp[i]*temp[i];
					temp[i] = 0;
				}
			    count = 0;
			}	
			
			 if (superCount++ == 100000) {
				 superCount = -1;
				 n = 0;
			 }
		}
		if (superCount == -1) return false;
			else return true;
	}
}
