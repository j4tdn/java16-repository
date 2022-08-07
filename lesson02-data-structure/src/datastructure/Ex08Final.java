package datastructure;

import bean.Item;

public class Ex08Final {
	public static void main(String[] args) {
		final int a  = 20;
		int b = 40;
	    final Item itemA = new Item ( 100, "iTEMa", 200);
	    Item itemb = new Item(200, "100" , 100);
	    itemA.name = "update name";
	    System.out.println(itemA.name);
	    
	}

}
