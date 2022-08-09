package lession2;

public class Ex02SumFactorial {

	public static void main(String[] args) {
		long sum = Factorial(4) + Factorial(7) + Factorial(12) + Factorial(18);
		System.out.println("Tổng giai thừa của 4! +7! + 12! + 18! là :" +sum);
	}
	
	public static long Factorial(int n) {
		if(n == 0 || n ==1 ) return 1;
		return n * Factorial(n -1);
	}
}
