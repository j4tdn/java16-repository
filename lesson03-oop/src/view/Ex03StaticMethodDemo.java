package view;

public class Ex03StaticMethodDemo {
	private int x;
	private int y;
	public Ex03StaticMethodDemo(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public static void main(String[] args) {
		System.out.println("sum 1: " + sum(5,10)); 
		System.out.println("sum 2: " + sum(5,10)); 
		System.out.println("==========");
		
		Ex03StaticMethodDemo o1 = new Ex03StaticMethodDemo(50, 8);
		Ex03StaticMethodDemo o2 = new Ex03StaticMethodDemo(50, 8);
		System.out.println("sub 1:" + o1.sub());
		System.out.println("sub 2:" + o2.sub());
		
	}
	// Hàm chỉ phụ thuộc vào tham số truyền vào, không phụ thuộc vào đối tượng đang gọi
	// --> cho hàm static
	private static int sum(int a, int b) {
		return a+b;
	}
	// Hàm phụ thuộc vào đối tượng đang tạo
	// --> cho hàm non-static
	private int sub() {
		return x-y;
	}
	// Đọc về nhà: ứng dụng static

}
