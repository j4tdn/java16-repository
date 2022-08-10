package datastructure;

import bean.Item;

public class Ex06ObjectDeclaration {
  
	public static void main(String[] args) {
		int number=10;
	
		  Item itemA =new Item();
		  itemA.id=101;
		  itemA.name="iteam 101";
		  itemA.price=120.000;
		  System.out.println(" Item id \t"+ itemA.id);
		  System.out.println(" Item name\t"+ itemA.name);
		  System.out.println(" Item price\t"+ itemA.price);
		  
		  
		  Item itemB = new Item();
		  itemB.id=100;
		  itemB.name=" ItemB 100";
		  itemB.price=100000;
		  System.out.println(" Item id \t"+ itemB.id);
		  System.out.println(" Item name\t"+ itemB.name);
		  System.out.println(" Item price\t"+ itemB.price);
		  
		  Item itemC = new Item(200,"Item 200",10000);
		  System.out.println(" Item price\t" + itemC.toString());
		  

	}

}
