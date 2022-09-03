package sortnumbers;

public class sortTheNumbers {
	public static void main(String[] args) {
		int number[] = { 12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18 };
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 7 == 0 && number[i] % 5 != 0) {
				System.out.print(number[i] + " ");
			}
		}
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 35 == 0 || (number[i] % 5 != 0 && number[i] % 7 != 0)) {
				System.out.print(number[i] + " ");
			}
		}
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 5 == 0 && number[i] % 7 != 0) {
				System.out.print(number[i] + " ");
			}
		}
	}
}
