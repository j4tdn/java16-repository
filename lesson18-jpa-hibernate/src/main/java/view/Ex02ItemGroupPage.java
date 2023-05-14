package view;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import utils.FileUtils;

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
		executeAndPrint("Câu 6: Thêm mới Loại Hàng", () -> {
			ItemGroup igToBeSaved = new ItemGroup(7, "JPA/Hibernate Test Save 07", "Test Save 07");
			itemGroupService.save(igToBeSaved);
		});
		
		executeAndPrint("Câu 7: Thêm mới danh sách loại hàng(batchUpdate)", () -> {
			List<ItemGroup> dataTobeSaved = FileUtils.readLines("data.txt", ItemGroup::toEntity);
			itemGroupService.save(dataTobeSaved);
		});
		
		List<ItemGroup> groups = itemGroupService.getAll();
		print("Câu 1: Liệt kê loại hàng", groups);
		
		List<Item> firstIgItems = groups.get(0).getItems();
		print("Mặt hàng của loại hàng đầu tiên", firstIgItems);
		
		print("Câu 2: Liệt kê loại hàng theo mã loại", itemGroupService.get(2));
	
		print("Câu 5: Thông kê số lượng mặt hàng theo từng loại hàng", itemGroupService.statistic());
		
		/*executeAndPrint("Câu 10: Thêm mới Loại Hàng với proceduce", () -> {
			int pRowCount = 4;
			itemGroupService.saveNewestItemGroup(pRowCount);
		});
	}*/
	}
}