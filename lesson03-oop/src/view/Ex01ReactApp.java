package view;

import bean.Rectangle;

public class Ex01ReactApp {
	public static void main(String[] args) {
		// 1. Create an rectangle object has with =10, height=5
		Rectangle r1 = new Rectangle();
		r1.setWidth(10);
		r1.setHeight(6);
		System.out.println(r1);
		//2. create an instance of rectangle has with =8, height=4
		Rectangle r2 = new Rectangle();
		r2.setWidth(8);
		r2.setHeight(3);
		System.out.println(r2);
		Rectangle r3 = new Rectangle(6,3);
		System.out.println(r3);

	}

}
