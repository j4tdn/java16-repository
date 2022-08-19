package view;

public class Ex03StaticMethod {
	private int x;
	private int y;
	
	public Ex03StaticMethod(int x, int y) {
		this.x= x;
		this.y = y;
	}
	public static void main(String[] args) {
		System.out.println("sum 1 " + sum(5,10));
		System.out.println("sum 1 " + sum(5,10));

		System.out.println("==========");
		
		Ex03StaticMethod o1 = new Ex03StaticMethod(50, 8);
		Ex03StaticMethod o2 = new Ex03StaticMethod(50, 8);
		System.out.println("sub 1: " + o1.sub());
		System.out.println("sub 2: " + o2.sub());

	}
	
	private static int sum(int a, int b) {
		return a + b;
	}
	
	// Hàm phụ thuộc vào đối tượng đang gọi
	// ==> cho hàm non-static
	private int sub() {
		return x - y;
	}
}
