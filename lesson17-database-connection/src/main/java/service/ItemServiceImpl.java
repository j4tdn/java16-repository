package service;

import java.util.List;

import bean.Item;
import dao.ItemDao;
import dao.JDBCItemDao;

public class ItemServiceImpl implements ItemService {
	
	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new JDBCItemDao();
	}
	@Override
	public List<Item> getAll() {
		// TODO Auto-generated method stub
		return itemDao.getAll();
	}
	

}
