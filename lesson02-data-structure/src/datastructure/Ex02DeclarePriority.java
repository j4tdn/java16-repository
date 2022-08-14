package datastructure;

public class Ex02DeclarePriority {
	private static int number = 99;

	public static void main(String[] args) {
		int number = 10;
		System.out.println(Ex02DeclarePriority.number);
		demo();
		test();
	}
	
	private static void demo() {
		int number = 20;
		System.out.println(number);
	}
	private static void test() {
		System.out.println(number);
	}
}
