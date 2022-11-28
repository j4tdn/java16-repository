package datastructure;

public class Ex12SwapInteger {
	public static void main(String[] args) {
		Integer a=22;
		Integer b=66;
		swap(a,b);
		System.out.println(a);
		System.out.println(b);
	}
	private static void swap(Integer first,Integer second) {
		Integer temp =first;
		first=second;
		second=temp;
	}
}
