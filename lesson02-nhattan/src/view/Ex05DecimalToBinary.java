package view;

/**
 * 	Bài 5: Viết chương trình chuyển đổi một số tự nhiên ở hệ cơ số 10 thành số ở hệ
	cơ số 2
 */

public class Ex05DecimalToBinary {
	public static void main(String[] args) {
		System.out.println(decToBin(15));
	}
	
	private static int decToBin(int number) {
		String bin = "";
		while (true) {
			if (number == 0) {
				break;
			}
			bin = "" + bin + number % 2;
			number = number / 2;
		}
		bin = reverse(bin);
		return Integer.parseInt(bin);
	}
	
	private static String reverse(String text) {
		String reverse = "";
		for (int i = text.length() - 1; i >= 0; i--) {
			reverse = "" + reverse + text.charAt(i);
		}
		return reverse;
	}
}
