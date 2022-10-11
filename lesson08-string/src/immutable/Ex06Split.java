package immutable;

public class Ex06Split {
	public static void main(String[] args) {
		String text = "Welcome to class";

		// Print words from text, each word on each line
		// regex stands for Regular Expression
		String[] tokens = text.split("\\s");
		printf(tokens);

		System.out.println("================");

		String line = "Susan, 0936252119, 28, English";
		tokens = line.split(",\\s");
		printf(tokens);

		System.out.println("================");
		// Split by set of letters[1-N] ==> []
		line = "   Smith,,0936252119,    19, English             ";
		tokens = line.trim().split("[,\\s]+");
		printf(tokens);

		System.out.println("================");
		// Question: Find valid numbers from string ab123bx09aa222
		// 123 9 222
		String numberAString = "ab123bx09aa222";
		tokens = numberAString.split("[a-zA-Z]+");
		printf(tokens);
	}

	private static void printf(String[] tokens) {
		System.out.println("Length: " + tokens.length);
		for (String s : tokens)
			System.out.println("||" + s + "||");
	}
}
