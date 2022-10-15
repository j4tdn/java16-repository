package immutable;

public class Ex06Split {
	public static void main(String[] args) {
		String text ="welcome to class";
		
		
		String[] tokens = text.split("\\s");
		printf(tokens);
		
		System.out.println("=========================");
		
		String line ="Susan, 0987657890, 28, english ";
		tokens= line.split(",\\s");
		printf(tokens);
		
		System.out.println("=========================");
		
		//Slipt
		line ="  Smith,  0987000890,   28,  Math ";
		tokens= line.trim().split("[,\\s]+");
		printf(tokens);
		
		//tìm các số hợp lệ trong chuỗi ab123bx09aa222
		
		String numberAsString ="ab123bx09aa222";
		tokens=numberAsString.split("a-zA-Z+");
		printf(tokens);
		
	}
	private static void printf(String [] tokens) {
		for(String token:tokens) {
			System.out.println("||" + token + "||");
		}
	}

}
