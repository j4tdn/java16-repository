package view;

import static Utils.PrintUtils.*;

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
		
		executeAndPrint("Câu 6: Thêm mới Mặt hàng", () -> {
			ItemGroup ig = new ItemGroup();
			// TH1: ig of it already existed
			// ig.setId(7);
			// TH2: ig of it not existed yet
			ig.setId(99);
			ig.setName("JPA/Hibernate Test Save Item 99");
			ig.setDescription("Test Save 99");
			
			
			
			Item itemToBeSaved = new Item(11,
							"JPA/Hibernate Test Save Item 11",
							"Test", 
							80d, 
							120d, 
							"Test", 
							ig);
			itemService.saveOrUpdate(itemToBeSaved);
		});
		
	}
}
