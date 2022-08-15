package view;

public class Ex03StaticMethodDemo {

	private int x;
	private int y;

	public Ex03StaticMethodDemo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {
		System.out.println("sum: " + sum(5, -1));

		System.out.println("==============");

		Ex03StaticMethodDemo o1 = new Ex03StaticMethodDemo(50, 8);
		System.out.println("sub: " + o1.sub());

	}

	// Phu thuoc vao tham so truyen vao, khong phu thuoc vao doi tuong dang goi
	private static int sum(int a, int b) {
		return a + b;
	}

	// Phu thuoc vao doi tuong dang goi
	private int sub() {
		return x - y;
	}

}
