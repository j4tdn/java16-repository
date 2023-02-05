package exam;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int number = ip.nextInt();
		if(isHappyNumber(number)) {
			System.out.println("Number is a happy number");
		} else {
			System.out.println("Number is not a happy number");
		}
		ip.close();
	}

	public static int happyNumber(int number) {
		int temp = 0,sum = 0;
		while(number > 0) {
			temp = number % 10;
			sum += temp*temp;
			number /= 10;
		}
		return sum;
	}

	public static boolean isHappyNumber(int number) {
		int currentNum= number;
		for (int round = 0; round < 100; round++) {
			if (happyNumber(currentNum) == 1) {
				return true;
			}
			currentNum = happyNumber(currentNum);
		}
		return false;
	}
	

}
