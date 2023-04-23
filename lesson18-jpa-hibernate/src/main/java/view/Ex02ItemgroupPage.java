package view;

import service.ItemGroupService;
import service.ItemgrouServiceImpl;
import static utils.PrintUtils.*;

public class Ex02ItemgroupPage {
private static ItemGroupService itemGroupService;
static {
	itemGroupService = new ItemgrouServiceImpl();
}
public static void main(String[] args) {
	print("cau 1 : Liet ke loai hang", itemGroupService.getAll());
}	
}
