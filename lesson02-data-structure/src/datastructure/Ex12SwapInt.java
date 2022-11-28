package datastructure;

public class Ex12SwapInt {
	public static void main(String[] args) {
		int a=22;
		int b=66;
		swap(a,b);
		System.out.println(a);
		System.out.println(b);
	}
	private static void swap(int first,int second) {
		int temp =first;
		first=second;
		second=temp;
	}
}
