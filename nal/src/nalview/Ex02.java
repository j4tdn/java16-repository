package nalview;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int minSpeed = sc.nextInt();
		int speedNow = sc.nextInt();
		int sub = speedNow - minSpeed;
		
		if(minSpeed > speedNow) {
			System.out.println("Congratulations, you are within the speed limit!");
		}
		if(1 <= sub && sub <= 20) {
			System.out.println("You are speeding and your fine is $100.");
		}
		if(21 <= sub && sub <= 30) {
			System.out.println("You are speeding and your fine is $270.");
		}
		if(sub >= 31) {
			System.out.println("You are speeding and your fine is $500.");
		}
		
	}

}
