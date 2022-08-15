package homework;

public class Ex03Symectric {
	public static void main(String[] args) {
		// 121  --> T
		// 123  --> F
		// 1221 --> T
		System.out.println(isSymectric(12354321));
	}
	
	private static boolean isSymectric(int number) {
		int sym = 0;
		int initialNumber = number;
		while(number != 0) {
			sym = sym*10 + number%10;
			number /= 10;
		}
		return initialNumber == sym;
		
	}
}
