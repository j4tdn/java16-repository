package view;

public class Ex02 {
	public static void main(String[] args) {
		String input = "aaaaaabbbcddde";
		System.out.println(countingNumber(input));
	}

	private static String countingNumber(String input) {
		int length = input.length();
		int[] count = new int[200];
		String result = "";

		for (int i = 0; i < length; i++) {
			count[input.charAt(i)]++;
		}
		char array[] = new char[input.length()];
		for (int i = 0; i < length; i++) {

			array[i] = input.charAt(i);
			int flag = 0;
			for (int j = 0; j <= i; j++) {
				if (input.charAt(i) == array[j])
					flag++;
			}
			if (flag == 1) {
				int max = 0;
				for (i = 0; i < input.length(); i++) {
					if (count[input.charAt(i)] > max) {
						max = count[input.charAt(i)];
						result = String.valueOf(input.charAt(i));
					}
				}
			}
		}
		return result;
	}
}
