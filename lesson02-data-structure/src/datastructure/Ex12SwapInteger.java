package datastructure;

public class Ex12SwapInteger {
	
	public static void main(String[] args) {
		
		Integer a = 22; //h1
		Integer b = 66; //h2
		swap(a, b);
		System.out.println("a: " +a);
		System.out.println("b: " +b);
	}
	
	//Khong the thay doi gia tri cua bien o STACK truyen vao
	private static void swap(Integer first, Integer second) {
		Integer temporary = first;
		first = second;
		second = temporary;
	}

}
