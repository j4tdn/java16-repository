package datastructure;

public class Ex12SwapInteger {
	public static void main(String[] args) {
		Integer a = 22 ; 
		Integer b = 66;
		
		swap(a,b);
		System.out.println("a , b " + a +" " + b);
		// create separate method to swap		
	}
	// Integer first = a;
	// Integer second = b;
	// JAVA pass by VALUE at STACK
	// không thể thây đổi giá trị của biến ở STACK truyền vào
	private static void swap(Integer first, Integer second) {
		Integer temporary  = first;
		first = second;
		second = temporary;
		
	}
}
