package ex01;

public class Ex01 {
	public static void main(String[] args) {
		String a = "Chào các bạn !";
		//1.
		for (int i = 0; i < a.length(); i++) {
			System.out.println(a.charAt(i));
		}
		
		System.out.println("\n=======================");
		
		//2.
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i)!=' ') {
				System.out.print(a.charAt(i));
			}
			else {
				System.out.println("\n");
			}
		}
			
		System.out.println("\n=======================");
		
		//3.
		for (int i = a.length()-1; i > 0; i--) {
			System.out.print(a.charAt(i));
		}
		
		System.out.println("\n=======================");
		
		//4.
		for (int i = a.length()-1; i > 0; i--) {
			if (a.charAt(i)!=' ') {
				System.out.print(a.charAt(i));
			}
			else {
				System.out.println("\n");
			}
		}
		
		System.out.println("\n=======================");
	}

}
