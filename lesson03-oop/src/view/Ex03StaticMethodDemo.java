package view;

public class Ex03StaticMethodDemo {
	private int x;
	private int y;
	
	public Ex03StaticMethodDemo(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public static void main(String[] args) {
		System.out.println("sum1: "+sum(5,10));
		System.out.println("======");
		Ex03StaticMethodDemo o1 = new Ex03StaticMethodDemo(50,8);
		System.out.println("sub1: "+o1.sub());
	}
	// hàm chỉ phụ thuộc vào tham số truyền vào,không phụ thuộc vào đối tượng đang gọi
	//==> cho hàm static
	private static int sum(int a,int b) {
		return a+b;
	}
	private int sub() {
		return x+y;
	}
}
