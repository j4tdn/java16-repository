package datastructure;

public class Ex12SwapInteger {
	public static void main(String[] args) {
		Integer a = 20;
		Integer b = 3;

		swap(a,b);
		System.out.println(a);
		System.out.println(b);
		
	
	}
	private static void  swap(Integer first, Integer second) {
		int temporary = first;
		first.toString();
		System.out.println("concac"+first.toString());
		first = second;
		second = temporary;
		System.out.println("concac2"+second.toString());
	}


}
