package view;

public class Ex03String {
	public static void main(String[] args) {
		
		String str = "Welcome  to JAVA10  class";
		System.out.println("Input: " + str);
		
		str = str.trim().replaceAll("\\s+", " ");
		
		System.out.println("Output: ");
		printReverse(str);
		
	}
	
	private static void printReverse(String str) {
		String[] arrays = str.split("");
		for (int i = arrays.length- 1; i >= 0; i--) {
			System.out.print(arrays[i]);
		}
	}
}
