package view;

public class Ex02LargestNumber {
	public static void main(String[] args) {
		String s = "aa6b546c6e22h, aa6b326c6e22h";

		char[] sarr = s.toCharArray();

		for (int i = 0; i < sarr.length; i++) {

			if (sarr[i] / 1 >= 48 && sarr[i] / 1 <= 57) {

				System.out.print(sarr[i] + ",");
			}
		}
	}
}
