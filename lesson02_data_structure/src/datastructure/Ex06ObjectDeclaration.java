package datastructure;
// chỉ import type khác package
import bean.Item;

public class Ex06ObjectDeclaration {

	public static void main(String[] args) {
		// Khai báo kdl nguyên thủy
		int number =10;
		
		//khai báo kiểu dữ liệu đối tượng ==>default :NULL
		//Item :id,name,price
		
		//new Item() --> gọi hàm khởi tạo của class Item 
		// tạo ra một ô nhớ ở HEAP với các thuộc tính mang giá trị mặc định.
		Item itemA =new Item();
		itemA.id =101;
		itemA.name = "Item 101";
		itemA.price =220;
	 
	 System.out.println("itemA id:"+itemA.id);
	 System.out.println("itemA id:"+itemA.name);
	 System.out.println("itemA id:"+itemA.price);
	 
	 System.out.println("=============");
	 //itemB: id =7,name +"Item 7"
	 Item itemB= new Item();
	 itemB.id = 7;
	 itemB.name ="Item 7";
	 itemB.price = 330;
	 
	 System.out.println("itemB id:"+itemB.id);
	 System.out.println("itemB id:"+itemB.name);
	 System.out.println("itemB id:"+itemB.price);
	 
	 System.out.println("=============");
	 //itemC : id=55, name ="item 55", price =440
	 Item itemC = new Item(55,"Item 55",440);
	 System.out.println("itemC id:"+itemC.id);
	 System.out.println("itemC id:"+itemC.name);
	 System.out.println("itemC id:"+itemC.price);
	
	 System.out.println("=============");
	 Item itemD =new Item(66,"Item 66");
	 System.out.println("itemD id:"+itemD.id);
	 System.out.println("itemD id:"+itemD.name);
	 System.out.println("=============");
	 //Mặc định khi in ra biến kiểu đối tượng -->tự động gọi hàm toString 
	 // vì Object mặc định là class cha của mọi class trong JAVA.
	 System.out.println("itemD:"+itemD);
	 System.out.println(itemC);
	 System.out.println(itemD.toString());
	}

}
