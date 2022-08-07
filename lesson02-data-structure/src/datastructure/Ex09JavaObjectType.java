package datastructure;

import bean.Item;

public class Ex09JavaObjectType {
	public static void main(String[] args) {
		int a = 5;
		
		//FLoat, Double, Long, Character
		Integer o1 = new Integer(10);
		String o2 = new String("Hello");
		
		Integer o3 = 99;
		String o4 = "Bye";
		
		//Custom
		Item item = new Item(1,"Item 1", 222);
	}
}
