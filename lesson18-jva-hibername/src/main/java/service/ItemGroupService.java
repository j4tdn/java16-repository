package service;

import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroupDto;

public interface ItemGroupService {
	List<ItemGroup> getAll();//câu 1: Liệt kê tất cả các loại hàng
	
	ItemGroup get(int id);////câu 2: Liệt kê tất cả các loại hàng [theo MaLoai]

	List<ItemGroupDto> statistic();
	
	void save(ItemGroup itemGroup);
	
	void save(List<ItemGroup> itemGroups);
}
