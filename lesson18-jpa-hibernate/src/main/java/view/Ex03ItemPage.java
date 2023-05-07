package view;

import java.util.List;

import persistence.Item;
import persistence.ItemGroup;
import service.ItemService;
import service.ItemServiceImpl;
import utils.PrintUtils;

public class Ex03ItemPage {
	
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		List<Item> items = itemService.getAll();
		PrintUtils.print("Câu 3: Liệt kê các mặc hàng bao gồm loại hàng", items);
		
		PrintUtils.executeAndPrint("Câu 6: thêm mới mặt hàng", () -> {
			// TH1: ig of it already existed
			ItemGroup ig = new ItemGroup();
			ig.setId(7);
			Item itemToBeSaved = new Item(11,
					"JPA/Hibernate Test 11",
					"Test",
					80d,
					128d,
					"Test",
					ig);
			itemService.saveOrUpdate(itemToBeSaved);
		});
	}
}
