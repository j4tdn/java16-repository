package view;

import bean.Rectangle;

public class Ex01RectApp {

	public static void main(String[] args) {
		// 1. Create an Rectangle object has width = 10 && height = 5
		Rectangle r1 = new Rectangle();
		r1.setWidth(10); 
		r1.setHeight(5);
		System.out.println("r1--> " + r1);
		
		// 2. Create an instance of Rectangle has width = 10 && height = 5
		Rectangle r2 = new Rectangle();
		r2.setWidth(8); 
		r2.setHeight(4);
		System.out.println("r2--> " + r2);
		
		Rectangle r3 = new Rectangle(6, 3);
		System.out.println("r3--> " + r3);
		
		// Những thuộc tính nonstatic attributes thuộc phạm vi của đối tượng
		// ==> đối tượng để gọi những thuộc tính non-static
		// ==> lớp không gọi được
	}

}
