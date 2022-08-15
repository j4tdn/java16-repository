package view;

import bean.Rectangle;

public class Ex01RectApp {
	public static void main(String[] args) {
		//1. create an Rectangle object has width=10 and height=5
		Rectangle r1 = new Rectangle();
		r1.setWidth(10);
		r1.setHeight(5);
		System.out.println("r1-->"+r1);
		
		//1. create an Rectangle object has width=8 and height=4
		
		Rectangle r2 = new Rectangle();
		r2.setWidth(8);
		r2.setHeight(5);		
		System.out.println("r2-->"+r2);
		
		Rectangle r3 = new Rectangle(6,8);
		System.out.println("r3-->"+r3);
		
		//non-static attributes thuộc phạm vi của đối tượng
		//==> đối tượng(biến) để gọi những thuộc tính non-static
		//==> class không gọi được
	}
}
