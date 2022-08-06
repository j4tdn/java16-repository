package datastructure;

public class Ex12SwapInt {
public static void main(String[] args) {
	int a = 22;
	int b = 66;
	
	// Swap in main method
	// Creat separate method to swap
	 int temp = a;
	 a = b;
	 b =temp;
	 System.out.println("a = "+ a);
	 System.out.println("b = " + b);
	 Swap(a, b);
}
public static void Swap(int a, int b)
{
	a = a + b;
	b = a - b;
	a = a - b;
	System.out.println("a = "+ a);
	System.out.println("b = " + b);
}
}
