package condition;

public class Ex01If {
	public static void main(String[] args) {
		int number = 8;
		if (isEven(number)) {
			System.out.println(number + " is even number!!!");
		}
		System.out.println("Finish...");
	}

	private static boolean isEven(int a) {
		return a % 2 == 0;
	}
}
