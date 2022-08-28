package view;
import bean.Rectangle;
public class Ex01RecApp {
	public static void main(String[] args) {
		// 1. create an Rectangle object has width=10; height = 5;
		Rectangle r1 = new Rectangle();
		r1.setWidth(5);
		r1.setHeight(10);
		System.out.println("r1--> " + r1);// r1 tostring()
		// 2. create an instance of Rectangle has width = 8, height = 4;

		Rectangle r2 = new Rectangle();
		r1.setWidth(8);
		r1.setHeight(4);

		System.out.println("r2--> " + r2);

		Rectangle r3 = new Rectangle(6,3);
		System.out.println("r3--> " +r3);

		// những thuộc tính non-static attributes thuộc phạm vi của đối tượng
		// ==> đối tượng (biến) để gọi những thuộc tính non-static
		// ==> lớp (class) không gọi được 
	}

}
