package collections.list;

import java.awt.ItemSelectable;
import java.awt.desktop.PrintFilesEvent;
import java.util.ArrayList;
import java.util.List;

import javax.xml.crypto.Data;

import common.Item;
import mode.DataModel;

public class Ex03AlistItemType {
public static void main(String[] args) {
	List<Item> items = DataModel.getItems();
	Item itemToBeRemoved = new Item(8, "Item  8", 120.0, 102);
	items.remove(itemToBeRemoved);
	System.out.println("size --> " + items.size());
	printf("items", items);
	items.removeIf(item ->item.getId()>5);
	printf("items", items);
	}

private static void printf(String prefix, List<Item> items) {
	System.out.println(prefix + "--> {");
	for (Item item:items) {
		System.out.println(item + ", ");
	}
	System.out.println("}");
	
}
}

 