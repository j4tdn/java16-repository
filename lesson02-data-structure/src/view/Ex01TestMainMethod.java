package view;

//running: f11
//debugging:
//breakpoint

public class Ex01TestMainMethod {
	// data structure: attributes, variables
	// algorithm: function, method
	public static void main(String[] args) {
		System.out.println("Main method");
		anotherMainMethod();
	}

	// chia nho bai toan
	// tai su dung code

	// declaration: khai bao
	private static void anotherMainMethod() {
		System.out.println("Fake main method");
	}
}
