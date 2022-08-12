package datastructure;

import bean.Item;
//chỉ import type khi khác package

public class Ex06ObjectDeclaration {
	public static void main(String[] args) {
		// khai bao KDL nguyen thuy
		// number,itemA: biến, tham chiếu ==> luôn lưu ở STACK
		// giá trị của KNT --> STACK
		//int number = 10;
		
		//khai bao KDL doi tuong ==> default: NULL
		// giá trị được lưu trữ ở HEAP
		// Item: id, name, price
		//new Item() --> gọi hàm khởi tạo của class Item
		// tạo ra một ô nhớ ở HEAP với các thuộc tính mang giá trị mặc 
		Item itemA = new Item(101, "Item 101", 220);
		
		System.out.println("itemA id: " + itemA.id);
		System.out.println("itemA name: " + itemA.name);
		System.out.println("itemA price: " + itemA.price);
		
		System.out.println("===========================");
		//itemC: id = 55, name = "Item 55", price = 440
		Item itemC = new Item(55, "Item 55", 440);
		System.out.println("itemC id: " + itemC.id);
		System.out.println("itemC name: " + itemC.name);
		System.out.println("itemC price: " + itemC.price);
		
		System.out.println("===========================");
		
		//itemB: id = 7, name = "Item 7"
		Item itemB = new Item();
		
		itemB.id = 7;
		itemB.name = "Item 7";
		
		System.out.println("itemB id: " + itemB.id);
		System.out.println("itemB name: " + itemB.name);
		
		System.out.println("===========================");
		
		//itemD: id = 33, name = "Item 33"
		Item itemD = new Item(33, "Item 33");
		
		System.out.println("itemD id: " + itemD.id);
		System.out.println("itemD name: " + itemD.name);
		
		System.out.println("===========================");
		//mặc định khi in ra kiểu đối tượng ==> tự động gọi hàm toString() của class Object
		//vì Obiect mặc định là class cha của mọi class trong 
		System.out.println(itemD);
		
		
	}

}
