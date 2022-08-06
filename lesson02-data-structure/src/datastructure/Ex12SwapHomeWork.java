package datastructure;
import bean.CustomInteger;
public class Ex12SwapHomeWork {
	public static void main(String[] args) {
		CustomInteger a = new CustomInteger(22);
		System.out.println("a: " + System.identityHashCode(a));
		CustomInteger b = new CustomInteger(66);
		System.out.println("b: " + System.identityHashCode(b));
		swap(a,b);		
		System.out.println("a , b " + a + " " + b);
		System.out.println("a , b " + a.number +" " + b.number);
		// create separate method to swap		
	}
// first  = a
	private static void swap(CustomInteger first, CustomInteger second) {
		int temporary  = first.number;
		first.number = second.number;
		second.number = temporary;
		System.out.println("first: " + System.identityHashCode(first));
		System.out.println("second : " + System.identityHashCode(second));
	}
	
}

