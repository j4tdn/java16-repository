package view;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;

import static utils.PrintfUtils.*;

import persistence.ItemGroup;

public class Ex02ItemGroupPage {
	private static ItemGroupService itemGroupService;
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	public static void main(String[] args) {
		System.out.println("\n" + "Câu 6: thêm mới loại hàng");
		System.out.println("======================");
		ItemGroup igToBeSaved = new ItemGroup(7, "ig to save", "test save");
		itemGroupService.save(igToBeSaved);
		System.out.println("===============");
		printf("câu 1", itemGroupService.getAll());
		printf("cau 2:", itemGroupService.get(2));
		printf("cau 3", itemGroupService.get(2));
	}

}
