package datastructure;

import bean.Item;

public class Ex09JavaObjectType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =5;
		
		//Float, Double, Long, Character
		Integer o1 = new Integer(10);
		String o2 = new String("hello");
		
		Integer o3 = 99;
		String o4 = "bye";
		
		// CUSTOM
		// new gọi hàm khởi tạo, gán giá trị cho ô nhớ ở heap
		Item item = new Item(1, "Item 1", 222);
		
		
	}

}
