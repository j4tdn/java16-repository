package view;

import java.time.LocalDate;

import service.ItemService;
import utils.PrintUtils;

public class ItemView {
	private static ItemService itemService;
	public static void main(String[] args) {
		PrintUtils.generate("C1 --> ", itemService.getItemsbyDate(LocalDate.of(2020, 03, 06)));
	}

}
