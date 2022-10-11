package immutable;

public class Ex06Split {

	public static void main(String[] args) {
		// Print words from text, each
		String text = "Welcome to class";
		String[] tokens = text.split("\\s");
		printf(tokens);
		for (String token : tokens) {
			System.out.println(token);
		}

		System.out.println("==================");
		String line = "Susan, 0776957453, 21, English";
		tokens = line.split(",\\s");
		printf(tokens);

		System.out.println("==================");
		// split by set of letters [1-N] ==> []
		line = "    Smith,,     123456789, 19, Math   ";
		tokens = line.trim().split("[,\\s]+");
		printf(tokens);

		System.out.println("==================");
		// Question: Find valid numbers from string abc123bx09aa222

		String numberAsString = "987abc123bx09AA222";
		tokens = numberAsString.split("[a-zA-Z]+");
		printf(tokens);
	}

	private static void printf(String[] tokens) {
		for (String token : tokens) {
			System.out.println("||" + token + "||");
		}
	}
}
