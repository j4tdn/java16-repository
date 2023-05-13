package view;

import java.time.LocalDate;

import service.ItemService;
import service.ItemServiceImpl;
import utils.PrintUtils;

public class ItemPage {
	
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		PrintUtils.generate("C1E1 items --> ", itemService.getAll());
		
		System.out.println("================== next ==================");
		
		PrintUtils.generate("C1E2 items by ig id --> ", itemService.getItems());
		
		System.out.println("================== next ==================");
		
		PrintUtils.generate("C1G items by order time --> ",
				itemService.getItems(LocalDate.of(2022, 01, 01)));
		
		System.out.println("-----------------------------------------"
				+ "Cau3 --> Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng"
				+ "-----------------------------------------");
		PrintUtils.generate("", itemService.statisticItemPerItemGroup());
		
	}
}