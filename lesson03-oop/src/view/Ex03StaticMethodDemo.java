package view;

public class Ex03StaticMethodDemo {
	int x = 0;
	int y = 0;

	public Ex03StaticMethodDemo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {

		System.out.println(sum(1, 2));
		Ex03StaticMethodDemo ob1 = new Ex03StaticMethodDemo(50, 8);
		System.out.println(ob1.sub());

	}

	private static int sum(int a, int b) {
		return a + b;
	}

	private int sub() {
		return x - y;
	}

}
