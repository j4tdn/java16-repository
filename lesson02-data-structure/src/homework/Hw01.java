package homework;

import bean.number;

public class Hw01 {
	
	
	
	public static void main(String[] args) {
		number number1 = new number(22);
		number number2 = new number(66);
		System.out.println("number1 :" +number1.number);
		System.out.println("number2 :" +number2.number);
		System.out.println("AFTER_SWAP");
		swap(number1, number2);
		System.out.println("number1 :" + number1.number);
		System.out.println("number2 :" + number2.number);
		
	}
	public static void swap(number i, number j) {
		int temp = i.number;
		i.number = j.number;
		j.number = temp;
	}
	
	
	
}
