package inmutable;

public class Ex06Split {
	public static void main(String[] args) {
		String text = "Welcome to class";

		// Print words form text, each wrong on each line
		// regex stands for regular expression
		String[] tokens = text.split("\\s");
		System.out.println("length: " + tokens.length);

		for (String token : tokens) {
			System.out.println(token);
		}

		System.out.println("==========================");

		String line = "Susan, 0936252119, 18, English";
		tokens = line.split(",\\s");
		printf(tokens);

		System.out.println("==========================");
		// split by set of letter[1-N] ===> []
		line = "   Smith,123456789 , 19, Marth   ";
		tokens = line.trim().split("[,\\s]");
		printf(tokens);
		
		String numberAsString = "ab123bx09aa222";
		tokens = numberAsString.split("[a-zA-Z]+");
		printf(tokens);

	}

	private static void printf(String[] tokens) {
		for (String token : tokens) {
			System.out.println("||" + token + "||");
		}
	}
}
