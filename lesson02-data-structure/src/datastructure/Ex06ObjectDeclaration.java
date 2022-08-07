package datastructure;

// chi import type khi khac package
import bean.Item;

public class Ex06ObjectDeclaration {
	public static void main(String[] args) {
		// Khai bao kieu du lieu nguyen thuy
		// numver, itemA: bien, tham chieu --> luon nam o STACK
		// gia tri cua KNT --> STACK
		int number = 10;
		
		//Khai bao kieu du lieu doi tuong ==> default: NULL
		//Item: id, name, price
		//gia tri lua tru o HEAP
		//new Item() --> goi ham khoi tao cua class Item
		//Tao ra o nho o HEAP voi cac thuoc tinh mang gia tri mac dinh
		
		//Item A
		Item itemA = new Item(101, "Item 101", 220);
		
		System.out.println("Item id a: " + itemA.id);
		System.out.println("Item name a: " + itemA.name);
		System.out.println("Item price a: " + itemA.price);
		System.out.println("===============================");
		
		//Item C
		Item itemC = new Item();
		
		itemC.id = 55;
		itemC.name = "Item 55";
		itemC.price = 440;
		
		System.out.println("Item id c: " + itemC.id);
		System.out.println("Item name c: " + itemC.name);
		System.out.println("Item price c: " + itemC.price);
		System.out.println("===============================");
		
		//Item B
		Item itemB = new Item(7, "Item 7");
		
		System.out.println("Item id b: " + itemB.id);
		System.out.println("Item name b: " + itemB.name);
		System.out.println("===============================");
		
		//Item D
		Item itemD = new Item(33, "Item 33");
		
		//System.out.println("Item id d: " + itemD.id);
		//System.out.println("Item name d: " + itemD.name);
		
		// Mac dinh khi in ra ben kieu doi tuong --> tu dong goi ham toString cua class ObJect
		//Vi Object mac dinh la class cha cua moi class trong JAVA
		System.out.println("Item d: " + itemD);
		System.out.println("Item c: " + itemC);
		//System.out.println("Item d: " + itemD.toString());
	}
}