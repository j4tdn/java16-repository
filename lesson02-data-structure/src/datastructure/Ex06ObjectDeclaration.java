package datastructure;

//Chỉ import type khi nó khác package
import bean.Item;

public class Ex06ObjectDeclaration {
	public static void main(String[] args) {
		// khai báo kiểu dữ liệu nguyên thuỷ
		// number , itemA: biến, tham chiếu --> luôn nằm ở STACK 
		// giá trị của KNT --> STACK
		int number = 10;
		// khai báo KDL đối tượng  ==> default :NULL
		// Item: id , name , price
		// Item itemA = 1; "Item 1" =100;
		//new Item() --> gọi hàm khởi tạo của class item
		// tạo ra một ô nhớ HEAP với các thuộc tính sẽ mang giá trị mặc định
		Item itemA = new Item(101, "Item 101", 220);
						
		System.out.println("itemId: " + itemA.id);
		System.out.println("item name: " + itemA.name);
		System.out.println("item price: " +itemA.price);
		System.out.println(Ex01Delcare.largeNumber);
		
		System.out.println("================");
		// itemC: id =55 ; name = "item 55", price = 440
		Item itemC = new Item(55, "item 55", 440);
		System.out.println("itemId: " + itemC.id);
		System.out.println("item name: " + itemC.name);
		System.out.println("item price: " +itemC.price);
		System.out.println("================");
		//itemB: ID =7; name = item 7
		Item itemB = new Item();
		
		itemB.id = 7;
		itemB.name = "Item 7";
		
		System.out.println("itemId: " + itemB.id);
		System.out.println("item name: " + itemB.name);
		System.out.println("item price: " +itemB.price);
		System.out.println("================");
		//itemB: ID =7; name = item 7
				Item itemD = new Item(33, "Item 33");
				// mac dinh khi in ra bien kieu doi tuong--> tu dong goi ham toString cua class Object
				// vi Object mac dinh la class cha cua moi class trong JAVA
				
				
				System.out.println("itemD Id: " + itemD);
				System.out.println("itemD name: " + itemD.toString());
				
				System.out.println("================");		
				Item itemf = new Item(20, "Item 20");
				
				System.out.println("itemf Id: " + itemf.id);
				System.out.println("itemf name: " + itemf.name);
	}
}
