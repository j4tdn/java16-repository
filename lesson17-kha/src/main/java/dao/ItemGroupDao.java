package dao;

import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroupDTO;

public interface ItemGroupDao {

	List<ItemGroupDTO> getAllItemGroupDTO();

	List<String> getNameItem(int Year);

	boolean add(List<ItemGroup> listIG);
	
}
