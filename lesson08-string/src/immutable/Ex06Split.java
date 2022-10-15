package immutable;

public class Ex06Split {
	public static void main(String[] args) {
		String text = "Welcome to class";
		
		// Print words from text, each word on each line
		// regex stands for regular expression 
		String[] tokens = text.split("\\s");
		
		System.out.println("Length: " + tokens.length);
		printf(tokens);
		
		System.out.println("============");
		
		String line = "Susan, 0936252119, 28, English"; 
		tokens = line.split(",\\s");
		printf(tokens);
		
		System.out.println("============");
		// split 
		String line1 = "Nam, 0379991727, 21, VietNam"; 
		tokens = line1.trim().split("[,\\s]+");
		printf(tokens);
		
		
		System.out.println("============");
		// find valid numbers from string ab123bx09aa222
		//123 9 222
		String numberAsString = "ab123bx09aa222";
		tokens = numberAsString.split("[a-zA-Z]+");
		printf(tokens);
		
	}
	private static void printf(String[] tokens) {
		for(String token: tokens) {
			System.out.println("||" + token + "||");
		}
	}
}
