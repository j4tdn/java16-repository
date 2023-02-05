package ex;

public class Ex03HappyNumber {
	private static boolean isHappyNumber(int number) {
		if (number <= 0) return false;
		
		int res = 100;
		
		do {
			res = 0;
			while(number > 0) {
				res += (Math.pow(number % 10, 2));
				number /= 10;
			}
			number = res;
			System.out.println("num = " + number);
		} while(number > 10);
		System.out.println("final res = "+ res);
		return res == 1;
	}
	
	public static void main(String[] args) {
		System.out.println("Is that a happy number? "+ isHappyNumber(5));
	}
}
