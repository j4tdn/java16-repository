package view;
import static utils.PrintfUtils.*;

import service.ItemService;
import service.ItemServiceImpl;
public class Ex03ItemPage {
	private static ItemService itemservice;
	static {
		itemservice = new ItemServiceImpl();
	}
	public static void main(String[] args) {
		printf("câu 3", itemservice.getAll());
		
	}

}
