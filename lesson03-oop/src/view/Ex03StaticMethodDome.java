package view;

public class Ex03StaticMethodDome {
	int x=0,y=0;
	
	public Ex03StaticMethodDome(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(1, 2)) ;
		System.out.println("===============================");
		Ex03StaticMethodDome o1 = new Ex03StaticMethodDome(5, 8);
		Ex03StaticMethodDome o2 = new Ex03StaticMethodDome(5, 8);
		
		
		System.out.println("sub1 : " + o1.sub());
		System.out.println("sub2 : " + o2.sub());
	}
	
	private static int sum (int a, int b) {
		return a + b;
	}
	
	private int sub() {
		return x-y;
	}

}
