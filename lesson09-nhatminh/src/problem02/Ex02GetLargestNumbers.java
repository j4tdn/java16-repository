package problem02;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Ex02GetLargestNumbers {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		while (true) {
			try {
				System.out.print("Input number of strings: ");
				n = Integer.parseInt(sc.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("Invalid number!!!");
			}
		}
		String[] listInput = getString(n);
		System.out.println("=======");
		printLargestNumbers(listInput);
	}

	private static void printLargestNumbers(String[] listStrings) {
		BigInteger[] results = new BigInteger[listStrings.length];
		System.out.println("Result:");
		for (int i = 0; i < listStrings.length; i++) {
			results[i] = getLargestNumbers(listStrings[i]);
			System.out.println("String[" + (i + 1) + "]: " + listStrings[i] + " ---> " + results[i]);
		}
		BigInteger max = BigInteger.ZERO;
		Arrays.sort(results);
		System.out.println("OUTPUT:");
		System.out.println(Arrays.toString(results));
	}

	private static BigInteger getLargestNumbers(String str) {
		String[] numList = str.replaceAll("[a-z]", " ").trim().split("\\s+");
		BigInteger max = BigInteger.ZERO;
		for (String num : numList) {
			BigInteger temp = (num.equals("")) ? BigInteger.ZERO : new BigInteger(num);
			if (temp.compareTo(max) == 1)
				max = temp;
		}
		return max;
	}

	private static String[] getString(int n) {
		String[] result = new String[n];
		for (int i = 0; i < n; i++) {
			while (true) {
				System.out.print("Input string[" + (i + 1) + "]: ");
				result[i] = sc.nextLine();
				if (result[i].matches(".*[^0-9a-z].*")) {
					System.out.println("0-9 and a-z only!!!");
				} else
					break;
			}
		}
		return result;
	}
}
