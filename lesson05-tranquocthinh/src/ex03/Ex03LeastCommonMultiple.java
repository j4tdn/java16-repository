package ex03;

import java.util.Arrays;

public class Ex03LeastCommonMultiple {
	public static void main(String[] args) {
		int[] set = { 2, 3, 4 };
		int lcm = 1;
		for (int each : set) {
			lcm = calculateLcm(lcm, each);
		}

		System.out.println("The smallest lcm is: " + Arrays.toString(set) + " is : " + lcm);
	}

	private static int calculateLcm(int lcm, int each) {
		return lcm * each / getLeastCommonMultiple(lcm, each);
	}

	private static int getLeastCommonMultiple(int num1, int num2) {
		if (num1 == 0 || num2 == 0)
			return 0;

		if (num1 == num2)
			return num1;

		if (num1 > num2)
			return getLeastCommonMultiple(num1 - num2, num2);
		return getLeastCommonMultiple(num1, num2 - num1);
	}

}
