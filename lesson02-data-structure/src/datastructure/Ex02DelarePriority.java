package datastructure;

public class Ex02DelarePriority {
	//attributes 
	private static int largeNumber=99;
	public static void main(String[] args) {
		int largeNumber=20;
		System.out.println(largeNumber);
		demo();
		test();
	}
	
	private static void demo() {
		int largeNumber=30;
		System.out.println(largeNumber);
		System.out.println(Ex02DelarePriority.largeNumber);
	}
	private static void test() {
		System.out.println(largeNumber);
	}
}
