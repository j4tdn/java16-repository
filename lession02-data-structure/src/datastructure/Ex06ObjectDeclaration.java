package datastructure;

//chỉ import type(class) khi khác package
import bean.Item;

public class Ex06ObjectDeclaration {
	public static void main(String[] arges) {
		//khai báo KDL nguyên thủy
		//number, Item: biến, tham chiếu -->luôn lưu trữ ở STACK
		int number = 10;
		
		//khai báo KDL đối tượng ==> defaut = null
		//Item: id, name, price
		//giá trị lưu trữ ở HEAP
		// new Item()--> gọi hàm khởi tạo của class Item
		//Tạo ra một ô nhớ ở HEAP với các thuộc tính mang giá trị mặc định
		Item itemA = new Item(101, "Item 101", 220);
		
		
		System.out.println("item id :" + itemA.id);
		System.out.println("item name : " + itemA.name);
		System.out.println("item price: " + itemA.price);
		System.out.println("============================");
		
		
		//item B
		Item itemB = new Item();
		
		itemB.id = 7;
		itemB.name = "Item 7";
		itemB.price = 220;
		
		System.out.println("item id :" + itemB.id);
		System.out.println("item name : " + itemB.name);
		System.out.println("============================");
		
		//item C
        Item itemC = new Item(55, "Item 55", 440);
		
        System.out.println("item id :" + itemC.id);
		System.out.println("item name : " + itemC.name);
		System.out.println("item price: " + itemC.price);
		System.out.println("============================");
		//Hai tham số
        
		Item itemD = new Item(5, "Item 5");
		
		// System.out.println("item id :" + itemD.id);
		// System.out.println("item name : " + itemD.name);
		// Mặc định khi in ra biến kiểu đối tượng --> tự động gọi hàm tostring của class object
		// Vì object mặc định là class cha của mọi class trong JAVA
		System.out.println("itemD " + itemD);
		//System.out.println("itemD " + itemD.toString());
		System.out.println("itemC " + itemC);
		
	}

}
