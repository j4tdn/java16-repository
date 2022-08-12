package view;

public class Ex01TestMainMethod {
	public static void main(String[] Args) {
		System.out.println("Main Method");
		anotherMainMethod();
	}
	private static void anotherMainMethod() {
		System.out.println("Fake Main Method");
	}
}
