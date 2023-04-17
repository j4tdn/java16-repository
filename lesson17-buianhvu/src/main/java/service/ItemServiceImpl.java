package service;

import java.time.LocalDate;
import java.util.List;

import bean.Item;
import dao.ItemDao;
import dao.JdbcItemDao;

public class ItemServiceImpl implements ItemService {
	
	private final ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new JdbcItemDao();
	}
	
	@Override
	public List<Item> getAll() {
		return itemDao.getAll();
	}
	
	@Override
	public List<Item> getItems() {
		return itemDao.getItems();
	}
	
	@Override
	public List<Item> getItems(LocalDate sellDate) {
		// TODO Auto-generated method stub
		return itemDao.getItems(sellDate);
	}

	@Override
	public List<Item> listItemsSoldOnDate(LocalDate date) {
		// TODO Auto-generated method stub
		return itemDao.listItemsSoldOnDate(date);
	}

}