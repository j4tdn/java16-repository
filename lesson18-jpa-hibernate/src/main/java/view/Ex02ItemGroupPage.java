package view;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import static utils.PrintUtils.*;

import java.util.List;

import persistence.Item;
import persistence.ItemGroup;

public class Ex02ItemGroupPage {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		executeAndPrint("Cau 6: Them moi Loai Hang", () -> {
			ItemGroup igToBeSaved = new ItemGroup(7, "JPA/Hibernate Test Save 07", "Test Save 07");
			itemGroupService.save(igToBeSaved);
		});
		
		List<ItemGroup> groups = itemGroupService.getAll();
		print("Cau 1: Liet ke loai hang", groups);
		
		List<Item> firstIgItems = groups.get(0).getItems();
		print("Mat hang cua loai hang đau tien", firstIgItems);
		
		print("Cau 2: Liet ke loai hang theo ma loai", itemGroupService.get(2));
	
		print("Cau 5: Thong ke so luong mat hang theo tung loai hang", itemGroupService.statistic());
	}
}