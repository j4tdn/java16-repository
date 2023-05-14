package view;

import service.ItemGroupServiceImpl;
import utils.FIleUtils;

import static utils.PrintUtils.*;

import java.util.List;

import persistence.Item;
import persistence.ItemGroup;
import service.ItemGroupService;

public class Ex02ItemGroupPage {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		
		//câu 6: thêm vào 1 loại hàng
//		System.out.println("\n"+"câu 6: thêm vào 1 loại hàng");
//		System.out.println("==__>> -----------------<<__==");
//		ItemGroup igToBeSaved = new ItemGroup(7, "JPA/Hibernate save 01 ", "Test save 01");
//		itemGroupService.save(igToBeSaved);
//		System.out.println("==__>> -----------------<<__==\n");
		
		executeAndPrint("Câu 6: Thêm mới Loại Hàng", () -> {
			ItemGroup igToBeSaved = new ItemGroup(7, "JPA/Hibernate Test Save 07", "Test Save 02");
			itemGroupService.save(igToBeSaved);
		});
		executeAndPrint("Câu 7: Thêm mới danh sách Loại Hàng(batch update)", () -> {
			List<ItemGroup> dataToBeSaved = FIleUtils.readLine("data.txt", ItemGroup::toEntity);
			itemGroupService.save(dataToBeSaved);
		});
		
		executeAndPrint("Câu 10: Thêm mới Loại Hàng(procedure)", () -> {
			int pRowcount = 4;
			itemGroupService.saveNewestItemGroups(pRowcount);
		});
		
		List<ItemGroup> groups = itemGroupService.getAll();
		
		//câu 1: Liệt kê tất cả các loại hàng
		print("cau 1", itemGroupService.getAll());
		
		//câu 4: Liệt kê tất cả các loại hàng chứa thông tin những mặt hàng thuộc từng loại hàng
		List<Item> firstIgItems = groups.get(0).getItems();
		print("Mặt hàng của loại hàng đầu tiên", firstIgItems);
		
		//câu 2: Liệt kê tất cả các loại hàng [theo MaLoai]
		print("cau 2", itemGroupService.get(2));
		
		print("câu 5: thống kê số lượng mặt hàng theo loại hàng", itemGroupService.statistic());
	
	    
	}

}
