
package view;

import java.time.LocalDate;

import datastructure.Ex01Delcare;

public class Ex01App {

	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println("Publish date: " +LocalDate.now());
		
		// Class.staticAttribute
		System.out.println("Hello world " +Ex01Delcare.largeNumber);
	}
}
