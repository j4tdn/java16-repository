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
		
		executeAndPrint("Câu 6: Thêm mới Mặt Hàng", () -> {
			// TH1: ig of it already existed
			// ItemGroup ig = new ItemGroup();
			// ig.setId(7);
			
			// TH2: ig of it not existed yet
			ItemGroup ig = new ItemGroup(999, "JPA/Hibernate Test Save 999", "Test Save 999");
			Item itemToBeSaved = new Item(11, 
					"JPA/Hibernate Test Save Item 11",
					"Test 11",
					11d,
					111d,
					"Test 11",
					ig);
			itemService.saveOrUpdate(itemToBeSaved);
		});
		
		List<Item> items = itemService.getAll();
		print("Câu 3: Liệt kê các mặt hàng bao gồm loại hàng", items);
		
		ItemGroup firstItemIg = items.get(0).getItemGroup();
		print("Loại hàng của mặt hàng đầu tiên", firstItemIg);
	}

}
