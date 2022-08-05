package datastruture;

import bean.Item;

public class Ex08Final {
	public static void main(String[] args) {
		// Biến(KNT,KĐT) thì mình không thể gán lại giá trị thông qua toán tử =
		// cannot reassign value at stack
		// một biến final có thể cập nhật được ở HEAP
		
		final Item itemA = new Item(111, "Item A", 111);
			  Item itemB = new Item(222, "Item B", 222);
			  
			  itemA.name = "Update ItemA";
			  
			  System.out.println(itemA);
	}
	
		  
		 
	
}
