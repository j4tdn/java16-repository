package view;

import java.time.LocalDate;
import java.time.Month;

import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImp;
import utils.ReadFile;
import utils.SqlUtils;




public class App {
	private static ItemGroupService itemGroupService;
	private static ItemService itemService;

	static {
		itemGroupService = new ItemGroupServiceImpl();
		itemService = new ItemServiceImp();
	}
	
	
	public static void main(String[] args) {
		System.out.println("++++++++Cau 1+++++++++");
		LocalDate date = LocalDate.of(2022, Month.DECEMBER, 18);
		SqlUtils.print(itemService.getAllItemWithTime(date).toArray());
		
		System.out.println("++++++++Cau 2+++++++++");
		SqlUtils.print(itemService.getAllItemGroupDTO().toArray());
		
		System.out.println("++++++++Cau 3+++++++++");
		SqlUtils.print(itemService.getNameItem(2022).toArray());
		
		System.out.println("++++++++Cau 4+++++++++");
		SqlUtils.print(itemService.getItems().toArray());
		
		System.out.println("++++++++Cau 5+++++++++");
		SqlUtils.print(itemGroupService.add(ReadFile.Readfile("data.txt")));
		
		
	}
}
