package view;

public class Ex03StaticMethodDemo{
	private int x;
	private int y;
	public Ex03StaticMethodDemo(int x, int y) {
		this.x=x;
		this.y=y;
	}



	public static void main(String[] args) {
		System.out.println("sum 1 " +sum(5, 10));
		System.out.println("sum 2 " +sum(5, 10));
		
		System.out.println("==================");


	}
	// hàm chỉ phụ thuộc vào tham số tuyền vào, không phụ thuộc vào đối tượng
	//==>cho hàm static
	
	private static int sum(int a, int b) {
		return a+b;
	}
	//hàm phụ thuộc vào đối tượng đang gọi
	private int sub() {
		return x-y;
	}

}
