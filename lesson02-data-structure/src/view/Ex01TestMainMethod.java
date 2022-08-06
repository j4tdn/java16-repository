package view;

public class Ex01TestMainMethod {

	public static void main(String[] args) {
		System.out.println("Main method");
		anotherMainMethod();

	}
	private static void anotherMainMethod() {
		System.out.println("Fake main method");
	}
}
