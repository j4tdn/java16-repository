package view;

import datastructure.Ex01Delcare;

public class Ex01TestMainMethod {
	// running: ctrl + F11
	// debugging: 
	// breakpoint
	
	// data structure: attributes, variables
	// algorithm: functions, methods
    public static void main(String[] args) {
		System.out.println("Main method");
		anotherMainMethod();

	}
    // chia nhỏ bài toán
    // tái sử dụng code
    
    // declaration: khai báo
    private static void anotherMainMethod() {
		System.out.println("Fake main method");
	}
}
