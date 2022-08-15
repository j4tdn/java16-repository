package view;

import bean.Ractangle;


public class Ex01RectApp {
public static void main(String[] args) {
	// 1.create an Rectangle has width =10,height =5;
	Ractangle r1 = new Ractangle();
		r1.setWidth(10);
		r1.setHeight(5);
		System.out.println("r1-->"+r1);
		
		Ractangle r2 = new Ractangle();
		r2.setHeight(4);
		r2.setWidth(8);
		System.out.println("r2-->"+r2);
		
		Ractangle r3 = new Ractangle(6,3);
		System.out.println("r3-->"+r3);
		
		
		//non-static attributes thuộc phạm vi của đối tượng.
		// ==>đối tượng(biến) để gọi những thuộc tính non-static.
		//==>lớp (class) không gọi được.
}
}
