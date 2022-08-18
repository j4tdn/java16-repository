package view;

public class Ex03StaticMethod {
	private int x;
	private int y;
	
	public Ex03StaticMethod(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	public static void main(String[] args) {
	System.out.println("sum1"+sum(5,10));
	System.out.println("sum2"+sum(5,10));
	System.out.println("======");
	Ex03StaticMethod o1 = new Ex03StaticMethod(50,8);
	Ex03StaticMethod o2 = new Ex03StaticMethod(50,8);
	System.out.println("sub1:"+o1.sub());
	System.out.println("sub2:"+o2.sub());
	}
	
	//Hàm  chỉ phụ thuộc vào tham số truyền vào, không phụ thuộc vào đối tượng ==>cho static
	private static int sum(int a,int b) {
		return a+b;
	}
	private int sub() {
		return x-y;
	}
}
