package datastructure;

public class Ex12SwapInt {
	public static void main(String[] args) {
		Integer a =22;
		Integer b = 66 ;
		swap(a,b);
		System.out.println( a);
		System.out.println( b);
	}
	private static void swap(Integer first, Integer second) {
		Integer temporary = first;
		first = second;
		second= temporary;
	}

}
