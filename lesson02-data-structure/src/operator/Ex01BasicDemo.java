package operator;

public class Ex01BasicDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 22;

		if (isPowerOf10AndLessThan100(b) == true) {
			System.out.println("b la so hop le");

		} else {
			System.out.println("b khong dung");
		}
	}

	private static boolean isPowerOf10AndLessThan100(int number) {
		return number % 10 == 0 && number < 100;
	}

}
