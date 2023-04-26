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
		List<ItemGroup> groups = itemGroupService.getAll();
		print("Câu 1: Liệt kê loại hàng", groups);
		
		List<Item> firstIgItems = groups.get(0).getItems();
		print("Mặt hàng của loại hàng đầu tiên", firstIgItems);
		
		print("Câu 2: Liệt kê loại hàng theo mã loại", itemGroupService.get(2));
		
		print("Câu 5: Thống kê số lượng mặt hàng theo từng loại hàng", itemGroupService.statistic());
	}
}
