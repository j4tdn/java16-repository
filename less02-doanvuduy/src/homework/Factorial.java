package homework;

public class Factorial {
	public static void main(String[] args) {

	}

	private static int factorial(int n) {
		int result = n;
		while (n > 1) {
			result *= --n;
		}
		return result;
	}

//using variables .. instead of array in some case
	private static int sumOfFactorial(int... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += factorial(number);
		}
		return sum;
	}

}
