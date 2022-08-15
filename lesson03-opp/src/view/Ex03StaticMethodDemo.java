package view;
public class Ex03StaticMethodDemo {
	private int x;
	private int y;
	public Ex03StaticMethodDemo(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public static void main(String[] args) {
		System.out.println(sum(5,10));
		Ex03StaticMethodDemo o1 = new Ex03StaticMethodDemo(8,2);
		System.out.println("sub :" + o1.sub());
		
	}
	// Hàm chỉ phụ thuộc vào tham số truyền vào không phụ thuộc vào đối tượng đang gọi
	// ==> Cho hàm static 
	private static int sum(int a, int b) {
		return a + b ;
	}
	// Hàm phụ thuộc vào đối tượng đang gọi
	// ==> non-static 
	private int sub() {
		return x - y;
	}
}
