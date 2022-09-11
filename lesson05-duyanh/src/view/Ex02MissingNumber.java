package view;

public class Ex02MissingNumber {
	public static void main(String[] args) {
		int[] number = {3,2,1,6,5};
		System.out.println(getMissingNumber(number, 6));
	}
	private static int getMissingNumber(int[] numbers, int n) {
		int sumAll = n*(n+1)/2;
		int sumArray = sum(numbers);
		return sumAll - sumArray;
	}
	
	private static int sum(int[] numbers) {
		int sum = 0;
		for (int i : numbers) {
			sum += i;
			
		}
		return sum;
	}

}
