package view;

public class Ex03StaticMethodDemo {
	private int x;
	private int y;
	
	public Ex03StaticMethodDemo(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public static void main(String[] args) {
		System.out.println("sum1: " + sum(5,10));
		System.out.println("sum1: " + sum(5,10));
		
		System.out.println("==============");

		Ex03StaticMethodDemo o1 = new Ex03StaticMethodDemo(49,9);
		Ex03StaticMethodDemo o2 = new Ex03StaticMethodDemo(37,9);
		Ex03StaticMethodDemo o3 = new Ex03StaticMethodDemo(18,9);
		System.out.println("sub1: " + o1.sub());
		System.out.println("sub2: " + o2.sub());
		System.out.println("sub3: " + o3.sub());
	
	}
	
	
	// Hàm chỉ phụ thuộc vào tham số truyền vào, không phụ thuộc vào đối tượng đang gọi
	// ==> Cho hàm static
	private static int sum(int a, int b) {
		return a+b;
	}
	// Hàm chỉ phụ thuộc vào đối tượng, không phụ thuộc vào tham số truyền vào
	//==> cho hàm non-static
	private int sub() {
		return x-y;
	}
}
