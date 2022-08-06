package view;
// debugging
public class Ex01TestMainMethod {
	// data structure: attributes, variables
	// algorithm: function, method
	public static void main(String[] args) {
		System.out.println("Main method");
		anotherMainMethod();
	}
	// declaration: khai báo
	private static void anotherMainMethod() {
		System.out.println("Fake main method");
	}

}
