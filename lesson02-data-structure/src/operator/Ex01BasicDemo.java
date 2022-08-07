package operator;

public class Ex01BasicDemo {
	public static boolean isPowerOf10AndLessThan100(int number) {
		return number%10==0 && number<100;
	}
	
	public static void main(String[] args) { 
		int x=7,z=2,k=3;
		int v = x++ + --z + k++ + ++z - x-- - --k;
		System.out.println(v);
	
		int a=120, b=30;
//		boolean isPowerOf5 = (a%5==0);
//		System.out.println(a + " is power of 5: " + isPowerOf5);
//		isPowerOf5 = (b%5==0);
//		System.out.println(b + " is power of 5: " + isPowerOf5);
		System.out.println(isPowerOf10AndLessThan100(a));
		System.out.println(isPowerOf10AndLessThan100(b));
	}
}
