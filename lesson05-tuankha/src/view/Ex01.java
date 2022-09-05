package view;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println(isPowerOf(8,2));
		System.out.println(isPowerOf(2,8));
		System.out.println(isPowerOf(6,2));
		System.out.println(isPowerOf(20,4));
		System.out.println(isPowerOf(64,2));
		System.out.println(isPowerOf(-2,4));
	}
	
	private static boolean isPowerOf(int a, int b) {
		if (b <= 0 || a <= 0) {
			return false;
		}
		double n1 = Math.log(b)/Math.log(a);
		double n2 = Math.log(a)/Math.log(b);
		if(Math.ceil(n1) == Math.floor(n1) || Math.ceil(n2) == Math.floor(n2))
			return true;
		else if(Math.ceil(n1) == Math.floor(n1) && Math.ceil(n2) == Math.floor(n2))
			return true;
		else
			return false;
	}

}
