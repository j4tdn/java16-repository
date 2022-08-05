package view;

public class Ex01TestMainMethod {
	// data structure: attributes, variables
	// algorithm: functions , methods
	public static void main(String[] args) {
		System.out.println("Main method");
		anotherMainMethod();
	}

	//declaration: khai báo
	private static void anotherMainMethod() {
		System.out.println("Fake Main method");
	}
}