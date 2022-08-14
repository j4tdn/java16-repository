package datastructure;

public class Swap {
	 static int a = 1; 
	 static int b = 2;
	
	
	public static void main(String[] args) {
		
		System.out.println("a = " + a + ", b = " + b );
		Swap object = new Swap();
	    swap(object.a, object.b);
		
		
	}
	public static void swap(int x, int y) {
		a = y;
		b = x;
		
		System.out.println("a = " + a + ", b = " + b );
		

	}
}
		

