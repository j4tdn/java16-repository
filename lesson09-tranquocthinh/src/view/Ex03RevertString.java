package view;

public class Ex03RevertString {
	public static void main(String[] args) {
		String n = "aa6b546c6e22h";

		System.out.println(findLargestNumbers(n));
	}

	public static int findLargestNumbers(String n) {

		String[] stringNumber = n.split("[^\\d]+");
		int[] numbers = new int[stringNumber.length];

		for (int i = 0; i < stringNumber.length; i++) {
			numbers[i] = Integer.parseInt(stringNumber[i]);
		}

		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			max = (max > numbers[i]) ? max : numbers[i];
		}

		return max;

	}

}
