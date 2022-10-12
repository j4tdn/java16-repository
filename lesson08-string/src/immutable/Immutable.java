package immutable;

public class Immutable {
	public static void main(String[] args) {
		String text = "Welcome to class";
		// print words from text, each word on each line
		String[] arrs = text.split("\\s", 3);
		System.out.println("length: " + arrs.length);
		printf(arrs);
		
		System.out.println("===============");

		String line = "Susan, 0966555487, 28, English";
		String[] tokens = line.split(",\\s");
		printf(tokens);
		
		System.out.println("===============");
		// split by set of letter[1-N] --> []
		line = "   Smith,   0988987,   28, Math";
		tokens = line.trim().split("[,\\s+]");
		printf(tokens);
		System.out.println("===============");
		// Find valid numbers from string ab12bc09aa22
		String numberAs = "12bc09aa22";
		 tokens = numberAs.split("[a-aA-Z]+");
				printf(tokens);
	}

	private static void printf(String[] tokens) {
		for (String token : tokens) {
			System.out.println("||" + token + "||");
		}

	}
}
