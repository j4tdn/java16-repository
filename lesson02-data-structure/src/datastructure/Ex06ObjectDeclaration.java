package datastructure;

import bean.Item;

public class Ex06ObjectDeclaration {
	public static void main(String[] args) {
		// Khai bao kieu du lieu nguyen thuy
		//number, ItemA : bien, tham chieu --> luon nam` o stack
		// gia tri cua KNT --> STACK
		int number = 10;
		
		// khai bao KDL doi tuong ==> default: NULL
		// Item : id , name , price
		// luu tru o HEAP
		// new Item() -> goi ham khoi tao cua class Item
		// Tạo ra một ô nhớ ở HEAP với các thuộc tính mang giá trị mặc định 
		Item itemA = new Item(30, " con tom", 7.8);
//		
//		
//		
		System.out.println("item id :" + itemA.itemId);
		System.out.println("item name :" + itemA.name);
		System.out.println("item price:" + itemA.price);
		System.out.println("=======================");
//		
//		Item itemB = new Item();
//		
//		itemB.itemId = 7;
//		itemB.name = "Item7";
//		itemB.price = 8.6;
//		
//		System.out.println("item id :" + itemB.itemId);
//		System.out.println("item name :" + itemB.name);
//		System.out.println("item price:" + itemB.price);
		
        Item itemC = new Item(1, "con ca'", 7);
        
        System.out.println("item id :" + itemC.itemId);
		System.out.println("item name :" + itemC.name);
		System.out.println("item price:" + itemC.price);
		
		System.out.println("=======================");
		
		
		
		Item itemD = new Item(7,"con chuot");
//		System.out.println("item id:" + itemD.itemId);
//		System.out.println("item name:" + itemD.name);
		// mac dinh khi in ra kieu doi tuong -> tu dong goi ham toString cua object
		// Object mac dinh la class cha cua moi class trong Java
		System.out.println(itemD.toString());
		System.out.println("=======================");
		System.out.println(itemC);
		
       
		
		
		
		
	}

}
