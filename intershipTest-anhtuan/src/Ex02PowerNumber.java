
public class Ex02PowerNumber {
	public static void main(String[] args) {
		System.out.println(isPowerOf(8, 64));
		System.out.println(isPowerOf(8, 65));
	}
	private static boolean isPowerOf(int n, int a) {
		for(int i = 0; i < 100; i++) {
			if(Math.pow(a, i) == n || Math.pow(n, i) == a) {
				return true;
			}
		}
		return false;
		
		
	}

}
