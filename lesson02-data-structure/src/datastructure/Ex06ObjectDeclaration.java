package datastructure;
//chỉ import khi khác package
import bean.Item;

public class Ex06ObjectDeclaration {
	public static void main(String[] args) {
		// khai báo kiểu dữ liệu nguyên thuỷ-->luôn nằm ở Stack
		int number =10;
		//khai báo kiểu dữ liệu đối tượng=> NULL
		//Item:id,name,price
		//Item itemA=1,"Iteam",100;
		//new iteam()-->gọi hàm khởi tạo của class item
		//tạo ra một ô nhớ ở HEAP với các thuộc tính mang giá trị mặc định
		Item itemA = new Item();
		itemA.id = 101;
		itemA.name = "Item101";
		itemA.price = 220;
		System.out.println("item id: "+ itemA.id);
		System.out.println("item name: "+ itemA.name);
		System.out.println("item price: "+ itemA.price);
		System.out.println("===========================");
		Item itemC = new Item(55, "Item 55", 440);
		//System.out.println("item id: "+ itemC.id);
		//System.out.println("item name: "+ itemC.name);
		//System.out.println("item price: "+ itemC.price);
		System.out.println("ItemC " + itemC);
        System.out.println("======================");	
		
		
		
		Item itemB = new Item(22,"dd77");
		
		
		//System.out.println("item id: "+ itemB.id);
		//System.out.println("item name: "+ itemB.name);
		System.out.println("ItemB " + itemB);
		System.out.println("ItemB: " + itemB.toString());
		// mặc định khi in ra biến kiểu đổi tượng--> tự động gọi hàm toString
		//Vì object mặc định là class cha của mọi class trong Java
	}

}
