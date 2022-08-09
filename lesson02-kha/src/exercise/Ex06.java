package exercise;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		boolean[] Eratosthenes = new boolean[9999];
		for(int i = 2; i < Eratosthenes.length; i++) {
			Eratosthenes[i] = true;
		}
		for(int i = 2; i < Eratosthenes.length; i++) {
			for(int j = 2; j < Eratosthenes.length; j++) {
				if(i*j >= Eratosthenes.length) continue;
				Eratosthenes[i*j] = false;
			}
		}
		Scanner ip = new Scanner(System.in);
		String numberAsText = "";
		do {
			System.out.print("Nhập vào vị trí số nguyên tố : ");
			numberAsText = ip.nextLine();
		}while(!numberAsText.matches("\\d+"));
		int range = Integer.parseInt(numberAsText);
		int count = 0;
		System.out.print("Số nguyên tố thứ " + range + " là : ");
		for(int i = 0; i < Eratosthenes.length; i++) {
			if(Eratosthenes[i]) {
				count++;
				if(count == range)
					System.out.println(i);
			} 
			else continue;
		}
	}
}
