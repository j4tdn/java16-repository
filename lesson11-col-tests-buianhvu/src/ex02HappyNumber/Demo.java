package ex02HappyNumber;

import static ex02HappyNumber.CheckNumber.*;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number = sc.nextInt();
		System.out.print(number);
		System.out.println(HappyNumber(number) ? " is a happy number" : " is not a happy number");
	}
}
