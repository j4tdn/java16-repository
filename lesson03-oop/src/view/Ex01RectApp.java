package view;
import bean.Rectangle;

public class Ex01RectApp {
	public static void main(String[] args) {
		// 1. Create a Rectangle Object having width=10 and height=5
		Rectangle r1 = new Rectangle();
		r1.setWidth(10);
		r1.setHeight(5);
		System.out.println(r1);
		
		// 2. Create an instance of Rectangle having width=8 and height=4
		Rectangle r2 = new Rectangle(4, 8);
		System.out.println(r2);
		
		// non-static attributes thuộc phạm vi của đối tượng
		// => đối tượng sẽ gọi được những thuộc tính non-static
		// => class sẽ ko gọi được
		
		// static attributes thuộc phạm vi của class
		// => class sẽ gọi được những thuộc tính static
		// => đối tượng gọi được nhưng sẽ hiện warning
		
		
	}
}
