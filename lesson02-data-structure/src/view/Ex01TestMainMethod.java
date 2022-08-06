package view;

public class Ex01TestMainMethod {
	// data structure: attribute, variables
	// algorithm: function, methods
	  
	public static void main(String[] args) {		
		System.out.println("?");
		anotherMainMethod();
	}
	
	// chia nhỏ code
	// tái sử dụng
	
	//declaration 
	private static void anotherMainMethod() {
		System.out.println("Fake main method");
	}
}
