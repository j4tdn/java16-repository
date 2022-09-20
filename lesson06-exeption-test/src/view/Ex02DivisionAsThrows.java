package view;

public class Ex02DivisionAsThrows {
	public static void main(String[] args) {
		System.out.println("divide " + divide(10, 0));
		
	}
	private static int divide( int a, int b) throws ArithmeticException {
		
		return a/b;
		
	}
}
