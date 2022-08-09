package datastructure;

import bean.Item;

public class Ex08Final {

	public static void main(String[] args) {
		final int a = 20;
		int b = 40;
		
		final Item itemA = new Item(111,"item111", 111);
		Item itemB = new Item(222,"item222", 222);
		itemA.name = "updata";
		System.out.println("itemA= " + itemA);

	}

}
