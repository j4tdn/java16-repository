package view;

import java.util.List;

import persistence.Item;
import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceIpml;
import utils.FileUtils;
import utils.PrintUtils;

public class Ex02ItemGroupPage {

	private static ItemGroupService itemGroupService;

	static {
		itemGroupService = new ItemGroupServiceIpml();
	}

	public static void main(String[] args) {

		
		  PrintUtils.executeAndPrint("\n" + "Câu 6: Thêm mới loại hàng ", () -> {
		  ItemGroup igToBeSaved = new ItemGroup(8, "JPA/Hibernate sđs Test", "Tsdsdeasst 08");
		 itemGroupService.save(igToBeSaved); });
		 
		  PrintUtils.executeAndPrint("\n" + "Câu 7: Thêm mới danh sách loại hàng (batch update ", () -> {
			List<ItemGroup> dataToBeSaved = FileUtils.readLines("data.txt", ItemGroup :: toEntity);
			itemGroupService.save(dataToBeSaved);
		  });

		List<ItemGroup> groups = itemGroupService.getAll();
		PrintUtils.print("Câu 1: Liệt kê loại hàng ", groups);

		List<Item> firstIgItems = groups.get(0).getItems();
		PrintUtils.print("Mặt hàng của loại hàng đầu tiên", firstIgItems);

		PrintUtils.print("Câu 2: Liệt kê loại hàng theo mã loại ", itemGroupService.get(2));

		PrintUtils.print("Câu 5: Thống kê số lượng mặt hàng theo từng loại hàng", itemGroupService.statistic());

		PrintUtils.executeAndPrint("\n" + "Câu 10: Thêm mới loại hàng với procedure ", () -> {
		      int pRowCount = 2;
		      itemGroupService.saveNewestItemGroups(pRowCount);
		});
	}
}
