package views;

public class Ex02HappyNumber {
	public static void main(String[] args) {
		System.out.println("is Happy Number: " + isHappyNumber(16));
	}
	
	private static boolean isHappyNumber(int number) {
		int tmp = number;
		int replace = 0;
		while(replace != 1 && replace != tmp) {
			replace = 0;
			while (number != 0) {
				replace += (number % 10) * (number % 10);
				number /= 10;
			}
			number = replace;
		}
		
		return replace == 1;
	}
}
