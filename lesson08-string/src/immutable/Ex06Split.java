package immutable;

public class Ex06Split {

	public static void main(String[] args) {
		String text = "Welcome to class";
		String[] tokens = text.split("\\s");
		printf(tokens);

		System.out.println("=================");

		String line = "Susan, 0912312423, 28, English";
		tokens = line.split(",\\s");
		printf(tokens);
		
		System.out.println("=================");
		
		line = "  Smith,0912312423, 18, Math  ";
		tokens = line.trim().split("[,\\s]+");
		printf(tokens);
		
		System.out.println("=================");
		String numberAsString = "ab123bx09aa222";
		tokens = numberAsString.split("[a-zA-Z]+");
		printf(tokens); // 123 09 222
		
	}

	private static void printf(String[] tokens) {
		for (String token : tokens) {
			System.out.println(token);
		}
	}

}
