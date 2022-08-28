package view;

public class Ex06 {
	public static void main(String[] args) {
		int running = 2;
		int count = 0; // if (running is prime) --> count++
		while(true) {
			if(isPrime(running)) {
				if(++count == 200) {
					System.out.println("200th prime: " + running);
					break;
			}
			}
			running++;
		}
		}
	private static boolean isPrime(int number) {
		if(number == 0 || number == 1) {
			return false;
		}
		for (int i=2; i <= Math.sqrt(number); i++) {
			if(number %i == 0) {
				return false;
			}
		}
		return true;
	
	}
}