package dao;

import java.util.List;


import bean.ItemGroup;
import dto.ItemGroupDto;

public interface ItemGroupDao {
	List<ItemGroup> getAll();
	
	 List<ItemGroupDto> CountItemByItemGroup();
	
	//liệt kê loại hàng theo mã loại
	 ItemGroup get(int id);
	 
	 ItemGroup get(String name);
	 
	 void save(ItemGroup ig);
	 
	 void update(ItemGroup ig);

}
