package ex01;

public class Demo {
	public static void main(String[] args) {
		isPowerOf(2, 8);
		}
		
	
	private static boolean isPowerOf(int a, int b) {
		for (int i = 1; i <= 100; i++) {
			if (Math.pow(a, i) == b || Math.pow(b, i) == a) {
				return true;
			}
		}
		return false;
	}

}
	


