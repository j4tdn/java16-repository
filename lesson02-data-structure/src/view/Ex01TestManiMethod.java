package view;

public class Ex01TestManiMethod {
	//data structure: attributes,variables
	//algorith:functoins,methods
	public static void main(String[] args) {
		System.out.println("Main method");
		anotherMainMethod();
	}
	
	//declaration
	private static void anotherMainMethod() 
	{
		System.out.println("Fake main method");
	}
}
