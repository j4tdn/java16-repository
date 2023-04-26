package view;

import service.ItemService;
import service.ItemServiceImpl;
import static utils.PrintUtils.*;

import java.util.List;

import persistence.Item;
import persistence.ItemGroup;

public class Ex03ItemPage {
	
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		List<Item> items = itemService.getAll();
		print("Câu 3: Liệt kê các mặt hàng bao gồm loại hàng", items);
		
		ItemGroup firstItemIg = items.get(0).getItemGroup();
		print("Loại hàng của mặt hàng đầu tiên", firstItemIg);

		
	}
}
