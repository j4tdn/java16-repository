package datastructure;

public class Ex12SwapInt {
	public static void main(String[] args) {
		Integer a = 22;
		Integer b = 66;
		
		swap(a, b);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		// Creat separater method to swap
		// Java pass by value at STACK
		// Không thể thay đổi giá trị của biến ở STACK truyền vào
		
	}
	private static void swap(Integer first, Integer second) {
		int temporary = first;
		first = second;
		second = temporary;
	}
	

}
