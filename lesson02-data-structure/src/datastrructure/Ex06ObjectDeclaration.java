package datastrructure;


import bean.Item;
public class Ex06ObjectDeclaration {
	public static void main(String[] args) {
		//khai bao kdl nguyen thuy
		//number, itemA: bien, tham chieu --> luon nam o stack
		//-->stack
		int number = 10;
		
		//khai bao kdl doi tuong
		//Item: Id,name, price
		//-->heap
		Item itemA =new Item(101,"Item 101",220);
	    
	    
	    Item itemB =new Item();
	    itemB.id=7;
	    itemB.name="Item 7";
	    
	    Item itemC = new Item(55,"Item 55", 440);
	    
	    Item itemD = new Item(7,"Item 7");
	    
	    
		System.out.println("item id: "+itemA.id);
		System.out.println("item name: "+itemA.name);
		System.out.println("item price: "+itemA.price);
		System.out.println("=========================");
		
		System.out.println("item id: "+itemB.id);
		System.out.println("item name: "+itemB.name);
		System.out.println("=========================");
		
		System.out.println("item id: "+itemC.id);
		System.out.println("item name: "+itemC.name);
		System.out.println("item price: "+itemC.price);
		System.out.println("=========================");
		
		//System.out.println("item id: "+itemD.id);
		//System.out.println("item name: "+itemD.name);
		//Mặc định khi in ra biến kđt--> tự động gọi hàm toString của Class Object
		//Vì Object mặc định là class cha của mọi class trong Java
		System.out.println("itemD: "+itemD);
		System.out.println("itemD: "+itemD.toString());
		System.out.println("=========================");
	}
}
