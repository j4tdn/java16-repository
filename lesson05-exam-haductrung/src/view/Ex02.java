package view;

public class Ex02 {
	public static void main(String[] args) {
		int [] numbers= {3,2,1,5,6};
		int n=6;
		System.out.println("Missing: " +getMissingNumber(numbers, n));
	}
	private static int getMissingNumber(int[] numbers, int n) {
		int sumAll =n*(n+1)/2;
		int sumArray =sum(numbers);
		return sumAll-sumArray;
	}
	private static int sum(int[] number) {
		int sum=0;
		for(int numbers: number) {
			sum=numbers+sum;
		}
		return sum;
	}

}
