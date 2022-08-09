package datastructure;

public class Ex12SwapInteger2 {

	public static void main(String[] args) {
		Integer a = 22;
		Integer b = 66;
		swap(a, b);
		System.out.println("a HD= " + a);
		System.out.println("b HD= " + b);
	}
	private static void swap(Integer first, Integer second) {
		int temporary = first;
		first = second;
		second = temporary;
	}

}
