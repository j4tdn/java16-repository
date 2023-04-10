package dao;

import java.util.List;

import bean.ItemGroup;

public interface ItemGroupDao {
	List <ItemGroup> getAll ();
	
	ItemGroup get(int id);
	
	ItemGroup get(String name);
	
	void save (ItemGroup ig );
	
	void update(ItemGroup ig);
}
