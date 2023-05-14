package dao;

import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroupDto;

public interface ItemGroupDao {
	List<ItemGroup> getAll();//câu 1: Liệt kê tất cả các loại hàng 
	
	ItemGroup get(int id);//câu 2: Liệt kê tất cả các loại hàng [theo MaLoai]
	
	List<ItemGroupDto> statistic();
	
	void save(ItemGroup itemGroup);
	
	void save (List<ItemGroup> itemGroups);//câu 7: batch update
	
	void saveNewestItemGroups(int nextNItemGroups);
	
	void demoHibernateCache();

}
