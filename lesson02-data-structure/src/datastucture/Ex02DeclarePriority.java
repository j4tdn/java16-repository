package datastucture;

public class Ex02DeclarePriority {
	//attributes
	private static int number = 99;
	public static void main(String[] args) {
		int number = 10;
		System.out.println(number);//10
		demo();
		test();
	}
	private static void demo() {
		int number = 20;
		System.out.println(number);//20
		System.out.println(Ex02DeclarePriority.number);//99
	}
	private static void test() {
		System.out.println(number);//99
	}
}
