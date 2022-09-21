package view;

public class Ex02DivideThrows {

	public static void main(String[] args) {
		System.out.println("Result 1: " + divide(4, 2));
		System.out.println("Result 2: " + divide(5, 0));

	}
	
	private static int divide(int a, int b) throws ArithmeticException {
		return a / b;
	}

}
