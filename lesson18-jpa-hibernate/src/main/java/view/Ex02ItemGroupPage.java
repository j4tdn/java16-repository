package view;

import java.util.List;

import persistence.Item;
import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceIpml;
import utils.PrintUtils;

public class Ex02ItemGroupPage {

	private static ItemGroupService itemGroupService;
	
	static {
	   itemGroupService = new ItemGroupServiceIpml();
	}
	public static void main(String[] args) {
		List<ItemGroup> groups = itemGroupService.getAll();
		PrintUtils.print("Câu 1: Liệt kê loại hàng ", groups);
		
		List<Item> firstIgItems = groups.get(0).getItems();
		PrintUtils.print("Mặt hàng của loại hàng đầu tiên", firstIgItems);
		
		PrintUtils.print("Câu 2: Liệt kê loại hàng theo mã loại ", itemGroupService.get(2));
	
		PrintUtils.print("Câu 5: Thống kê số lượng mặt hàng theo từng loại hàng", itemGroupService.statistic());
	}
}
