package datastructure;

public class Ex12SwapInteger {
	public static void main(String[] arges) {
		Integer a =22;//h1
		Integer b =66;//h2
		swap(a, b);
		
		
		//swap int main method
		//int temporary = a;
		//a = b;
		//b = temporary;
		
		//a = a + b  ;//88
		//b = a - b;//22
		//a = a - b;
		
		System.out.println(" a " + a);
		System.out.println(" b " + b);
		
		//create separate method to swap
	}
	//int first = a;
	//int second = b;
	//java pass by value at STACK
	//không thể thay đổi giá trị của biến ở STACK truyền vào
   private static void swap(Integer first, Integer second) {
	   int temporary = first;//h1
	   first = second;//h2
	   second = temporary;//h1

	
}
}
