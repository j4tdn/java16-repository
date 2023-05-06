package view;

import static utils.PrintUtils.*;

import java.util.List;

import persistence.Item;
import persistence.ItemGroup;
import service.ItemService;
import service.ItemServiceImpl;

public class Ex03ItemPage {
	
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		List<Item> items = itemService.getAll();
		print("Câu 3: Liệt kê các mặt hàng bao gồm loại hàng", items);
		
		ItemGroup firstItemIg = items.get(0).getItemGroup();
		print("Mặt hàng đầu tiên", firstItemIg);
	}
}
