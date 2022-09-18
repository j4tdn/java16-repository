package view;

public class Ex02_MissingNumber_w2 {
	public static void main(String[] args) {
		int n = 7;
		int []numbers = {1, 2, 4, 3, 5 ,7};
		System.out.println(findMissing(numbers,n));
	}
	private static int findMissing(int []numbers, int n) {
		int sumAll = n *(n+1)/2 ;
		int sum = sum(numbers);
		return sumAll  - sum;
	}
	
	private static int sum(int[] numbers) {
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		return sum;
	}
}


