package datastructure;

//chỉ import type khi khác package
import bean.Item;

public class Ex06ObjectDeclaration {
	public static void main(String[] args) {
		//Khai báo KDL nguyên thủy
		//number, itemA: biến, tham chiếu --> luôn nằm ở STACK
		//giá trị của KNT --> STACK
		int number = 10;
		
		//Khai báo KDL đối tượng ==> default: NULL
		//Item: id, name, price
		//giá trị lưu trữ ở HEAP
		//Item itemA = 1, "Item 1", 100;
		//new Item() --> gọi hàm khởi tạo của class Item (dữ liệu)
		//Tạo ra một ô nhớ ở HEAP với các thuộc tính mang giá trị mặc định
		Item itemA = new Item(101, "Item 101", 220);
		
		System.out.println("itemA id: " +itemA.id);
		System.out.println("itemA name: " +itemA.name);
		System.out.println("itemA price: " +itemA.price);
		
        System.out.println("======================");
		
        Item itemC = new Item(55, "Item 55", 440);
		System.out.println("itemC id: " +itemC.id);
		System.out.println("itemC name: " +itemC.name);
		System.out.println("itemC price: " +itemC.price);
		
		System.out.println("======================");
		
		Item itemB = new Item();
		
		itemB.id = 7;
		itemB.name = "Item 7";
		
		System.out.println("itemB id: " +itemB.id);
		System.out.println("itemB name: " +itemB.name);
		
        System.out.println("======================");
		
		Item itemD = new Item(33, "Item 33");
		
		//System.out.println("itemD id: " +itemD.id);
		//System.out.println("itemD name: " +itemD.name);
		//Mặc định khi in ra biến kiểu đối tượng --> tự động gọi hàm toString của class Object
		//Vì Object mặc định là class cha của mọi class trong JAVA
		System.out.println("itemD: " + itemD);
		System.out.println("itemC: " + itemC);
		//System.out.println("itemD: " + itemD.toString());
	}
}
