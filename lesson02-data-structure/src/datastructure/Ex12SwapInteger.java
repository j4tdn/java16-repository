package datastructure;
import bean.CustomInteger;
public class Ex12SwapInteger {

	public static void main(String[] args) {
	
     
		CustomInteger a = new CustomInteger(22); 	// H1
		CustomInteger b = new CustomInteger(66);     // H2
		
		swap(a,b);
		System.out.println("a: " +a);
		System.out.println("b: " +b); 
		//Ojecct#toString  getClass().getName()@hex
	}
	// JAVA pass by value at STACK
	// k thể thay đổi giá trị của biến ở STACK truyền vào
	private static void swap(CustomInteger first, CustomInteger second) {
		int temporary = first.value;
		first.value = second.value;
		second.value = temporary;
	}

}
