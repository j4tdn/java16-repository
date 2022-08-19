package view;

import bean.Rectangle;

public class Ex01RectApp {
	 public static void main(String[] args) {
	        // 1. Create a Rectangle object has width = 10, height = 5
	        Rectangle r1 = new Rectangle(3, 5);


	        System.out.println(r1);
	        // 2. Create an instance of Rectangle has width = 4, height = 4
	        Rectangle r2 = new Rectangle(2, 4);
	        System.out.println(r2.getHeight());
	        System.out.println(r2.getWidth());
	    }
	}
