package datastructure;

// chi import type khi khac package
import bean.Item;

public class Ex06ObjectDeclaration {
	public static void main(String[] args) {
		//khai bao KDL nguyen thuy
		// number, itemA: bien, tham chieu --> luon nam o STACK
		// gia tri cua kieu nguyen thuy --> STACK
		int number = 10;
		
		// khai bao KDL doi tuong ==> default: Null
		// Item: id, name, price
		// gia tri luu tru o HEAP
		// new item() --> goi ham khoi tao cua class Item
		// Tao ra mot o nho o HEAP voi cac thuoc tinh mang gia tri mac dinh
		Item itemA = new Item(101, "Item 101", 220);
		

		
		System.out.println("item id: " + itemA.id);
		System.out.println("item name: " + itemA.name);
		System.out.println("item price: " + itemA.price);
		
		System.out.println("==========================");
		
		// itemC: id=55, name="Item 55", price=440;
		Item itemC = new Item(55, "Item 55", 440);
		
		System.out.println("item id: " + itemC.id);
		System.out.println("item name: " + itemC.name);
		System.out.println("item price: " + itemC.price);
		
		System.out.println("==========================");
		//itemB: id = 7, name = "Item 7"
		Item itemB = new Item();
		
		itemB.id = 7;
		itemB.name = "Item 7";
		
		System.out.println("item id: " + itemB.id);
		System.out.println("item name: " + itemB.name);
		
		System.out.println("==========================");
		//
		Item itemD = new Item(33, "Item 33");
		
		// System.out.println("item id: " + itemD.id);
		// System.out.println("item name: " + itemD.name);
		// Mac dinh khi in ra bien kieu doi tuong --> tu dong goi la ham toString cua class Object
		// Vi Object mac dinh la class cha cua moi class trong JAVA
		System.out.println("item D " + itemD);
		System.out.println("item C " + itemC);
		//System.out.println("item D " + itemD.toString());
		
	}
}
