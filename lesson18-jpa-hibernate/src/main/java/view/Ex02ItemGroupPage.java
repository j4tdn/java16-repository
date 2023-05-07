package view;

import java.util.List;

import persistence.Item;
import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import utils.PrintUtils;

public class Ex02ItemGroupPage {
	
	private static 	ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		List<ItemGroup> groups = itemGroupService.getAll();
		PrintUtils.print("Câu 1: liệt kê tất cả các loại hàng: ", groups);
		
		List<Item> FirstIgItems = groups.get(0).getItems();
		PrintUtils.print("Mặt hàng của loại hàng đầu tiên: ", FirstIgItems);
		
		PrintUtils.print("Câu 2: Liệt kê loại hàng theo mã loại: ", itemGroupService.get(2));
		
		PrintUtils.print("Câu 5: Thống kê số lượng mặt hàng theo từng loại hàng ",itemGroupService.statistic());
		
		PrintUtils.executeAndPrint("Câu 6: Thêm mới loại hàng: ", () -> {
			ItemGroup igToBeSaved = new ItemGroup(8, "JPA/Hibernate Test Save 08", "Test Save 08");
			itemGroupService.save(igToBeSaved);
		});
	}
}
