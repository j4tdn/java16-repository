package view;

import static Utils.PrintUtils.*;

import java.util.List;

import Utils.FileUtils;
import persistence.Item;
import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class E02ItemGroupPage {
	
	private static ItemGroupService itemGroupService;

	static {
		itemGroupService = new ItemGroupServiceImpl();
	}

	public static void main(String[] args) {
		executeAndPrint("Câu 6: Thêm mới loại hàng", () -> {
			ItemGroup igToBeSaved = new ItemGroup(7, "JPA/Hibernate Test Save 01", "Test Save 01");
			itemGroupService.save(igToBeSaved);
		});
		
		executeAndPrint("Câu 7: Thêm mới danh sách loại hàng(batch update)", () -> {
		
			List<ItemGroup> dataTobeSaved = FileUtils.readLines("data.txt", ItemGroup::toEntity);
			itemGroupService.save(dataTobeSaved);
		});
		
		List<ItemGroup> groups = itemGroupService.getAll();
		print("Câu 1: Liệt kê toàn bộ loại hàng", groups);
		
		List<Item> firstIgItems = groups.get(0).getItems();
		print("Mặt hàng của loại hàng đầu tiên", firstIgItems);
		
		print("Câu 2: Liệt kê loại hàng theo mã loại", itemGroupService.get(4));
		
		print("Câu 5: Thống kê số lượng mặt hàng theo từng loại", itemGroupService.statistic());
		
		executeAndPrint("Câu 10: Thêm mới loại hàng với procedure", () -> {
			
			int pRowCount = 4;
			itemGroupService.saveNewestItemGroup(pRowCount);
		});
	}
}
