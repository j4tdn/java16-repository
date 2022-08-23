package view;

public class Ex02App {
	public static void main(String[] args) {
		int a = 20;
		x(a);
		System.out.println("a3: "+a);
	
	}
	private static void x(int a) {
		System.out.println("a1: "+a);
		a = 30 ;
		System.out.println("a2: "+a);
	}
}
