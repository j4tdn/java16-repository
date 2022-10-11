package immutable;

public class Ex06Split {
	public static void main(String[] args) {
		String text = "Welcome to class";
		//printf word from text, each word on each line
		//regex stands for regular
		//expression
		String[] tokens = text.split("\\s");
		System.out.println(tokens);
		for(String token:tokens) {
			System.out.println(token);
		}
		System.out.println("===============");
		
		String line = "Susan, 0936521456, 28, English";
		tokens = line.split(",\\s");
		printf(tokens);
		//split by set of letters[1-N] ==> []
		line = "    Smith,  123456789,   19,Math      ";
		tokens = line.trim().split("[,\\s]+");
		printf(tokens);
		System.out.println("=================");
		
		String sequence = " ab123bx09aa222";
		tokens = sequence.trim().split("[a-zA-Z]+");
		printf(tokens);
	}
	private static void printf(String[] tokens) {
		for(String token: tokens) {
			System.out.println(token);
		}
	}

}
