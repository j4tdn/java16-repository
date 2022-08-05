package datastrructure;

public class Ex12SwapInteger {
	public static void main(String[] args) {
		Integer a = 22;
		Integer b = 66;
	
	//swap in main method
	//int temp = a;
	//a = b;
	//b = temp;
	swap(a,b);
	System.out.println("a= "+a);
	System.out.println("b= "+b);
	}
	// create seperate method to swap
	private static void swap(Integer first, Integer second) {
		Integer temp = first;
		first = second;
		second = temp;
	}
	
	
}


