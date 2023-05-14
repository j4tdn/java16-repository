package view;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import static utils.PrintUtils.*;

import java.util.List;

import persistence.Item;
import persistence.ItemGroup;

public class Ex02ItemgroupPage {
	private static ItemGroupService itemGroupService;
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}

	public static void main(String[] args) {
		
		
		executeAndPrint("Cau 6 : Them moi loai hang",()->{
			ItemGroup igToBeSaved = new ItemGroup(7, "JPA/Hibernate Test Save 07", "Test Save 07");
			itemGroupService.save(igToBeSaved);
		});
		
		List<ItemGroup> groups = itemGroupService.getAll();
		
		print("cau 1 : Liet ke loai hang ", groups);
		
		List<Item> firstItems = groups.get(0).getItems();
		
		print(" Mat hang cua loai hang dau tien", firstItems);
		
		print("Cau 2 : Liet ke loai hang theo ma loai ", itemGroupService.get(2));
		
		print("Cau 5 : Thong ke so luong mat hang theo rung loai hang ", itemGroupService.statistic());
	}
}
