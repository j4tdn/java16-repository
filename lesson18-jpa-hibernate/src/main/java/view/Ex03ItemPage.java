package view;

import static utils.PrintUtils.print;

import persistence.Item;
import persistence.ItemGroup;
import service.ItemService;
import service.ItemServiceIpml;
import utils.PrintUtils;

public class Ex03ItemPage {

	private static ItemService itemService;
	static {
		itemService = new ItemServiceIpml();
	}

	public static void main(String[] args) {

		ItemGroup ig = new ItemGroup();
		ig.setId(9);
		PrintUtils.executeAndPrint("\n" + "Câu 6: Thêm mới loại hàng ", () -> {
			Item itemToBeSaved = new Item(11, "ádd", "Red", 56d, 90d,"sd",ig);
			itemService.saveOrUpdate(itemToBeSaved);
		});

		print("Câu 3: Liệt kê mặt hàng bao gồm loại hàng", itemService.getALl());
		
	}
}
