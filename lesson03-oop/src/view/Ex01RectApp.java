package view;


import bean.Rectrangle;

public class Ex01RectApp {
	public static void main(String[] args) {
		// 1. Create an Rectangle object has width=10, height=5
		Rectrangle r1 = new Rectrangle();
		r1.setWidth(10);
		r1.setHeight(5);
		
		System.out.println("r1 -->"+ r1); // r1.toString()
		
		// 2. Create an instance of Rectangle has width=8, height=4
		Rectrangle r2 = new Rectrangle();
		r2.setWidth(8);
		r2.setHeight(4);
		
		System.out.println("r2 -->"+ r2); // r2.toString()

		Rectrangle r3 = new Rectrangle(6, 3);
		System.out.println("r3 --> " + r3);
	
		// non-static attributes thuộc phạm vi của đối tượng
		// ==> đối tượng(biến) để gọi những thuộc tính non-static
		// ==> lớp(class) không gọi được
	}
}
