package Ex02;

public class App {
	public static void main(String[] args) {
		isCheck("01a2b3456cde4789");
	}

	private static void isCheck(String text) {
		String regex = "[^\\d]+";
		int[] isDigit = new int[text.length()];
		String[] str = text.split(regex);
		for (int i = 0; i < str.length; i++) {
			isDigit[i] = Integer.parseInt(str[i]);
		}
		System.out.println(isMax(isDigit));

	}

	private static int isMax(int[] number) {
		int max = number[0];
		for (int i = 0; i < number.length; i++) {
			if (number[i] > max) {
				max = number[i];
			}
		}
		return max;
	}
}
