package homework;

public class Ex02Factorial {
	public static void main(String[] args) {
		System.out.println(sumOfFactorial(new int[] {5}));
		System.out.println(sumOfFactorial(4, 5));
		System.out.println(sumOfFactorial(4, 5, 7));
		System.out.println(sumOfFactorial());
	}
	
	// using variables ... instead of array in some case
	private static int sumOfFactorial(int... numbers) {
		int sum = 0;
		for (int number: numbers) {
			sum += factorial(number);
		}
		return sum;
	}
	
	private static int factorial(int n) {
		int result = n; 
		while(n > 1) {
			result *= --n;
		}
		return result;
	}
}
