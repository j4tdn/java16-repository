package view;

public class Ex02MissingNumber {
	public static void main(String[] args) {
		int n=6;
		int[] numbers = {7,9,10,6,5};
		System.out.println("Missing element: "+getMissingNumber(numbers,n));
		//= -16 ?
	}
	private static int getMissingNumber(int[] numbers,int n) {
		int sumAll=n*(n+1)/2;
		int sumArray=sum(numbers);
		
		return sumAll-sumArray;
	}
	private static int sum(int[] numbers) {
		int sum=0;
		for(int number:numbers) {
			sum+=number;
		}
		return sum;
	}
}
