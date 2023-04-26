package view;

import service.ItemService;
import service.ItemServiceImpl;
import utils.PrintUtils;

public class ItemPage {
	
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println(
				  "----------------------------------------------------------------------"
				+ "Câu 3 --> Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng"
				+ "----------------------------------------------------------------------");
		PrintUtils.generate("", itemService.statisticItemsPerItemGroup());
	}
}
