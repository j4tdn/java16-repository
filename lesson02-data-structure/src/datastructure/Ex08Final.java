package datastructure;

import bean.Item;

public class Ex08Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       final int a= 20;
       Item itemA = new Item ( 111,"ItemA",50000);
       Item itemB = new Item ( 222,"ItemB",60000);
       itemA = itemB;
       itemA.name= "Update item";
       System.out.println(" item" + itemA);
	}

}
