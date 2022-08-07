package datastructure;
public class Ex12Swap {
	public static void main(String[] args) {
		Integer a =22;
		Integer b = 66;
		
			swap(a,b);	 
		System.out.println("a:" +a);
		System.out.println("b:"+b);
		//create separate method to swap

	}
	//Integer fist = a;
	//Integer second = b;
	//JAVA pass by VALUE at STACK
private static void swap(int first,int second) {
	Integer temporary = first;
	first =second;
	second = temporary;
	
}
}
