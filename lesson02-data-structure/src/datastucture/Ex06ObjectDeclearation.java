package datastucture;

import bean.Item;

public class Ex06ObjectDeclearation {
	public static void main(String[] args) {
		// Khai bao kieu du lieu nguyen thuy
		// number, itemA: bien, tham chieu --> luon nam o STACK
		// gia tri cua KNT -->STACK
		int number = 10;

		// Khai bao KDL doi tuong
		// Item: id, name, price
		// gia tri luu tru o HEAP
		// new Item() --> goi ham khoi tao cua class Item
		// Tao ra mot o nho o HEAP voi cac thuoc tinh se mang gia tri mac dinhj
		Item itemA = new Item(101, "Item 101", 220);
		System.out.println("item id: " + itemA.itemId);
		System.out.println("item name: " + itemA.name);
		System.out.println("item price: " + itemA.price);

		System.out.println("================================");

		// itemB: id =7, name = "Item 7"
		Item itemB = new Item();
		itemB.itemId = 7;
		itemB.name = "Item 7";
		System.out.println("item id: " + itemB.itemId);
		System.out.println("item name: " + itemB.name);
		System.out.println("item price: " + itemB.price);

		System.out.println("================================");

		// itemC : id=55, name = "Item 55", price = 440
		Item itemC = new Item(55, "Item 55", 440);
		System.out.println("item id: " + itemC.itemId);
		System.out.println("item name: " + itemC.name);
		System.out.println("item price: " + itemC.price);

		System.out.println("================================");

		// itemD: id = 7, name = "Item 7"
		Item itemD = new Item(33, "Item 33");
//		System.out.println("itemD id: " + itemD.itemId);
//		System.out.println("itemD name: " + itemD.name);
		// Mac dinh khi in ra bien kieu doi tuong --> tu dong goi ham toString() cua
		// class Object
		// Vi Object mac dinh la class cha cua moi class trong JAVA
		System.out.println("itemD: " + itemD);
		System.out.println("itemD: " + itemD.toString());

	}
}
