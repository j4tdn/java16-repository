package ex02;

public class LargestNumbers {
	public static void main(String[] args) {
		String numberAsString = "01a2b3456cde478";
		String [] tokens = numberAsString.split("[a-zA-Z]+");
		printf(tokens);
		
	}
	private static void printf(String [] tokens) {
		for(String token:tokens) {
			System.out.println(token +"");
		}
	}
}
