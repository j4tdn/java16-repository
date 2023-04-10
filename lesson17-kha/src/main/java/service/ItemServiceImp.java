package service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import dao.ItemDao;
import dao.ItemDaoImp;
import dao.ItemGroupDao;
import dao.ItemGroupDaoImpl;
import persistence.Item;
import persistence.ItemDTO;
import persistence.ItemGroupDTO;

public class ItemServiceImp implements ItemService {

	private ItemDao itemDao;
	private ItemGroupDao itemGroupDao;

	public ItemServiceImp() {
		itemDao = new ItemDaoImp();
		itemGroupDao = new ItemGroupDaoImpl();
	}

	public List<ItemDTO> getAllItemWithTime(LocalDate date) {
		return itemDao.getAllItemWithTime(date);
	}

	public List<ItemGroupDTO> getAllItemGroupDTO() {
		// TODO Auto-generated method stub
		return itemGroupDao.getAllItemGroupDTO();
	}

	public List<String> getNameItem(int Year) {
		// TODO Auto-generated method stub
		return itemGroupDao.getNameItem(Year);
	}

	public List<Item> getItems() {
		// TODO Auto-generated method stub
		return itemDao.getItems();
	}


	

}
