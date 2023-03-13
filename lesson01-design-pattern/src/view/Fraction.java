package view;
import java.util.Scanner;
public class Fraction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int part1, part2, part3;
		part1 = a / b;
		if (a == 0) {
			System.out.println(a);
		} else if (a % b == 0) {
			System.out.println(part1);
		} else {
			part2 = a - part1 * b;
			part3 = b;
			int gcds = gcd(part2, part3);
			if (gcds > 1) {
				part2 = part2 / gcds;
				part3 = part3 / gcds;
			}
			if (part1 > 0) {
				System.out.println(part1 + " " + part2 + "/" + part3);
			} else {
				division(a, b);
			}
		}
	}
	public static String division(double a, double b) {
		String result = "";
		String dString = Double.toString(a/b);
		String[] fraction = dString.split("\\.");

		int denominator = (int) Math.pow(10, fraction[1].length());
		int numerator = Integer.parseInt(fraction[0] + "" + fraction[1]);
		
		
		if ((numerator / gcd(numerator, denominator))/denominator / gcd(numerator, denominator) != 0) {
			result = numerator / gcd(numerator, denominator) + "/" + denominator / gcd(numerator, denominator);	
		} else {
			result =((numerator / gcd(numerator, denominator))/denominator / gcd(numerator, denominator)) + numerator / gcd(numerator, denominator) + "/" + denominator / gcd(numerator, denominator);
		}
		return result;	
	}
	private static int gcd(int a, int b) {
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}
}
