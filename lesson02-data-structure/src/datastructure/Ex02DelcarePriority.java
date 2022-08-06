package datastructure;

public class Ex02DelcarePriority {
	private static int number = 99;
	public static void main(String[] args) {
		int number = 10;
		System.out.println(number);
		demo();
		test();
	}
	
	private static void demo() {
		int number = 20;
		System.out.println(number);
		System.out.println(Ex02DelcarePriority.number);
	}
	
	private static void test() {
		System.out.println(number);
	}
}
