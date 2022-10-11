package problem06;

import java.math.BigInteger;
import java.util.Scanner;

public class Ex06KthNumber {
	public static void main(String[] args) {
		BigInteger position = getPosition();
		kthNumber(position);
	}

	private static void kthNumber(BigInteger position) {
		BigInteger numberLeft = BigInteger.ONE;
		int numberOfNumber = 0;
		for (int i = 1;; i++) {
			BigInteger temp = numberLeft.add(
					pow(BigInteger.valueOf(10), i - 1).multiply(BigInteger.valueOf(9)).multiply(BigInteger.valueOf(i)));
			if (1 == temp.compareTo(position)) {
				numberOfNumber = i;
				break;
			}
			numberLeft = temp;
		}
		numberLeft = position.subtract(numberLeft);
		String theNumber = pow(BigInteger.valueOf(10), numberOfNumber - 1)
				.add(numberLeft.divide(BigInteger.valueOf(numberOfNumber))).toString();
		int positionInTheNumber = Integer.parseInt(numberLeft.mod(BigInteger.valueOf(numberOfNumber)).toString());
		// RESULT
		System.out.println("=======");
		System.out.println("The number: " + theNumber);
		System.out.println("Position in the number: " + (positionInTheNumber + 1));
		System.out.println("Result: " + theNumber.charAt(positionInTheNumber));
	}

	private static BigInteger getPosition() {
		Scanner sc = new Scanner(System.in);
		BigInteger bigInteger;
		while (true) {
			try {
				System.out.print("Input K(>0 and can be BigInteger): ");
				bigInteger = new BigInteger(sc.nextLine());
				if (1 != bigInteger.compareTo(bigInteger.valueOf(0)))
					throw new Exception();
				break;
			} catch (Exception e) {
				System.out.println("Invalid!!!");
			}
		}
		return bigInteger;
	}

	private static BigInteger pow(BigInteger bigInt, int n) {
		BigInteger result = BigInteger.ONE;
		for (int i = 0; i < n; i++)
			result = result.multiply(bigInt);
		return result;
	}
}
