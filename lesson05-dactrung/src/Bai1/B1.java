package Bai1;

public class B1 {
	public static void main(String[] args) {
//		int a =8, b = 2;
//		int a =2, b = 8;
		int a =6, b = 2;
//		int a =20, b = 4;
//		int a =64, b = 4;
		System.out.println(isPowerOf(a, b));
	}
	
	private static boolean isPowerOf(int a, int b) {
		if(b <= 0) {
			return false;
		}
		double n = Math.log(b)/Math.log(a);
		
		return Math.ceil(n) == Math.floor(n);
	}
}
