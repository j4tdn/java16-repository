package service;

import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroupDTO;

public interface ItemGroupService {
	public boolean add(List<ItemGroup> listIG);
}
