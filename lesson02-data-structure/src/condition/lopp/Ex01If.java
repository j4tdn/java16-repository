package condition.lopp;

public class Ex01If {

	public static void main(String[] args) {
		int number = 8;
		if (isEven(number)) {
			System.out.println(number + " is even number !!!");
		}
		System.out.println("Finish...");
	}

	private static boolean isEven(int number) {
		return number % 2 == 0;
	}

}
