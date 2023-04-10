package service;

import java.util.List;
import java.util.Objects;

import dao.ItemGroupDao;
import dao.ItemGroupDaoImpl;
import persistence.ItemGroup;
import persistence.ItemGroupDTO;

public class ItemGroupServiceImpl implements ItemGroupService {

	private ItemGroupDao itemGroupDao;

	public ItemGroupServiceImpl() {
		itemGroupDao = new ItemGroupDaoImpl();
	}

	public boolean add(List<ItemGroup> listIG) {
		
		return itemGroupDao.add(listIG);
	}

	

}
