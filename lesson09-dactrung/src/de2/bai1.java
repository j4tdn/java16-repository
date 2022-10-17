package de2;

import java.util.ArrayList;

public class bai1 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(2);a.add(8);a.add(9);a.add(1);a.add(6);
	    ArrayList b = new ArrayList();
	    b.add(2);b.add(1);b.add(1);b.add(8);b.add(9);
		a.retainAll(b);
		System.out.println("Số phần tử chung của 2 mảng đó: " + a);
	}
}
