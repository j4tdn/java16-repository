package datastrructure;
import bean.MyInteger;
public class Ex12SwapInt {
	
	public static void main(String[] args) {
		
		MyInteger a = new MyInteger(22);
		MyInteger b = new MyInteger(66);
		//swap in main method
		//int temp = a;
		//a = b;
		//b = temp;
		swap(a,b);
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		}
		
		// create seperate method to swap
		private static void swap(MyInteger first, MyInteger second) {
			Integer temp = first.value;
			first.value = second.value;
			second.value = temp;
		
		
	}

}

