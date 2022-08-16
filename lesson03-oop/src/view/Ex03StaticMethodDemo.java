package view;

public class Ex03StaticMethodDemo {
	private int x;
	private int y;
	
	public Ex03StaticMethodDemo(int x, int y) {
		this.x =x;
		this.y = y;
	}
	public static void main(String[] args) {
		System.out.println("Sum 1: " + sum(2,3));
		System.out.println("Sum 2: " + sum(2,3));
		
		System.out.println("==================");
		Ex03StaticMethodDemo o1 = new Ex03StaticMethodDemo(10,4);
		Ex03StaticMethodDemo o2 = new Ex03StaticMethodDemo(12,4);
		System.out.println("Sub 1: " + o1.sub());
		System.out.println("Sub 2: " + o2.sub());
		
		
		
		
	}
	//Hàm chỉ phụ thuộc vào tham số truyền vào, không phụ thuộc vào đối tượng đang gọi thì
	//==> cho hàm đó là static
	private static int sum(int a, int b) {
		return a+ b;
	}
	
	//Hàm phụ thuộc vào đối tượng đang gọi 
	// ==> non-static
	private int sub(){
		return x - y;
	}
}