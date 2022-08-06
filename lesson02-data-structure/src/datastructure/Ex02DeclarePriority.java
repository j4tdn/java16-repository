package datastructure;

public class Ex02DeclarePriority {
	public static int number = 555;
	public static void main(String[] args) {
		int number = 10;
		System.out.println(number);
		demo();
		test();
	}
	private static void demo() {
		int number = 20;
		System.out.println(number);
		System.out.println(Ex02DeclarePriority.number);
	}
	private static void test() {
		System.out.println(number);
	}
}
