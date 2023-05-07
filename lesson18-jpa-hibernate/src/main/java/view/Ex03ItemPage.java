package view;

import static utils.PrintUtils.*;

import service.ItemService;
import service.ItemServiceIpml;

public class Ex03ItemPage {

	private static ItemService itemService;
	static {
		itemService = new ItemServiceIpml();
	}
	public static void main(String[] args) {
		print("Câu 3: Liệt kê mặt hàng bao gồm loại hàng", itemService.getALl());
	}
}
