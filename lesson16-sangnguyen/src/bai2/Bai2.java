package bai2;

public class Bai2 {
	public static void main(String[] args) {
		int a = 5, b = 1;
		isPowerOf(a,b);
	}

	public static void isPowerOf(int a, int b) {
		if ((a == 1) || ( b == 1)) {
			System.out.println("true");
			System.exit(0);
		} 
		if ((a == 0) || (b == 0)) {
			System.out.println("false");
			System.exit(0);
		}
		if (a > b) {
			for (int i = 1; i< a / 2; i++) {
				if ( a == Math.pow(b,i)) {
					System.out.println(a);
					System.exit(0);
				}
			} 
			System.out.println("false");
		}
		else {
			for (int i = 1; i < b / 2; i++) {
				if ( b == Math.pow(a,i)) {
					System.out.println("true");
					System.exit(0);
				}
			}
			System.out.println("false");
		}
	}
}	
