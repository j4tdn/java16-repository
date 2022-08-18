package view;

public class Ex03StaticMethodDemo {
	private int x;
	private int y;

	public Ex03StaticMethodDemo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {

		System.out.println("sum 1: " + sum(5, 10));
		System.out.println("sum 2: " + sum(5, 10));
		System.out.println("sum 3: " + sum(5, 10));
		System.out.println("sum 4: " + sum(5, 10));

		System.out.println("=======================");
		Ex03StaticMethodDemo o1 = new Ex03StaticMethodDemo(50, 8);
		Ex03StaticMethodDemo o2 = new Ex03StaticMethodDemo(50, 8);
		Ex03StaticMethodDemo o3 = new Ex03StaticMethodDemo(50, 8);
		System.out.println("sub 1: " + o1.sub());
		System.out.println("sub 2: " + o2.sub());
		System.out.println("sub 3: " + o3.sub());

	}

	// ham chi phu thuoc vao tham so truyen vao , khong phu thuoc vao doi tuong
	// ==> cho ham static
	private static int sum(int a, int b) {
		return a + b;
	}

	private int sub() {
		return x - y;
	}
}
