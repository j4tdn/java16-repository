package view;

import java.time.LocalDate;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;

public class ItemView {
	private static ItemService itemService;
	private static ItemGroupService igService;
	
	static {
		itemService = new ItemServiceImpl();
		igService = new ItemGroupServiceImpl();
	}
	public static void main(String[] args) {
		// OK --> 10/20 --> chạy được nhưng sai KQ
		System.out.println("==> Cau 1: ");
		LocalDate date = LocalDate.of(2023, 11, 23);
		System.out.println(itemService.getItems(date));
		
		// OK --> 20
		System.out.println("==> Cau 2: ");
		System.out.println(igService.getItemGroups());
		
		// Sai
		System.out.println("==> Cau 3: ");
		Integer year = 2020;
		System.out.println(itemService.getTop3ItemsToSring(year));
		
		// Sai --> 5
		System.out.println("==> Cau 4: ");
		System.out.println(itemService.getItemsGroupByIG());
		
		/**
		 A thấy Duy code được 4 câu khá ok, nhưng hầu như KQ đều ra sai, chỉ có câu 2
		 chạy được
		 Chắc em chưa hiểu chỗ khái niệm DTO rồi
		 Tổng a thấy đang 35/100 :'( --> Failed
		 */
	}
}