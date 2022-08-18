package view;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] n = new int[5];
		for(int i=0; i<5; i++) {
			while(true) {
				int numbers = 20 + rd.nextInt(30-20+1);
				int flag = 0;
				for(int j=0; j<i; j++) {
					if(numbers==n[j]) {
						flag = 1;
						break;
					}
				}
				if(flag==0) {
					n[i] = numbers;
					break;
				}
			}
			System.out.print(n[i] + " ");
		}
	}
}
