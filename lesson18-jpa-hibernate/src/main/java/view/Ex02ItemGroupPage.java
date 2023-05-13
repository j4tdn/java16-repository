package view;

import static Utils.PrintUtils.*;

import java.util.List;

import Utils.FileUtils;
import persistence.Item;
import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class Ex02ItemGroupPage {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		List<ItemGroup> groups = itemGroupService.getAll();
		print("Câu 1: Liệt kê loại hàng", groups);
		
		List<Item> firstIgItems = groups.get(0).getItems();
		print("Mặt hàng của loại hàng đầu tiên", firstIgItems);
		
		print("Câu 2: Liệt kê loại hàng theo mã loại", itemGroupService.get(2));
		
		print("Câu 5: Thống kê mặt hàng theo từng loại hàng", itemGroupService.statistic());
		
		executeAndPrint("Câu 6: Thêm mới Loại hàng", () -> {
			ItemGroup igToBeSaved = new ItemGroup(7, "JPA/Hibernate Test Save 07", "Test Save 07" );
			itemGroupService.save(igToBeSaved);
		});
		
		executeAndPrint("Câu 7: Thêm mới danh sách loại hàng(batch update)", () -> {
			List<ItemGroup> dataToBeSaved = FileUtils.readLine("data.txt", ItemGroup::toEntity );
			itemGroupService.save(dataToBeSaved);
		});
		
		executeAndPrint("Câu 10: Thêm mới loại hàng với produre", () -> {
			int pRowCount = 4;
			itemGroupService.saveNewestItemGroups(pRowCount);
		});
		
	}
}
