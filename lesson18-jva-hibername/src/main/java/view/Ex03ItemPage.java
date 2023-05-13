package view;

import static utils.PrintUtils.executeAndPrint;

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
		PrintUtils.print("câu 3", items);
		
		ItemGroup firstItemIg = items.get(0).getItemGroup();
		PrintUtils.print("loại hàng của mặt hàng đầu tiên", firstItemIg);
	
		//TH1: ig of it already existed
		//ig.setId(7);
		//ItemGroup ig = new ItemGroup()
		//TH2: ig of it NOT existed
		executeAndPrint("Câu 6: Thêm mới mặt hàng Hàng", () -> {
			ItemGroup ig = new ItemGroup(99,"JPA/Hibernate Test save Item 11","Test save 99");
			Item igToBeSaved = new Item(11,
					"JPA/Hibernate Test save Item 11",
					"Test",
					80d,
					128d,
					"Test",
					ig);
			itemService.saveOrUpdate(igToBeSaved);
		});
	}

}
