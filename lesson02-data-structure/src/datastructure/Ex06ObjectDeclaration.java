package datastructure;

import bean.Item;

public class Ex06ObjectDeclaration {
	public static void main(String[] args) {
//		Khai báo KDL nguyên thủy
		int number = 10;

//		Khai báo KDL đối tượng ==> default: NULL 
//		new Item() --> gọi hàm khởi tạo của class Item
//		Tạo ra một ô nhớ ở HEAP với các thuộc tính mang giá trị mặc định
		Item itemA = new Item(101, "Item 101", 200);
		System.out.println("itemA id: " + itemA.id);
		System.out.println("itemA name: " + itemA.name);
		System.out.println("itemA price: " + itemA.price);
		
		
		Item itemC = new Item(55, "Item 55", 400);
		System.out.println("itemC id: " + itemC.id);
		System.out.println("itemC name: " + itemC.name);
		System.out.println("itemC price: " + itemC.price);
		
		
		Item itemB = new Item(7, "Item 7");
		System.out.println("itemB id: " + itemB.id);
		System.out.println("itemB name: " + itemB.name);
		
		Item itemD = new Item(7, "Item 7");
//		Mặc định khi in ra biến kiểu đối tượng --> tự động gọi hàm toString của Object
//		Vì Object mặc định là class cha của mọi class trong Java
//		System.out.println("itemD: " + itemD);
		System.out.println("itemC: " + itemC);
		System.out.println("itemD: " + itemD.toString());
	}

}
