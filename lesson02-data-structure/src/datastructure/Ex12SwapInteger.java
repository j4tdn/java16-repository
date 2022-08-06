package datastructure;

import javax.print.DocFlavor.INPUT_STREAM;

public class Ex12SwapInteger {
public static void main(String[] args) {
	Integer a = 22;
	Integer b = 66;
	
	// Swap in main method
	// Creat separate method to swap
	
	    Swap(a, b);
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
}

 // Không thể thay đổi giá trị của biển ở STACK truyền vào

public static void Swap(Integer a, Integer b)
{
	Integer c = a;
	a = b;
	b = c;
}
}
