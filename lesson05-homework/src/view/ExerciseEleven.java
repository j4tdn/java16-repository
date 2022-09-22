package view;

import java.util.Scanner;

public class ExerciseEleven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double fraction;
		int fractionValue;
		int decimal;
		double value;

		System.out.println("Enter Numerator: ");
		int numerator = sc.nextInt();
		System.out.println("Enter Denominator: ");
		int denominator = sc.nextInt();

		fraction = (double) numerator / denominator;
		fractionValue = (int) (fraction * 10);
		decimal = fractionValue % 10;
		value = decimal * 0.1;

		System.out.println(value);
	}
}
