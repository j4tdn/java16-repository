package exam;

public class Ex02 {
	public static void main(String[] args) {
		String numberAsString ="01a2b3456cde478";
		String[] tokens=numberAsString.split("[a-zA-Z0]+");
		printf(tokens);
		
		int number =Integer.parseInt(numberAsString);
		
		
		
	}
	private static void printf(String [] tokens) {
		for(String token:tokens) {
			System.out.println(token );
		}
	}

}
