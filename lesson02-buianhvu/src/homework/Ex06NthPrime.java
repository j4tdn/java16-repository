package homework;

public class Ex06NthPrime {
	public static void main(String[] args) {
		int running = 2;
		int count = 0;
		while(true) {
			if(isPrime(running)) {
				
				if(++count == 200) {
					System.out.println("200 th prime: "+running);
					break;
				}
			}
			
			running ++;
		}
	}
	
	private static boolean isPrime(int num) {
		if (num == 0 || num == 1) {
			return false;
		}
		
		for (int i = 2;i<=Math.sqrt(num);i++) {
			if (num%i == 0) {
				return false;
			}
		}
		return true;
	}

}
