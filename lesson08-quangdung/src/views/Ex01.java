package views;

public class Ex01 {

	public static void main(String[] args) {

		String text = "Xin chào Trần Quang Dũng";

		// 1
		for (int i = 0; i < text.length(); i++) {
			System.out.println(text.charAt(i));
		}
		System.out.println("=================");

		// 2
		String[] tokens = text.split("\\s");
		printf(tokens);
		System.out.println("=================");

		// 3
		for (int i = text.length(); i > 0; i--) {
			System.out.println(text.charAt(i - 1));
		}
		System.out.println("=================");

		 // 4
		StringBuilder str = new StringBuilder(text);
		System.out.println(str.reverse().toString());
		System.out.println("=================");
	}

	private static void printf(String[] tokens) {
		for (String token : tokens) {
			System.out.println(token);
		}
	}

}
