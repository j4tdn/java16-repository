package datastructure;

// chỉ import type khi khác package
import bean.Item;

public class Ex06ObjectDeclaration {
	public static void main(String[] args) {
		
		// khai báo kiểu dữ liệu nguyên thủy
		// number: biến, tham chiếu --> luôn lưu nằm ở STACK
		// giá trị của kiểu nguyên thủy --> STACK 
		
		int number = 10;
		
		// khai báo kiểu dữ liệu đối tượng ==> default: NULL
		// Item: id, name, price
		// giá trị của kiểu đối tượng --> HEAP
		// Item itemA = 1, "Item 1", 100;
		// đoạn new item() --> gọi hàm khỏi tạo của class Item
		// Tạo ra 1 ô nhớ ở HEAP với các thuộc tính mang giá trị mặc định 
		
		Item itemA = new Item(101, "Item 101", 220);
		
		System.out.println("item id: " + itemA.id);
		System.out.println("item name: " + itemA.name);
		System.out.println("item price: " + itemA.price);
		
		System.out.println("==========================");
		
		
		Item itemB = new Item(7, "Item 7");
				
		//System.out.println("item id: " + itemB.idư);
		//System.out.println("item name: " + itemB.name);
		//Mặc định khi in ra biến đối tượng --> tự dộng gọi ra hàm toString của class object
		//Vì Object mặc định là class cha của mọi class trong JAVA	
		System.out.println("itemB: " + itemB);
		//System.out.println("itemB: " + itemB.toString());
		
		System.out.println("==========================");
		
		
		Item itemC = new Item(55, "Item 55", 440);
		
		System.out.println("item id: " + itemC.id);
		System.out.println("item name: " + itemC.name);
		System.out.println("item price: " + itemC.price);
		
		
		
	}
}
