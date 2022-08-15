package exercise;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int number = 0;
		Scanner ip = new Scanner(System.in);
		Boolean check = true;
		int count = 0;
		do {
			System.out.print("nhap vao` 1 so` : ");
			String numberAsText = ip.nextLine();
			if(numberAsText.matches("\\d+")) {
				check = false;
				number = Integer.parseInt(numberAsText);
				System.out.println(isPowerOfTwo(number)?number + " la` thua` so cua 2":number + " khong la` thua` so cua 2");
			}
			else {
				count++;
				System.out.println();
			}
		} while (check && count < 3);
		System.out.println("Finish...");
		
	}
	
	private static boolean isPowerOf(int a, int b) {
		if(b<=0) return false;
		double n = Math.log(b)/Math.log(a);
		return Math.ceil(n) == Math.floor(n);
	}
	
	private static boolean isPowerOfTwo(int x){
	    return (x & (x - 1)) == 0;
	}
}
