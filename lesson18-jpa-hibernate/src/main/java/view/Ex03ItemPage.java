package view;

import static Utils.PrintUtils.executeAndPrint;
import static Utils.PrintUtils.print;

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
		executeAndPrint("Câu 6: Thêm mới mặt hàng", () -> {
			// TH1: ig of it already existed
			// ig.setId(7);
			
			// TH2: ig of it not existed
			ItemGroup ig = new ItemGroup(99, "JPA/Hibernate Test Save Item 99","Test99");
			ig.setId(9);
			Item itemToBeSaved = new Item(11,
					"JPA/Hibernate Test Save Item 11",
					 "Test11",
					 80d,
					 128d,
					 "Test11",
					 ig);
			itemService.saveOrUpdate(itemToBeSaved);
		});
		
		List<Item> items = itemService.getAll();
		print("Câu 3: Liệt kê các mặt hàng bao gồm loại hàng", items);
		
		ItemGroup firstItemGroup = items.get(0).getItemGroup();
		print("Liệt kê mặt hàng đầu tiên ", firstItemGroup);
		
	}
}
