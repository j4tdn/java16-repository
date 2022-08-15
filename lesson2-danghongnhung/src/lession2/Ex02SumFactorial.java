package lession2;

public class Ex02SumFactorial {

	public static void main(String[] args) {
		System.out.println(SumOfFactorial(new int [] {5}));
		System.out.println(SumOfFactorial(4,5));
	}
	public static long SumOfFactorial(int... numbers) {
		int sum =0;
		for(int number: numbers) {
			sum += factorial(number);
		}
		return sum;
	}
	
	public static long factorial(int n) {
		if(n == 0 || n ==1 ) return 1;
		return n * factorial(n -1);
		/*
		int result = n;
		while(n > 1) {
			result *= --n;
		}
		return result;
		*/
	}
}
