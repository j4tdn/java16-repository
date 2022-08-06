package datastructure;

public class Ex12SwapInt {
	public static void main(String[] arges) {
		int a =22;
		int b =66;
		
		//swap int main method
		//int temporary = a;
		//a = b;
		//b = temporary;
		
		a = a + b  ;//88
		b = a - b;//22
		a = a - b;
		
		System.out.println(" a " + a);
		System.out.println(" b " + b);
		
		//create separate method to swap
	}
	//int first = a;
	//int second = b;
   private static void swap(int first, int second) {
	   int temporary = first;
	   first = second;
	   second = temporary;
	
}
}
