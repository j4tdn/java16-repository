package view;

public class Ex03_LCMTest {
	public static void main(String[] args) {
		int []arrays  = {2, 3, 4, 6};
		System.out.println(findlcm(arrays));
	}
	private static int gcd (int a, int b) {
		while(a != b ) {
			if(a > b ) a = a-b;
			else b = b -a;
		}
		return a;
	}
	private static int lcm (int a, int b) {
		return a * b / gcd(a,b);
	}
	
	private static int findlcm(int[] arrays) {
		int temp = lcm(arrays[0],arrays[1]);
		for(int i = 2; i < arrays.length; i++) {
			temp = lcm(temp,arrays[i]);
		}
		return temp;
	}
}
