package view;

public class Ex03StaticMethodDemo {
	private int x;
	private int y;

	public Ex03StaticMethodDemo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {
		System.out.println("Sum 1: " + sum(12, 17));

		System.out.println("=============================");

		Ex03StaticMethodDemo o1 = new Ex03StaticMethodDemo(12, 7);
		System.out.println("Sub 1: " + o1.sub());
	}

	//
	private static int sum(int a, int b) {
		return a + b;
	}

	private int sub() {
		return x - y;
	}
}