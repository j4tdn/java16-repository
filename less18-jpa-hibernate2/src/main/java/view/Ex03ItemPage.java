package view;

import service.ItemService;
import service.ItemServiceImpl;
import static utils.PrintUtils.*;

import java.util.List;

import persistence.Item;
import persistence.ItemGroup;

public class Ex03ItemPage {

	private static ItemService itemService;
	static {
		itemService = new ItemServiceImpl();
	}

	public static void main(String[] args) {
		
		executeAndPrint("Cau 6 : Them moi loai hang",()->{
			ItemGroup ig = new ItemGroup();
			ig.setId(7);
			Item itemToBeSaved = new Item(11,"JPA/Hibernate Test save Item 11","Test",80d,128d,"Test",ig);
			itemService.saveOrUpdate(itemToBeSaved);
		});
		
		
		List<Item> list = itemService.getAll();

		print("cau 3 : cac mat hang bao gom loai hang ",list );
		
		ItemGroup firstItem = list.get(0).getItemgroup();
		
		print("Loai hang cua mat hang dau tien ", firstItem);
		
		
	}
}
