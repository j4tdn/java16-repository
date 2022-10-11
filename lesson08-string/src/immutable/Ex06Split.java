package immutable;

public class Ex06Split {
	public static void main(String[] args) {
		String text = "Welcome to class";

		// Print words from text, each word on each line
		// regex stands for regular expression

		String[] tokens = text.split("\\s");
		printf(tokens);

		System.out.println("=========================================");

		String line = "Susan, 0936252113, 28, English";
		tokens = line.split(",\\s");
		printf(tokens);
		
		System.out.println("=========================================");
		// split by set of letters[1-N] ===> []
		line = "    Smith,123456789, 19, Math    ";
		tokens = line.trim().split("[,\\s]+");
		printf(tokens);
		
		System.out.println("=========================================");
		
		String numberAsString = "987ab123bx09aa222";
		tokens = numberAsString.trim().split("[a-zA-Z]+");
		printf(tokens);
	}

	private static void printf(String[] tokens) {
		for (String token : tokens) {
			System.out.println("||" + token + "||");
		}
	}

}
