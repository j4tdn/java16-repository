package immutable;

public class Ex06Split {
	public static void main(String[] args) {
		String text = "Welcome to class";

		// Print words from text, each word on each line
		// regex stands for regular expression

		String[] tokens = text.split("\\s");

		System.out.println("length:" + tokens.length);

		for (String token : tokens) {
			System.out.println(token);
		}

		System.out.println("=============");

		String line = "Susan, 0936298555, 28, English";

		tokens = line.split("[,\\s]");
		prinf(tokens);

		System.out.println("=============");
		// split by set of letters [1-N] ==>[]
		line = "Smith,,  12334567,  19 ,Math";
		tokens = line.split("[,\\s+]+");
		prinf(tokens);

		System.out.println("===============");
		String numberAsString = "abc123bx09aa222";
		tokens = numberAsString.split("[a-zA-Z]+");
		prinf(tokens);
	}

	private static void prinf(String[] tokens) {
		for (String token : tokens) {
			System.out.println("||" + token + "||");
		}
	}
}
