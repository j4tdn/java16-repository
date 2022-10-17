package ex02;

public class StringLargestNumber {

	public static void main(String[] args) {
		check("4545sdasdf4433d33233223");
	}

	private static void check(String text) {
		String regex = "[^\\d]+";

		int[] isDigit = new int[text.length()];

		String[] str = text.split(regex);
		for (int i = 0; i < str.length; i++) {
			isDigit[i] = Integer.parseInt(str[i]);
		}
		System.out.println(maximum(isDigit));

	}

	private static int maximum(int[] number) {
		int max = number[0];
		for (int i = 0; i < number.length; i++) {
			if (number[i] > max) {
				max = number[i];
			}
		}
		return max;
	}

}
