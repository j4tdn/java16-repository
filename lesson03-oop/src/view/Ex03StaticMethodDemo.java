package view;

public class Ex03StaticMethodDemo {
	public int a;
	public int b;

	public Ex03StaticMethodDemo(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		System.out.println(sum(5, 7));
		Ex03StaticMethodDemo o1 = new Ex03StaticMethodDemo(5, 8);
		System.out.println(o1.sub());
		Ex03StaticMethodDemo o2 = new Ex03StaticMethodDemo(5, 7);
		System.out.println(o2.sub());
	}

	private static int sum(int a, int b) {
		return a + b;
	}

	private int sub() {
		return this.a - this.b;
	}
}
