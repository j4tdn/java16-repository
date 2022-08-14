package datastructure;

import bean.Item;

public class Ex09JavaObjectType {
	public static void main(String[] args) {
		//Float, Double, Long, Character...
		Integer o1 = new Integer(10);
		String  o2 = new String("hello");
		
		Integer o3 = 99;
		String  o4 = "bye";
		
		// Custom
		Item item = new Item(1, "Item 1", 222);
		// phải gọi hàm Item để biết giá trị 1 cho ai. Item 1 cho ai,...
		// Item itemX = 1, "Item 1", 222;
	}

}
